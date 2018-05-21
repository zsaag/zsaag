package Day0412_2;

public class Student {
	
	
	//이름(문자열),학년(정수),점수(국,영,수:Score)
	//name,   grade , score
	//생성자 : 기본생성자
	//    : 매개변수가(이름,학년,Score) 인 생성자
	//	  : 매개변수가(이름,학년,국어,영어,수학) 인 생성자
	
	//메서드
	//평균점수를 반환하는 메서드 : getAverage()
	//getter/setter/toString
	//국영수 점수를 각 저장 하지 못합니다. 각 점수를 따로 설정할 수 있는 메서드 만들기
	//setKor, setMath, setEng
	  String name;
	  int grade;
	  Score score;
	
	 
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
	public Score getScore() { //getter score 메소드
		return score; //score 반환
	}
	public void setScore(int kor, int eng, int math) {
		//this.score = new Score(kor,eng,math);
		score.setKor(kor);
		score.setEng(eng);
		score.setMath(math);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", score=" + score 
				+ ",average ="+getAverage()+"] ";
	}


	public Student() { //studnet 기본 생성자 
		name = "이름없음";
		grade = 1;
		score = new Score();
	}
	
	public Student(String name,int grade,  Score score) //student 생성자
	{
		this.name = name;
		this.grade= grade;
		this.score = score;
	}
	public Student(String name,int grade, int kor, int eng, int math)
		{
			this.name = name;
			this.grade= grade;
			this.score = new Score(kor,eng,math);
				
		}
	public double getAverage() {
		double result = (double)(score.getKor()+score.getMath()+score.getEng())/3;
		return result;	
	}
	public void setKor(int kor) {
		//내가 받아온 점수를 내 점수(score 객체)에다가 셋팅
		score.setKor(kor);
	}
	public void setEng(int eng) {
		score.setEng(eng);
	}
	public void setMath(int math) {
		score.setMath(math);
	}		
	}
	
	


