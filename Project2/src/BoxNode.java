/*
 * This class creates the Box Nodes to be linked together in a Linked List
 * @author Eneid Papa
 * 
 */
public class BoxNode {

 	protected Box data; // Data will store the Box
	protected BoxNode next; // Next will point to the next node
	
	public BoxNode(Box d) {
		data = d;
		next = null;
	}// Constructor
	
}

