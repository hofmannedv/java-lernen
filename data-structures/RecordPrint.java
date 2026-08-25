// ------------------------------------------------------------------
// Demonstrates how to define, and access a record. Uses record named
// User.
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java RecordPrint
// requires User.java that contains the User record definition
// ------------------------------------------------------------------

public class RecordPrint {
  public static void main (String[] args) {

    // define user1 based on the record data structure
    User user1 = new User(1000, "Holger", "Holgersen");

    // access the content as initialized above
    System.out.printf("%d %s %s\n", user1.id(), user1.firstName(), user1.lastName());

    // output structure 
    System.out.println(user1.toString());
  }
}
