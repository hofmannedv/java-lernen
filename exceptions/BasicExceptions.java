// ------------------------------------------------------------------
// Demonstrates usage of exceptions
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicExceptions
//
// Further reading: 
// * Java Errors and Exception Types
//   https://www.w3schools.com/java/java_ref_errors.asp
//
// * Division by Zero in Java: Exception, Infinity, or Not a Number
//   https://www.baeldung.com/java-division-by-zero
// ------------------------------------------------------------------

public class BasicExceptions {
  public static void simpleErrorMessage () {
    // single assignment
    int value1 = 5;                    // define integer with value '5' 
    int value2 = 0;                    // define integer with value '0'
    double result;                     // define result as double

    System.out.printf("current values: %d and %d\n", value1, value2);  // use %d as placeholder for int

    // try to divide value1 by value2
    try {
      result = value1 / value2;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void detailedErrorMessage () {
    // single assignment
    int value1 = 5;                    // define integer with value '5' 
    int value2 = 0;                    // define integer with value '0'
    double result;                     // define result as double

    System.out.printf("current values: %d and %d\n", value1, value2);  // use %d as placeholder for int

    // try to divide value1 by value2
    try {
      result = value1 / value2;
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException during calculation");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main (String[] args) {
    System.out.println("= Basic Error Handling =");
    simpleErrorMessage();
    System.out.println(" ");
    System.out.println("= Extended Error Handling =");
    detailedErrorMessage();
  }
}
