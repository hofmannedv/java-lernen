// ------------------------------------------------------------------
// demonstrates usage of a for loop
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java ForLoop
//
// ------------------------------------------------------------------

public class ForLoop {
  public static void main (String[] args) {

    int i = 0;

    // basic for loop
    // print the numbers 0 to 4, one value per line
    for (i = 0; i < 5; i++) {
      System.out.printf("value: %d \n", i);
    }

    // print even numbers between 1 to 10, one value per line
    for (i = 1; i < 11; i++) {
      // check for a remainder of 0 which is true for even numbers, only
      if (i % 2 == 0) {
        System.out.printf("value: %d \n", i);
      }
    }
  }
}

