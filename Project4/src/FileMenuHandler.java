import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.TreeMap;
public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   TreeMap b;
   int Length, Width, Height;
   public FileMenuHandler (JFrame jf, TreeMap a) {
      jframe = jf;
      this.b = a;
   }
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Search")) {
    	  Length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Length of Box: "));
    	  Width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Width of Box: "));
    	  Height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Height of Box: "));
    	  BoxSearch(new Box(Length,Width,Height), b);
      }
   } //actionPerformed  
   
   public void BoxSearch(Box key, TreeMap root) {
	   String Result = "";
	   if( root.containsKey(key)) {
		   Result = "The there is a Box: " + key.toString() + "in the list! \n";
		   BoxSearchGUI b = new BoxSearchGUI(Result);
	   }
	   else {
		 Result = "Nothing Found, Sorry :(";
		 BoxSearchGUI b = new BoxSearchGUI(Result);
	   }
   }//BoxSearch
}// FileMenuHandler 