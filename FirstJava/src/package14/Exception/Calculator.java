package package14.Exception;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.printDivide(1, 2);
			calc.printDivide(1, 0);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	public void printDivide(double d1, double d2) throws RuntimeException{
		if(d2 == 0) {
			throw new RuntimeException("Second value can't be zero");
		}
		
		double result = d1 / d2;
		System.out.println(result);
	}
}
