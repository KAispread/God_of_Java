package package18;

public class CalculateSalary {

	public static void main(String[] args) {
		CalculateSalary sample = new CalculateSalary();
		sample.calculateSalaries();
	}
	
	public long getSalaryIncrease(Employee employee) {
		final int employeeType = employee.getType();
		long employeeSalary = employee.getSalary();
		switch(employeeType) {
		case 1:
			employeeSalary = (long) (employeeSalary - (employeeSalary * 0.95));
			break;
		case 2:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 0.10));
			break;
		case 3:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 0.20));
			break;
		case 4:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 0.30));
			break;
		case 5:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 1.00));
			break;
		}
		return employeeSalary;
	}
	
	public long getSalaryIncrease2(Employee employee) {
		final int employeeType = employee.getTypeEnum();
		long employeeSalary = employee.getSalary();
		
		switch(employeeType) {
		case 1:
			employeeSalary = (long) (employeeSalary - (employeeSalary * 0.95));
			break;
		case 2:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 0.10));
			break;
		case 3:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 0.20));
			break;
		case 4:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 0.30));
			break;
		case 5:
			employeeSalary = (long) (employeeSalary + (employeeSalary * 1.00));
			break;
		}
		return employeeSalary;
	}
	
	public void calculateSalaries() {
		Employee[] group = new Employee[5];
		group[0] = new Employee("LeeDaeRi", 1, 1000000000, EmployeeType.OWNER);
		group[1] = new Employee("KimManager", 2, 100000000, EmployeeType.MANAGER);
		group[2] = new Employee("WhangDesign", 3, 70000000, EmployeeType.DESIGNER);
		group[3] = new Employee("ParkArchi", 4, 80000000, EmployeeType.ARCHITECT);
		group[4] = new Employee("LeeDevelop", 5, 60000000, EmployeeType.DEVELOPER);
		
		for(Employee employee: group) {
			System.out.println(employee.getName() +"="+getSalaryIncrease2(employee));
		}
	}
}
