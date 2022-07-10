package package33.stream;

public class StudentDTO {
	String name;
	int age;
	int scoreMath;
	int scoreEnglish;
	
	public StudentDTO(String name, int age, int scoreMath, int scoreEnglish) {
		this.name = name;
		this.age = age;
		this.scoreMath = scoreMath;
		this.scoreEnglish = scoreEnglish;
	}
	
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return this.age; }
	public void setAge(int age) { this.age = age; }
	
	public int getScoreMath() { return this.scoreMath; }
	public void setScoreMath(int scoreMath) {this.scoreMath = scoreMath; }
	
	public int getScoreEnglish() { return this.scoreEnglish; }
	public void setScoreEnglish(int scoreEnglish) { this.scoreEnglish = scoreEnglish; }
}
