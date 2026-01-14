// ------------------------------------------------------------------
// Demonstrates how to count, and output call parameters using the
// getopts library
//
// (C) 2026 Frank Hofmann
// Released under GNU Public License (GPL)
// Email frank.hofmann@efho.de
// 
// License: GNU Public License (GPL) v.3.0 or later
// SPDX-License-Identifier: GNU General Public License v3.0 or later
//
// Inspired by GetoptDemo.java from https://github.com/arenn/java-getopt
// 
// Compile on Debian GNU/Linux: 
// javac -classpath /usr/share/java/gnu-getopt.jar ParametersGetopt.java
// 
// Usage: java ParametersGetopt -argument1 --argument2=value
// Subsitute 'argument1', 'argument2', and 'value' by the actual 
// names, and value of the call parameters/options
// ------------------------------------------------------------------

// import required libraries
import gnu.getopt.LongOpt;
import gnu.getopt.Getopt;

public class ParametersGetopt {
  public static void main (String[] parameters) {

  // define long options with three entries
  LongOpt[] longopts = new LongOpt[3];
  StringBuffer sb = new StringBuffer();

  // --help (short: -h) without further value
  longopts[0] = new LongOpt("help", LongOpt.NO_ARGUMENT, null, 'h');

  // --outputdir (short: -o) followed by a directory name
  longopts[1] = new LongOpt("outputdir", LongOpt.REQUIRED_ARGUMENT, sb, 'o'); 

  // --maximum with neither a short option name, nor further value
  longopts[2] = new LongOpt("maximum", LongOpt.OPTIONAL_ARGUMENT, null, 2);
 
  // evaluate the call of testprog, and "-:bc::d:hW;" as valid options
  Getopt g = new Getopt("testprog", parameters, "-:bc::d:hW;", longopts);

  // define error handling: done by ourself
  g.setOpterr(false); 

  // evaluate parameters
  int c = 0;

  while ((c = g.getopt()) != -1) {
    System.out.println("option: " + c);
    // switch (c) {
    //}
  }

    // count for parameters
    if (parameters.length == 0) {
      // program call without any parameters
      System.out.println("this program has not been called with any parameters at all");
    } else {
      // print the parameters one after the next
      System.out.println("this program has been called with " + parameters.length + " parameter(s) as follows:");
      for (String currentParameter: parameters) {
        System.out.println("parameter: " + currentParameter);
      }
    }
  }
}
