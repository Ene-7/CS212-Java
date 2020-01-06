/*
 * @author Eneid Papa
 * This is the Main Program it reads Information from a File and turns it into a Box while simultaneously sending
 * them to a Unsorted Linked List and a Sorted Linked List then Displaying them in a GUI. 
 * Lab Section: 11 D
 * CS 212
 */
import java.util.StringTokenizer;

public class Project2 {
	
	public static void main(String[] args) {//Main
		int[][] boxInfo = fillArray("boxes.txt"); // Take Information From File
		UnsortedBoxList ubl = new UnsortedBoxList(); // Instantiate UnsortedBox
		SortedBoxList sbl = new SortedBoxList(); // Instantiate SortedBox
		//TODO: Create the Box and BoxNode using box info
		// add them to the ubl and sbl
		for(int i = 0; i < boxInfo.length; i++) { //Take Info to a box and send it to Lists
			int l = boxInfo[i][0]; // find Length
			int w = boxInfo[i][1]; // find Width
			int h = boxInfo[i][2]; // find Height
			ubl.addBox(new Box(l, w, h)); // Send to UnsortedBoxList To Append To List
			sbl.addBox(new Box(l, w, h)); // Sent to SortedBoxList To Sort as Inserted
		}
		BoxGUI b = new BoxGUI(ubl,sbl); // Send The Two Lists To The GUI So they are displayed
	}// main
	
	private static int[][] fillArray (String myFile) { // read the input form the boxes.txt file
		TextFileInput input = new TextFileInput(myFile);
		String line = input.readLine(); // read the first line from the file! (rows in file,3) where the rows and cols have been specified
		StringTokenizer myTokens = new StringTokenizer(line, ",");
		int row = Integer.parseInt(myTokens.nextToken());
		int col = Integer.parseInt(myTokens.nextToken());
		int [][] integers = new int[row][col];
		for (int i = 0; i < row; i++) {
			StringTokenizer rowToken = new StringTokenizer(input.readLine(), ",");
			int j = 0;
			while(rowToken.hasMoreTokens()) {
				integers[i][j] = Integer.parseInt(rowToken.nextToken());
				j++;
			}
		}
		input.close();
		return integers;
	} // fillArray
	
}// Project2 
