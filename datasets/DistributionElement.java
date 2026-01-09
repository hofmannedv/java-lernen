// ------------------------------------------------------------------
// Defines a class containing two elements for value, and counter
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java DistributionElement
//
// ------------------------------------------------------------------

public class DistributionElement {

  // define attributes
  private int value;                   // value to be counted
  private int counter;                 // number of items

  public static int getValue () {
    return value;                      // return the stored value
  }

  public static int setValue (int newValue) {
    value = newValue;                  // assign a new value
  }

  public static int getCounter () {
    return counter;                    // return the stored counter value
  }

  public static int setCounter (int newCounter) {
    counter = newCounter;              // assign a new counter value
  }

  public static int increaseCounter () {
    counter = counter + 1;             // increase counter value by one
  }
}
