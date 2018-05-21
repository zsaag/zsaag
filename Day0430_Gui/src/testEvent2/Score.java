package testEvent2;

import java.io.Serializable;

public class Score implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 8745932205790598397L;	
		private int kor;
		private int eng;
		private int math;
	public Score()
	{
		
	}
	public Score(int k, int e, int m) {
		this.kor =k;
		this.eng=e;
		this.math=m;
	}
	@Override
	public String toString() {
		return " 국어 =" + kor + ", 영어 = " + eng + ", 수학 = " + math + " ";
	}
	public void setKor(int k) {
		this.kor =k;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int e) {
		this.eng =e;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int m) {
		this.math =m;
	}
	public int getMath() {
		return this.math;
	}
		// private
		//국어(정수), 영어(정수),수학(정수) 점수를 저장할 수 있는 클래스
		//kor,eng,math
		//getter/setter만들고 toString
		//생성자:기본생성자/국,영,수 점수를 매개변수로 받는 생성자


}
