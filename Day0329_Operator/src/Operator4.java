
public class Operator4 {
	public static void main(String[] args){
		//비트 연산자
		//&(AND), |(OR), ^(XOR), ~(NOT)
		//비트단위 연산을 할 수 있게 만들어 주는 연산자
		//&(AND) : 둘다 1일 때 1
		//|(OR)  : 둘 중 하나라도 1일 때 1
		//^(XOR) : 둘 중 하나만 1일 때 1
		//~(NOT) : 비트 전환
		
		int x =2;
		int y =6;
		int result;
		
		result = x&y;
		/*
		  0110
		 &0110
		  0010 =2
		 */
		System.out.println("x&y : "+ result); //2가 나옴
		x=3;
		y=6;
		result =x|y;
		/*
		  0011
		 |0110
		  0111 =7
		 */
		System.out.println("x|y : "+ result); //7이 나옴
		x=3;
		y=6;
		result =x^y;
		/*
		  0011
		 ^0110
		  0101 =7
		 */
		System.out.println("x^y : "+ result); //5가 나옴
		
		result = ~x;
		System.out.println("~x : "+ result); //3은 011이므로 비트전환하면 100이므로 -4가나옴
		/*3개의 비트로 표현할 수 있는 수의 개수 :
		 * 2의 보수 방식으로 음수를 표시 
		0	000									000	0
		1	001									001	1
		2	010									010	2
		3	011									011	3
		
		4	100  	
		5	101	110(앞에 1은 냅두고 뒤 두자리는 서로전환)+1	111	-1
		6	110	101(앞에 1은 냅두고 뒤 두자리는 서로전환)+1	110	-2
		7	111	100(앞에 1은 냅두고 뒤 두자리는 서로전환)+1	101	-3
												100	-4
		*/
		
		//정수를 2진 표기법으로 출력하기,Integer 클래스 이용
		System.out.println(Integer.toBinaryString(result)); //11111111111111111111111111111100
		System.out.println(Integer.toBinaryString(-1));     //11111111111111111111111111111111
			
		x=-7; //0111
		
		result =x <<1; //1110(14)
		System.out.println("7 << 1:" + result);
		
		//*tip 좌측으로 1bit 쉬프트 되면 곱하기 2가 된다.
		//System.out.println("7 << 1:" + (result<<1));
		
		result = x>>1;
		System.out.println("7 >> 1:" + result);
	}   
}

        //쉬프트 연산자: 비트를 옮기는 연산자  <<,>>,>>>
		//<< : 좌측으로 비트를 옮김, 빈자리는 0으로 채움 => ex)0111 -> 1110
		//>> : 우측으로 비트를 옮김, 빈자리는 0으로 채움=> ex)1100 -> 0110
        //>>> : 우측으로 비트를 옮김,부호비트를 그대로 유지 => ex)1100 -> 1110

		









