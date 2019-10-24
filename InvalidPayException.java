package employee;

public class InvalidPayException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPayException() {
		super("Employee pay is registered as invalid");
	}

	public String getMessage() {
		return ("Pay cannot be below or equal to: ");
	}
}
