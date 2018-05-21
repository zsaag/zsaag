import java.util.Scanner;

public class gogodan2 {
	//반대로 출력하기
	//3단
	//3*9=27
	//3*8=24
	//3*7=21
	//3*6=18
	//3*5=15
	//3*4=12
	//3*3=9
	//3*2=6
	//3*1=3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inNum;
		Scanner input = new Scanner(System.in);
		System.out.printf("출력할 구구단을 입력하세요");
		inNum = input.nextInt();
		
		//System.out.printf("%d");
		for(int n=9;n>=1;n--) {
			//int number;
			//number = n*2;
			System.out.println(inNum+"X"+n+"="+(n*inNum));
		}

	}
	}

