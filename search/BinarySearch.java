// ------------------------------------------------------------------
// Demonstrates how to run a binary search for a value in an array
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BinarySearch
// ------------------------------------------------------------------

// *** work in progress ***

// import required modules
import java.util.Arrays;

public class BinarySearch {
  public static int findBinary (int[] data, int searchFor, int level) {
    // define internal variables
    int position = 1;                  // define position
    boolean found = false;             // marker to remember if value was found
    int result = -1;                   // assume: value not found in data

    // check size of data: must be more than 0 to do a proper search
    if (data.length < 1) {
      // data is an empty array, and cannot be searched
      System.out.println("findBinary: given data list is empty, and cannot perform a search");      
    } else {
      // firstly, sort the array in-place in case it contains more than a single element
      if (data.length > 1) {
        Arrays.sort(data);             // use built-in sort method from Arrays class
      }

      // secondly, search the array using a foreach loop
      // so far, finds the 1st occurence of the value, only
      for (int value: data) {
        System.out.println("comparing " + value + " ... ");

        if (searchFor == value) {
          // print success
          System.out.println("findBinary: " + searchFor + " found at element " + position);

          // adjust marker, and result
          found = true;
          result = position;

          // no further search needed, so quit the foreach loop
          break;
        }
        position += 1;
      }
    }

    // define search result
    return result;
  }

  public static void main (String[] args) {

    // define an array with five postcodes from the Alsace region
    int[] postcodeAlsace = new int[] {68000, 67000, 68130, 68100, 68200}; 
    int searchFor = 68100;             // define value to look for
    int position = -1;                 // assume: value not in array

    // call findBinary method
    position = findBinary(postcodeAlsace, searchFor, 1);
    
    if (position > -1) {
      // print success
      System.out.println(searchFor + " found at element " + position);
    } else {
      // print failure
      System.out.println(searchFor + " not found in list.");
    }
  }
}
