package student;

public class Student {
	//이름, 학년, 국, 영, 수
	private String name;
	private int grade;
	private int kor;
	private int eng;
	private int math;
	//총합,평균을 반환하는 메서드
	
	public Student() {
		
	}
	public Student(String name, int grade, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAverage() {
		return getTotal()/3;
	}
	
	public String getName() {
		return name;
	}

	public String toString() {
		return name; //나중에 목록에 표시될때 보이는 글자가 toString()에 의한 문자열
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	
}
