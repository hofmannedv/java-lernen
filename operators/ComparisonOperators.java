// ------------------------------------------------------------------
// demonstrates usage of comparison operators
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java ComparisonOperators
//
// ------------------------------------------------------------------

public class ComparisonOperators {
  public static void isEqualInteger(int operand1, int operand2) {
    
    // compare the two operands using the == operator
    boolean result = operand1 == operand2;
    
    // output result
    if (result == true) {
      System.out.printf("'%d' and '%d' are equal. \n", operand1, operand2);
    } else {
      System.out.printf("'%d' and '%d' are not equal. \n", operand1, operand2);
    }
  }

  public static void isGreaterInteger(int operand1, int operand2) {
    
    // compare the two operands using the > operator
    boolean result = operand1 > operand2;
    
    // output result
    if (result == true) {
      System.out.printf("'%d' is greater than '%d'. \n", operand1, operand2);
    } else {
      System.out.printf("'%d' is lower than, or equal to '%d'. \n", operand1, operand2);
    }
  }

  public static void isLessInteger(int operand1, int operand2) {
    
    // compare the two operands using the < operator
    boolean result = operand1 < operand2;
    
    // output result
    if (result == true) {
      System.out.printf("'%d' is lower than '%d'. \n", operand1, operand2);
    } else {
      System.out.printf("'%d' is greater than, or equal to '%d'. \n", operand1, operand2);
    }
  }

  public static void main (String[] args) {

    // compare two integer values for equality
    isEqualInteger(15,10);
    isEqualInteger(15,15);

    // compare two integer values for greater than
    isGreaterInteger(15,10);
    isGreaterInteger(15,15);

    // compare two integer values for lower than
    isLessInteger(15,10);
    isLessInteger(15,15);
  }
}
