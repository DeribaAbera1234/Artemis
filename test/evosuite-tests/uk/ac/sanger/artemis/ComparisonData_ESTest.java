/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:09:09 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.MUMmerComparisonData;
import uk.ac.sanger.artemis.MegaBlastComparisonData;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparisonData_ESTest extends ComparisonData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      // Undeclared exception!
      try { 
        mUMmerComparisonData0.getMinimumScore();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      // Undeclared exception!
      try { 
        mUMmerComparisonData0.getMaximumScore();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MegaBlastComparisonData megaBlastComparisonData0 = new MegaBlastComparisonData();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("wD");
      Bases bases0 = new Bases(emblStreamSequence0);
      // Undeclared exception!
      try { 
        megaBlastComparisonData0.flipMatchesIfNeeded(bases0, bases0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleComparisonData", e);
      }
  }
}
