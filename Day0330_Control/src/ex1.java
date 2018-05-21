// 짝수인지 홀수인지 작성하는 프로그램 만들기
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		int x; //숫자를 입력받을 변수를 선언
	Scanner input = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요."); //입력하라고 안내
	x = input.nextInt(); //정수 하나를 사용자로부터 입력받음
	
	boolean result = x%2 ==0;
	if(result) {
		
		System.out.printf("%d는 짝수입니다.",x);
	}else {
		System.out.printf("%d는 홀수입니다.",x);	
	}
	}
}
	/*//if-else 문장을 이용해서 선택적으로 출력
 		if(x%2==0) { //%를 사용해서 2로 나눈 나머지가 0인지 확인->짝수 확인
			
			System.out.printf("%d는 짝수입니다.",x);
		}else { //나머지가 0이 아니면 홀수로 출력-> 홀수 확인
			System.out.printf("%d는 홀수입니다.",x);	
		}
	}
	}*/



