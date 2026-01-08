// ------------------------------------------------------------------
// Demonstrates how to assign a fixed value to a variable
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Constants
// ------------------------------------------------------------------

public class Constants {
  public static void main (String[] args) {

    // single assignment
    final int postcode = 14467;        // fixed integer assignment with value '14467' 

    System.out.printf("current postcode: %d\n", postcode);    // use %d as placeholder for int

    // try to increase the value
    try {
      postcode = position + 1;         // try to increase the stored value
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.printf("new postcode: %d\n", postcode);    // use %d as placeholder for int
  }
}
