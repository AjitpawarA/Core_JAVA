package throw_exception;

public class WrongInputException extends RuntimeException{
	String message;

	public WrongInputException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
