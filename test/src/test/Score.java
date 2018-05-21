package test;

public class Score {
	private int kor;
	private int eng;
	private int math;
	
public Score(int kor, int eng, int math) {
	this.kor=kor;
	this.eng=eng;
	this.math=math;
}
public void setKor(int kor) {
	this.kor=kor;
}
public int getKor() {
	return this.kor;
}
public void setEng(int eng) {
	this.eng=eng;
}
public int getEng() {
	return this.eng;
}
public void setMath(int math) {
	this.math=math;
}
public int getMath() {
	return this.math;
}
public String toString() {
	return "총합 = kor : " + kor+ "eng : "+ eng + "math : "+kor; 
}
}
