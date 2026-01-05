// ------------------------------------------------------------------
// Demonstrates the scope of a variable
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java VariableScope
// ------------------------------------------------------------------

public class VariableScope {
  public static void main (String[] args) {

    // single assignment
    int postcode = 14467;              // integer assignment with value '14467' 
    System.out.printf("postcode: %d\n", postcode);    // print current value

    for (int position = 1; position < 5; position += 1) {
        postcode = position * 10000;
        System.out.printf("postcode: %d\n", postcode);// print current value
    }

    System.out.printf("postcode: %d\n", postcode);    // print current value
    
    // accessing position fails: out of scope
    // System.out.printf("position: %d\n", position);    // print current value
  }
}
