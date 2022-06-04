package package25.sync;

public class CommonCalculate {
	private int amount;
	private Object lock = new Object();
	
	public CommonCalculate() {
		amount = 0;
	}

	public void plus(int value) {
		synchronized(lock) {
			amount += value;
		}
	}

	public void minus(int value) {
		synchronized(lock) {
			amount -= value;
		}
	}

	public int getAmount() {
		return amount;
	}
}
