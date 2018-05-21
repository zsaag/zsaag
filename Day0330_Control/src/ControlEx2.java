import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {
		//if-else를 이용한 학점 계산하기
		//점수를 입력 받아서
		//점수가 90이상일 경우 'A'
		// 90미만  80점이상일 경우 'B'
		// 80미만    70점이상일 경우 'C'
		// 70미만    60점이상일 경우 'D'
		// 60점미만 일 경우 'E'
		//를 출력하는 프로그램 작성
		/*입출력 예)
		 * 정수를 입력하세요
		 88
		 등급은 B입니다
		 */
		int score;
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요."); //입력자에게 표시
		score = input.nextInt(); //입력
		
		if(score>=90) { //90점 이상일 때 출력
			System.out.println("등급은 A 입니다.");
		}
		else if(score>=80) {// 위 조건이 아니면 출력(90점 미만 80점이상 확인)
			System.out.println("등급은 B 입니다.");
		}
		else if(score>=70) {// 위 조건이 아니면 출력(80점 미만 70점이상 확인)
			System.out.println("등급은 C 입니다.");
		}
		else if(score>=60) {// 위 조건이 아니면 출력(70점 미만 60점이상 확인)
			System.out.println("등급은 D 입니다.");
		}
		else {// 위에 있는 조건들이 다 맞지 않으면 출력(60점 미만)
			System.out.println("등급은 E 입니다.");
		}
			
		}

}
/*int score;
char grade;
if(score>=60) {
	//a,b,c,d
	if(score >=70){
		//a,b,c	
	if(score >=80){
		//a,b
    if (score >=90{
         //a
	}}}}else {
		//a grade='A';
	}else {
	    //b grade='B';
	}else {
		//c grade='C';
	}else {
	    //d grade='D';
    }else {
        //e grade='E';
}*/
