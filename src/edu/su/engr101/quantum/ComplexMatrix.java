/*
*  ComplexMatrix.java
*/

package edu.su.engr101.quantum;

/**
*  Class for complex matrices.
*
*  @author Madison Harris
*  @author Keyri Arevalo Argueta
*  @author Stephanie Edlich
*/ 
public class ComplexMatrix {
   private int n;
   private Complex m[][];

   /** 
   *  This creates a new n x n matrix of zeros.
   *
   *  @param size the number of rows (= number of columns)
   *  @returns a square matrix of zeros
   */
   public ComplexMatrix(int size) {
      n = size;
      m = new Complex[size][size];
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            set_value(row, col, Complex.zero());
         }
      }
   }

   public Complex get_value(int row, int col) {
      return m[row][col];
   }

   /**
   *  Set a value in a complex matrix.
   *
   *  @param row the row
   *  @param col the column
   *  @param value the value to put in the specified location
   */
   public void set_value(int row, int col, Complex value) {
      m[row][col] = value;
   }

   /**
   *  Get the size of the matrix.
   */
   public int get_size() {
      return n;
   }

   /**
   *  Compute the transpose of a matrix.
   */
   public ComplexMatrix transpose() {
      n = get_size();
      ComplexMatrix t = new ComplexMatrix(n);
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            t.set_value(col, row,  get_value(row, col));        
         }
      }
      return t;
   }

   /**
   *  Compute the conjugate of a complex matrix.
   */
   public ComplexMatrix conjugate() {
      n = get_size();
      ComplexMatrix c = new ComplexMatrix(n);
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            c.set_value(row, col, get_value(row, col).conjugate());      
         }
      }
      return c;
   }

   /**
   *  Compute the adjoint (conjugate transpose) of a complex matrix.
   */
   public ComplexMatrix adjoint() {
      return conjugate().transpose();   
   }

   /**
   *  Add this complex matrix to another one of the same size.
   *
   *  @param w a complex matrix to add to this one
   */
   public ComplexMatrix add(ComplexMatrix w) {
      int n = get_size();
      ComplexMatrix result = new ComplexMatrix(n);
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            Complex w1 = get_value(row, col);
            Complex w2 = w.get_value(row, col);
            result.set_value(row, col, w1.add(w2));        
         }
      }
      return result;
   }

   /**
   *  Multiply a complex matrix by a complex number.
   *
   *  @param z the complex number by which to multiply
   */
   public ComplexMatrix scalar_multiply(Complex z) {
      int n = get_size();
      ComplexMatrix result = new ComplexMatrix(n);
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            //result.set_value(row, col, 0);         // Fix this
         }
      }
      return result;
   }

   /**
   *  Multiply this complex matrix by another one of the same size.  Note that
   *  matrix multiplication is not commutative.  This method computes this * other
   *  not other * this.
   *
   *  @param w a complex matrix to mutiply by this one
   */
   public ComplexMatrix multiply(ComplexMatrix w) {
      int n = get_size();
      ComplexMatrix result = new ComplexMatrix(n);
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            Complex value = Complex.zero();
            for (int k = 0; k < n; k++) {
               Complex w1 = get_value(row, k);
               Complex w2 = w.get_value(k, col);
               Complex w3 = w1.multiply(w2);
               //value = new Complex(0, 0);                         // Fix this
            }
            result.set_value(row, col, value);
         }
      }
      return result;
   }

   /** 
   *  Compute the tensor product $m1\otimes m2$ of two matrices.
   *
   *  @param w the matrix to multiply by
   */
   public ComplexMatrix tensor(ComplexMatrix w) {
      int n1 = get_size();
      int n2 = w.get_size();
      ComplexMatrix t = new ComplexMatrix(n1 * n2);
      for (int row = 0; row < n1*n2 ; row++) {
         for (int col = 0; col < n1*n2; col++) {
            int r1 = row / n2;
            int c1 = col / n2;
            int r2 = row % n2;
            int c2 = col % n2;
            Complex w1 = get_value(r1, c1);
            Complex w2 = w.get_value(r2, c2);
            t.set_value(row, col, w1.multiply(w2));
         }
      }
      return t;
   }

   /**
   *  Determine if two complex matrices are equal.
   *  
   *  @param w a complex matrix to which to compare this one.
   */
   public boolean equals(ComplexMatrix w) {
      int n = get_size();
      for (int row = 0; row < n; row++) {
         for (int col = 0; col < n; col++) {
            if (!get_value(row, col).equals(w.get_value(row, col))) {
               return false;
            }
         }
      }
      return true;
   }

   /**
   *  Create a string representation of a complex matrix.
   */
   public String toString() {
      String s = "";
      for (int row = 0; row < n; row++) {
         s += "| ";
         for (int col = 0; col < n; col++) {
            s += "(" + get_value(row, col).toString() + ") ";
         }
         s += "|\n";
      }
      return s;
   }

   /**
   *  This main method can contain basic tests.  Try to use ComplexMatrixTest.java
   *  for the majority of your testing.
   */
   public static void main(String[] args) {
   }
}
