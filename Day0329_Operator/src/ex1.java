//예제1 : 사용자에게 숫자 2개를 입력받아서 어떤 숫자가 더 큰지 알려주는 프로그램을 작성하시오
// 실행 예 숫자 1을 입력하세요
//       3
//     숫자 2을 입력하세요
//       5
//     더 큰 숫자는 5 입니다.
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		int a,b;
		int result1;
		
		Scanner input = new Scanner(System.in);
	    System.out.println("숫자1을 입력하세요.");
	    a = input.nextInt();
	 
	    System.out.println("숫자2을 입력하세요.");
	    b = input.nextInt();
	    result1 = a > b ? a : b;
	    
	
	    System.out.printf("더 큰 숫자는 %d입니다", result1);
	}

}
