// ------------------------------------------------------------------
// demonstrates testing for a specific condition (short version using
// the ternary operator)
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java ConditionShort
//
// ------------------------------------------------------------------

public class ConditionShort {
  public static void main (String[] args) {

    // define variables
    int result = 95;                   // define integer with test result

    // simple test for a value using ternary operator
    // if result > 50 the output is 'passed', and otherwise 'failed'
    String message = (result > 50) ? "passed" : "failed";
    System.out.println("You have " + message + " the test.");
  }
}
