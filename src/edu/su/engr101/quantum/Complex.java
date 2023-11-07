/*
*  Complex.java
*/

package edu.su.engr101.quantum;

import java.lang.Math;

/**
*  Class for complex numbers x + i y.
*
*  @author put your names here
*/ 
public class Complex {
   private double _real;
   private double _imaginary;

   /** 
   *  Construct a complex number x + i y from the real part x and the
   *  imaginary part y.
   *
   *  @param real the real part
   *  @param imaginary the imaginary part
   */
   public Complex(double real, double imaginary) {
      _real = real;
      _imaginary = imaginary;
   }

   /**
   *  Get the real part x of a complex number x + i y.
   */
   public double get_real_part() {
      return _real;
   }

   /**
   *  Set the real part x of a complex number x + i y.
   *
   *  @param real the real part of the complex number
   */
   public void set_real_part(double real) {
      _real = real;
   }

   /**
   *  Get the imaginary part y of a complex number x + i y.
   */
   public double get_imaginary_part() {
      return _imaginary;
   }

   /**
   *  Set the imaginary part y of a complex number x + i y.
   *
   *  @param imaginary the imaginary part of the complex number
   */
   public void set_imaginary_part(double imaginary) {
      _imaginary = imaginary;
   }

   /**
   *  Add two complex numbers.
   *
   * @param z the complex number to add
   */
   public Complex add(Complex z) {
      double x1 = get_real_part() + z.get_real_part();
      double y1 = get_imaginary_part() + z.get_imaginary_part();
      return new Complex(x1, y1);
   }

   public Complex subtract(Complex z) {
      // Use add as an example then compute the difference betwteen two complex numbers.     
      return new Complex(0, 0);
   }

   public Complex multiply(Complex z) {
      // Use add as an example then compute the product of two complex numbers.
      return new Complex(0, 0);
   }

   public Complex conjugate() {
      // Fix this so that it computes the complex conjugate
      return new Complex(0, 0);
   }

   public Complex divide(Complex z) {
      // Use add as an example then compute the quotient of two complex numbers.
      return new Complex(0, 0);
   }

   /**
   *  Compute the magnitude of a complex number
   */
   public double magnitude() {
      double x = get_real_part();
      double y = get_imaginary_part();
      return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
   }

   public double angle() {
      return Math.atan2(get_imaginary_part(), get_real_part());
   }

   /**
   *  Determine if two complex numbers are equal.
   *
   *  @param z the complex number to compare
   */
   public boolean equals(Complex z) {
      // 
      return false;
   } 
   
   public String toString() {
      if ((get_real_part() == 0) && (get_imaginary_part() == 0)) {
         return "0";
      }
      else if (get_real_part() == 0) {
         return "i * " + get_imaginary_part();         
      }
      else if (get_imaginary_part() == 0) {
         return "" + get_real_part();         
      }
      return get_real_part() + " + i * " + get_imaginary_part();      
   }

   /**
   *  Construct the complex number 0.
   */
   public static Complex zero() {
      return new Complex(0, 0);
   }

   /**
   *  Construct the complex number 1.
   */
   public static Complex one() {
      // Fist this part
      return new Complex(0, 0);
   }

   /**
   *  Construct the complex number i.
   */
   public static Complex I() {
      // Fix this part.
      return new Complex(0, 0);
   }

   /**
   *  This main method can contain basic tests.  Try to use ComplexTest.java for 
   *  the majority of your testing.
   */
   public static void main(String[] args) {
   }
}
