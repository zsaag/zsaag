package testEvent;

import java.io.Serializable;


public class Student implements Serializable{
	
	
	//이름(문자열),학년(정수),점수(국,영,수:Score)
	//name,   grade , score
	//생성자 : 기본생성자
	//    : 매개변수가(이름,학년,Score) 인 생성자
	//	  : 매개변수가(이름,학년,국어,영어,수학) 인 생성자
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//메서드
	//평균점수를 반환하는 메서드 : getAverage()
	//getter/setter/toString
	//국영수 점수를 각 저장 하지 못합니다. 각 점수를 따로 설정할 수 있는 메서드 만들기
	//setKor, setMath, setEng
//	  private transient String name;
	  private String sname;
	  private int sgrade;
	  private Score sscore;
	 
	 public String getSname() {  //getter name메소드
		return sname;
	}
	public void setSname(String sname) { //setter name 메소드
		this.sname = sname;
	}
	public int getSgrade() { //getter grade메소드
		return sgrade; //grade 반환
	}
	public void setSgrade(int sgrade) { //setter grade 메소드
		this.sgrade = sgrade;
	}
	public Score getSscore() { //getter score 메소드
		return sscore; //score 반환
	}
	public void setSscore(int skor, int seng, int smath) {
		//this.score = new Score(kor,eng,math);
		sscore.setSkor(skor);
		sscore.setSeng(seng);
		sscore.setSmath(smath);
	}

	@Override
	public String toString() {
		return " 학생이름 = " + sname + "\n "
				+ "학년 = " + sgrade + "\n "
				+ "점수 = " + sscore + "\n "
				+ "총점 = " + getTotal()+"\n " 
				+ "평균 = " +getAverage()+" ";
	}


	public Student() { //studnet 기본 생성자 
		sname = "이름없음";
		sgrade = 1;
		sscore = new Score();
	}
	
	public Student(String sname,int sgrade,  Score sscore) //student 생성자
	{
		this.sname = sname;
		this.sgrade= sgrade;
		this.sscore = sscore;
	}
	public Student(String name,int grade, int skor, int seng, int smath)
		{
			this.sname = name;
			this.sgrade= grade;
			this.sscore = new Score(skor,seng,smath);
				
		}
	public double getTotal() {
		double result = sscore.getSkor()+sscore.getSmath()+sscore.getSeng();
		return result;	
	}
	public double getAverage() {
		double result = (double)(sscore.getSkor()+sscore.getSmath()+sscore.getSeng())/3;
		return result;	
	}
	public void setSkor(int skor) {
		//내가 받아온 점수를 내 점수(score 객체)에다가 셋팅
		sscore.setSkor(skor);
	}
	public void setSeng(int seng) {
		sscore.setSeng(seng);
	}
	public void setSmath(int smath) {
		sscore.setSmath(smath);
	}		
	}
	
	


