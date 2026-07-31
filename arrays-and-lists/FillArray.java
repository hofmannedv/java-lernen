// ------------------------------------------------------------------
// Demonstrates how to fill an array entirely with identical values
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java FillArray
// ------------------------------------------------------------------

import java.util.Arrays;

public class FillArray {
  public static void main (String[] args) {

    // define data as list of 5 empty fields
    int[] data = new int[5]; 

    // fill the entire array with the value of 10 per field
    Arrays.fill(data, 10);

    // print the content of the array
    for (int value: data) {
      System.out.printf("value: %d\n", value);
    }

  }
}
