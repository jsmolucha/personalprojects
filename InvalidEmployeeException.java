package employee;

public class InvalidEmployeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeException() {
		super("Employee Number is Invalid");
	}

}
