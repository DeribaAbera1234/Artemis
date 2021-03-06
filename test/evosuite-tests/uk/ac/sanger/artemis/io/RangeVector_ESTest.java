/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:24:16 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RangeVector_ESTest extends RangeVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector((Range) null);
      // Undeclared exception!
      try { 
        rangeVector0.containsRange((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RangeVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Range range0 = new Range(18, 1691);
      RangeVector rangeVector0 = new RangeVector(range0);
      Range range1 = new Range(1691);
      boolean boolean0 = rangeVector0.containsRange(range1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Range range0 = new Range(18, 1691);
      RangeVector rangeVector0 = new RangeVector(range0);
      rangeVector0.setSize(1691);
      rangeVector0.reverse();
      assertEquals(1691, rangeVector0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      Range range0 = new Range((-1));
      rangeVector0.addElement(range0);
      boolean boolean0 = rangeVector0.containsRange(range0);
      assertTrue(boolean0);
  }
}
