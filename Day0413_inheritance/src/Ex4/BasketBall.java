package Ex4;

public class BasketBall extends SportsPlayer{ //SportsPlayer의 자식클래스 BasketBall
	private int twopoint; //twopoint 정수형 변수
	private int threepoint; // threepoint 정수형 변수
	private int freepoint;  // freepoint 정수형 변수
	public int getTwopoint() { //getter 2점 메소드
		return twopoint;
	}
	public void setTwopoint(int twopoint) { //setter twopoint 메소드
		this.twopoint = twopoint;
	}
	public int getThreepoint() {//getter threepoint 메소드
		return threepoint;
	}
	public void setThreepoint(int threepoint) {//setter threepoint 메소드
		this.threepoint = threepoint;
	}
	public int getFreepoint() {//getter freepoint 메소드
		return freepoint;
	}
	public void setFreepoint(int freepoint) {//setter freepoint 메소드
		this.freepoint = freepoint;
	}
	public BasketBall() { //BasketBall 기본 생성자
		
	}
	public BasketBall(String type,String name, String temper,int age,int career,int weeklysalary,int twopoint, int threepoint,int freepoint) { //생성자
		this.type=type;
		this.name=name;
		this.temper=temper;
		this.age=age;
		this.career=career;
		this.weeklysalary=weeklysalary;
		this.twopoint=twopoint;
		this.threepoint=threepoint;
		this.freepoint=freepoint;
	}

@Override
	public String toString() { //tostring선언
		return "BasketBall [twopoint=" + twopoint + ", threepoint=" + threepoint + ", freepoint=" + freepoint
				+ ", name=" + name + ", temper=" + temper + ", age=" + age + ", career=" + career + ", weeklysalary="
				+ weeklysalary + "]";
	}
public void play(){ //BasketBall class에 play 오버라이딩 선언
	System.out.println("농구선수입니다");
}

}