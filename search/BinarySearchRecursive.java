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
// Usage: java BinarySearchRecursive
// ------------------------------------------------------------------

// *** work in progress, and result is not accurate ***

// import required modules
import java.util.Arrays;

public class BinarySearchRecursive {
  public static int findBinary (int[] data, int searchFor, int level) {
    // define internal variables
    boolean found = false;             // marker to remember if value was found
    int result = -1;                   // assume: value not found in data

    // output recursion level
    System.out.println("findBinary: called at level " + level);      

    // output data to be searched
    for (int dataValue: data) {
      System.out.println("value: " + dataValue);
    }

    // check size of data: must be more than 0 to do a proper search
    if (data.length < 1) {
      // data is an empty array, and cannot be searched
      System.out.println("findBinary: given data list is empty, and cannot perform a search");      
    } else {
      // we can shorten it in case the array consists of a single element, only
      if (data.length == 1) {
        if (data[0] == searchFor) {
          found = true;                // report success
          result = 0;                  // position is 0
          System.out.println("findBinary: found " + searchFor + " at position 0");      
        }
      } else {
        // search the array, and find the 1st occurence of the value, only
        // define left, and right range
        int left = 0;
        int right = data.length - 1;

        // define middle element
        int middle = (right + left) / 2;

        System.out.println("comparing " + data[middle] + " at position " + middle + " with " + searchFor + " ...");
        if (data[middle] == searchFor) {
          found = true;              // report success
          result = middle;           // position is middle
          System.out.println("findBinary: found " + searchFor + " at position " + middle);
        } else {
          if (data[middle] > searchFor) {
            // prepare left side to be searched
            int[] leftData = new int[middle - left];
            for (int i = left; i < middle; i++) {
              leftData[i - left] = data[i];
            }
            result = findBinary(leftData, searchFor, level + 1);
            // adjust result
            if (result != -1) {
              result = result + middle;
            }
          } else {
            // prepare right side to be searched
            int[] rightData = new int[right - middle];
            for (int i = middle + 1; i <= right; i++) {
              rightData[i - middle - 1] = data[i];
            }
            result = findBinary(rightData, searchFor, level + 1);
            // adjust result
            if (result != -1) {
              result = result + middle - 1;
            }
          }
        }

      }
    }

    // define search result
    return result;
  }

  public static void main (String[] args) {

    // define an array with five postcodes from the Alsace region
    int[] postcodeAlsace = new int[] {68000, 67100, 67000, 68145, 68130, 68100, 68200, 68205, 67200, 67300}; 
    int searchFor = 68200;             // define value to look for
    int position = -1;                 // assume: value not in array
    int level = 1;                     // used to indicate the recursion level

    // firstly, sort the array in-place in case it contains more than a single element
    Arrays.sort(postcodeAlsace);       // use built-in sort method from Arrays class

    // call findBinary method
    position = findBinary(postcodeAlsace, searchFor, level);
    
    if (position > -1) {
      // print success
      System.out.println(searchFor + " found at element " + position);
    } else {
      // print failure
      System.out.println(searchFor + " not found in list.");
    }
  }
}
