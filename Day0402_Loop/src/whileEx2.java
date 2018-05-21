import java.util.Scanner;
public class whileEx2 {

	public static void main(String[] args) {
		/*
		 * 예제 사용자에게 숫자를 하나 입력받아서 1부터 입력받은 수 사이의
		 * 짝수를 출력하기(2로 나누어 떨어지는 수, n%2==0)를 출력하기
		 * 입출력 예)
		 * 숫자를 입력하세요.
		 * 11
		 * 2 4 6 8 10
		 * 
		 * while, if사용
		 * */
		Scanner input = new Scanner(System.in);
		int x=1; //x값
		int n; //사용자가 입력 받은 정수를 저장할 변수 선언
		
		System.out.println("숫자를 입력하세요");//숫자를 입력받기
		n = input.nextInt();
		
		//입력받은 수 만큼 반복하기 위해서, 반복 횟수를 확인 할 수있는 변수(반복계수)가 필요
		//반복계수:반복문 시작전에 초기화되면,반복문안에서 변하면서 반복문의 조건문을 변화시키는 변수
		while(x<=n) 
		{	
			if (x%2==0) {//출력되는 부분을 x가 짝수를 출력하고 싶다	
				System.out.print(x+" ");}
			//홀수일때는 작성하지 않음}
			x++;//반복문안에서 반복계수는 1씩 증가		
		}
		
		
	}
}
