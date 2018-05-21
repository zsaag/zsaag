
public class Literal2 {
	public static void main(String[] args) {
		//이번 예제에서는 실수형 상수를 표현하는 방법에 대해서 실습합니다.
		//자바에서의 실수 기본자료형은 double!!!
	
		int a = (int)1.2;
		double r1 = 123.5;
		float r2 = 123.5f;
		//자바에서는 지수표기법을 이용한 실수를 표현할 수 있다.
		
		float r3 = 1.235e2f; //e2->소수점 두칸 뒤로 움직여로(f표기는 float의미)
		double r4 = 1.235e-2;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		char c = '가';
		boolean isTrue; //true or false(ex=> isFirst,isClsed)
		isTrue = true; //if 조건식 또는 논리연산에 사용됨
	}

}
