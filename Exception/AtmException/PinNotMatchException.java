package AtmException;

public class PinNotMatchException extends RuntimeException{
	String message;

	public PinNotMatchException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
