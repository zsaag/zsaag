package test;

public class Student {
	private String name;
	private int grade;
	private Score score;
	
	
	public Student(String name, int grade, int kor, int eng, int math) {
		
		this.name=name;
		this.grade=grade;
		this.score=new Score(kor, eng, math);	
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public Score getScore()
	{
		return this.score;
	}
	public void setScore(Score score) {
		this.score=score;
	}
	public String toString() {
		return "학생 = 이름 : " + name + ", 학년 : " + grade + ", 점수 : " + score + " ";
	}

}
