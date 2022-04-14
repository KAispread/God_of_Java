package package00;

public class SalaryManager {
	
	static SalaryManager pointMan = new SalaryManager();
	
	public static void main(String[] args) {
		double monthSal = pointMan.getMonthlySalary(20000000);
		System.out.println("월 급여 : " + monthSal);
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double monthSal = yearlySalary / 12.0;
		System.out.println("원 월급여 : " + monthSal);
		
		double Tax = calculateTax(monthSal);
		double National = calculateNationalPerson(monthSal);
		double HealthIns = calculateHealthInsurance(monthSal);
		
		System.out.println("근로 소득세 : " + Tax);
		System.out.println("국민 연금 : " + National);
		System.out.println("건강 보험료 : " + HealthIns);
		
		monthSal -= (Tax + National + HealthIns);
		return monthSal;
	}

	public double calculateTax(double monthSalary) {
		return monthSalary * 0.125;
	}
	
	public double calculateNationalPerson(double monthSalary) {
		return monthSalary * 0.081;
	}
	
	public double calculateHealthInsurance(double monthSalary) {
		return monthSalary * 0.135;
	}
}
