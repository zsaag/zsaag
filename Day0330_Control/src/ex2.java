//연도를 사용자에게 입력받고-Scanner, year

//입력받은 연도가 윤년인지 계산 - 조건식

//계산 결과에 따라 출력 -if-else

import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in); 
			System.out.println("연도를 입력하세요.");
			year = scan.nextInt();
		if ((year%4 ==0 && year% 100!=0)||(year % 400==0)){
			System.out.printf("%d년은 윤년입니다.",year);
		}else{
			System.out.printf("%d년은 평년입니다.", year);
		}
			
	}
}


