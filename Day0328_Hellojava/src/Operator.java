
public class Operator {
	public static void main(String[] args) {
		//연산자
		//연산자의 종류
		//산술연산,비교연산,논리연산,증감연산,대입연산,비트연산
		//산술연산 실습
		//연산은 같은 데이터 타입끼리 연산
		/*
		 *정수  + 정수 연산  >> 정수
		 *정수  - 정수 연산  >> 정수
		 *정수  * 정수 연산  >> 정수
		 *정수  / 정수 연산  >> 정수
		 *정수  % 정수 연산  >> 정수
		  */
		
		int result = 7+5;
		System.out.println(result);
		
		result = 7-5;
		System.out.println(result);
		
		result = 7*5;
		System.out.println(result);
		
		//정수끼리 연산은 정수이다. 계산결과가 소수점이 나와서 버리는게 아니라 결과가 정수이다.
		result = 7/5; 
		System.out.println(result);
		
		//소수점 연산이 제대로된 결과를 얻고 싶으면
		//실수 연산을 해야한다.
		//실수/정수 연산은 정수가 실수로 형변환이 되고 난뒤 연산한다. 
		double a = 7.0/5; //
		System.out.println(a);
		
		double b= 7/5; 
		System.out.println(b); 
		
		result = 5%3; 
		System.out.println(result); 
		//변수를 같이 사용하는 것은 가능(그러나 변수선언을 같이 사용 불가 ex)int result이후 또 선언 불가)
	}

}
