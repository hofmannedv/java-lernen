// ------------------------------------------------------------------
// Demonstrates determination of even, and odd values using modulo operator
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Modulo
//
// ------------------------------------------------------------------

public class Modulo {
  public static boolean isEven(int value) {
    
    // test the value, and return true if value is even
    boolean result = value % 2 == 0;
    return result;
  }

  public static void main (String[] args) {

    // define array of values to be tested
    int[] numbers = {394, 6, 15, 2, 88, 153};
    for (int item: numbers) {
      if (isEven(item)) {
        System.out.println(item + " is an even number");
      } else {
        System.out.println(item + " is an odd number");
      }
    }
  }
}
