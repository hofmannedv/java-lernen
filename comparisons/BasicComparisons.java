// ------------------------------------------------------------------
// Demonstrates basic comparisons
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicComparisons.java
// ------------------------------------------------------------------

public class BasicComparisons {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {10, 15, 20};

    // go through the dataset as a list
    for (int position = 0; position < data.length; position++) {
      int value = data[position];
      if (value == 15) {
        System.out.printf("value has the requested value of 15\n");
      } else if (value < 15) {
        System.out.printf("value has a smaller value than 15 (%d)\n", value);
      } else {
        System.out.printf("value has a different value than 15 (%d)\n", value);
      }
    }
  }
}
