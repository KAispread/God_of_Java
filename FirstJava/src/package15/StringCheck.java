package package15;

public class StringCheck {

	public static void main(String[] args) {
		StringCheck sample = new StringCheck();
		
		String addresses[] = new String[] {
				"서울시 구로구 신도림동",
				"경기도 성남시 분당구 정자동 개발 공장",
				"서울시 구로구 개봉동",
		};
		
		sample.checkAddress(addresses);
		sample.containsAddress(addresses);
		sample.checkReplace();
	}
	
	public void checkAddress(String[] addresses) {
		int startCount = 0, endCount = 0;
		String startText = "서울시";
		String endText = "동";
		for(String address: addresses) {
			if(address.startsWith(startText)) {
				startCount++;
			}
			if(address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Starts with "+startText+" count is" + startCount);
		System.out.println("Ends with "+endText+" count is" + endCount);
	}
	
	public void containsAddress(String[] addresses) {
		int containCount = 0;
		String containText = "구로";
		for(String address: addresses) {
			if (address.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("Contains with "+containText+" count is " + containCount);
	}

	public void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
	}

	public void checkIndexOf() {
		String text="Java technology is both a programming language and a platform";
		System.out.println(text.indexOf('c'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a", 20));
		System.out.println(text.indexOf('z'));
		System.out.println(text.charAt(text.indexOf('c')));
	}
	
	public void toCharArr( ) {
		String text = "JAVA";
		char[] charArray = text.toCharArray();
		for (char character: charArray) {
			System.out.println(character);
		}
	}

	public void checkSubString() {
		String text = "Java technology";
		int techIndex = text.indexOf("technology");
		
		String sliceText = text.substring(techIndex);
		System.out.println(sliceText);
	}

	public void checkSplit() {
		String text="Java technology is both a programming language and a platform";
		String[] splitArray = text.split(" ");
		for(String arr : splitArray) {
			System.out.println(arr);
		}
	}

	public void checkReplace() {
		String text = "The String class represents character strings.";
		System.out.println(text.replace('s', 'z'));
		System.out.println(text);
		System.out.println(text.replace("tring", "trike"));
		System.out.println(text.replaceAll(" ", "|"));
		System.out.println(text.replaceFirst(" ", "|"));
	}
}
