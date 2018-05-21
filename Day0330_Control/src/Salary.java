//예제) 사용자에게 일한 시간을 입력 받고, 일한 시간의 수당을 계산해서
//화면에 보여주는 프로그램을작성하라
//정규 근무 시간은 8시간, 8시간을 초과하여 근무하였을 경우 추가 수당을 지급한다.
//시급은 7,530원이다. 8시간을 초과하였을 경우 초과한 시간만큼은 시급의 1.5배를 적용
// ex)10시간 일했다고 가정할 겨웅
// 8*7530 +2*7530*1.5
//(60240)+(22590) =82830
//if-else를 사용해서 계산
//단,급여는 소수점 둘째짜리 출력
//입출력 예)
//근무시간을 입력하세요
//10
//급여는 82830.00원입니다.
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		int workTime;
		int money = 7530;
		int result;
		double result2;
		Scanner input = new Scanner(System.in);
		System.out.println("근무시간을 입력하세요");
		workTime = input.nextInt(); //입력받을 변수(일하는 시간입력)
		
		//근무시간에 따라서 급여의 계산 방법이 달라짐
		result = workTime * money;  //8시간일 할경우
		result2 = 8*money +((workTime-8)*1.5*money); //8시간 초과할 경우
		
		if(workTime<9) {
			System.out.printf("급여는 %d입니다.",result);
		}
		else{
			System.out.printf("급여는 %.2f입니다",result2);
		}
		
	}

}




//다른 방법
/*final int REG_HOURS 8; //근무시간
 * final int TIME_PAY 7530; //시급
 * final int OVER_PAY_RATE 1.5; //8시간 초과시 1.5배
 * int hours;


if(hours<=REG_HOURS)
{
	Salary=hours*TIME_PAY
}
else {
salary = REG_ROURS*TIME_PAY 
+ (hours-REG_HOURS)*TIME_PAY*OVER_PAY_RATE;
*/