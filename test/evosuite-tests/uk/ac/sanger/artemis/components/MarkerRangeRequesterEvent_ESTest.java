/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:48:50 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.MarkerRangeRequester;
import uk.ac.sanger.artemis.components.MarkerRangeRequesterEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MarkerRangeRequesterEvent_ESTest extends MarkerRangeRequesterEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MarkerRangeRequesterEvent markerRangeRequesterEvent0 = null;
      try {
        markerRangeRequesterEvent0 = new MarkerRangeRequesterEvent((MarkerRangeRequester) null, "GenBan", 101);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }
}