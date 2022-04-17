package package00;

public class InterestManager {

	public static void main(String[] args) {
		InterestManager manager = new InterestManager();
		double amount = 100;
		
		for(int day = 1; day < 366; day++) {
			System.out.println("["+day+"]일째 원금+이자 : "+(double)(manager.calculateAmount(day,amount) + amount)+"");
		}
	}
	
	public double getInterestRate(int day) {
		if(day < 90) {
			return 0.005;
		}
		else if(day < 180) {
			return 0.01;
		}
		else if(day < 364) {
			return 0.02;
		}
		else {
			return 0.056;
		}
	}
	
	public double calculateAmount(int day, double amount) {
		double InterestRate = getInterestRate(day);
		return (amount*InterestRate);
	}
}
