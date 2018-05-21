
public class ArrayEx {

	public static void main(String[] args) {
		//배열(Array)에 대해서 공부합니다.
		//배열은 같은 데이터타입 변수의 모임이다.
		
		int s1,s2,s3;
			s1 =100;
			s2 =90;
			s3 =80;
			
			/*System.out.println(s1);
			System.out.println(s1);
			System.out.println(s1);
			
			
			for(int i=1;i<=3;i++) {
				
			}*/
			
			//인간이 보기에 같은 종류의 데이터라도 따로 선언을 하면 한꺼번에 처리하지 못함
			
				//정수형 데이터 3개를 저장할 수 있는 배열 생성하기
				//1. (정수형)배열의 주소를 저장할 수 있는 참조 변수 만들기
				//	 만들 배열의 종류는 정수형 배열
				int[] numbers;
				//int[] numbers=null; //정수배열의 주소값을 저장할 수 있는 (참조)변수
				
				
				//배열 만들기 &주소값 참조변수에 넣기
				numbers = new int[3]; //주소값을 numbers참조변수에 넣기  
				//int[] numbers = new int[3];
				
				
				
				//배열을 사용합시다.
				
				//numbers = 5; numbers 는 배열의 주소값을 저장하는 변수,정수를 그대로 넣을 수 없음
				//배열의 사용은 inddex를 통해서 할수 있다.
				//index: 배열의 요소의 순서를 나타내는 번호, 0부터 시작. 
				//그래서 가장 큰 인덱스는  배열길이 -1이다.
				
				//첫번째칸에는1, 두번째 칸에는 3, 세번째 칸에는 5를 넣어봅시다
				numbers[0] = 1; //3번째 칸안에 3을 넣어라
				numbers[1] = 3; //3번째 칸안에 3을 넣어라
				numbers[2] = 5; //3번째 칸안에 3을 넣어라
				
				
		
				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				System.out.println(numbers[2]);
				
				for(int i=0;i<numbers.length;i++) 
				{ //i(index)는 0부터 시작(3이면 0,1,2), 그래서 i는 3(numbers.length=numbers의 길이)보다 작고 i는 증감
					System.out.println(numbers[i]);
				}
			
	}

}
