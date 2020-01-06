/*
 * @author Eneid Papa
 * This is the Main Program it reads Information from a File and turns it into a Box while simultaneously sending
 * them to a HashMap and a TreeMap then displaying them in a GUI. 
 * Lab Section: 11 D
 * CS 212
 */
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Project4 {
	
	public static void main(String[] args) {//Main
		int[][] boxInfo = fillArray("boxes.txt"); // Take Information From File
		HashMap HashBox = new HashMap();
		TreeMap <Box, Integer> TreeBox = new TreeMap(new BoxComparator());
		// add them to the HashBox and TreeMap
		for(int i = 0; i < boxInfo.length; i++) { //Take Info to a box and send it to Lists
			int l = boxInfo[i][0]; // find Length
			int w = boxInfo[i][1]; // find Width
			int h = boxInfo[i][2]; // find Height
			try {
		//	ubl.addBox(new Box(l, w, h)); // Send to UnsortedBoxList To Append To List
		//	sbl.addBox(new Box(l, w, h)); // Sent to SortedBoxList To Sort as Inserted
			HashBox.put(new Box(l,w,h),new Integer(i));
			TreeBox.put(new Box(l,w,h),new Integer(i));
			}
			catch (IllegalBoxException IBE) {
				System.out.println(IBE.getMessage());
			}
		}
		BoxGUI b = new BoxGUI(HashBox,TreeBox); // Send The Two Lists To The GUI So they are displayed
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
	
}// Project3
