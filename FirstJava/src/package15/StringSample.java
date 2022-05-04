package package15;

public class StringSample {

	public static void main(String[] args) {
		StringSample sample = new StringSample();
		
		String kor = "자바의 신 최고!!";
		sample.convert(kor);
		sample.convertUTF16(kor);
	}

	public void convert(String korean) {
		byte[] array1 = korean.getBytes();
		// "한글"이라는 문자열을 byte [] 객체로 변환

		try {
			printByteArray(array1);

			String korean2 = new String(array1);
			// byte [] 객체를 다시 문자열로 변환

			System.out.println(korean2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printByteArray(byte[] array) {

		for (byte data : array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public void convertUTF16(String korean) {
		try {
			byte[] array1 = korean.getBytes("UTF-16");
			//CharSet을 UTF-16으로 설정 
			
			printByteArray(array1);
			
			String korean2 = new String(array1, "UTF-16");
			//CharSet을 byte[] 와 맞춤
			
			System.out.println(korean2);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
