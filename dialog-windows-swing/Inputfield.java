// (C) 2025 Frank Hofmann, email info@efho.de
// Licensed under General Public License (GPL)

// demonstrates how to display an input window using SWING
// input field is a standard SWING entry box with description, and buttons
// simple code without any input validation
// usage: java Inputfield

// import required Java module
import javax.swing.*;

public class Inputfield {
  public static void main (String[] args) {

  // define input field
  String entryfield = JOptionPane.showInputDialog("Wie heißen Sie?");
  
  // output entered data
  System.out.println("Hallo, " + entryfield + " :-)");
  }
}
