/**
*  QuantumGateFactoryTest.java
*/

package edu.su.engr101.tests.quantum;

import edu.su.engr101.quantum.Complex;
import edu.su.engr101.quantum.ComplexMatrix;
import edu.su.engr101.quantum.QuantumGateFactory;

/**
*  Class for testing the QuantumGateFactory class.
*
*  @author put your names here
*/ 
public class QuantumGateFactoryTest {
  
   /**
   *  Test that X^2 = I.
   */
   public static boolean Xsquared_equals_I_test() {
      ComplexMatrix X = QuantumGateFactory.X();
      ComplexMatrix X2 = X.multiply(X);
      ComplexMatrix I2 = QuantumGateFactory.identity(2);
      return X2.equals(I2);
   }

   /**
   *  Test that Y^2 = I.
   */
   public static boolean Ysquared_equals_I_test() {
      // See the X^2=I test.
      // Fix this.
      return false;
   }

   /**
   *  Test that Z^2 = I.
   */
   public static boolean Zsquared_equals_I_test() {
      // fix this.
      return false;
   }

   /**
   *   Test that H = (1/sqrt(2)) * (X + Z)
   */
   public static boolean H_equals_X_plus_Z_over_sqrt2_test() {
      ComplexMatrix H = QuantumGateFactory.Hadamard();
      ComplexMatrix X = QuantumGateFactory.X();
      ComplexMatrix Z = QuantumGateFactory.Z();
      ComplexMatrix X_plus_Z = X.add(Z);
      ComplexMatrix X_plus_Z_over_sqrt2 = X_plus_Z.scalar_multiply(new Complex(1/Math.sqrt(2), 0));
      return H.equals(X_plus_Z_over_sqrt2);
   }

   // Test that X = H*Z*H
   public static boolean X_equals_HZH_test() {
      ComplexMatrix Z = QuantumGateFactory.Z();
      ComplexMatrix X = QuantumGateFactory.X();
      ComplexMatrix H = QuantumGateFactory.Hadamard();
      //ComplexMatrix HZH = ???;                          // Fix this
      return false;
   }

   // Test that Z = H*X*H
   public static boolean Z_equals_HXH_test() {
      // Fix this.
      return false;
   }

   // Test that Y = -H*Y*H
   public static boolean Y_equals_neg_HYH_test() {
      ComplexMatrix Y = QuantumGateFactory.Y();
      ComplexMatrix H = QuantumGateFactory.Hadamard();
      ComplexMatrix HYH = H.multiply(Y.multiply(H));
      ComplexMatrix neg_HYH = HYH.scalar_multiply(new Complex(-1, 0));
      return Y.equals(neg_HYH);
   }

   // Test that S = T^2
   public static boolean S_equals_T_squared_test() {
      // Fix this.
      return false;
   }

   // Test that Y = -X*Y*X
   public static boolean Y_equals_neg_XYX_test() {
      ComplexMatrix Y = QuantumGateFactory.Y();
      ComplexMatrix X = QuantumGateFactory.X();
      ComplexMatrix XYX = X.multiply(Y.multiply(X));
      ComplexMatrix neg_XYX = XYX.scalar_multiply(new Complex(-1, 0));
      return Y.equals(neg_XYX);
   }

   // Test that SqrtNOT*SqrtNOT = NOT
   public static boolean SqrtNOT_test() {
      ComplexMatrix SqrtNOT  = QuantumGateFactory.SqrtNOT();
      ComplexMatrix SqrtNOT2 = SqrtNOT.multiply(SqrtNOT);
      ComplexMatrix NOT      = QuantumGateFactory.NOT();
      return false;                                          // Fix this.
   }

   /**
   *  Test that Toffoli^2 = I
   */
   public static boolean Toffoli2_equals_I_test() {
      ComplexMatrix T = QuantumGateFactory.Toffoli();
      ComplexMatrix T2 = T.multiply(T);
      ComplexMatrix I8 = QuantumGateFactory.identity(8);
      return T2.equals(I8);
   }

   /**
   *  Test that Fredkin^2 = I
   */
   public static boolean Fredkin2_equals_I_test() {
      // Compare the Toffoli test.
      // Fix this.
      return false;
   }

   /**
   *  main method that runs all the tests.
   */
   public static void main(String[] args) {
      boolean b;
  
      b = QuantumGateFactoryTest.Xsquared_equals_I_test();
      System.out.println("Xsquared_equals_I_test " + b);

      b = QuantumGateFactoryTest.Ysquared_equals_I_test();
      System.out.println("Ysquared_equals_I_test " + b);

      b = QuantumGateFactoryTest.Zsquared_equals_I_test();
      System.out.println("Zsquared_equals_I_test " + b);

      b = QuantumGateFactoryTest.H_equals_X_plus_Z_over_sqrt2_test();
      System.out.println("H_equals_X_plus_Z_over_sqrt2_test " + b);

      b = QuantumGateFactoryTest.S_equals_T_squared_test();
      System.out.println("S_equals_T_squared_test " + b);

      b = QuantumGateFactoryTest.SqrtNOT_test();
      System.out.println("SqrtNOT_test() " + b);

      b = QuantumGateFactoryTest.Y_equals_neg_HYH_test();
      System.out.println("Y_equals_neg_HYH_test() " + b);

      b = QuantumGateFactoryTest.Z_equals_HXH_test();
      System.out.println("Z_equals_HXH_test() " + b);

      b = QuantumGateFactoryTest.X_equals_HZH_test();
      System.out.println("X_equals_HZH_test() " + b);

      b = QuantumGateFactoryTest.Toffoli2_equals_I_test();
      System.out.println("Toffoli2_equals_I_test " + b);

      b = QuantumGateFactoryTest.Fredkin2_equals_I_test();
      System.out.println("Fredkin2_equals_I_test " + b);
   }
}
