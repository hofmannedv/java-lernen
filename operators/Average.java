// ------------------------------------------------------------------
// Demonstrates determination of the average of a list of items
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Average
//
// ------------------------------------------------------------------

public class Average {
  public static void main (String[] args) {

    // define array of values to be tested
    int[] numbers = {394, 6, 15, 2, 88, 153};

    // define average value, and total
    double average = 0.0;
    int total = 0;

    for (int item: numbers) {
      // calculate the total
      total = total + item;
    }
      
    average = (double) total / numbers.length;

    // print outcome
    System.out.printf("the average is %.2f\n", average);
  }
}
