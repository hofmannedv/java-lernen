// ------------------------------------------------------------------
// Demonstrates how to check whether a key exists in a hash map
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
// Usage: java HashmapKeyCheck
// ------------------------------------------------------------------

import java.util.HashMap;

public class HashmapKeyCheck {
    public static void main(String[] args) {

        // create a data set using HashMap
        HashMap<String, String> capital = new HashMap<String, String>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the data set
        System.out.println(capital);

        // check for key based on a list 
        String[] keyList = {"Norway", "France", "Germany"};
        for (String country : keyList) {       
            if (capital.containsKey(country)) {
                System.out.println(country + " exists as a key in the data set");
            } else {
                System.out.println(country + " does not exist as a key in the data set");
            }
        }
    }
}
