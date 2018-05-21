public class MethodEx {

	public static void main(String[] args) {
		//goSchoolA(); //메서드 호출
		//goSchoolB();
		int a= 3+5;
		int b = goSchool("A"); //파라미터를 정의하면, 
		goSchool("B"); //argument(인자(값))=A를 넘겨줘야한다
		System.out.println("DO Someting");
		System.out.println("b : " + b);
		//goSchoolA();
		
		
		
	}
	//메소드 선언
	public static void goSchoolA(){ //public static void(수식자) goSchoolA(이름)(매개변수)
		//A가 학교에 가는 프로그램을 작성
		System.out.println("A가 일어난다");
		System.out.println("A가 씻는다");
		System.out.println("A가 밥을먹는다");
		System.out.println("A가 버스를탄다");
		System.out.println("A가 공부를한다");
		System.out.println("A가 귀가를한다");
		System.out.println("A가 씻고 잠을잔다");
	}

public static void goSchoolB(){ //public static void(수식자) goSchoolB(이름)(매개변수)
	//A가 학교에 가는 프로그램을 작성
	System.out.println("B가 일어난다");
	System.out.println("B가 씻는다");
	System.out.println("B가 밥을먹는다");
	System.out.println("B가 버스를탄다");
	System.out.println("B가 공부를한다");
	System.out.println("B가 귀가를한다");
	System.out.println("B가 씻고 잠을잔다");
	
}
public static int goSchool(String str){ //public static (void(수식자):반환값이 없다 )goSchoolB(이름)(매개변수)
	//메서드의 외부로 부터 값을 받아오는 방법
	//>>> ()매개변수, 파라미터(parameter)
	String name = str; //외부로 부터 받아온 값을 사용
	//if(name.equals("B"))
	//{
	//	return 0;
	//} //이런 형태로도 사용 가능하다.
	System.out.println(name+"가 일어난다");
	System.out.println(name+"가 씻는다");
	System.out.println(name+"가 밥을먹는다");
	System.out.println(name+"가 버스를탄다");
	System.out.println(name+"가 공부를한다");
	System.out.println(name+"가 귀가를한다");
	System.out.println(name+"가 씻고 잠을잔다");
	return 1; //반환
}
}
/*
 * 메서드 모양
 * [수식자] 반환형 식별자:이름([매개변수]){ //[]=있어도되고 없어도 상관없음
 * 		반환값;
 * }
 *
 *
 *
 *
 *
 *
객체지향 프로그래밍

문제를 해결함에 있어서 문제해결 순서에 집중하지 않고

문제를 해결하는 객체에 집중한다


객체는 어떻게 만들어 낼까요?????



>>클래스를 이용해서 생성


객체는 상태값(데이터)와 동작(메서드)를 가진다.

클래스로 부터 객체는 여러객체를 만들어 낼 수 있다고

각 객체들은 각각 데이터와 메서드를 가진다.


 */


