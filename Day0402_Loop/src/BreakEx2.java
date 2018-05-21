import java.util.Scanner;
public class BreakEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number,result;
		int i=1;
		System.out.println("숫자를 입력하세요");
		number = input.nextInt();
		while(true) { 
			result = number *i; //계수계산
			System.out.print(result+" "); //출력
			if(result >=100) {
				break;
			}
		i++;
		}
		//사용자에게 정수를 입력으면(단, 100미만의 정수를 입력받음)해당정수의 배수를
		//100이 넘어가면 출력하고 종료
		/*예) 숫자를 입력하세요
		 *    21
		 *    21 42 63 84 105
		 * */
		//사용자에게 입력 한번 받음
		//입력받은 숫자에다가 *1,*2,*3,*4 ...계속해서 반복
		//반복할 때마다 100이넘어가는지 확인하고, 넘어가면 반복 종료
		//필요변수, 입력한 수를 저장할 변수, 매  반복마다 결과를 저장할 변수
		}
		}
	


