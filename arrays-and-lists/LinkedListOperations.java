// ------------------------------------------------------------------
// Demonstrates how to add, update, and remove entries from a data set
// organized as a linked list
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Inspiration by: Java Linked List Tutorial
// https://www.w3schools.com/java/java_linkedlist.asp
// 
// Usage: java LinkedListOperations
// ------------------------------------------------------------------

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {

        // create a data set using LinkedList
        LinkedList<String> capital = new LinkedList<String>();

        // add entries
        capital.add("Paris");
        capital.add("Bern");
        capital.add("Berlin");

        // output the contents of the data set
        System.out.println("data set (with original data):" + capital);

        // remove the entry for Bern if it exists
        System.out.println("removing Bern from the data set ...");
        if (capital.contains("Bern")) {
            capital.remove("Bern");
            System.out.println("updated data set:" + capital);
        } else {
            System.out.println("cannot find Bern in the data set");
        }

        // add another entry for Norway with wrong data
        //System.out.println("adding Norway to the data set ...");
        //capital.put("Norway", "Olso");
        //System.out.println("updated data set:" + capital);

        // updating entry for Norway with correct data
        //System.out.println("updating Norway from the data set ...");
        //capital.replace("Norway", "Oslo");
        //System.out.println("updated data set:" + capital);

        // adding entry for France if not yet in dataset
        //System.out.println("adding France to the data set ...");
        //capital.putIfAbsent("France", "Paris");
        //System.out.println("updated data set:" + capital);

        // adding entry for Spain if not yet in dataset
        //System.out.println("adding Spain to the data set ...");
        //capital.putIfAbsent("Spain", "Madrid");
        //System.out.println("updated data set:" + capital);
    }
}
