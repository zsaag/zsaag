package Ex4;

public class BaseBall extends SportsPlayer{ //SportsPlayer의 자식클래스  BaseBall
	private int safety; //safety 정수형 변수
	private int homerun; //homerun 정수형 변수
	private int out;     //out 정수형 변수
	
	
	
	public int getSafety() { //getter safety 메소드
		return safety;
	}
	public void setSafety(int safety) { //setter safety 메소드
		this.safety = safety;
	}
	public int getHomerun() { //getter homerun 메소드
		return homerun;
	}
	public void setHomerun(int homerun) { //setter homerun 메소드
		this.homerun = homerun;
	}
	public int getOut() { //setter out 메소드
		return out;
	}
	public void setOut(int out) { //setter out 메소드
		this.out = out;
	}
	public BaseBall() {//BaseBall 기본생성자
		
	}
	public BaseBall(String type,String name, String temper,int age,int career,int weeklysalary,int safety, int homerun,int out) { //Base Ball 생성자
		this.type=type;
		this.name=name;
		this.temper=temper;
		this.age=age;
		this.career=career;
		this.weeklysalary=weeklysalary;
		this.safety=safety;
		this.homerun=homerun;
		this.out=out;
		
	}



@Override
	public String toString() {//tostring선언 
		return "BaseBall [safety=" + safety + ", homerun=" + homerun + ", out=" + out + ", name=" + name + ", temper="
				+ temper + ", age=" + age + ", career=" + career + ", weeklysalary=" + weeklysalary + "]";
	}
public void play(){ //Soccer class에 play 오버라이딩 선언
	System.out.println("야구선수입니다.");
}
}