// ------------------------------------------------------------------
// Demonstrates the calculation of the total of a number of values
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Total
// ------------------------------------------------------------------

public class Total {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {10, 23, 4, 15, 20};

    int total = 0;

    // calculate the total of data
    for (int value: data) {
      total += value;
    }

    // output the total value 
    System.out.printf("The total value is: %d\n", total);

  }
}
