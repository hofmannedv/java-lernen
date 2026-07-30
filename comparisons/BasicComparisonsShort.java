// ------------------------------------------------------------------
// Demonstrates basic comparisons (short version)
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicComparisonsShort.java
// ------------------------------------------------------------------

public class BasicComparisonsShort {
  public static void main (String[] args) {

    // define data as list of integer values
    int data[] = {10, 15, 20};
    for (int position = 0; position < data.length; position++) {
      int value = data[position];
      String result = (value == 15) ? "" : "not ";
      System.out.printf("value has " + result + "the requested value of 15\n");
    }
  }
}
