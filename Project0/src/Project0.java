/*
 * Name: Eneid Papa
 * 
 * Lab Section: 11D 
 * CS212
 */
import javax.swing.*;

public class Project0 {
	public static void main (String[] args) {
		
		String inputWord;
		int Big_E = 0, Small_e = 0;
		
		while(true) {
			inputWord = JOptionPane.showInputDialog(null, "Please enter a sentence or STOP to exit: ");
			
			if(inputWord.equalsIgnoreCase("STOP")) {
				System.exit(0); // Exit Program 
			}
			
			for(int i = 0; i < inputWord.length(); ++i) { // Look at each character from the input
				if(inputWord.charAt(i) == 'e')
					Small_e++; // Add 1 if 'e' is found
				if(inputWord.charAt(i) == 'E')
					Big_E++; // Add 1 if 'E' is found
			} //for loop
			
			JOptionPane.showMessageDialog(null, "There are: " + Big_E + " E's and: " + Small_e + " e's" );
			
			Big_E = 0;
			Small_e = 0; // reset both back to 0 otherwise they will add up each time we enter a new sentence.
		
		} //while loop
	} // main
} // class Project0