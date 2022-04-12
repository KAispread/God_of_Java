package package01;

public class primitiveTypes {

	public static void main(String[] args) {
		primitiveTypes types = new primitiveTypes();
		types.checkByte();
		types.checkChar();
	}
	
	public void checkByte() {
		byte bytemin = -128;
		byte bytemax = 127;
		System.out.println("bytemin=" + bytemin);
		System.out.println("bytemax=" + bytemax);
		bytemin = (byte)(bytemin + 2);
		bytemax = (byte)(bytemax - 2);
		System.out.println("bytemin + 1 =" + bytemin);
		System.out.println("bytemin - 1 =" + bytemax);
	}
	
	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println(charMin);
		System.out.println(charMax);
	}
}
