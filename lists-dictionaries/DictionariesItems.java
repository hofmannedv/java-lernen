// ------------------------------------------------------------------
// Demonstrates how to read the items of a dictionary
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

public class DictionariesItems {
    public static void main(String[] args) {

        // create a Dictionary instance using Hashtable
        Dictionary<String, String> capital = new Hashtable<>();

        // add entries
        capital.put("France", "Paris");
        capital.put("Switzerland", "Bern");
        capital.put("Germany", "Berlin");

        // output the contents of the dictionary
        System.out.println(capital);

        // extract the items (values) of the dictionary
        Enumeration<String> e = capital.elements();
        while (e.hasMoreElements()) {
            String v = e.nextElement();
            System.out.println(v);
        }
    }
}
