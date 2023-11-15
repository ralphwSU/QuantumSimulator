/**
*  ComplexMatrixTest.java
*/

package edu.su.engr101.tests.quantum;

import edu.su.engr101.quantum.Complex;
import edu.su.engr101.quantum.ComplexMatrix;


/**
*  Class for testing complex matrices.
*
*  @author Madison Harris
*  @author Keyri Arevalo Argueta
*  @author Stephanie Edlich
*/ 
public class ComplexMatrixTest {

   // Write a test for matrix addition.
   public static void addTest1() {
      System.out.println("Create the matrix m = [[i,2], [1+i,3]] then add it to matrix c = [[i,2], [1+i,3]]");
      ComplexMatrix m = new ComplexMatrix(2);
      m.set_value(0,0, new Complex(0,1));
      m.set_value(0,1, new Complex(2,0));
      m.set_value(1,0, new Complex(1,1));
      m.set_value(1,1, new Complex(3,0));
      System.out.println(mm.toString());
   }

   // Write a test for the adjoint functio.
   public static void adjointTest() {
   System.out.println("Create the matrix m = [[i,2], [1+i,3]] then compute m.adjoint().");
      ComplexMatrix m = new ComplexMatrix(2);
      m.set_value(0,0, new Complex(0,1));
      m.set_value(0,1, new Complex(2,0));
      m.set_value(1,0, new Complex(1,1));
      m.set_value(1,1, new Complex(3,0));
      ComplexMatrix mm= m.adjoint();
      System.out.println(mm.toString());
   }

   // Write a test for the conjugate function.
   public static void conjugateTest(){ 
   System.out.println("Create the matrix m = [[i,2], [1+i,3]] then compute m.conjugate().");
      ComplexMatrix m = new ComplexMatrix(2);
      m.set_value(0,0, new Complex(0,1));
      m.set_value(0,1, new Complex(2,0));
      m.set_value(1,0, new Complex(1,1));
      m.set_value(1,1, new Complex(3,0));
      ComplexMatrix mm= m.conjugate();
      System.out.println(mm.toString());
      
   }

   // Write a test for the equals function.
   public static void equalsTest() {
   }

   // Write a test for the multiply function.
   public static void multiplyTest() {
      System.out.println("Create the matrix m = [[i,2], [1+i,3]] then compute m*m.");
      ComplexMatrix m = new ComplexMatrix(2);
      m.set_value(0,0, new Complex(0,1));
      m.set_value(0,1, new Complex(2,0));
      m.set_value(1,0, new Complex(1,1));
      m.set_value(1,1, new Complex(3,0));
      ComplexMatrix mm = m.multiply(m);
      System.out.println(mm.toString());
   }

   // Write a test for the scalar_multiply function.
   public static void stalar_multiplyTest() {
   }

   // Write a test for the tensor function
   public static void tensorTest() {
   }

   // Write a test for the toString function.
   public static void toStringTest() {
      // Create a 2x2 matrix
      ComplexMatrix m = new ComplexMatrix(2);
      System.out.println("Create a 2x2 matrix of zeros.");
      System.out.println(m.toString());

      // Create the 2x2 matrix [[i,2], [1+i,3]]
      System.out.println("Create the matrix [[i,2], [1+i,3]].");
      ComplexMatrix m2 = new ComplexMatrix(2);
      m2.set_value(0,0, new Complex(0,1));
      m2.set_value(0,1, new Complex(2,0));
      m2.set_value(1,0, new Complex(1,1));
      m2.set_value(1,1, new Complex(3,0));
      System.out.println(m2.toString());
   }

   // Write a test for the transpose function.
   public static void transposeTest() {
   }

   public static void main(String[] args) {
      toStringTest();
      multiplyTest();
      conjugateTest();
      adjointTest();

      // Run each test here after you have implemented it.
   }

}
