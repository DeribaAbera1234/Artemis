/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:50:15 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.FeatureVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureVector_ESTest extends FeatureVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureVector featureVector0 = new FeatureVector();
      featureVector0.addElement((Feature) null);
      Feature feature0 = featureVector0.featureAt(0);
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureVector featureVector0 = new FeatureVector();
      // Undeclared exception!
      try { 
        featureVector0.featureAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }
}