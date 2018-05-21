package testEvent;

import java.io.Serializable;

public class Score implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 8745932205790598397L;	
		private int skor;
		private int seng;
		private int smath;
	public Score()
	{
		
	}
	public Score(int k, int e, int m) {
		this.skor =k;
		this.seng=e;
		this.smath=m;
	}
	@Override
	public String toString() {
		return " 국어 =" + skor + ", 영어 = " + seng + ", 수학 = " + smath + " ";
	}
	public void setSkor(int k) {
		this.skor =k;
	}
	public int getSkor() {
		return this.skor;
	}
	public void setSeng(int e) {
		this.seng =e;
	}
	public int getSeng() {
		return this.seng;
	}
	public void setSmath(int m) {
		this.smath =m;
	}
	public int getSmath() {
		return this.smath;
	}
		// private
		//국어(정수), 영어(정수),수학(정수) 점수를 저장할 수 있는 클래스
		//kor,eng,math
		//getter/setter만들고 toString
		//생성자:기본생성자/국,영,수 점수를 매개변수로 받는 생성자


}
