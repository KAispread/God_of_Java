package package08;

public class StaticExample {
	
	public static void main(String[] args) {
		Calculator.plusMethod(2, 4);
	}
}

class Calculator{
    public static int staticNum = 3;
	int nonStaticNum = 2;
	
	Calculator(){
		System.out.println("Hello");
	}
	
	static {
		staticNum = 5;
		System.out.println("----- Static Block -----");
	}
	
	static {
		System.out.println("----- StaticNum is "+staticNum+" -----");
	}
	
	public static void plusMethod(int a, int b) {
		System.out.println(a + b);
	}
}
