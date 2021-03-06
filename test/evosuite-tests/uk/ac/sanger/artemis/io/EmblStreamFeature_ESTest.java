/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:42:41 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedReader;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.MalformedInputException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmblStreamFeature_ESTest extends EmblStreamFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(charArrayReader0);
      EmblStreamFeature emblStreamFeature0 = EmblStreamFeature.readFromStream(linePushBackReader0);
      assertNull(emblStreamFeature0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-86);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)8);
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pushbackInputStream0, charsetDecoder0);
      BufferedReader bufferedReader0 = new BufferedReader(inputStreamReader0, (byte)21);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(bufferedReader0);
      try { 
        EmblStreamFeature.readFromStream(linePushBackReader0);
        fail("Expecting exception: MalformedInputException");
      
      } catch(MalformedInputException e) {
         //
         // Input length = 1
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmblStreamFeature.readFromStream((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.PublicDBStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = null;
      try {
        emblStreamFeature0 = new EmblStreamFeature((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.PublicDBStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Key key0 = Key.CDS;
      QualifierVector qualifierVector0 = new QualifierVector();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature(key0, (Location) null, qualifierVector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature(genbankStreamFeature0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(1140);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pipedReader0);
      try { 
        EmblStreamFeature.readFromStream(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      Feature feature0 = emblStreamFeature0.copy();
      assertNotSame(emblStreamFeature0, feature0);
  }
}
