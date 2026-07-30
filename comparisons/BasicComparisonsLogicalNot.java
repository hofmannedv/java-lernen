// ------------------------------------------------------------------
// Demonstrates basic comparisons in combination with logical NOT
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java BasicComparisonsLogicalNot.java
// ------------------------------------------------------------------

public class BasicComparisonsLogicalNot {
  public static void main (String[] args) {

    // define boolean values
    boolean isLoggedIn = false;
    boolean isAdmin = true;

    if (isAdmin && (! isLoggedIn)) {
      System.out.printf("log in required to perform this administrative task \n");
    } else {
      System.out.printf("access granted \n");
    }
  }
}
