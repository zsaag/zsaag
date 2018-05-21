import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		// while - break 연습예제
		// 사용자에게 숫자(정수)를 입력받아서 계속해서 더합니다.
		// -1을 입력받으면 그 전까지 더한 숫자의 총합과 평균을 출력하는 프로그램을 작성
		// 단 평균은 소수점 둘째 자리에서 반올림하여 한 자리만 표시
		/*
		 * 입출력 예) 5 10 6 7 -1 총합은 28 평균은 7.0
		 * 
		 * 총합과 평균
		 * 총합 : 입력된 숫자의 누적합 >>> 5 4 7 2 1
		 * 평균 : 누적합 / 입력된수
		 * 
		 * 필요한 변수 : 총합을 저장할 변수, 입력받은 수의 개수를 저장할 변수
		 * 			사용자에게 수를 입력받을 변수
		 * 1. 사용자에게 수를 하나 입력받고
		 * 2. 입력받은 수가 -1인지 아닌지 확인
		 * 3. 3-1 -1이라면 반복을 종료하고 총합과 평균을 계산, -1이 아니라면
		 * 	  3-2 -1이아니라면 입력받은 수를 총합에 더하고, 개수를 1증가
		 * 4. 1~3을 반복
		 */
		Scanner input = new Scanner(System.in); // 입출력
		int number; // 사용자에게 수를 입력받을 변수
		int sum = 0; //합계을 저장할 변수
		double avg=0;	//평균변수
		int i=0; // 입력받은 수의 개수를 세기 위한 변수
		System.out.println("숫자를 입력하세요");// 숫자를 입력하라는 메시지 출력
				//몇번 반복인지 알수없음 >> while문을 사용
				while(true) { // -1을 제외한 수들은 더하거나,나눔 논리값(true/false)나 논리식이 올수 있다.
				number = input.nextInt();//number변수 입력//사용자에게 숫자를 입력받는 것을 반복
			
				if(number==-1) {// 입력받은수가 -1을 입력확인
				
				break;//반복종료
			}	//if end
				avg=(double)(sum/i);
				sum = sum + number;	  //입력받은수가 -1이 아니면 입력받은수를 더한다 총점
				i++;				  //입력받은수가 -1이 아니면 입력받은 숫자의 개수를 올림 횟수 증감
			}//while end
				System.out.printf("합계는 %d, 평균은 %.1f 입니다", sum, avg);//총합및 평균 출력	}
		}
	}
/*		        int score; //입력수
		        int sum=0; //합계
		        int count=0; //카운터횟수
		        double avg; //평균
		        Scanner input= new Scanner(System.in);
		        System.out.print("점수를 입력하세요 : "); //입력창
		        
		        while(true) {
		            
		            score = input.nextInt(); //입력
		            sum = sum+score; //합계
		            count++; //위의 조건 완성 후 증가
		            if(score==-1) {
		                sum = sum+1; //-1음수값을 제외 하므로 합계에 +1
		                System.out.printf("합계는 %d, 평균은 %.1f",sum, avg=(sum/(count-1)));
		                //종료하기 위해 입력한 음수 값은 점수 입력 횟수에서 제외해야 한다. 그래서 count-1로 sum을 나눈다 
		                break;//break문을 통해서 while 반복문의 반복을 중단하고 빠져 나간다    
		            }
		        }
		    }
		}*/





