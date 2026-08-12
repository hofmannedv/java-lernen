// ------------------------------------------------------------------
// Demonstrates how to look for keys of a dictionary with error handling
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Inspiration by: Java Dictionary Class
// https://www.geeksforgeeks.org/java/java-util-dictionary-class-java/
//
// Usage: java DictionariesItems
// ------------------------------------------------------------------

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionariesErrorHandling {
    public static void main(String[] args) {

        // create a Dictionary instance using Hashtable
        Dictionary<String, String> capital = new Hashtable<>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the dictionary
        System.out.println(capital);

        // EAFP: Easier to Ask Forgiveness than Permission
        try {
            // look for the key Spain
            String city = capital.get("Spain");
            if (city != null) {
                // ... we found it
                System.out.printf("The capital of Spain is %s \n", city);
            } else {
                // ... we did not find it, and throw an exception
                throw new Exception("key lookup error for Spain");
            }
        } catch (Exception e) {
            System.out.println("There is no entry for Spain");
        }
    }
}
