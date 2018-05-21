
public class FindMaxVal {

	public static void main(String[] args) {
		//1.{77,50,64,100,25} 형태의 임의의 숫자 5개로 초기화된 정수형 배열을 생성
		//2.해당 배열에서 가장 큰 숫자를 찾아서 화면에 출력
		//출력 예)
		//가장 큰 숫자는 100입니다.
		int[] num = {77,50,64,100,25};//초기화된 값 배열  생성
		//배열중에서 가장 큰 값으 ㄹ찾아야 하는데.. 외부 값이 배교 대상에 포함됨
		int maxValue=0; //가장 큰값을 저장할 maxValue 변수 선언
		//int maxvalue=num[0];
		//배열의 원소를 하나씩 maxVal과 비교하면서,
		//원소가 maxVal 보다 크면, 해당 원소값을 maxVal에 저장
		//arr.length ==>5
		for(int i=0;i<num.length;i++) //배열을 반복해서 출력
		{
			if(num[i]>maxValue){ //배열들을 저장할 변수중 비교 해서 최대값 출력
				maxValue=num[i]; //배열들을 저장할 변수은 num과 같다
		}
	}System.out.println("가장 큰 숫자는"+maxValue+"입니다.");
}
}

		

	


