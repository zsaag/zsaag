import java.util.Scanner;

public class CircleTest2 {
	
	
	
	
	
	public static void main(String[] args) {
		//사용자로부터 다수의 원의 반지름과 중심정의 좌표를 입력받아서
		//출력하는 프로그램을 작성하라
		/*입 출력예) 저장할 원의 개수를 입력하세요
				  3
				  원의반지름을 입력하세요
				  10
				  원의 x좌표를 입력하세요
				  3
				  원의 y좌표를 입력하세요
				  5
				  원의반지름을 입력하세요
				  11
				  원의 x좌표를 입력하세요
				  4
				  워의 y좌표를 입력하세요
				  6
				  원의반지름을 입력하세요
				  12
				  원의 x좌표를 입력하세요
				  7
				  워의 y좌표를 입력하세요
				  8
				  원 1의 반지름은 3, 넓이는 xxx.xx 중심좌표는3,5
				  원 2의 반지름은 5......
				  원 3의 반지름은 6......
				  */
	
	
		//원 하나의 정보를 저장하는 객체는 Circle의 객체
		
		Scanner input = new Scanner(System.in);
		System.out.println("저장할 원의 개수를 입력하세요");	
		int n = input.nextInt();
		//우리가 필요한건 하나가 아니라 여러개의 원의 정보를 처리할 수 있는 변수
		Circle[] c = new Circle[n];
		//배열을 만들고나면,해당하는 배열의 한칸 한칸은 각각 Cicrcle 객체 의 수고값을 저장할 수있다.
		//배열을 만들면 객체의 주소값을 저장할 수 있는 변수가 여러개 생성되는 것이다.
		//객체가 여러개가 생성되는 것이 아님
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Circle();
		}
		for(int i=0;i<c.length;i++) {
		System.out.println("원의 반지름을 입력하세요");
		c[i].setradius(input.nextInt());
		System.out.println("원의 x좌표를 입력하세요");
		c[i].center.setX(input.nextInt());
		System.out.println("원의 y좌표를 입력하세요");
		c[i].center.setY(input.nextInt());
		}
	
	
		for(int i=0;i<c.length;i++)
		{
			System.out.printf("원%d의 반지름 %d 넓이는%.2f 중심좌표는 %d, %d\n",i+1,c[i].getradius(),c[i].area(),c[i].center.getX(),c[i].center.getY());
		}	
	}
}