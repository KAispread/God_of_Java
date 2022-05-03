package package14;

public class MultiCatchSample {

	public static void main(String[] args) {
		MultiCatchSample sample = new MultiCatchSample();
		sample.multiCatch();
	}
	
	public void multiCatch() {
		int [] intArray = new int[5];
		try {
			intArray = null;
			System.out.println(intArray[5]);
		} 
		catch(NullPointerException e) {
			System.out.println( e.getMessage() + "NullPointerException has been occured");
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is occured");
		} 
		catch(Exception e) {
			System.out.println("Array is "+intArray.length+"");
		} 
		finally {
			System.out.println("Here is finally");
		}
		System.out.println("This code is must run");
	}

}
