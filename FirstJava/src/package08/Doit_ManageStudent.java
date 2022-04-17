package package08;

public class Doit_ManageStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doit_Student[] student = new Doit_Student[3];
		Doit_ManageStudent manage = new Doit_ManageStudent();
		
		student = manage.addStudent();
		
		manage.printStudents(student);
	}
	
	public Doit_Student[] addStudent() {
		Doit_Student[] student = new Doit_Student[3];
		student[0]=new Doit_Student("Lim");
		student[1]=new Doit_Student("Min");
		student[2]=new Doit_Student("Sook", "Seoul", "0108435XXXX", "pian0231@naver.com");
		return student;
	}
	
	public void printStudents(Doit_Student[] student) {
		for(Doit_Student data: student) {
			System.out.println(data.toString());
		}
	}
}
