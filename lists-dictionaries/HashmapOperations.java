// ------------------------------------------------------------------
// Demonstrates how to add, update, and remove entries from a hashmap 
// data set
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Inspiration by: Java Hash Map Tutorial
// https://www.w3schools.com/java/java_hashmap.asp
// 
// Usage: java HashmapOperations
// ------------------------------------------------------------------

import java.util.HashMap;

public class HashmapOperations {
    public static void main(String[] args) {

        // create a data set using HashMap
        HashMap<String, String> capital = new HashMap<String, String>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the data set
        System.out.println("data set (with original data):" + capital);

        // remove the entry for Switzerland if it exists
        System.out.println("removing Switzerland from the data set ...");
        if (capital.containsKey("Switzerland")) {
            capital.remove("Switzerland");
            System.out.println("updated data set:" + capital);
        } else {
            System.out.println("cannot find Switzerland in the data set");
        }

        // add another entry for Norway with wrong data
        System.out.println("adding Norway to the data set ...");
        capital.put("Norway", "Olso");
        System.out.println("updated data set:" + capital);

        // updating entry for Norway with correct data
        System.out.println("updating Norway from the data set ...");
        capital.replace("Norway", "Oslo");
        System.out.println("updated data set:" + capital);

        // adding entry for France if not yet in dataset
        System.out.println("adding France to the data set ...");
        capital.putIfAbsent("France", "Paris");
        System.out.println("updated data set:" + capital);

        // adding entry for Spain if not yet in dataset
        System.out.println("adding Spain to the data set ...");
        capital.putIfAbsent("Spain", "Madrid");
        System.out.println("updated data set:" + capital);
    }
}
