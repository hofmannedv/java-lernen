// ------------------------------------------------------------------
// Demonstrates how to search an array for a value
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicSearch
// ------------------------------------------------------------------

public class BasicSearch {
  public static void main (String[] args) {

    // define an array with five postcodes from the Alsace region
    int[] postcodeAlsace = new int[] {68000, 67000, 68130, 68100, 68200}; 
    int position = 1;                  // define position
    int searchFor = 68100;             // define value to look for
    boolean found = false;             // marker to remember if value was found

    // search the array using a foreach loop
    // finds the 1st occurence of the value, only
    for (int value: postcodeAlsace) {
      System.out.println("comparing " + value + " ... ");

      if (searchFor == value) {
        // print success
        System.out.println(searchFor + " found at element " + position);

        // adjust marker
        found = true;

        // no further search needed, so quit the foreach loop
        break;
      }
      position += 1;
    }

    // check marker
    if (!found) {
      System.out.println(searchFor + " not found in list.");
    }
  }
}
