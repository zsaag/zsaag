
public class Opearator2 {
	public static void main(String[] args) {
		//관계연산자에 대해 실습합니다.
		//==(같냐),!=(다르냐),>(크냐),<(작냐),>=(크거나같냐,)<=(작거나같냐)
		
		int x =3;
		int y =4;
		
		//결과 값을 저장할 변수를 선언
		boolean result;
		//x와 y가 같은지 비교하고 결과를 result 변수에 넣는다.
		result = x == y;
		System.out.println("x == y : " + result); //x와 y가 같은지 물음
		
		result = x != y;
		System.out.println("x != y : " +result);   //x와 y가 다른지 물음
		
		result = x > y;
		System.out.println("x > y : " +result);    //x가 y보다 큰지 물음
		
		result = x < y;
		System.out.println("x < y : " +result);    //x가 y보다 작은지 물음
		
		result = x >= y;
		System.out.println("x >= y : " +result);    //x가 y보다 크거나 같은지 물음
		
		result = x <= y;
		System.out.println("x <= y : " +result);    //x가 y보다 작거나 같은지 물음
		//******결과 값은boolean
		
		//논리연산자 &&, ||, !
		// &&(AND) : 피연산자 두개가 모두 참일 때만 참인 연산자
		// ||(OR) : 피연산자 중 하나라도 참이면 참인 연산자
		// !((NOT) : 단항연산자, 피연산자의 값(true/false)을 반대로 순간,만들어주는 연산자
		
		/*
		 T:true, F:false
         F && F : F
         F && T : F
         T && F : F
         T && T : T
         
         F || F : F
 		 F || T : T
 		 T || F : T
 		 T || T : T
		 */
         
		boolean result1 = x == 1; //true
		boolean result2 = x == 2; //false
		boolean result3;
		boolean result4;
		
		result3 = result1 && result2;
		result4 = result1 || result2;
		
		System.out.println("result1 && result2  : " +result3);
		System.out.println("result1 || result2  : " +result4);
		
		//System.out.println("resutl : " + !result);  //!는 그 순간만 결과를 반대로 출력해줌
		//System.out.println("resutl : " + result);  //는 결과를 반대로 출력해줌
	}
}
