// ------------------------------------------------------------------
// demonstrates usage of logical operators
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java LogicalOperators
//
// ------------------------------------------------------------------

public class LogicalOperators {
  public static void main (String[] args) {

    // define variables
    int a = 3;
    int b = 5;

    // AND with full evaluation of all conditions
    if ((a == 3) & (b == 5)) {
      System.out.println("both conditions are met");
    } else {
      System.out.println("both conditions are not met");
    }

    // AND with short evaluation; stop further evaluation at first mismatch
    if ((a == 2) && (b == 5)) {
      System.out.println("both conditions are met");
    } else {
      System.out.println("both conditions are not met");
    }

    // OR with full evaluation of all conditions
    if ((a == 3) | (b == 5)) {
      System.out.println("all conditions are met");
    } else {
      System.out.println("none of the conditions are met");
    }

    // OR with short evaluation; stop further evaluation at first mismatch
    if ((a == 2) || (b == 5)) {
      System.out.println("at least one condition is met");
    } else {
      System.out.println("none of the conditions are met");
    }

    // NOT with full evaluation
    if (!(a == 2)) {
      System.out.println("condition is not met");
    } else {
      System.out.println("condition is not met");
    }

  }
}
