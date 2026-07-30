// ------------------------------------------------------------------
// Demonstrates basic comparisons in combination with logical AND
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicComparisonsLogicalAnd.java
// ------------------------------------------------------------------

public class BasicComparisonsLogicalAnd {
  public static void main (String[] args) {

    // define two values
    int data1 = 10;
    int data2 = 15;

    // use && for an incomplete analysis
    if (data1 == 10 && data2 == 15) {
        System.out.printf("data1 has the value of 10, and data2 has 15 \n");
    } else {
      System.out.printf("values do not match the requirements");
    }
  }
}
