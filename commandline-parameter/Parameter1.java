// ------------------------------------------------------------------
// Demonstrates how to evaluate, and output the first parameter
//
// (C) 2025 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java Parameter1 value
// Subsitute 'value' by the actual value of the call parameter
// ------------------------------------------------------------------

public class Parameter1 {
  public static void main (String[] args) {
    System.out.println("this program has been called with the following parameter: '" + args[0] + "'");
  }
}
