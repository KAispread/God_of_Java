package package14;

public class ThrowableSample {

	public static void main(String[] args) {
		ThrowableSample sample = new ThrowableSample();
		sample.throwable();
	}
	
	public void throwable() {
		int[] arrayInt = new int[5];
		try {
			arrayInt = null;
			if (arrayInt == null) {
				throw new ThrowNull();
			}
		} catch (ThrowNull e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}


class ThrowNull extends Exception {
	public ThrowNull() {
		super();
	}
	public ThrowNull(String message) {
		super(message);
	}
	
	public String getMessage() {
		return "Throw Null occured";
	}
}
