// ------------------------------------------------------------------
// Demonstrates how to count the number of items in a hash map
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
// Usage: java HashmapSize
// ------------------------------------------------------------------

import java.util.HashMap;

public class HashmapSize {
    public static void main(String[] args) {

        // create a data set using HashMap
        HashMap<String, String> capital = new HashMap<String, String>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the data set
        System.out.println("data set (with data):" + capital);

        // determine the number of items
        int number = capital.size();
        System.out.println("number of items:" + number);

        // empty (clear) the data set
        capital.clear();

        // output the contents of the data set
        System.out.println("data set (emptied):" + capital);

        // determine the number of items, again
        number = capital.size();
        System.out.println("number of items:" + number);

    }
}
