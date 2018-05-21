import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		//정올 실력키우기 1291 구구단 출력하기
		//s와 e를 입력 받아서 해당 범위의 구구단 출력하기
		//s와e의 범위는 2이상 9이하, 작은수 부터 입력 받아야 하는건 아니다.
		//입력을 잘못받으면 에러메시지 출력후 다시 받는다.
		
		
		
		//가로 구구단 출력 가져와서 출력 형식 맞추기
		//입력받기
	/*	Scanner input = new Scanner(System.in);
		int s; //시작범위
		int e; //종료범위
		
		
		//일단 해야 할일은 s와e가 정상 범위인지 아닌지 확인
		//1.s가 2이상 이고 9이하 이다.
		//2.e가 9이상 이고 9이하 이다.
		//1과 2가 둘다 참이어야 정상적인 범위
		//입력을 잘못받으면에러메시지 출력후 다시 입력 받는다.
		//<<한번만이란말이 없음 : 입력이 잘못되면 반복해서 계속 입력 받는다.
		
				
		while(true) {
			//입력받는 부분이 반복 되어야 함
			s = input.nextInt();  //시작점 입력받기
			e = input.nextInt();  //시작점 입력받기
			
			if((s >=2&& s<=9)&&(e >=2&& e<=9)) {
				
				break; //정상적으로 입력받았다면 더 이상 반복은 필요없다.
			}else {
				System.out.println("INPUT ERROR!!");
			}
		}
		if(s<=e) {
			//e가 s보다 크거나 같은 경우
		for(int i=1;i<=9;i++){	
			//이반복문은 j가 s일때 e는 j보다 크                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     거나 같다
			for(int j=s;j<=e;j++) {
				System.out.printf("  %d * %d = %2d" ,j,i,i*j);
			}
			System.out.println();
		}
		}else {
			//s가 e보다 큰 경우
			for(int i=1;i<=9;i++){
				//이반복문은 s가 작을때나 같을 때 정상 동작하는 반복문			
				for(int j=s;j>=e;j--) {
					System.out.printf("  %d * %d = %2d" ,j,i,i*j);
				}
				System.out.println();
		}
		}
		*/
		
		
		Scanner input = new Scanner(System.in);
			
				while(true) {
					int number1,number2;
					System.out.println("숫자를 입력하세요");
					number1 = input.nextInt(); //시작점 입력받기
					number2 = input.nextInt(); //시작점 입력받기
					if (number1>9||number2>9||number1<2||number2<2){//number1과2가 2와 9사이에 있을때
						System.out.println("INPUT ERROR!!"); //없는 값을 제출 하면 error!
						continue;
						}//에러 조건이 충족하면 다시 숫자 입력
					
					
					if(number1>number2) {//number1이 number2보다 클때
						for(int i=1; i<=9 ; i++) { //i초기값 1, i는 9보다 작거나 같을때 i증감
						for(int j=number1; j>=number2 ; j--) //j는 number1일때 j>=number값이랑 같을때 j감소
						{ 			
							System.out.printf(" %d * %d = %2d   ", j, i,(i*j)); //입력한 구구단 값 출력
						     }
							System.out.println();//다음 라인으로 입력
							}					
						}else {//number2가 number1보다 클때
							for(int i =1; i <=9; i++) { //i초기값 1, i는 9보다 작거나 같을때
								for(int j=number1; j<=number2; j++){ //j는 number1일때 j>=number값이랑 같을때 j감소
									System.out.printf(" %d * %d = %2d   ", j, i,(i*j));////입력한 구구단 값 출력
									}
									
								}							
								}
								break;	//위 조건들을 만족 했을 때 프로그램 종료
							}
						}
					}





			
	



