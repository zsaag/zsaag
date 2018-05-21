import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
			//break 연습
			//반목문을 빠져 나올때 사용
			//반목분의 조건식과 상관없이 반복문을 종료하고 싶을 때 사용
			//break을 만나면,더이상 반복문을 실행하지 않고, 즉시 종료
		//int i=1;
		Scanner input = new Scanner(System.in);
		//숫자 입력받을 변수 선언
		int number;
		while(true) {
			System.out.println("숫자를 입력하세요");
			number = input.nextInt();
			if(number !=-1)
			{	//number가 -1이 아니면
				System.out.printf("%d X %d는  %d입니다.\n" ,number,number,number*2);
			}
			else{ //number -1이면
				System.out.println("종료합니다");
				break;
			}
		}
	}
}
	//while end
		/*while(true) {
			System.out.println("i:"+i);
			
			//10바퀴만 반복하고 싶을 때 >> i가 10이되면 종료
			if(i==10){
			break; //반복문을 빠져나오게 하는 역활,break의 아래쪽은 실행X
			}
			i++;
		}*/



	//예제)사용자에게 숫자를 입력받고, *2한 수를 출력하다가
	//	  -1을 입려받으면 출력하지 않고 종료
	//    입 출력예)
	//		숫자를 입력하세요
	//	2
	//	2 X 2는 4입니다.
	//		숫자를 입력하세요
	//	5
	//  5 X	2는 10입니다.
	//		숫자를 입력하세요
	//	-1
	//	종료합니다.
