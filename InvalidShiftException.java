package employee;

public class InvalidShiftException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidShiftException () {
		super("Employee Number is invalid");
	}

}
