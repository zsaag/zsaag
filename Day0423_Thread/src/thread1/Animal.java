package thread1;


//Animal 클래스
//name 문자열
//numOfLeg 정수
//sound(){동물이 웁니다.} 라고 출력하는 메서드 하나 작성
// 생성자(기본생성자:name에 "멍멍이" numOfLegs=4, 2개를 매개변수로 받는 생성자)

//dog,
//bark() 멍멍 출력

//cat
//meow() 야옹 출력
public class Animal {
	 String name;
	 int numOfLegs; 
	public Animal() {
		
	}
	public Animal(String name, int numOfLegs) {
		this.name=name;
		this.numOfLegs=numOfLegs;
	}
	
	public void sound() {
		System.out.println("동물이 웁니다");
	}

}
