// ------------------------------------------------------------------
// Demonstrates value distribution in an array of integer values
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// Usage: java DistributionInArray
// 
// ------------------------------------------------------------------

import java.util.ArrayList;            // import the ArrayList class

public class DistributionInArray {

  public static boolean isValueAlreadyInDistributionList (ArrayList<DistributionElement> valueDistribution, int value) {
    boolean result = false;            // define the outcome

    // check if valueDistribution contains any elements
    if (!valueDistribution.isEmpty()) {
      // go through the list, and return true if the value is already part of the list
      for (DistributionElement item: valueDistribution) {
        if (value == item.getValue()) {
          // yes, the requested value is in the list
          // adjust result
          result = true;

          // discontinue search
          break;
        }
      }
    }

    return result;
  }

  public static void main (String[] args) {

    // define array of values to be evaluated
    int[] numbers = {394, 6, 15, 2, 88, 153, 15, 394, 6, 6, 3};
    boolean status = true;
    int length = 0;
    int counter = 0;
    int value = 0;

    // define an empty distribution list as ArrayList
    ArrayList<DistributionElement> valueDistribution = new ArrayList<DistributionElement> ();

    // go through the list of numbers, and create the distribution
    for (int item: numbers) {
      // check value distribution, and is value already in it?
      if (isValueAlreadyInDistributionList(valueDistribution, item)) {
        // yes, so increase the counter for the existing element
        // find element in distribution list
        for (DistributionElement currentElement: valueDistribution) {
          if (item == currentElement.getValue()) {
            // yes, we found the requested list element
            // increase the counter for the element
            currentElement.increaseCounter();
            System.out.println("counter increased for element with value " + item);
            break;
          }
        }
     } else {
        // no, so create a new distribution element
        DistributionElement d = new DistributionElement();
        d.setValue(item);              // set the value
        d.setCounter(1);               // set the counter to 1
        if (valueDistribution.add(d)) {
          System.out.println("new element for value " + item + " added to the distribution");
        }
      }
    }

    // output value distribution
    System.out.println(" ");
    System.out.println("= Distribution statistics =");
    // - number of items
    length = valueDistribution.size();
    System.out.println("the list contains " + length + " element(s)");

    // - value, and counter
    for (DistributionElement currentElement: valueDistribution) {
      value = currentElement.getValue();
      counter = currentElement.getCounter();
      System.out.println("value " + value + ":" + counter);
    }
  }
}

