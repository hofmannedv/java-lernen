// ------------------------------------------------------------------
// Demonstrates basic comparisons in combination with logical OR
// Short version: incomplete analysis
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicComparisonsLogicalOr.java
// ------------------------------------------------------------------

public class BasicComparisonsLogicalOr {
  public static void main (String[] args) {

    // define two values
    int data1 = 12;
    int data2 = 15;

    // use || for incomplete analysis
    if (data1 == 10 || data2 == 15) {
        System.out.printf("either data1 has the value of 10, or data2 has 15 \n");
    } else {
      System.out.printf("minimal requirements are not met");
    }
  }
}
