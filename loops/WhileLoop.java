// ------------------------------------------------------------------
// demonstrates usage of a while loop
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java WhileLoop
//
// ------------------------------------------------------------------

public class WhileLoop {
  public static void main (String[] args) {

    int position = 0;
    int maximum = 6;

    // basic while loop
    // print all the numbers starting from 0 until 5, one value per line
    while (position < maximum) {
      System.out.printf("value: %d \n", position);

      // increase the current position by one
      position += 1;
    }

    System.out.println(" ");

    // print even numbers between 1 to 10, one value per line
    position = 1;
    maximum = 10;
    while (position <= maximum) {
      // check for a remainder of 0 which is true for even numbers, only
      if (position % 2 == 0) {
        System.out.printf("value: %d \n", position);

      }

      // increase the current position by one
      position += 1;
    }

    System.out.println(" ");

    // print the numbers between 10 to 1 as a countdown, one value per line
    position = 10;
    while (position > 0) {
      System.out.printf("value: %d \n", position);

      // decrease the current position by one
      position = position - 1;
    }

    System.out.println(" ");

    // print the numbers between 10 to 1 as a countdown, one value per line
    // implemented as endless loop, with break statement to exit the loop
    position = 10;
    while (true) {
      System.out.printf("value: %d \n", position);

      // decrease the current position by one
      position = position - 1;

      // check position for exiting the loop
      if (position < 1) {
        break;
      }
    }
  }
}

