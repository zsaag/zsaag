public class Lotto {

	public static void main(String[] args) {
		//1~45까지의 정수 중에 **중복되지 않는** 정수 6개를 생성
		//크기 6인 정수형 배열에 수를 저장하여 출력
		//배열, 중첩반복문
				//1. 크기 6인 정수형 배열 생성
				//2. 1~45 사이의 난수 생성
				//3. 생성한 난수가 이전에 생성한 난수인지 확인
				//4. 4-1 이전에 생성한 난수가 아니라면, 다음 난수 생성
				//	 4-2 이전에 생성한 난수라면, 현재 난수 다시 생성
				//5. 6개의 난수가 모두 생성되면 배열에 있는 숫자 출력	
				
		int[] arr = new int[6];//발생한 로또번호 6개를 저장하기 위한 배열
		//int count=0;//중복횟수 확인 초기화
		//난수 만드는 작업을 6번 반복>>반복문
		//난수 만들고 나서 배열에다가 0번부터 5번까지 차례대로 저장,숫자행 반복문
		for(int i=0;i<arr.length;i++) {//6인 배열 생성(0~5)
			arr[i] = (int)(Math.random()*45)+1; //1~45까지의 난수 생성(int는 형변환=소수점 출력 x)+1은 45까지 출력해야 하기 때문에
				//count++; //중복횟수확인
				//중복을 없애는 방법이 필요,중복검사 반복문
				for(int j=0;j<i;j++) {	//j뒤에있는 값 j<i(앞에 나온 index값이랑 비교해야 하므로 j>i)보다 크고 j는 증감		
					if(arr[i]==arr[j]) //앞에있는 i와 뒤에 있는 j가 같을때
					//중복이 발생한 것..
					//i번째 만들 난수를 새롭게 생성해줘야함
					{
						i--;	//중복이되면 i(index값)을  감소
						break; //현재 for문을 나가고 다시 이전 for문으로 다시 진행
					}
				}
		}
		/*for(int i=0;i<arr.length;i++) //6인 배열 생성(0~5)
		{
			System.out.println(arr[i]); //위의 조건을 만족하는 배열 출력
		}*/
		//출력 부분
		for(int number:arr)//for-each를 이용한 출력문
		{
			System.out.println(number);
		}
		//중복횟수 확인출력
		//System.out.println();
		//System.out.println(count);
	}
}

