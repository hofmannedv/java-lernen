// ------------------------------------------------------------------
// demonstrates usage of a for-each loop
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java ForEachLoop
//
// ------------------------------------------------------------------

public class ForEachLoop {
  public static void main (String[] args) {

    // define a list of Strings
    String[] frenchCities = {"Bordeaux", "Strasbourg", "Paris", "Lyon"};

    // print each list item, one item per line
    for (String city : frenchCities) {
      System.out.println("city: " + city);
    }
  }
}

