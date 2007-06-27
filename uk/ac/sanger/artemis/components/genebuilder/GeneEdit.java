/* 
 *
 * created: 2006
 *
 * This file is part of Artemis
 *
 * Copyright (C) 2006  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package uk.ac.sanger.artemis.components.genebuilder;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;


import javax.swing.JButton;
import javax.swing.JOptionPane;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Box;
import javax.swing.UIManager;

import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.Options;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.chado.*;
import uk.ac.sanger.artemis.io.FeatureVector;
import uk.ac.sanger.artemis.io.DatabaseDocumentEntry;
import uk.ac.sanger.artemis.io.EntryInformationException;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.components.Splash;
import uk.ac.sanger.artemis.components.SwingWorker;
import uk.ac.sanger.artemis.components.database.DatabaseEntrySource;


/**
 * Chado data access example code. This searches for features by their
 * uniquename and returns their properties and attributes.
 * 
 * @author tjc
 * 
 */
public class GeneEdit
{
  /** JDBC DAO */
  private JdbcDAO jdbcDAO = null;

  /** iBatis DAO */
  private IBatisDAO connIB = null;

  /** password fields */
  private JPasswordField pfield;


  /**
   * 
   * 
   */
  public GeneEdit()
  {
    try
    {
      DatabaseEntrySource entry_source = new DatabaseEntrySource();
      entry_source.setLocation(true);
      final String location = entry_source.getLocation();
      
      final GmodDAO dao = getDAO(location);
      showFeatureSearchPanel(dao, location);
    }
    catch(java.net.ConnectException ce)
    {
      ce.printStackTrace();
    }
    catch(SQLException sqlExp)
    {
      JOptionPane.showMessageDialog(null, "SQL Problems...\n"
          + sqlExp.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
      sqlExp.printStackTrace();
    }

  }

  /**
   * Display a window for searching for features.
   * 
   * @throws java.net.ConnectException
   * @throws SQLException
   */
  private void showFeatureSearchPanel(final GmodDAO dao,
                                      final String location)
      throws java.net.ConnectException, SQLException
  {
    int index = location.indexOf('=') + 1;
    String schema = location.substring(index);

    final List schemas = dao.getSchema();

    Vector v_schemas = new Vector(schemas);
    v_schemas.add(0, "All");

    final JPanel panel = new JPanel(new BorderLayout());
    final JComboBox schema_list = new JComboBox(v_schemas);
    schema_list.setSelectedItem(schema);

    Box xbox = Box.createHorizontalBox();
    final JTextField gene_text = new JTextField(20);
    gene_text.setText("BPSS0002"); //"SPAC212.04c");
    xbox.add(gene_text);
    xbox.add(schema_list);
    gene_text.selectAll();
    
    JButton findButt = new JButton("RETRIEVE");
    findButt.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent event)
      {
        final String search_gene = gene_text.getText();
        final String schema = (String)schema_list.getSelectedItem();
        List schema_search;
        if(schema.equalsIgnoreCase("All"))
          schema_search = schemas;
        else
        {
          schema_search = new Vector();
          schema_search.add(schema);
        }

        SwingWorker entryWorker = new SwingWorker()
        {
          public Object construct()
          {
            DatabaseDocumentEntry entry = makeEntry(schema, search_gene,
                                                    location, pfield);
            //entry.setReadOnly(true);
            showGeneEditor(schema, search_gene, entry);
            return null;
          }
        };
        entryWorker.start();
        
        
      }
    });
    xbox.add(findButt);
    xbox.add(Box.createHorizontalGlue());
    
    panel.add(xbox, BorderLayout.NORTH);
    
    GeneSplash frame = new GeneSplash();
    frame.getContentPane().add(panel);
    frame.setJMenuBar(getJMenuBar(dao));
    frame.pack();
    frame.setVisible(true);
  }

  private DatabaseDocumentEntry makeEntry(final String schema, 
                                          final String uniquename,
                                          final String location,
                                          final JPasswordField pfield)
  {
    DatabaseDocumentEntry db_entry = null;
    DatabaseDocument doc = new DatabaseDocument(location, pfield, 
                                                uniquename,
                                                schema, true);
    try
    {
      db_entry = new DatabaseDocumentEntry(doc, null);
    }
    catch(EntryInformationException e)
    {
      e.printStackTrace();
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }

    return db_entry;  
  }
  
  /**
   * Build a <code>JMenuBar</code>.
   * 
   * @return a <code>JMenuBar</code>
   */
  public JMenuBar getJMenuBar(final GmodDAO dao)
  {
    JMenuBar mbar = new JMenuBar();
    JMenu file = new JMenu("File");
    mbar.add(file);

    JMenuItem showLog = new JMenuItem("Show Log Window");
    showLog.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent event)
      {
        GeneSplash.showLog();
      }
    });
    file.add(showLog);
    
    JMenuItem exit = new JMenuItem("Exit");
    exit.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent event)
      {
        System.exit(0);
      }
    });
    file.add(exit);

    return mbar;
  }

  public static void showGeneEditor(final String schema,
                                    final String search_gene,
                                    final DatabaseDocumentEntry dbentry)
  {
    FeatureVector features = dbentry.getAllFeatures();
    Feature gff_gene_feature = null;

    SimpleEntryGroup entry_group = new SimpleEntryGroup();
    Entry entry = new Entry(dbentry);
    
    for(int i = 0; i < features.size(); i++)
    {
      GFFStreamFeature this_embl_feature = (GFFStreamFeature) features.get(i);
      String uniquename = (String) this_embl_feature.getQualifierByName("ID")
          .getValues().get(0);

      Feature this_feature;
      
      if(this_embl_feature.getUserData() == null)
        this_feature = new Feature(this_embl_feature);
      else
        this_feature = (Feature)this_embl_feature.getUserData();
      this_feature.setEntry(entry);
      
      if(search_gene.equals(uniquename))
        gff_gene_feature = this_feature;
    }

    Selection selection = new Selection(null);
    selection.add(gff_gene_feature);
    
    entry_group.addElement(gff_gene_feature.getEntry());
    
    ChadoTransactionManager ctm = new ChadoTransactionManager();
    entry_group.addFeatureChangeListener(ctm);
    
    new GeneBuilderFrame(gff_gene_feature, entry_group, selection, null); 
  }
  
  /**
   * Get the data access object (DAO).
   * 
   * @return data access object
   */
  private GmodDAO getDAO(final String location) 
          throws java.net.ConnectException, SQLException
  {
    if(System.getProperty("ibatis") == null)
    {
      if(jdbcDAO == null)
        jdbcDAO = new JdbcDAO(location, pfield);
      return jdbcDAO;
    }
    else
    {
      if(connIB == null)
      {
        System.setProperty("chado", location);
        connIB = new IBatisDAO(pfield);
      }

      return connIB;
    }
  }

  class GeneSplash extends Splash
  {
    /** */
    private static final long serialVersionUID = 1L;

    public GeneSplash()
    {
      super("Feature Search", "Gene Editor");  
    }
    
    protected void exit()
    {   
    }
    
  }
  
  public static void main(String args[])
  {
    final javax.swing.plaf.FontUIResource font_ui_resource =
      Options.getOptions().getFontUIResource();

    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while(keys.hasMoreElements()) 
    {
      Object key = keys.nextElement();
      Object value = UIManager.get(key);
      if(value instanceof javax.swing.plaf.FontUIResource) 
        UIManager.put(key, font_ui_resource);
    }
    new GeneEdit();
  }
}
