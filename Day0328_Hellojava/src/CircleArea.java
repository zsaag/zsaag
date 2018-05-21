import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		
		// 내가프로그램 작성에 필요한 변수 부터 생각....
		
		int radius; //반지름을 저장할 변수
		double area;
		//입력 받을 준비
		Scanner input = new Scanner(System.in);
		//사용자에게 정보 출력
		System.out.println("넓이를 구하고자 하는 원의 반지름을 입력하세요.");
		
		//키보드로 부터 정수를 입력 받음
		radius = input.nextInt();
		//원의 넓이를 계산
		area = 3.14*radius*radius;
		//System.out.println("반지름" +radius+"인 원의 넓이는 "+area+"입니다.");
		//printf >> 출력시 포맷을 결정해놓고 출력하는 메서드
		System.out.printf("반지름:%d인 원의 넓이는 %.2f입니다",radius, area);
	}
	
}
	
    //원의 넓이를 구하는 프로그램 작성
	//반지름(정수)을 입력받아서 원의 넓이를 구하는 프로그램
	
	//3.14*r*r     (r=반지름)
	
	//실행 예) 넓이를 구하고자 하는 원의 반지름을 입력하세요

