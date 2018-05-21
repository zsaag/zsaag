import java.util.Scanner;

public class Salary {
	public static void main(String[] args){
     
     int deposit,totalBalance;
     Scanner scan = new Scanner(System.in);
     System.out.println("저축액을 입력하세요.");
     deposit = scan.nextInt();
     totalBalance = deposit*12*10;
   //이름 작성중 ctrl+space >>> 자동 완성 목록
     System.out.println("10년동안의 저축액:"+totalBalance+"입니다."); 
	}
	
	}
	
//저축액을 계산하는 프로그램 작성
	
	//메인매서드 작성
	//월급(정수)를 입력받아서 10년동안 저축액(원금)을 구하는 프로그램 작성
	//단,10년동안 같은 금액을 저축한다고 가정.
	//프로그램 실행 예)
	// 월급을 입력하세요.
	// 1000000
	// 10년동안의 저축액 : ~~~~원


