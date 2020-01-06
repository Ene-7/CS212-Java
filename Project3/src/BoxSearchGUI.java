


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.*;

public class BoxSearchGUI extends JFrame {
	
	Container container; // Container to hold text areas
	TextArea found; // Text Area for Unsorted Boxes
	public BoxSearchGUI(String result) {
	      // set the title of the JFrame
	      setTitle("Search Results");
	      // set the location of the JFrame
	      setLocation(400, 200);
	      // set the size of the JFrame
	      setSize(500, 500);
	      // set the layout of the JFrame,    
	      container = getContentPane();
	      found = new TextArea();
	      found.setText(result);
	      container.add(found);
	      found.setEditable(false); // Prevent The User From Writing On The Outputs.
	      setVisible(true);
    }
}
  