// ------------------------------------------------------------------
// Demonstrates how to count, and output call parameters
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java CountParameters value1 value2 ... value(n)
// Subsitute 'value1', 'value2', and 'value(n)' by the actual values 
// of the call parameters
// ------------------------------------------------------------------

public class CountParameters {
  public static void main (String[] parameters) {
    // count for parameters
    if (parameters.length == 0) {
      // program call without any parameters
      System.out.println("this program has not been called with any parameters at all");
    } else {
      // print the parameters one after the next
      System.out.println("this program has been called with " + parameters.length + " parameter(s) as follows:");
      for (String currentParameter: parameters) {
        System.out.println("parameter: " + currentParameter);
      }
    }
  }
}
