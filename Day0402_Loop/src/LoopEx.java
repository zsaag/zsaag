
public class LoopEx {

	public static void main(String[] args) {
		/*
		 * 반복문에 대해서 공부합니다.
		 * 반목문은 특정한 문장(들)을 여러번 반복해서 실행하고자 할때 사용
		 * 반목문의 종류 : while, for, do while
		 * 
		 * 1. while : 조건식이 만족할 때, 계속해서 반복할 때 사용
		 * 2. for : 보통, 반복하고자 하는 횟수가 정해져 있을 때
		 * 3. do while : while과 동일하나, 최소 한번은 실행할 때 사용 
		 * 
		 *  while(조건식){
		 *  //조건식이 참이면 반복할 문장
			//if는 조건식이 참이면 실행할 문장
		 *  	문장;
		 *  }
		 *  x+=5;
		 * */
		int x=1;
		while(x<=10) { 
			
			System.out.println("Hello World!!"+x*2);
			x=x+1;
		}
	}

}
