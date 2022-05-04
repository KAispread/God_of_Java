package package13.ImplList;

public enum HealthInsurance {
	LEVEL_ONE(1000, 1.0),
	LEVEL_TWO(2000, 2.0),
	LEVEL_THREE(3000, 3.2),
	LEVEL_FOUR(4000, 4.5),
	LEVEL_FIVE(5000, 5.6),
	LEVEL_SIX(6000, 7.1);
	
	private final int maxSalary;
	private final double ratio;
	
	HealthInsurance(int i, double d) {
		this.maxSalary = i;
		this.ratio = d;
	}
	
	public double getRatio() {
		return this.ratio;
	}
	
	public double getSalary() {
		return this.maxSalary;
	}
	
	public static HealthInsurance getHealthInsurance(int salary) {
		HealthInsurance healthInsur = null;
		final int salaryUnit = 1000;
		int alertSalary = (salary / salaryUnit) * salaryUnit;
		if(alertSalary >= 7000) alertSalary = 6000;
		
		switch(alertSalary) {
		case 1000:
			healthInsur = HealthInsurance.LEVEL_ONE;
			break;
		case 2000:
			healthInsur = HealthInsurance.LEVEL_TWO;
			break;
		case 3000:
			healthInsur = HealthInsurance.LEVEL_THREE;
			break;
		case 4000:
			healthInsur = HealthInsurance.LEVEL_FOUR;
			break;
		case 5000:
			healthInsur = HealthInsurance.LEVEL_FIVE;
			break;
		case 6000:
			healthInsur = HealthInsurance.LEVEL_SIX;
			break;
		default:
			break;
		}
		return healthInsur;
	}
}
