package package25;

public class NameCalcThread extends Thread{
	private int calcNumber;
	public NameCalcThread(String name, int calcNumber) {
		super(name);
		this.setCalcNumber(calcNumber);
	}
	public void run() {
		setCalcNumber(getCalcNumber() + 1);
	}
	public int getCalcNumber() {
		return calcNumber;
	}
	public void setCalcNumber(int calcNumber) {
		this.calcNumber = calcNumber;
	}
}
