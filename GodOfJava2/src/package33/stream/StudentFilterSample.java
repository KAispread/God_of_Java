package package33.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentFilterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFilterSample sample = new StudentFilterSample();
		List<StudentDTO> studentList = new ArrayList<>();
		studentList.add(new StudentDTO("°­ÈÆ", 25, 81, 90));
		studentList.add(new StudentDTO("±â¿ì", 25, 35, 70));
		studentList.add(new StudentDTO("¹«¼º", 25, 90, 89));
		studentList.add(new StudentDTO("ÈñÁØ", 25, 84, 77));
		sample.filterWithScoreForLoop(studentList, 80);
	}
	
	public void filterWithScoreForLoop(List<StudentDTO> students, int scoreCutLine) {
		Predicate<StudentDTO> englishScoreCut = (score) -> score.getScoreEnglish() > scoreCutLine;
		Predicate<StudentDTO> mathScoreCut = (score) -> score.getScoreMath() > scoreCutLine;
		List<Integer> Over80EnglishScore = new ArrayList<>();
		List<Integer> Over80MathScore = new ArrayList<>();
		
		students.stream().filter(englishScoreCut).map(student -> student.getScoreEnglish())
		.forEach(x -> Over80EnglishScore.add(x));
		students.stream().filter(mathScoreCut).map(student -> student.getScoreMath())
		.forEach(x -> Over80MathScore.add(x));
		
		System.out.println("English score Over 80 list :: " + Over80EnglishScore);
		System.out.println("Math score Over 80 list :: " + Over80MathScore);
	}
}
