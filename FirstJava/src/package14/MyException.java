package package14;

public class MyException extends Exception{
	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "MyException is occured";
	}
}
