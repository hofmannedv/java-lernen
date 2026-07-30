// ------------------------------------------------------------------
// Demonstrates extended comparisons using switch-case
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

public class ExtendedComparisons {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {10, 15, 20};

    // go through the dataset as a list
    for (int position = 0; position < data.length; position++) {
      int value = data[position];
      switch (value) {
        case 10:
          System.out.printf("value is 10\n");
          break;
        case 15:
          System.out.printf("value is 15\n");
          break;
        default:
          System.out.printf("value is neither 10, nor 15 (%d)\n", value);
      }
    }
  }
}
