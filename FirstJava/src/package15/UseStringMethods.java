package package15;

public class UseStringMethods {

	public static void main(String[] args) {
		UseStringMethods use = new UseStringMethods();
		String text = "The String class represents character strings.";
		String findStr = "string";
		
		use.printWords(text);
		use.findString(text, findStr);
		use.findAnyCaseString(text, findStr);
		use.printContainWords(text, "ss");
	}
	
	public void printWords(String str) {
		String[] Words = str.split(" ");
		for(String word : Words) {
			System.out.println(word);
		}
	}
	
	public void findString(String str, String findStr) {
		int indexOfStr = 0;
		indexOfStr = str.indexOf(findStr);
		
		System.out.println("string is appeared at "+indexOfStr+"");
	}
	
	public void findAnyCaseString(String str, String findStr) {
		String lowerStr = str.toLowerCase();
		String lowerFindStr = findStr.toLowerCase();
		
		int indexOfStr = lowerStr.indexOf(lowerFindStr);
		
		System.out.println("string is appeared at "+indexOfStr+"");
	}
	
	public void countChar(String str, char c) {
		char[] charStr = str.toCharArray();
		int countChar = 0;
		
		for(char character: charStr) {
			if(character == c) countChar++; 
		}
		System.out.println("char 's' count is "+countChar+"");
	}
	
	public void printContainWords(String str, String findStr) {
		String[] strArray = str.split(" ");
		
		for(String word : strArray) {
			if(word.contains(findStr)) {
				int wordIndex = word.indexOf(findStr);
				
				System.out.println(word.substring(wordIndex, (wordIndex + findStr.length())));
			}
		}
	}
	
}
