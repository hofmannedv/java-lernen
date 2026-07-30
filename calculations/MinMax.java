// ------------------------------------------------------------------
//
// demonstrates the detection of the minimal, and maximal value in a 
// simple array
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java MinMax
// ------------------------------------------------------------------

public class MinMax {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {10, 23, 4, 15, 20};

    int minimum = data[0];    // assume that the first entry is the minimum
    int maximum = data[0];    // assume that the first entry is the maximum

    // go through the data one by one
    for (int value: data) {
      if (value < minimum) {
        minimum = value;
      }

      if (value > maximum) {
        maximum = value;
      }
    }

    // output both the minimum, and the maximum
    System.out.printf("%d is the minimal value from the list.\n", minimum);
    System.out.printf("%d is the maximal value from the list.\n", maximum);

  }
}
