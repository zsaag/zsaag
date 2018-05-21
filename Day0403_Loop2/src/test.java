import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int a;
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요"); //출력값을 입력하라고 안내
			a = input.nextInt(); //a출력를 출력
			for(int i=1; i<=a; i++) //조건 i=1 i<=입력변수 , i증감 			
				if(i%5==0) {// i가 5의 배수이면					
					sum = sum+i; //입력값에서 5의 배수의 값만 더해서 출력	
									
			}System.out.println(sum); //입력한수에서 5의 배수 만 더한 값을 출력해라
		}	
	}


