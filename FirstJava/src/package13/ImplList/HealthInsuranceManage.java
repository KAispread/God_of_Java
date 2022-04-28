package package13.ImplList;

public class HealthInsuranceManage {

	public static void main(String[] args) {
		
		int salaryArray[] = new int[] {1500, 5500, 8000};
		HealthInsurance[] insurances = new HealthInsurance[salaryArray.length];
		
		for(int i =0; i < salaryArray.length; i++) {
			insurances[i] = HealthInsurance.getHealthInsurance(salaryArray[i]);
			System.out.println(salaryArray[i] + "=" + insurances[i] + "," + insurances[i].getRatio());
		}
	}

}
