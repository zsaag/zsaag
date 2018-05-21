import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		//숫자를 키보드로 입력받아서 더하기
		//입력받을 준비:Scanner를 사용해야 한다.
		/*
		 * 1. Scanner를 사용하기 위해서 import 사용(import java.util.Scanner;)
		 * 2. Scanner 사용 방법
		 *   
		 * */
		// scan, input은 이름입니다. 바뀔수 있음
		
		Scanner scan = new Scanner(System.in); //키보드로 부터 입력 발을 준비                
		int a,b,sum;  //정수를 저장할 변수 a,b,sum 선언
		
		System.out.println("첫번째 숫자 a를 입력하세요"); //""안에 내용을 콘솔에 출력
		a = scan.nextInt(); //키보드로 부터 숫자를 읽어와서 a에 대입(할당)
		System.out.println("두번째 숫자 b를 입력하세요"); //""안에 내용을 콘솔에 출력
		b = scan.nextInt(); //키보드로 부터 숫자를 읽어와서 b에 대입(할당)
		
		sum = a+b;
		
		System.out.println("a+b의 결과는 "+sum+"입니다."); //""안에 내용을 콘솔에 출력
		
	}

}

//shift+end 한줄이 전체 선택
