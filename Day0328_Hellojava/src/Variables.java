
public class Variables {
	//필드( 멤버변수, 클래스 변수) 는 클래스 안에서 참조가능하다.->메서드안에서도 사용 가능
	//필드 :클래스 영역에 선언되 변수
	//전역변수(class안에서 선언된 변수)
	int a=3; 
	double b;
	public void method1() {//()파라미터->메게변수=(int a)
		//메서드 영역안에서 선언된 변수 : 지역변수
		//local variable=지역변수(method안에서 선언된 변수)
		//메서드 안에서만 사용가능하다.
		
		
		
		//변수를 사용한다>>>> 변수가 가지는 값을 가지고 온다.
		//선언과  초기화가 필요 
		//선언 : 변수를 사용하기 위해서 메모리 공간을 할당 받음
		//초기화 : 변수에 처음 값을 한 번 넣어주는 작업
		
		int c = 5; //초기화 선언
		System.out.println(c); //위에 초기화를 사용않으면 사용 불가능
	}
	public void method2() {
		System.out.println(a);
	}

}
