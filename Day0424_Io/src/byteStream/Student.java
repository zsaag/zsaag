package byteStream;

import java.io.Serializable;

public class Student implements Serializable{
		

	//클래스의 버전 정보를 확인하는 데이터
	//클래스의 정보가 변경되었을 때, 직렬화해서 문제가 발생할 수 있다 
	//클래스의 버전 정보를 저장하는 변수를 둬서 객체가 업데이트 되었는지 확인
	private static final long serialVersionUID = 1L;
	
	private String name;
	private  int grade;
	private  int score;
	
	 
	 public String getName() {  //getter name메소드
		return name;
	}
	public void setName(String name) { //setter name 메소드
		this.name = name;
	}
	public int getGrade() { //getter grade메소드
		return grade; //grade 반환
	}
	public void setGrade(int grade) { //setter grade 메소드
		this.grade = grade;
	}
	public int getScore() { //getter score 메소드
		return score; //score 반환
	}
	public void setScore(int score) {	
		this.score=score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", score=" + score 
				+"] ";
	}


	public Student() { //studnet 기본 생성자 
		name="홍기동";
		grade=5;
		score=100;
	}

	public Student(String name,int grade, int score) {
			this.name = name;
			this.grade= grade;
			this.score = score;			
		}
}

