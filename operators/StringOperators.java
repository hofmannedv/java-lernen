// ------------------------------------------------------------------
// demonstrates usage of string operators
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
// 
// usage: java StringOperators
//
// ------------------------------------------------------------------

public class StringOperators {
  public static void glueStrings(String operand1, String operand2) {
    
    // glue the two operands together using + operator
    String result = operand1 + operand2;
    
    // output result
    System.out.printf("the result of '%s' and '%s' is '%s'. \n", operand1, operand2, result);
  }

  public static void containsString(String text, String searchString) {
  
    // does text contain searchString?
    boolean result = text.contains(searchString);
    if (result == false) {
       // searchString is not in text
       System.out.printf("'%s' cannot be found in '%s' \n", searchString, text);
    } else {
       // searchString is in text
       System.out.printf("'%s' is found in '%s' \n", searchString, text);
    }
  }

  public static void main (String[] args) {

    // glue two strings together using + operator
    System.out.println("= Glue Two Strings Together =");
    glueStrings("Cape ", "Town");           // use +
    System.out.println(" ");

    // check for substring in text
    System.out.println("= Check For Substring =");
    containsString("Cape Town", "Cape");    // will return true
    containsString("Cape Town", "Canal");   // will return false
    System.out.println(" ");

  }
}
