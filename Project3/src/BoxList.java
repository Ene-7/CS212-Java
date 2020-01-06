/*
 * Abstract Class Which Can Not Be Instantiated And Will Link Each Node To The Other
 * @author Eneid Papa
 */

public abstract class BoxList {

	protected int length = 0;
	protected BoxNode first;
	protected BoxNode last;
	
	
	public BoxList() {
	  first = new BoxNode(null); //Make a BoxNode and assign it as first
	  last = first; // Assign the same BoxNode as Last Since it's the only element
	  length = 0; // Length is Zero as there is no other elements.
	}//No-argument Constructor 
		
	public int getLength() { // Return number of elements in a List
		return length;
	}
	
	public void append(Box d) { // Appends a Box to the BoxList
		BoxNode node = new BoxNode(d);
		this.last.next = node;
		this.last = node;
		this.length++;
	}
	
	public String toString() {//Method To Allow The Lists To Easily Display On The GUI.
		BoxNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}
	public BoxNode get_First() {
		return first;
	}//Take out?
	
	
}