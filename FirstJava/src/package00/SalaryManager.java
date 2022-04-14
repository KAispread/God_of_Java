package package00;

public class SalaryManager {
	
	static SalaryManager pointMan = new SalaryManager();
	
	public static void main(String[] args) {
		double monthSal = pointMan.getMonthlySalary(20000000);
		System.out.println("�� �޿� : " + monthSal);
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double monthSal = yearlySalary / 12.0;
		System.out.println("�� ���޿� : " + monthSal);
		
		double Tax = calculateTax(monthSal);
		double National = calculateNationalPerson(monthSal);
		double HealthIns = calculateHealthInsurance(monthSal);
		
		System.out.println("�ٷ� �ҵ漼 : " + Tax);
		System.out.println("���� ���� : " + National);
		System.out.println("�ǰ� ����� : " + HealthIns);
		
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
