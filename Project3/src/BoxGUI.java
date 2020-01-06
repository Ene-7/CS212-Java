/*
 * GUI Project 3
 */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.*;

public class BoxGUI extends JFrame {
	
	Container container; // Container to hold text areas
	TextArea unsorted; // Text Area for Unsorted Boxes
	TextArea sorted; // Text Area for Sorted Boxes
   public BoxGUI(UnsortedBoxList b1, SortedBoxList b2) {
	      // set the title of the JFrame
	      setTitle("Project 3");
	      // set the location of the JFrame
	      setLocation(400, 200);
	      // set the size of the JFrame
	      setSize(500, 500);
	      // set the layout of the JFrame,   
	      setLayout(new GridLayout(1,2)); 
	      container = getContentPane();
	      unsorted = new TextArea();
	      sorted = new TextArea();
	      unsorted.setText("Unsorted:\n\n" + b1);
	      sorted.setText("Sorted:\n\n" + b2);
	      container.add(unsorted);
	      container.add(sorted);
	      createFileMenu(b2);
	      
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      unsorted.setEditable(false); // Prevent The User From Writing On The Outputs.
	      sorted.setEditable(false);
	      setVisible(true);
    }
  
   private void createFileMenu(SortedBoxList b) {
	      JMenuItem   item;
	      JMenuBar    menuBar  = new JMenuBar();
	      JMenu       fileMenu = new JMenu("Tools");
	      FileMenuHandler fmh  = new FileMenuHandler(this, b);

	      item = new JMenuItem("Search");    //Search Option
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	     /* fileMenu.addSeparator();           //add a horizontal separator line
	    
	      item = new JMenuItem("Quit");       //Quit
	      item.addActionListener( fmh );
	      fileMenu.add( item );*/

	      setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	    
	   } //createMenu

}
