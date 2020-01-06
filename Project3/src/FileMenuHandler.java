import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   SortedBoxList b;
   int Length, Width, Height;
   public FileMenuHandler (JFrame jf, SortedBoxList a) {
      jframe = jf;
      this.b = a;
   }
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Search")) {
    	  Length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Length of Box: "));
    	  Width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Width of Box: "));
    	  Height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Height of Box: "));
    	  BoxSearch(Length,Width,Height);
      }
   } //actionPerformed  
   
   public void BoxSearch(int L, int W, int H) {
	   Box NewBox = new Box(L,W,H);
	   String TextBlockOfFound = "No Boxes Found"; // String to display to new JFrame
	   BoxNode p = b.first;
	   while (p.next != null) { // Look Through the Linked List And Search For A Match!
	     if(p.next.data.compareTo(NewBox) == 0) {//If we find a Matching box do the following:
	    	 if(TextBlockOfFound == "No Boxes Found") { // Modify The String if We found a Box that matches
	    		TextBlockOfFound = "Found: " + p.next.data.toString() + "\n"; 
	    	 }
	    	 else { // If We previously found a match concatenate the string!
	    		TextBlockOfFound += "Found: " + p.next.data.toString() + "\n"; 
	    	 }
	     }
	     p = p.next;
	   }//while
     // Now we send the TextBlockOfFound to some JFrame and Display to the screen!
	 BoxSearchGUI s = new BoxSearchGUI(TextBlockOfFound);  
   }//BoxSearch
   
   
   
   
}// FileMenuHandler 