/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:17:32 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JRootPane;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.StyledEditorKit;
import org.apache.batik.ext.awt.ColorSpaceHintKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.ActMain;
import uk.ac.sanger.artemis.components.ArtemisMain;
import uk.ac.sanger.artemis.components.Splash;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Splash_ESTest extends Splash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Color color0 = Color.WHITE;
      StyledEditorKit.ForegroundAction styledEditorKit_ForegroundAction0 = new StyledEditorKit.ForegroundAction((String) null, color0);
      AWTEventMulticaster.remove((ActionListener) styledEditorKit_ForegroundAction0, (ActionListener) styledEditorKit_ForegroundAction0);
      // Undeclared exception!
      try { 
        Splash.makeMenuItem((JMenu) null, (String) null, (ActionListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.Splash", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Splash.getLogger();
      Splash.getLogger();
      Splash.processJnlpAttributes();
      // Undeclared exception!
      try { 
        Splash.showLog();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.LogViewer$1
         //
         verifyException("uk.ac.sanger.artemis.components.LogViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        Splash.initLogger();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.LogViewer$1
         //
         verifyException("uk.ac.sanger.artemis.components.LogViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JMenu jMenu0 = new JMenu((String) null);
      Splash.makeMenuItem(jMenu0, "S6@@\"", (ActionListener) null);
      assertFalse(jMenu0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Splash.exitApp();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "org.biojava.bio.taxa.Taxon";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.biojava.bio.taxa.Taxon");
      String string1 = "f#?((34<0R";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "f#?((34<0R");
      Splash.processJnlpAttributes();
      // Undeclared exception!
      try { 
        Splash.setWorkingDirectory();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InputMethodListener inputMethodListener0 = mock(InputMethodListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(inputMethodListener0, inputMethodListener0);
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      String string0 = "MZk-*Z[/naTC ";
      Object[] objectArray0 = new Object[10];
      objectArray0[3] = (Object) null;
      objectArray0[6] = (Object) "MZk-*Z[/naTC ";
      // Undeclared exception!
      try { 
        Splash.showLog();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.LogViewer$1
         //
         verifyException("uk.ac.sanger.artemis.components.LogViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JMenu jMenu0 = new JMenu("1) b4T`3V%WNjDz");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      defaultEditorKit_DefaultKeyTypedAction0.getKeys();
      Object object0 = ColorSpaceHintKey.VALUE_COLORSPACE_ARGB;
      Splash.makeMenuItem(jMenu0, "L06@\"k>x*n{uK", defaultEditorKit_DefaultKeyTypedAction0);
      // Undeclared exception!
      try { 
        Splash.showLog();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.LogViewer$1
         //
         verifyException("uk.ac.sanger.artemis.components.LogViewer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Splash.processJnlpAttributes();
      ActMain actMain0 = null;
      try {
        actMain0 = new ActMain();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = null;
      Splash.appendToLog((String) null);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureVector featureVector0 = new FeatureVector();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, (String) null);
      filteredEntryGroup0.isReadOnly();
      filteredEntryGroup0.getBases();
      Entry entry0 = Entry.newEntry((Bases) null);
      // Undeclared exception!
      try { 
        ArtemisMain.makeEntryEdit(entry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleEntryGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Splash.getLogger();
      ActMain actMain0 = null;
      try {
        actMain0 = new ActMain();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Splash.appendToLog("garbage at the end of the location string");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Splash.setWorkingDirectory();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JRootPane jRootPane0 = new JRootPane();
      JLayeredPane jLayeredPane0 = jRootPane0.getLayeredPane();
      InputMethodListener inputMethodListener0 = mock(InputMethodListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(inputMethodListener0, inputMethodListener0);
      InputMethodListener inputMethodListener1 = AWTEventMulticaster.remove(inputMethodListener0, (InputMethodListener) null);
      jLayeredPane0.removeInputMethodListener(inputMethodListener1);
      // Undeclared exception!
      try { 
        Splash.exitApp();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}