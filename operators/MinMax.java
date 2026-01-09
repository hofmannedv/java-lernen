// ------------------------------------------------------------------
// Demonstrates determination of minimal, and maximal value in a list
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java MinMax
//
// ------------------------------------------------------------------

public class MinMax {
  public static void main (String[] args) {

    // define array of values to be tested
    int[] numbers = {394, 6, 15, 2, 88, 153};

    // define minimal, and maximal value 
    int minimal = numbers[0];
    int maximal = numbers[0];

    for (int item: numbers) {
      // assign new minimal value if discovered
      if (item < minimal) {
        minimal = item;
      }
      
      // assign new maximal value if discovered
      if (item > maximal) {
        maximal = item;
      }
    }
      
    // print outcome
    System.out.println("the minimum is " + minimal);
    System.out.println("the maximum is " + maximal);
  }
}
