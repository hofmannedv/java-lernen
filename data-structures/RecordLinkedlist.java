// ------------------------------------------------------------------
// Demonstrates how to define, and access a LinkedList of records. Uses 
// record named User.
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java RecordLinkedlist
// requires User.java that contains the User record definition
// ------------------------------------------------------------------

import java.util.LinkedList; // import the LinkedList class

public class RecordLinkedlist {
  public static void main (String[] args) {

    // define user1 to user4 based on the record data structure
    User user1 = new User(1000, "Holger", "Holgersen");
    User user2 = new User(1001, "Christian", "Fischer");
    User user3 = new User(1002, "Anna", "Karlsson");
    User user4 = new User(1003, "Fred", "Stone");

    // define ArrayList for user1 to user4, and fill the list
    LinkedList<User> data = new LinkedList<User>(); 
    data.add(user1);
    data.add(user2);
    data.add(user3);
    data.add(user4);

    // access the content as initialized above, and output the data
    for (User currentUser: data) {
      System.out.printf("%d %s %s\n", currentUser.id(), currentUser.firstName(), currentUser.lastName());
    }

    // output structure 
    for (User currentUser: data) {
      System.out.println(currentUser.toString());
    }
  }
}
