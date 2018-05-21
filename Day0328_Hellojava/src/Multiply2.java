import java.util.Scanner;

public class Multiply2 {
	public static void main (String[] args) {
	//정수 2개를 입력받아서 곱을 구하는 프로그램 작성
	//입력받은 숫자를 저장하기 위한 a,b 결과를 저장하기위하 result변수 선언
	int a,b,result; 
	Scanner scan = new Scanner(System.in); //키보드 입력준비
	
	System.out.println("첫번째 숫자 a를 입력하세요."); //첫번째 숫자 입력받기
	a = scan.nextInt();
	System.out.println("두번째 숫자 a를 입력하세요."); //두번째 숫자 입력받기
	b = scan.nextInt();
	
	result = a*b; //a*b의 결과를 result에 대입
	//결과 출력
	System.out.println("a+b의 결과는 "+result+"입니다."); 
	}

}
//ctrl +m 옆에 Project Explorer창을 닫거나 나타내는 명령어
