// ------------------------------------------------------------------
// Demonstrates how to find a value in a sorted array using built-in 
// method named binarySearch
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BinarySearchArray
// ------------------------------------------------------------------

import java.util.Arrays;

public class BinarySearchArray {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {3, 12, 39, 40, 67}; 

    // print the content of the array
    System.out.println("the array contains these values:");
    for (int value: data) {
      System.out.printf("%d ", value);
    }
    System.out.printf("\n\n");

    // define values to be looked up
    int searchList[] = {12, 39, 17, 2, 67};

    int position = -1;

    for (int value: searchList) {
      System.out.printf("searching for %d ...\n", value);
      position = Arrays.binarySearch(data, value);
      if (position < 0) {
        System.out.printf("the array does not contain the value of %d\n", value);
      } else {
        System.out.printf("the array contains the value of %d in element %d\n", value, position + 1);
      }
    }
  }
}
