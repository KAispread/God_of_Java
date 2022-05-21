package package18;

public class Employee {
	private String name;
	private int type;
	private long salary;
	private EmployeeType emType;
	
	public Employee(String name, int type, long salary) {
		this.name = name;
		this.type = type;
		this.salary = salary;
	}
	public Employee(String name, int type, long salary, EmployeeType emType) {
		this.name = name;
		this.type = type;
		this.salary = salary;
		this.emType = emType;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getType() {
		return this.type;
	}
	
	public long getSalary() {
		return this.salary;
	}

	public int getTypeEnum() {
		return emType.getType();
	}
}
