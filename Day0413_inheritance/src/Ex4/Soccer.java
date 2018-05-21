package Ex4;

public class Soccer extends SportsPlayer{ //SportsPlayer의 자식클래스 Soccer
	private String position; //position 문자열 변수
	private int goal; //goal 정수형 변수
	private int assist; //assist 정수형 변수
	
	public String getPosition() { //getter position 메소드
		return position; 
	}
	
	
	@Override
	public String toString() { //tostring선언 
		return "Soccer [position=" + position + ", goal=" + goal + ", assist=" + assist + ", type=" + type + ", name="
				+ name + ", temper=" + temper + ", age=" + age + ", career=" + career + ", weeklysalary=" + weeklysalary
				+ "]";
	}


	public void setPosition(String position) {//setter position 메소드
		this.position = position;
	}
	public int getGoal() {//getter goal 메소드
		return goal;
	}
	public void setGoal(int goal) {//setter goal 메소드
		this.goal = goal;
	}
	public int getAssist() {//getter assist 메소드
		return assist;
	}
	public void setAssist(int assist) {//setter assist 메소드
		this.assist = assist;
	}

	public Soccer() { //soccer 기본 생성자
				
		
	}
	public Soccer(String type,String name, String temper,int age,int career,int weeklysalary,String position, int goal, int assist) { //soccer 생성자
	this.type=type;
	this.name=name;
	this.temper=temper;
	this.age=age;
	this.career=career;
	this.weeklysalary=weeklysalary;
	this.position=position;
	this.goal=goal;
	this.assist=assist;
	
	}
	
	public void play(){ //Soccer class에 play 오버라이딩 선언
	System.out.println("축구선수입니다.");
	}
}