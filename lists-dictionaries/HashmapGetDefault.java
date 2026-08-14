// ------------------------------------------------------------------
// Demonstrates how to output the value of an entry in a hash map, or 
// "unknown" if it does not exist
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Inspiration by: Java HashMap getOrDefault() Method
// https://www.w3schools.com/java/ref_hashmap_getordefault.asp
// 
// Usage: java HashmapGetDefault
// ------------------------------------------------------------------

import java.util.HashMap;

public class HashmapGetDefault {
    public static void main(String[] args) {

        // create a data set using HashMap
        HashMap<String, String> capital = new HashMap<String, String>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the data set using println
        System.out.println("print data set using println:");
        System.out.println("data set:" + capital);
        System.out.println(" ");

        // check for key based on a list 
        String[] keyList = {"Norway", "France", "Germany"};
        String value;

        for (String country : keyList) {
            value = capital.getOrDefault(country, "unknown");
            System.out.println("value for " + country + " is " + value);
        }
    }
}
