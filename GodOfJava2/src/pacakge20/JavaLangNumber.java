package pacakge20;

public class JavaLangNumber {

	public static void main(String[] args) {
		JavaLangNumber sample = new JavaLangNumber();
		sample.numberTypeCheck();
		sample.integerMinMaxCheckBinary();
	}
	public void numberTypeCheck() {
		String value1 = "3";
		String value2 = "5";
		byte byte1 = Byte.parseByte(value1);
		byte byte2 = Byte.parseByte(value2);
		System.out.println(byte1+byte2);
		
		Integer int1 = Integer.parseInt(value1); 
		//parseInt 메소드는 int형 기본 자료형을 리턴하지만 Integer,Byte와 같은 클래스들은 리터럴 값을 할당해도 된다.
		Integer int2 = Integer.valueOf(value2);
		//Integer int3 = 34;
		System.out.println(int1+int2+"7");
	}
	
	public void numberMinMaxCheck() {
		System.out.println("Byte min="+Byte.MIN_VALUE+" / max="+Byte.MAX_VALUE+"");
		System.out.println("Short min="+Short.MIN_VALUE+" / max="+Short.MAX_VALUE+"");
		System.out.println("Int min="+Integer.MIN_VALUE+" / max="+Integer.MAX_VALUE+"");
		System.out.println("Long min="+Long.MIN_VALUE+" / max="+Long.MAX_VALUE+"");
		System.out.println("Float min="+Float.MIN_VALUE+" / max="+Float.MAX_VALUE+"");
		System.out.println("Double min="+Double.MIN_VALUE+" / max="+Double.MAX_VALUE+"");
		System.out.println("Char min="+(int)Character.MIN_VALUE+" / max="+(int)Character.MAX_VALUE+"");
	}
	
	public void integerMinMaxCheckBinary() {
		System.out.println("Integer BINARY min=" + Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("Integer BINARY max=" + Integer.toBinaryString(Integer.MAX_VALUE));
		
		System.out.println("Integer HEX min=" + Integer.toHexString(Integer.MIN_VALUE));
		System.out.println("Integer HEX max=" + Integer.toHexString(Integer.MAX_VALUE));
	}
}
