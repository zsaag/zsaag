package Ex4;

public class SportsPlayer { //부모클래스 SportsPlayer
	protected String type; //type 문자열 변수
	protected String name; //name 문자열 변수
	protected String temper; //temper 문자열 변수
	protected int age; //age 정수형 변수
	protected int career; //career 정수형 변수
	protected int weeklysalary; //weeklysalary 정수형 변수
	
	public String getType() { //getter type 메서드
		return type;
	}
	public void setType(String type) {//setter type 메서드
		this.type = type;
	}
	public SportsPlayer() { //SportsPlayer 기본생성자
		
	}
	public SportsPlayer(String type, String name, String temper,int age,int career,int weeklysalary) { //SportsPlayer 생성자
		this.type=type;
		this.name=name;
		this.temper=temper;
		this.age=age;
		this.career=career;
		this.weeklysalary=weeklysalary;
	}
	
	public String getName() { //getter name 메서드
		return name;
	}
	public void setName(String name) { //setter name 메서드
		this.name = name;
	}
	public String getTemper() { //getter temper 메서드
		return temper;
	}
	public void setTemper(String temper) { //setter temper 메서드
		this.temper = temper;
	}
	public int getAge() { //getter age 메서드
		return age;
	}
	public void setAge(int age) { //setter age 메서드
		this.age = age;
	}
	public int getCareer() { //getter career 메서드
		return career;
	}
	public void setCareer(int career) { //setter career 메서드
		this.career = career;
	}
	public int getWeekSalary() { //getter weeklysalary 메서드
		return weeklysalary;
	}
	public void setWeekSalary(int weeklysalary) { //setter weeklysalary 메서드
		this.weeklysalary=weeklysalary;
	}
	public void play(){ //BasketBall class에 play 오버라이딩 선언
		System.out.println("운동선수입니다.");	
	}
}

