/*
 * GUI Project 3
 */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.HashMap;
import java.util.TreeMap;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class BoxGUI extends JFrame {
	
	Container container; // Container to hold text areas
	TextArea unsorted; // Text Area for Unsorted Boxes
	TextArea sorted; // Text Area for Sorted Boxes
   public BoxGUI(HashMap b1, TreeMap b2) {
	      // set the title of the JFrame
	      setTitle("Project 4");
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
   private void createFileMenu(TreeMap b) {
	      JMenuItem   item;
	      JMenuBar    menuBar  = new JMenuBar();
	      JMenu       fileMenu = new JMenu("Tools");
	      FileMenuHandler fmh  = new FileMenuHandler(this,b);//info for search

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
