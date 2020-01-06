/**
 *  @author Eneid Papa
 *  Project 2 CS212
 *  Lab Section: 11D
 *  
 */
public class Box { //Optional implements Comparator<Box>, Comparable <Box>
	
	private int Length;// Instance Variables
	private int Width;
	private int Height;
	
	public Box () { // Default Constructor 
		Length = 1;
		Width = 1;
		Height = 1;
	}
	
	public Box (int a, int b, int c) { 
		
		if(!isValidBox(a))
			throw new IllegalBoxException("Invalid Box Length!!! " + a); // Check each variable if it is valid
		if(!isValidBox(b))
			throw new IllegalBoxException("Invalid Box Width!!! " + b);
		if(!isValidBox(c))
			throw new IllegalBoxException("Invalid Box Height!!! " + c);	
		Length = a;
		Width = b;
		Height = c;
	} // Constructor
	
	public void setBox_Length (int x) { // Set Methods Length, Width and Height.
		if(!isValidBox(x))
			throw new IllegalBoxException("Invalid Box: Length! " + x);
		Length = x;
	}
	
	public void setBox_Width (int x) {
		if(!isValidBox(x))
			throw new IllegalBoxException("Invalid Box: Width! " + x);
		Width = x;
	}
	
	public void setBox_Height (int x) {
		if(!isValidBox(x))
			throw new IllegalBoxException("Invalid Box: Height! " + x);
		Height = x;
	} 
	
	public int getBox_Length() { // Get Methods For Length, Width, and Height
		return Length;
	}
	
	public int getBox_Width() {
		return Width;
	}
	
	public int getBox_Height() {
		return Height;
	}
	
	public int volume() {
		return Length * Width * Height;
	}
	
	public boolean equals(Box obj) {
		if (this.Length == obj.Length && this.Width == obj.Width && this.Height == obj.Height) {
			return true;
		}
		else {
			return false;
		}
	}// equals
	
	public String toString() {
		return "L: " + Length + " W: " + Width + " H: " + Height + ' ' + "(V: " + volume() + ") \n";  
	} //toString
		
	private static boolean isValidBox(int a) { // Check if input variables are less than 1
		if( a < 1) return false;
		else return true;
	}// isValidBox

	public int compareTo(Box other) { //compare the current volume with the others volume
		if (this.volume() > other.volume()) {
			return 1;
		}
		else if(this.volume() < other.volume()) {
			return -1;
		}
		return 0;
	} // compareTo
}// Box
