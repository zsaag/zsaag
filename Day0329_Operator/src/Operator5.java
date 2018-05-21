
public class Operator5 {
	public static void main(String[] args) {
		//조건 삼항 연산자(항이 3개다)
		// 조건식 ? 값1 : 값2
		//조건식이 참이면 값1,거짓이면 값2를 선택
		
		//grade : 학년, 4학년 이상(4,5,6) 이면 용돈 500
		// 3학년 이하면 100
	
		int grade = 3;
		
		int pocketMoney;
		//String level;
		
		pocketMoney = grade <=3 ? 100 : 500;
		//level = grade <=3 ? "Low" :(grade>=7 ? "VERY HIGH": "High");
		System.out.println(pocketMoney);
	}

}

//예제1 : 사용자에게 숫자 2개를 입력받아서 어떤 숫자가 더 큰지 알려주는 프로그램을 작성하시오
// 실행 예 숫자 1을 입력하세요
//       3
//     숫자 2을 입력하세요
//       5
//     더 큰 숫자는 5 입니다.
