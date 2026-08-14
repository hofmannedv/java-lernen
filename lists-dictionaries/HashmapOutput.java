// ------------------------------------------------------------------
// Demonstrates how to output the hashmap data set using forEach() method
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Inspiration by: Java Hash Map forEach()
// https://www.w3schools.com/java/ref_hashmap_foreach.asp
// 
// Usage: java HashmapOutput
// ------------------------------------------------------------------

import java.util.HashMap;

public class HashmapOutput {
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

        // output the contents of the data set using forEach method
        System.out.println("print data set using forEach method:");
        capital.forEach( 
            (key, value) -> { System.out.println(key + " -> " + value); }
        );
    }
}
