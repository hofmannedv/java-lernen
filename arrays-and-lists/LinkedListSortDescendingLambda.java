// ------------------------------------------------------------------
// Demonstrates how to sort a linked list in descending order using a
// lambda expression
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
// Usage: java LinkedListSortDescendingLambda
// ------------------------------------------------------------------

import java.util.LinkedList;

public class LinkedListSortDescendingLambda {
    public static void main(String[] args) {

        // create a data set using LinkedList
        LinkedList<String> capital = new LinkedList<String>();

        // add entries
        capital.add("Paris");
        capital.add("Bern");
        capital.add("Berlin");
        capital.add("Madrid");
        capital.add("Oslo");

        // output the contents of the data set
        System.out.println("data set (with original data):" + capital);

        // sorting the linked list in ascending order using a lambda expression
        System.out.println("sorting the data set in descending order ...");
        capital.sort( (a, b) -> { return -1 * a.compareTo(b); } );
        System.out.println("sorted data set:" + capital);
    }
}
