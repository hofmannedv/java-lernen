// ------------------------------------------------------------------
// Demonstrates how to sort an array in reverse order using a loop
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java SortArrayReverseLoop
// ------------------------------------------------------------------

import java.util.Arrays;

public class SortArrayReverseLoop {
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

    // define an array of similar size
    int dataReversed[] = new int[data.length];
    int reversedPosition = 0;
    for (int position = data.length - 1; position > -1; position--) {
        dataReversed[reversedPosition] = data[position];
        reversedPosition++;
    }

    // print the content of the array
    System.out.println("Sorted in descending order:");
    for (int value: dataReversed) {
      System.out.printf("%d ", value);
    }
    System.out.printf("\n");

  }
}
