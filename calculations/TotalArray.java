// ------------------------------------------------------------------
// Demonstrates the calculation of the total of a number of values
// stored in an array
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java TotalArray
// ------------------------------------------------------------------

public class TotalArray {
  public static void main (String[] args) {

    // define data as list of 5 integer values
    int length = 5;

    int[] data = new int[length]; 
    data[0] = 10;
    data[1] = 23;
    data[2] = 4;
    data[3] = 15;
    data[4] = 20;

    int total = 0;

    // calculate the total of data
    for (int value: data) {
      total += value;
    }

    // output the total value 
    System.out.printf("The total value is: %d\n", total);

  }
}
