package package14;

public class ThrowSample {

	public static void main(String[] args) {
		ThrowSample sample = new ThrowSample();
		sample.throwException(13);
		
		try {
		  sample.throwException(13);
			sample.throwsException(13);
		} catch (Exception e) {
			System.out.println("Throw out to the method");
		}
		
	}
	
	public void throwException(int number) {
		try {
			if (number > 12){
				throw new Exception("Number is bigger than 12");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("throwException Method has been run");
	}
	
	public void throwsException(int number) throws NullPointerException ,Exception{
		if (number>12) {
			throw new Exception();
		}
		System.out.println("throwsException Method has been run");
	}
}
