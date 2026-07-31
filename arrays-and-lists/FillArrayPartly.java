// ------------------------------------------------------------------
// Demonstrates how to fill an array partly with identical values
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java FillArrayPartly
// ------------------------------------------------------------------

import java.util.Arrays;

public class FillArrayPartly {
  public static void main (String[] args) {

    // define data as list of 5 empty fields
    int[] data = new int[5]; 

    // fill entries with index 1, 2, and 3 of the array with the value 
    // of 10; the others stay untouched, and have a value of 0
    Arrays.fill(data, 1, 4, 10);

    // print the content of the array
    for (int value: data) {
      System.out.printf("value: %d\n", value);
    }

  }
}
