import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		/* 피보나치수열 만들기
		 * 사용자로 부터 정수하나(3이상)를 입력받아서 해당하는 수만큼의 피보나치 수열을 출력
		 * 0 1 1 2 3 5 8 13 21 34
		 * 
		 * n3= n1+n2;
		 * 
		 * 단, 1항과 2항은 0과 1로 고정
		 * 입출력 예)
		 * 출력할 항의 개수를 입력하세요
		 * 5
		 * 0 1 1 2 3
		 * 
		 * 0 + 1 = 1
		 * 1 + 1 = 2 앞에 2항을 1항 뒤의 결과값을 2항
		 * 1 + 2 = 3
		 * 2 + 3 = 5
		 * 3 + 5 = 8
		 * 5 + 8 = 13
		 * 8 +13 = 21
		 * 13+21 = 34
		 * 21+34 = 55
		 * */ 
		int c;   //입력받아 출력할 변수
		int a=0; //첫번째 숫자 초기값
		int b=1; //두번째 숫자 초기값
		int temp; //합계 변수
		Scanner input = new Scanner(System.in);
		System.out.println("출력할 항의 개수를 입력하세요"); //출력값을 입력하라고 안내
		c = input.nextInt();
		for(int i=1;i<=c;i++) //i=1초기값 , i<=c(입력값)과 크거나 같을때, i는 증가
		{
			System.out.print(a+" "); //입력했을 때 출력해주는 결과물
			temp = a+b; //두수의 합을 더한 값의 합계
			a = b;		//a와에 b를 넣음
			b = temp;	//b의 값이 temp에 넣음	
		}
	}

}
