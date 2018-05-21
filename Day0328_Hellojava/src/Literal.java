
public class Literal {
	public static void main(String[] args) {
		//이번 예제 에서는 Literal(값,상수)에 대해서 공부합니다.
		/*
		 정수를 표현할 때는 10진수를 사용하지만, 8진수나 16진수, 2진수도 사용할 수있다.
		 10진수               2진수                      8진수                     16진수
		 0          0			0			0										
		 1          0			1			1    
		 2			10			2			2
		 3			11			3			3
		 4			100			4			4
		 5			101			5			5
		 6			110			6			6
		 7			111			7			7
		 8			1000		10			8	
		 9			1001		11			9
		 10			1011		12			a
		 11			1011		13			b
		 12			1100		14			c	
		 13			1101		15			d
		 14			1110		16			e			
		 15			1111		17			f
		 16			10000		20			10
		 17			10001		21			11
		 * */
		//각 상수 표현법에 따른 값을 저장할 변수 선언
		int decimal; //10진수를 저장할 변수
		int octal; //8진수를 저장할 변수
		int hexaDecimal; //16진수를 저장할 변수
		int binary; //2진수를 저장할 변수
		
		decimal =14; //10진수 상수를 변수에 저장
		octal = 016; //8진수 상수를 변수에 저장(8진수 0을 앞에 붙여야함)
		hexaDecimal = 0xe; //16진수 상수를 변수에 저장(16진수는 0x릅 앞에붙여주어야함)
		binary = 0b1110; //2진수 상수를 변수에 저장(2진수는 0b를 앞에 붙여주어야함)
		
		System.out.printf("decimal :%d %n",decimal);
		System.out.printf("octal :%d %n",octal);
		System.out.printf("hexaDecimal :%d %n",hexaDecimal);
		System.out.printf("binary :%d %n",binary);
		//%n or \n은 줄바꿈 처리(%n으로 많이 쓰임)
	}
}
  /* //문자열을 저장할 수 있는 자료형
	String octaStr;
	String hexaStr;
	String binaryStr;
	
  //Integer 정수와 관련된 만들어 놓은 클래스
	Integer = Integer.toHexString(14);
	Integer = Integer.tooctaStr(14);
	Integer = Integer.tobinaryStr(14);
	
	System.out.printf("toHexString");
	System.out.printf("tooctaStr");
	System.out.printf("tobinaryStr");
*/

