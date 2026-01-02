// ------------------------------------------------------------------
// demonstrates different arithmetic operators used in Java
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java ArithmeticOperators
//
// ------------------------------------------------------------------

public class ArithmeticOperators {
  public static void negateInteger(int operand) {
    
    // negate the value of the given operand
    int result = -1 * operand;
    
    // output result
    System.out.printf("the negation of %d is %d. \n", operand, result);
  }

  public static void negateFloat(float operand) {
    
    // negate the value of the given operand
    float result = -1 * operand;
    
    // output result
    System.out.printf("the negation of %f is %f. \n", operand, result);
  }

  public static void addInteger(int operand1, int operand2) {
    
    // calculate sum based of the two parameters
    int sum = operand1 + operand2;
    
    // output result
    System.out.printf("the sum of %d and %d is %d. \n", operand1, operand2, sum);
  }

  public static void addFloat(float operand1, float operand2) {
    
    // calculate sum based of the two parameters
    float sum = operand1 + operand2;
    
    // output result
    System.out.printf("the sum of %f and %f is %f. \n", operand1, operand2, sum);
  }

  public static void subtractInteger(int operand1, int operand2) {
    
    // calculate difference between the two parameters
    int difference = operand1 - operand2;
    
    // output result
    System.out.printf("the difference between %d and %d is %d. \n", operand1, operand2, difference);
  }

  public static void subtractFloat(float operand1, float operand2) {
    
    // calculate difference between the two parameters
    float difference = operand1 - operand2;
    
    // output result
    System.out.printf("the difference between %f and %f is %f. \n", operand1, operand2, difference);
  }

  public static void multiplyInteger(int operand1, int operand2) {
    
    // calculate product of the two parameters
    int product = operand1 * operand2;
    
    // output result
    System.out.printf("the product of %d and %d is %d. \n", operand1, operand2, product);
  }

  public static void multiplyFloat(float operand1, float operand2) {
    
    // calculate product of the two parameters
    float product = operand1 * operand2;
    
    // output result
    System.out.printf("the product of %f and %f is %f. \n", operand1, operand2, product);
  }

  public static void main (String[] args) {

    // variable assignments
    boolean isAvailable = true;        // boolean assignment with value 'true'
    byte amount = 5;                   // byte assignment with value '5' 
    short width = -45;                 // short assignment with value '-45' 
    char letter = '%';                 // character assignment with value '%'
    int postcode = 14467;              // integer assignment with value '14467' 
    long height = 135792468;           // long assignment with value '135792468' 
    float weight = 1.25f;              // float assignment with value 1.25
    double size = 2.25;                // double assignment with value 2.25
    String colour = "blue";            // string assignment with value 'blue'

    // arithmetic operators
    // * negation
    System.out.println("= Negation =");
    negateInteger(10);                 // negate a positive integer
    negateInteger(-10);                // negate a negative integer
    negateFloat(10.0f);                // negate a positive integer
    negateFloat(-10.0f);               // negate a negative integer
    System.out.println(" ");

    // * addition: +
    System.out.println("= Addition =");
    addInteger(10, 15);                // add two positive integer values
    addInteger(10, -15);               // add a positive, and a negative integer value
    addFloat(10.0f, -1.23f);           // add two float values
    addFloat(10, -1.23f);              // add integer, and float value with automatic type conversion
    System.out.println(" ");

    // * subtraction: -
    System.out.println("= Subtraction =");
    subtractInteger(10, 15);           // subtract two positive integer values from each other
    subtractInteger(10, -15);          // subtract a positive, and a negative integer value from each other
    subtractFloat(10.0f, -1.23f);      // subtract two float values from each other
    subtractFloat(10, -1.23f);         // subtract integer, and float value with automatic type conversion
    System.out.println(" ");

    // * increment: ++
    System.out.println("= Increment =");

    // * decrement: --
    System.out.println("= Decrement =");

    // * multiplication: *
    System.out.println("= Multiplication =");
    multiplyInteger(10, 15);           // multiply two positive integer values with each other
    multiplyInteger(10, -15);          // multiply a positive, and a negative integer value with each other
    multiplyFloat(10.0f, -1.23f);      // multiply two float values with each other
    multiplyFloat(10, -1.23f);         // multiply integer, and float value with each other, automatic type conversion
    System.out.println(" ");

    // * division: /
    System.out.println("= Division =");

    // * modulo: %
    System.out.println("= Modulo operation =");
  }
}
