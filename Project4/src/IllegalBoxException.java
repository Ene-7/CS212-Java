
public class IllegalBoxException extends IllegalArgumentException {
	//check if box is correct or not.
	public IllegalBoxException(String a) {
		super(a); 
		// This sends a string answer to the Super Class. 
		// The Answer comes in when we throw The Exception from the constructor
	}
}
