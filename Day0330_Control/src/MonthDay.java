import java.util.Scanner;// Scanner입력후 ctrl+shift+o

public class MonthDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		int month;
		int days=0; //초기화 (특정한 값을 넣어줄때는 초기화 실행) 
		System.out.println("연도를 입력하세요");
		year = scan.nextInt();
		System.out.println("월을 입력하세요");
		month = scan.nextInt();
		
		switch(month) {
		case 1:		
		case 3:	
		case 5:	
		case 7:	
		case 8:
		case 10:		
		case 12:
			days =31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			//윤년이면 29일, 평년이면 28일
			if ((year%4 ==0 && year% 100!=0)||(year % 400==0)){
				days=29; //윤년
			}else{
				days=28; //평년
			}
			
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}		
		System.out.printf("%d년 %d월은 %d일 입니다.", year,month,days); 
		
		//달을 입력받아서 달의 일수를 구하는 프로그램을 작성하자
		//예) 월을 입력하세요.
		//     3
		//    3월은 31일 입니다.
		//1,3,5,7,8,10,12 31일
		//4,6,9,11 30일
		//2 28일(기준으로 프로그램 작성)/29일
		/*Scanner scan = new Scanner(System.in);
		int month;
		int days=0; //초기화 (특정한 값을 넣어줄때는 초기화 실행) 
		System.out.println("월을 입력하세요");
		month = scan.nextInt();
		
		switch(month) {
		case 1:		
		case 3:	
		case 5:	
		case 7:	
		case 8:
		case 10:		
		case 12:
			days =31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			days=28;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			//days=0; //선언하면 모든 정수에서 선언(초기화 선언)
			break;
		}
		//switch문을 통해서 선택한 일 수 출력
		System.out.printf("%d월은 %d일 입니다.",month,days); 
		*/
	}

}
//조건상으로 보면 모든 경우의 수를 커버하지만
//코드만으로 봤을때는 아니다. 그래서 초기화가 되지 않은 것으로 판단->그래서 초기화를 선언해야함