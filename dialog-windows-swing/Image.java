// (C) 2025 Frank Hofmann, email info@efho.de
// Licensed under General Public License (GPL)

// demonstrates how to display an output window using SWING
// display an JPEG image
// usage: java Image

// import required Java modules
import java.awt.*;
import javax.swing.*;

public class Image extends JFrame {
  public Image() {

    // define window title
    super("Route 66");

    // define image file that will be displayed
    Icon image = new ImageIcon("route66.jpg");

    // define label for the image, centred
    JLabel imageLabel = new JLabel(image, JLabel.CENTER);

    // create output container with flowing layout
    Container windowcontainer = getContentPane();
    windowcontainer.setLayout(new FlowLayout());

    // define background colour white for the output container
    windowcontainer.setBackground(Color.white);

    // add the label to the output container
    windowcontainer.add(imageLabel);

    // define action for clicking on the window exit control
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // set size of window
    setSize(700, 500);

    // display window: enable visibility
    setVisible(true);
  }

  public static void main (String[] args) {
    new Image();
  }
}
