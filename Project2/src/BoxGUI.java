/*
 * GUI Project 2
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
	      setTitle("Project 2");
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
	      
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      unsorted.setEditable(false); // Prevent The User From Writing On The Outputs.
	      sorted.setEditable(false);
	      setVisible(true);
    }
  


}
	
	
	
	
	
	/*public BoxGUI(UnsortedBoxList b1, SortedBoxList b2) {
		unsortedBox = boxes.clone(); // hold unsorted boxes
		selectionSort(boxes); // sort boxes
		sortedBox = boxes; // hold the sorted boxes
		container.setSize(800,400);
		container.setLocation(700,500);
		container.setTitle("Box Project 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.add(unsorted,0);
		container.add(sorted,1);
		container.setLayout(new GridLayout (1,2)); // define layout with 1 row, 2 columns
		
		for(int i = 0; i < boxes.length; i++) 
			unsorted.append(unsortedBox[i].toString()+ "\n"); // add unsorted list text area to the left column
		
		for(int i = 0; i < boxes.length; i ++)
			sorted.append(sortedBox[i].toString()+ "\n"); // add sorted list text area to the right column
		
		unsorted.setEditable(false);
		sorted.setEditable(false);
		container.setVisible(true);
	}//BoxGUI
	
	public static void selectionSort(Box[] boxes) { // Sort Boxes by using the volume method 
		for(int i = 0; i < boxes.length - 1; i++) {
			int indexLowest = i;
			for(int j = i + 1; j < boxes.length; j++) {
				if (boxes[j].volume() < boxes[indexLowest].volume())// compare by volume
					indexLowest = j;
			}
			if(boxes[indexLowest]!= boxes[i]) {
				Box temp = boxes[indexLowest];
				boxes[indexLowest] = boxes[i];
				boxes[i] = temp;
			}
		}
	} // selectionSort 
} // BoxGUI*/
	