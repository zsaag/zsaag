import java.util.Scanner;
public class ArrayEx4 {

	public static void main(String[] args) {
		//사용자에게 10개의 정수 입력받아서
		//배열에다가 저장해서
		//짝수 번째 입력받은 수의 합과
		//홀수 번째 입력받은 합을 각각 출력하시오.
		//10칸짜리 정수형 배열 만들어서 입력받으세요~
		Scanner input = new Scanner(System.in);
		int odd=0;//홀수번째더한값
		int even=0;//짝수번째더한값
		int[] num = new int[10]; //10개의 정수를 저장할 수 있는 배열 선언
		//[0][0][0][0][0][0][0][0][0][0]
		
		for(int i=0; i<num.length;i++){
		{		
			System.out.println("숫자를 입력하세요"); //숫자를 입력하라고 안내
			num[i] = input.nextInt(); //값을 입력하시오
		}
		}
		//입력을 다 받았으니까 한칸씩 검사하면서 짝수 인덱스, 홀수 인덱스에 있는 값을 따로 합계 구하기
		for(int i=0; i<num.length;i++) {
			if(i%2==0) { //짝수번째 출력
			odd = odd+num[i];
		}else { //홀수번째출력
				even = even+num[i];		
			}
		}System.out.println("odd :"+ odd); //짝수값 출력
		 System.out.println("even :"+ even); //홀수값 출력
	}
	}



	

