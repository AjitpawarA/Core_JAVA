package Ageexception;

public class UnderAgeException extends RuntimeException{
	String message;

	public UnderAgeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
