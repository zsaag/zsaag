import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		int year;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		year = input.nextInt();
		//1번(year%4 ==0 && year% 100!=0)  
		//2번 (year%400 ==0);
		
		result = (year %4 ==0) && (year% 100!=0) || (year%400 ==0) ? "윤년" : "평년";
		
		System.out.printf("%d년은 %s입니다!", year, result);
	}

}
//예제3 윤년 검사하기
// 사용자에게 연도를 입력받아서 헤당 년도가 윤년인지 아닌지 검사하는 프로그램 작성
/*윤년의 조건
 1. 4로 나누어 떨어지면서(AND) 100으로 나누어 떨어지지 않음
     (a % 4 ==0)           (a % 100!=0)
 2. 400으로 나누어 떨어짐
 (a % 400 ===0)
 3. 1,2중 하나라도(OR) 만족하면 윤년
 
 
 실행 예
 연도를 입력하세요
 2000
 2000년은 윤년입니다!
 */
 