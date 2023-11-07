/**
*  ComplexTest.java
*/

package edu.su.engr101.tests.quantum;

import edu.su.engr101.quantum.Complex;

/**
*  Class for testing complex numbers.
*
*  @author put your names here
*/ 
public class ComplexTest {

   /** 
   *  Test addition of complex numbers.
   */
   public static void addTest() {
      System.out.println("addTest()");
      Complex z = new Complex(1,3 );
      Complex w = new Complex(-2,5);
      System.out.println("(" + z + ") + (" + w + ") = (" + z.add(w) + ")");
      System.out.println("");
   }

   public static void angleTest() {
      System.out.println("angleTest()");
      // Add a test here.
      System.out.println("");
   }

   public static void conjugateTest() {
      System.out.println("conjugateTest()");
      // Add a test here.
      System.out.println("");
   }

   /** 
   *  Test division of complex numbers.
   */
   public static void divideTest() {
      System.out.println("divideTest()");
      // Add a test here.
      System.out.println("");
   }

   /** 
   *  Test equality of complex numbers.
   */
   public static void equalsTest() {
      System.out.println("equalsTest()");
      Complex z = new Complex(1,3 );
      System.out.println("(" + z + ") = (" + z + ") " + z.equals(z));
      System.out.println("");
   }

   /** 
   *  Test the constant i.
   */
   public static void ITest() {
      System.out.println("ITest()");
      Complex i = Complex.I();
      System.out.println("The complex number i is: " + i.toString());
      System.out.println("");
   }

   /** 
   *  Test the magnitude of complex numbers.
   */
   public static void magnitudeTest() {
      System.out.println("magnitudeTest()");
      // Add a test here.
      System.out.println("");
   }

   /** 
   *  Test multiplication of complex numbers.
   */
   public static void multiplyTest() {
      System.out.println("multiplyTest()");
      Complex z = new Complex(1,3 );
      Complex w = new Complex(-2,5);
      System.out.println("(" + z + ") * (" + w + ") = (" + z.multiply(w) + ")");      
      System.out.println("");
   }

   /** 
   *  Test the constant 1.
   */
   public static void oneTest() {
      System.out.println("oneTest()");
      Complex one = new Complex(1,0 );
      System.out.println(one);
      System.out.println("");
   }

   /** 
   *  Test subtraction of complex numbers.
   */
   public static void subtractTest() {
      System.out.println("subtractTest()");
      // Add a test here.
      System.out.println("");
   }

   /** 
   *  Test the constant 0.
   */
   public static void zeroTest() {
      System.out.println("zeroTest()");
      // Add a test here.
      System.out.println("");
   }

   public static void main(String[] args) {
      addTest();
      angleTest();
      conjugateTest();
      divideTest();
      equalsTest();
      ITest();
      magnitudeTest();
      multiplyTest();
      oneTest();
      subtractTest();
      zeroTest();
   }

}
