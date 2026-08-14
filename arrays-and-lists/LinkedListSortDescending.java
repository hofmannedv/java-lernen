// ------------------------------------------------------------------
// Demonstrates how to sort a linked list in descending order using a
// while loop
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Inspiration by: Java LinkedList sort() Method
// https://www.w3schools.com/java/ref_linkedlist_sort.asp
// 
// Usage: java LinkedListSortDescending
// ------------------------------------------------------------------

import java.util.LinkedList;

public class LinkedListSortDescending {
    public static void main(String[] args) {

        // create a data set using LinkedList
        LinkedList<String> capital = new LinkedList<String>();
        LinkedList<String> capitalReversed = new LinkedList<String>();

        // add entries
        capital.add("Paris");
        capital.add("Bern");
        capital.add("Berlin");
        capital.add("Madrid");
        capital.add("Oslo");

        // output the contents of the data set
        System.out.println("data set (with original data):" + capital);

        // sorting the linked list in ascending order
        System.out.println("sorting the data set in ascending order ...");
        capital.sort(null);

        // sorting the linked list in descending order by reversing the 
        // list: taking the last element of capital, and adding it as the 
        // last element of capitalReversed
        System.out.println("reversing the data set ...");
        while (capital.size() > 0) {
            String entry = capital.removeLast();
            capitalReversed.add(entry);
        }
        System.out.println("sorted data set:" + capitalReversed);
    }
}
