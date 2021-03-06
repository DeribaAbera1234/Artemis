/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:07:48 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.AdjustmentEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ScoreChangeListener;
import uk.ac.sanger.artemis.components.ScoreScrollbar;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScoreScrollbar_ESTest extends ScoreScrollbar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = new ScoreScrollbar((-2216), (-2216));
      AdjustmentEvent adjustmentEvent0 = new AdjustmentEvent(scoreScrollbar0, 0, 12, (-2216));
      ScoreChangeListener scoreChangeListener0 = mock(ScoreChangeListener.class, new ViolatedAssumptionAnswer());
      scoreScrollbar0.removeScoreChangeListener(scoreChangeListener0);
      ScoreChangeListener scoreChangeListener1 = mock(ScoreChangeListener.class, new ViolatedAssumptionAnswer());
      scoreScrollbar0.removeScoreChangeListener(scoreChangeListener1);
      scoreScrollbar0.adjustmentValueChanged(adjustmentEvent0);
      assertEquals(0, adjustmentEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = null;
      try {
        scoreScrollbar0 = new ScoreScrollbar(75, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid range properties
         //
         verifyException("javax.swing.DefaultBoundedRangeModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = null;
      try {
        scoreScrollbar0 = new ScoreScrollbar((-1), (-1), (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // orientation must be one of: VERTICAL, HORIZONTAL
         //
         verifyException("javax.swing.JScrollBar", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = new ScoreScrollbar(1, 1);
      ScoreChangeListener scoreChangeListener0 = mock(ScoreChangeListener.class, new ViolatedAssumptionAnswer());
      scoreScrollbar0.addScoreChangeListener(scoreChangeListener0);
      assertFalse(scoreScrollbar0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = new ScoreScrollbar((-2216), (-2216));
      ScoreChangeListener scoreChangeListener0 = mock(ScoreChangeListener.class, new ViolatedAssumptionAnswer());
      scoreScrollbar0.removeScoreChangeListener(scoreChangeListener0);
      ScoreChangeListener scoreChangeListener1 = mock(ScoreChangeListener.class, new ViolatedAssumptionAnswer());
      scoreScrollbar0.addScoreChangeListener(scoreChangeListener1);
      assertFalse(scoreScrollbar0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = new ScoreScrollbar(0, 230, 0, 0);
      assertTrue(scoreScrollbar0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = null;
      try {
        scoreScrollbar0 = new ScoreScrollbar(4535, 0, 4535, 4535);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // orientation must be one of: VERTICAL, HORIZONTAL
         //
         verifyException("javax.swing.JScrollBar", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ScoreScrollbar scoreScrollbar0 = new ScoreScrollbar((-2663), (-1967));
      scoreScrollbar0.removeScoreChangeListener((ScoreChangeListener) null);
      AdjustmentEvent adjustmentEvent0 = new AdjustmentEvent(scoreScrollbar0, 12, 12, 62);
      // Undeclared exception!
      try { 
        scoreScrollbar0.adjustmentValueChanged(adjustmentEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ScoreScrollbar", e);
      }
  }
}
