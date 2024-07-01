package Ageexception;

public class OverAgeException extends RuntimeException{
	String message;

	public OverAgeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
