import java.util.Scanner;
public class ArrayEx2 {

	public static void main(String[] args) {
		//학생의 점수(정수)를 입력받는 10칸짜리 배열하나 생성
				//반복문을 이용하여 배열에 데이터 채워 넣기.
				//데이터가 입력되고 난 뒤 점수 출력하기
				/*입출력 예)
				 * 점수를 입력하세요.
				 * 50
				 * 점수를 입력하세요.
				 * 60 
				 * 점수를 입력하세요.
				 * 77
				 * 점수를 입력하세요.
				 * 86  ....10번 반복
				 * 
				 * 입력된 점수는
				 * 50 60 77 86......(10개)
				 */
		//학생점수 여러개 저장할 수 있는 배열 선언
		int[] score; //배열 참조 변수 선언
		score = new int[10]; //배열 객체 생성10까지
		Scanner input = new Scanner(System.in); //입력함수 생성				
			for(int i=0;i<score.length;i++){	//i=0부터 i<10까지 i증감		
				{ 
					System.out.println("점수를 입력하세요."); //점수 입력 하라고 안내
					score[i] = input.nextInt(); //점수를 입력
				}
			}
			System.out.println("입력된 점수는"); //결과 출력
			for(int i=0;i<score.length;i++){ //i=0부터 i<10까지 i증감		
				{ 
					System.out.print(score[i]+" "); //10입력한 값이 출력
				}
			}
		}
	}

	



