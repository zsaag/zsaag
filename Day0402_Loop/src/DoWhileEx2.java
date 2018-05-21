import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		//사용자가 특정한 수를 맞추는 게임 프로그램 작성
		//사용자에게 숫자를 입력받아서 
		//입력받은 수가 지정한 수보다 큰지 작은지 알려주다가
		//사용자가 정답을 입력하면 정달!이라고 알려주고 종료
		//do-while로 작성

		int answer=67; //정답
		int number; //사용자의 입력값
		
		Scanner input = new Scanner(System.in);
		//해야할일
		//사용자에게 숫자를 입력받아
		//숫자가 정답보다 큰지 작은지, 또는 정답인지 출력
		//정답과 입력받은 숫자가 같으면 종료
		do {
			System.out.println("숫자를 입력하세요."); //숫자를 입력
			number = input.nextInt();
			if(number>answer) {
				System.out.println("입력하신 수가 정답보다 큽니다."); //입력하신 수가 정답이 클때
			}
			else if(number<answer) {
				System.out.println("입력하신 수가 정답보다 작습니다."); //입력하신 가 정답이 작을때
			}
			else{
			System.out.println("축하합니다. 정답입니다!!");//정답일 경우 출력
		}
		}
		while(answer!= number);//정답과 같지 않으면 계속 실행 해라	
		} 
		
}


