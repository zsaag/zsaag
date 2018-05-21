import java.util.Scanner;

public class gogodan {

	public static void main(String[] args) {
	/*	//구구단 출력하기
		//2단 출력하기
	
	for(int x=2;x<3;x++) {
		for(int y=2;y<=9;y++) {
			System.out.printf("%d * %d = %d\n",x,y,x*y);
		}}*/
	/*int number;
	Scanner input = new Scanner(System.in);
	System.out.printf("출력할 구구단을 입력하세요");
	number = input.nextInt();
	for(int x=1; x<=number; x++)
		for(int y=1; y<=9 ; y++){
			System.out.printf("%d * %d = %d\n",x,y,x*y);
		}*/
		int inNum;
		Scanner input = new Scanner(System.in);
		System.out.printf("출력할 구구단을 입력하세요");
		inNum = input.nextInt();
		
		//System.out.printf("%d");
		for(int n=1;n<9;n++) {
			//int number;
			//number = n*2;
			System.out.println(inNum+"X"+n+"="+(n*inNum));
		}

	}
	}

