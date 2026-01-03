// ------------------------------------------------------------------
// demonstrates testing for a specific condition 
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java Condition
//
// ------------------------------------------------------------------

public class Condition {
  public static void main (String[] args) {

    // define variables
    int result = 95;                   // integer with test result

    // simple test for a value using if keyword
    // message is printed only if condition is met
    if (result > 50) {
       System.out.println("Bravo -- you have passed the test!");
    }
  }
}
