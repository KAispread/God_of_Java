package package33;

public class CalculateManager {

	public static void main(String[] args) {
		Calculate calculateAdd = (a, b) -> a + b;
		System.out.println(calculateAdd.operator(1, 2));
		Calculate calculateSub = (a, b) -> a - b;
		System.out.println(calculateSub.operator(2, 1));
	}
}
