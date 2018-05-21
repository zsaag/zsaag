import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		//예제 1부터 10까지의 합을 출력하는 프로그램을 작성하라
		//단, while문장을 사용하시오.
		//1+2           2까지의 합= 1 + 2
		//1+2+3			3까지의 합= 2까지의 합 + 3
		//1+2+3+4		4까지의 합= 3까지의 합 + 4
		//....
		//1+2+3+4+5+6+7+8+9+10	10까지의 합 = 9까지의 합 +1;
		//특정한 수 n 까지의 합은.. n-1까지의 합 +n
		/*int x=1; //x는 1부터
		int sum=0;//합을 저장할수 있는 변수
		while(x<=10){ //10까지 반복
		    sum =sum+x; //sum값은 sum+1의값
			x++; //x를 1씩 증가 시켜라
		} 	System.out.println("합계는"+sum);
	}

}*/
//사용자에게 입력받은 수 만큼 반복해서 더하기
//실행 예) 숫자를 입력하세요
//      3
//      1부터 3까지의 합은 6입니다.
		Scanner input = new Scanner(System.in);
		int x=1; 
		int sum=0; //합을 저장할 변수, 0으로 초기화
		int n; //사용자가 입력할 변수
		
		System.out.println("숫자를 입력하세요");
		n = input.nextInt();
		
		while(x<=n){  
		//System.out.println("hello world!!"); //1부터 사용자가 입력한 수까지 출력
		sum = sum+x;
		//System.out.println(x); //사용자가 입력한 숫자대로 출력
		x++;
	}   System.out.printf("1부터 %d까지의 합은 %d입니다", n,sum); //1부터 입력값까지의 합을 출력
  }
}
