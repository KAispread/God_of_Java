package package18;

public enum EmployeeType {
	OWNER(1),
	MANAGER(2),
	DESIGNER(3),
	ARCHITECT(4),
	DEVELOPER(5);
	final int type;
	EmployeeType(int i) {
		this.type = i;
	}
	int getType() {
		return this.type;
	}
}
