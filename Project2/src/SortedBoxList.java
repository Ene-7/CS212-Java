public class SortedBoxList extends BoxList {
	
	public void addBox(Box b) {
		BoxNode newNode = new BoxNode(b);
		BoxNode p = first;
		if(first == null) {
			last.next = newNode;
			last = newNode;
			++length;
			return;
		} // If the list is empty simply append no need to sort so return.
		while(p.next != null && p.next.data.compareTo(newNode.data) < 0)
			p = p.next; // Search the list until you reach the end or you find a data node with volume less than the new Node data 
		if(p.next == null) {
			last.next =newNode;
			last = newNode;
			++length;
		} // append
		else {
			newNode.next = p.next;
			p.next = newNode;
			++length;
		} // prepend 
		
	}//addBox
}//SortedBoxList