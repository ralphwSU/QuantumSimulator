/**
*  QuantumAlgorithms.java
*/

package edu.su.engr101.quantum;

import edu.su.engr101.quantum.Complex;
import edu.su.engr101.quantum.ComplexMatrix;
import edu.su.engr101.quantum.QuantumGateFactory;

/**
*  Class for quantum algorithms.
*
*  @author Ralph Wojtowicz
*/ 
public class QuantumAlgorithms {

   /**
   *  Compute the matrix Uf for a boolean function f:2^n -> 2.
   *  
   *  @param f an array of the values [f(0), f(1), ..., f(n-1)]
   *  @returns the complex matrix Uf.
   */
   private static ComplexMatrix Uf(boolean[] f) {
      int n = f.length;
      ComplexMatrix U = new ComplexMatrix(2 * n);
      // Compute the values.
      return U;
   }

   /** 
   *  Perform Deutsch's algorithm on a 
   *
   *  @returns true if f is balanced, false if f is constant
   */
   public static boolean Deutsch(boolean f0, boolean f1) {
      ComplexMatrix Uf;
      ComplexMatrix H = QuantumGateFactory.Hadamard();
//      ComplexMatrix I;
//      ComplexMatrix D = H.tensor(I).times(Uf.times(H.tensor(H)));
      return false;
   }

   /**
   *  Perform the Deutsch-Jozsa algorithm.
   */
   public static boolean Deutsch_Jozsa() {
      return false;
   }

   /**
   *  Perform the Simon's algorithm.
   */
   public static boolean[] Simon() {
      return new boolean[1];
   }

   public static boolean[] Grover() {
      return new boolean[1];
   }

   /**
   *  Shor's quantum factoring algorithm.  
   *
   *  @param N a positive integer for which we seek to find a factor
   *  @returns a factor of N
   */
   public static int Shor(int N) {
      return 1;
   }

   /**
   *  This main method can contain basic tests.  Try to use QuantumAlgorithmsTest.java
   *  for the majority of your testing.
   */
   public static void main(String[] args) {
   }
}
  
