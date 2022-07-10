package package33.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StudentForEachSample {

	public static void main(String[] args) {
		// TODO Stream forEach �޼ҵ� ���
		StudentForEachSample sample = new StudentForEachSample();
		List<StudentDTO> studentList = new ArrayList<>();
		studentList.add(new StudentDTO("���", 43, 99, 10));
		studentList.add(new StudentDTO("����", 30, 89, 85));
		studentList.add(new StudentDTO("�ǻ�", 25, 99, 87));
		studentList.add(new StudentDTO("�ٴ�", 28, 78, 95));
		sample.createStudentNameList(studentList);
	}
	
	public void printStudentNames(List<StudentDTO> students) {
		students.stream().forEach(student -> System.out.println(student.getName()));;
	}
	
	public void printStudentScore(List<StudentDTO> students) {
		students.stream().map(student -> student.getName()).forEach(name -> System.out.print(name+ " "));
		System.out.println();
		students.stream().forEach(student -> System.out.print(student.getScoreMath() + " "));
		System.out.println();
		students.stream().forEach(student -> System.out.print(student.getScoreEnglish() + " "));
	}
	
	public void createStudentNameList(List<StudentDTO> students) {
		List<String> nameList = students.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(nameList);
	}
}
