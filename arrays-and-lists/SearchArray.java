// ------------------------------------------------------------------
// Demonstrates how to search an array 
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java SearchArray
// ------------------------------------------------------------------

import java.util.Arrays;

public class SearchArray {
  public static void main (String[] args) {

    // define data as list of 5 empty fields
    int[] data = {12, 78, 3, 25, 35};

    // define value to look for
    int lookFor = 25;

    // print the content of the array
    for (int value: data) {
      System.out.printf("value: %d\n", value);
    }

    // find the first ocurrence of a value in the array
    for (int value: data) {
        if (value == lookFor) {
            System.out.printf("Value %d found. Discontinuing search.\n", value);
            break;
        }
    }

  }
}
