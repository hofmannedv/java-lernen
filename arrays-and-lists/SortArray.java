// ------------------------------------------------------------------
// Demonstrates how to sort an array using the built-in method sort()
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java SortArray
// ------------------------------------------------------------------

import java.util.Arrays;

public class SortArray {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {67, 3, 39, 12, 40}; 

    // print the content of the array
    System.out.println("Unsorted:");
    for (int value: data) {
      System.out.printf("%d ", value);
    }
    System.out.printf("\n\n");

    // sort the data in ascending order
    Arrays.sort(data);

    // print the content of the array
    System.out.println("Sorted in ascending order:");
    for (int value: data) {
      System.out.printf("%d ", value);
    }
    System.out.printf("\n");

  }
}
