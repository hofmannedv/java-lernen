// ------------------------------------------------------------------
// Demonstrates how to read the items of a hashmap
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
// Usage: java HashmapItems
// ------------------------------------------------------------------

import java.util.HashMap;

public class HashmapItems {
    public static void main(String[] args) {

        // create a data set using HashMap
        HashMap<String, String> capital = new HashMap<String, String>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the data set
        System.out.println(capital);

        // extract the items (values) of the data set
        for (String key : capital.keySet()) {
            System.out.println(capital.get(key));
        }
    }
}
