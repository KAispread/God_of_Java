package package15;

public class StringCompare {

	public static void main(String[] args) {
		StringCompare sample = new StringCompare();
		String context = "   ";
		
		sample.checkString(context);
		sample.checkCompareto();
	}
	
	public void checkString(String text) {
		System.out.println("text length :: " + text.length());
		System.out.println("text length :: " + text.isBlank());
		System.out.println("text length :: " + text.isEmpty());
	}
	
	public void checkCompare() {
		String text = "Check value";
		String text2 = "Check value";
		if (text == text2) {
			System.out.println("text==text2 result is same");
		} else {
			System.out.println("text==text2 result is not same");
		}
		if (text.equals(text2)) {
			System.out.println("text.equals(text2) result is same");
		}
		
		String text3 = "check value";
		if (text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same");
		}
	}
	
	public void checkCompareto() {
		String text = "a";
		String text2 = "b";
		String text3 = "c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
	}
}
