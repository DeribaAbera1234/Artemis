/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:56:46 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.LineAttribute;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LineAttribute_ESTest extends LineAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LineAttribute lineAttribute0 = null;
      try {
        lineAttribute0 = new LineAttribute((DNADraw) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.LineAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DNADraw dNADraw0 = new DNADraw((Vector) null, (Vector) null, (Vector) null, (Vector) null);
      LineAttribute lineAttribute0 = null;
      try {
        lineAttribute0 = new LineAttribute(dNADraw0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }
}
