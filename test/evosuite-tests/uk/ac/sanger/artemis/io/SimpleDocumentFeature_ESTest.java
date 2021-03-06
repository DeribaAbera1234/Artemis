/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:34:52 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.DatabaseStreamFeature;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleDocumentFeature_ESTest extends SimpleDocumentFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      StringVector stringVector0 = new StringVector("Z");
      Qualifier qualifier0 = new Qualifier("Z", stringVector0);
      emblStreamFeature0.setQualifier(qualifier0);
      assertEquals("Z", qualifier0.getName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      Feature feature0 = genbankStreamFeature0.copy();
      assertNotSame(genbankStreamFeature0, feature0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      QualifierVector qualifierVector0 = genbankStreamFeature0.getQualifiers();
      assertEquals(0, qualifierVector0.capacity());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      uk.ac.sanger.artemis.Feature feature0 = new uk.ac.sanger.artemis.Feature(genbankStreamFeature0);
      Reader reader0 = feature0.toReader();
      assertNotNull(reader0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      emblStreamFeature0.removeQualifierByName("<T~7@?h%]c)tW6F");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Key key0 = Key.CDS;
      QualifierVector qualifierVector0 = new QualifierVector();
      qualifierVector0.add((Qualifier) null);
      GFFStreamFeature gFFStreamFeature0 = null;
      try {
        gFFStreamFeature0 = new GFFStreamFeature(key0, (Location) null, qualifierVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleDocumentFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatabaseStreamFeature databaseStreamFeature0 = null;
      try {
        databaseStreamFeature0 = new DatabaseStreamFeature((Key) null, (Location) null, (QualifierVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GFFStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      boolean boolean0 = genbankStreamFeature0.isReadOnly();
      assertFalse(boolean0);
  }
}
