// (C) 2025 Frank Hofmann, email info@efho.de
// Licensed under General Public License (GPL)

// demonstrates how to display an output window using SWING
// usage: java Hello

// import required Java modules
import java.awt.*;
import javax.swing.*;

public class Hello extends JFrame {
  public Hello() {

    // define window title
    super("Hello");

    // define label to display text, centred
    JLabel labelText = new JLabel("Hello :-)", JLabel.CENTER);

    // define used font as sans serif, bold, size 24pt
    Font labelfont = new Font("SansSerif", Font.BOLD, 24);

    // adjust label, and use the font defined before
    labelText.setFont(labelfont);

    // create output container with flowing layout
    Container windowcontainer = getContentPane();
    windowcontainer.setLayout(new FlowLayout());

    // define background colour white for the output container
    windowcontainer.setBackground(Color.white);

    // add the label to the output container
    windowcontainer.add(labelText);

    // define action for clicking on the window exit control
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // set size of window
    setSize(300, 250);

    // display window: enable visibility
    setVisible(true);
  }

  public static void main (String[] args) {
    new Hello();
  }
}
