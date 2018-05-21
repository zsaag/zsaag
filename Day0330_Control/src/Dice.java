import java.util.Random; //Random 클래스 이용시 사용
public class Dice {

	public static void main(String[] args) {
		//주사위 프로그램 만들기(1~6까지 랜덤하게 숫자생성해서 보여주기)
		//랜덤 숫자 생성방법-Math클래스 이용하기, Random 클래스 이용
		//1.Random 클래스 이용하기 //임의의 숫자를 만들어주는 클래스
		
		Random ran = new Random(); // Random 클래스 이용시 사용
		int dice = ran.nextInt(6)+1; //0~5까지의 정수를 생성 +1을 하면 1~6까지 생성
		//switch 문의로 dice가 어떤 숫자인지 출력하는 문장 작성
		switch(dice) {
		case 1:
			System.out.println("1이 나왔습니다");//1출력
			break;
		case 2:
			System.out.println("2가 나왔습니다");//2출력
			break;
		case 3:
			System.out.println("3이 나왔습니다");//3출력
			break;
		case 4:
			System.out.println("4가 나왔습니다");//4출력
			break;
		case 5:
			System.out.println("5가 나왔습니다");//5출력
			break;
		case 6:
			System.out.println("6이 나왔습니다");//6출력
			break;
		default:
	}
	}
}




//Math 이용하기: 수학과 관련된 기능들과, 값들을 저장하고 있는 클래스
//Random() : 0~0.99999999999999999
//생성된 숫자*6 : 0~5.99999999
//생성된 실수를 정수로 형변환

//int ranNum = ((int)(Math.radnom()*6))+1;

//*6