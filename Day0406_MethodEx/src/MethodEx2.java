import java.util.Scanner;
public class MethodEx2 {

	public static void main(String[] args) {
		//메서드 만들기
		//수식자는 public static
		//이름은 add
		//매개변수는 정수2개 
		//반환형은 정수
		//반환값은 매개 변수 2개를 더한 값
		
		//두 정수를 입력받아서 나머지 값을 반환하는 메서드 작성
		//mod
		int a = add(3,5);
		int b = mod(4,3);
		
		System.out.println(a);		
		System.out.println(b);
		

	}

	public static int add(int num, int num2) {
		//매개변수로 입력받은 두수를 더해서 결과를 반환하는 매서드
		int num3 = num+num2;
		return num3;
		
	}
	public static int mod(int a, int b) {
		
		
		return a%b;
		
		
	}
}
