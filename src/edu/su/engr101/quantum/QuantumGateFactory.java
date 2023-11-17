/*
 * QuantumGateFactory.java
 */

package edu.su.engr101.quantum;

import java.lang.Math.*;

//import edu.su.engr101.quantum.ComplexMatrix;

/**
*  Class with static methods for creating several common quantum gates.
*
*  @author Ralph Wojtowicz
*  @version Fall 2023
*/
public class QuantumGateFactory {

   /**
   *  Create the identity matrix of a specified size.
   *
   *  @param n the size of the matrix
   */
   public static ComplexMatrix identity(int n) {
      ComplexMatrix Identity = new ComplexMatrix(n);
      for (int i = 0; i < n; i++) {
          Identity.set_value(i, i, new Complex(1, 0));
      }
      return Identity;
   }

   /**
   *  This is the matrix [[0,1], [1,0]].
   */
   public static ComplexMatrix X() {
      int n = 2;
      ComplexMatrix X = new ComplexMatrix(n);
      X.set_value(0,1, new Complex(1, 0));
      X.set_value(1,0, new Complex(1, 0));
      return X;
   }

   /**
   *  This is the matrix [[0,-i], [i,0]].
   */
   public static ComplexMatrix Y() {
      int n = 2;
      ComplexMatrix Y = new ComplexMatrix(n);
      Y.set_value(0,1, new Complex(0, -1));                    // Fix these two lines
      Y.set_value(1,0, new Complex(0, 1));
      return Y;
   }

   /**
   *  This is the matrix [[1,0], [0,-1]].
   */
   public static ComplexMatrix Z() {
      int n = 2;
      ComplexMatrix Z = new ComplexMatrix(n);
      Z.set_value(0,0, new Complex(1,0));                    // Fix these two lines
      Z.set_value(1,1, new Complex(0,-1));
      return Z;
   }


   /**
   *  This is the matrix [[1,0], [0,i]].
   */
   public static ComplexMatrix S() {
      int n = 2;
      ComplexMatrix S = new ComplexMatrix(n);
      S.set_value(0,0, new Complex(1,0));                    // Fix these two lines
      S.set_value(1,1, new Complex(0,1));
      return S;
   }

   /**
   *  This is the matrix [[1,0], [0,(1 + i)/sqrt(2)]].
   */
   public static ComplexMatrix T() {
      int n = 2;
      ComplexMatrix T = new ComplexMatrix(n);
      T.set_value(0,0, new Complex(1, 0));
      T.set_value(1,1, new Complex(1/Math.sqrt(2), 1/Math.sqrt(2)));
      return T;
   }

   /**
   *  This is the matrix 
   */
   public static ComplexMatrix Hadamard() {
      int n = 2;
      ComplexMatrix Hadamard = new ComplexMatrix(n);
      Hadamard.set_value(0,0, new Complex(1/Math.sqrt(2),  0));
      Hadamard.set_value(0,1, new Complex(1/Math.sqrt(2),  0));          
      Hadamard.set_value(1,0, new Complex(1/Math.sqrt(2), 0));
      Hadamard.set_value(1,1, new Complex(-1/Math.sqrt(2), 0));
      return Hadamard;
   }

   /**
   *  This is the matrix [[0,-1], [1,0]].
   */
   public static ComplexMatrix NOT() {
      int n = 2;
      ComplexMatrix NOT = new ComplexMatrix(n);
      NOT.set_value(0, 0, Complex.zero());
      NOT.set_value(0, 1, Complex.zero());                // Fix the next three lines.
      NOT.set_value(1, 0, Complex.one());
      NOT.set_value(1, 1, Complex.one());
      return NOT;
   }

   /**
   *  This is the matrix [[1/sqrt(2),-1/sqrt(2)], [1/sqrt(2),1/sqrt(2)]].
   */
   public static ComplexMatrix SqrtNOT() {
      int n = 2;
      ComplexMatrix SqrtNOT = new ComplexMatrix(n);
      SqrtNOT.set_value(0,0, new Complex(1/Math.sqrt(2),  0));
      //SqrtNOT.set_value(0,1, ???);          // Fix the next three lines.
      //SqrtNOT.set_value(1,0, ???);
      //SqrtNOT.set_value(1,1, ???);
      return SqrtNOT;
   }

   /** 
   *  This is the 4x4 matrix [[1,0,0,0], [0,1,0,0], [0,0,0,1], [0,0,1,0]]
   */
   public static ComplexMatrix ControlledNOT() {
      int n = 2;
      ComplexMatrix ControlledNOT = new ComplexMatrix(2);
      // Set the values.
      return ControlledNOT;
   }

   /**
   *  This is the 8x8 matrix [[1,0,0,0,0,0,0,0], [0,1,0,0,0,0,0,0], [0,0,1,0,0,0,0,0], [0,0,0,1,0,0,0,0],
   *  [0,0,0,0,1,0,0,0], [0,0,0,0,0,1,0,0], [0,0,0,0,0,0,0,1], [0,0,0,0,0,0,1,0]].
   */
   public static ComplexMatrix Toffoli() {
     ComplexMatrix toffoli = new ComplexMatrix(8);
      for (int i = 0; i < 6; i++) {
         toffoli.set_value(i, i, new Complex(1, 0));
      }
      toffoli.set_value(6,7, new Complex(1, 0));
      toffoli.set_value(7,6, new Complex(1, 0));
      return toffoli;
   }

   /**
   *  This is the 8x8 matrix [[1,0,0,0,0,0,0,0], [0,1,0,0,0,0,0,0], [0,0,1,0,0,0,0,0], [0,0,0,1,0,0,0,0],
   *  [0,0,0,0,1,0,0,0], [0,0,0,0,0,0,1,0], [0,0,0,0,0,1,0,0], [0,0,0,0,0,0,0,1]]
   */
   public static ComplexMatrix Fredkin() {
      ComplexMatrix fredkin = new ComplexMatrix(8);
      // Follow the Toffoli example
      return fredkin;
   } 

   /**
   *  This main method can contain basic tests.  Try to use QuantumGateFactorTest.java
   *  for the majority of your testing.
   */
   public static void main(String[] args) {
   	System.out.println("x = \n" + QuantumGateFactory.X().toString());
   	System.out.println("y = \n" + QuantumGateFactory.Y().toString());
   	System.out.println("z = \n" + QuantumGateFactory.Z().toString());
   	System.out.println("s = \n" + QuantumGateFactory.S().toString());
   	System.out.println("t = \n" + QuantumGateFactory.T().toString());
   	System.out.println("hadamard = \n" + QuantumGateFactory.Hadamard().toString());
   	System.out.println("not = \n" + QuantumGateFactory.NOT().toString());
   }
}
