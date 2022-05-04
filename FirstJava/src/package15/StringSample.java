package package15;

public class StringSample {

	public static void main(String[] args) {
		StringSample sample = new StringSample();
		
		String kor = "�ڹ��� �� �ְ�!!";
		sample.convert(kor);
		sample.convertUTF16(kor);
	}

	public void convert(String korean) {
		byte[] array1 = korean.getBytes();
		// "�ѱ�"�̶�� ���ڿ��� byte [] ��ü�� ��ȯ

		try {
			printByteArray(array1);

			String korean2 = new String(array1);
			// byte [] ��ü�� �ٽ� ���ڿ��� ��ȯ

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
			//CharSet�� UTF-16���� ���� 
			
			printByteArray(array1);
			
			String korean2 = new String(array1, "UTF-16");
			//CharSet�� byte[] �� ����
			
			System.out.println(korean2);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
