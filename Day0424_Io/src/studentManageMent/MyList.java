package studentManageMent;
//Generic 사용방법 및 ArrayList 동작 방법 학습
/* ArrayList의 동작과 매우 비슷한 List 만들기
 * add(E): 파라미터로 전달받은 데이터를 array에 끝에 추가
 * remove(int) : 인덱스를 전달받아서 array에서 해당 인덱스의 데이터를 삭제
 * [A][B][C][D][E][F]
 * get(int) : 인덱스를 전달받아서 해당 인덱스의 데이터를 반환
 * size() : array 길이 반환
 * set(int,E) :  특정 인덱스에 데이터 넣기(덮어쓰기)
 */


import java.io.Serializable;
import java.util.Scanner;
public class MyList<E> implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 304239902794627270L;
	//데이터를 저장하기 위해서는 배열이 필요
//	Scanner scan = new Scanner(System.in);
	private E[] array; //임의의 데이터 타입의 배열
	
	

	public MyList() {
		//크기 0인 배열을 생성
		//애는 객체를 만들어 내는 코드 이기 때문에 타입이 정확하게 명시되어야 함
		//array = new E[];  //얘는 안됨
		array = (E[])new Object[0]; //배열 선언(자식클래스 배열로 형변환)
	}
	public void remove(int input) {
		//index위치에 있는 요소 삭제하기
		//하나를 삭제하면 내가 관리할 배열의 길이가 1줄어든다..
		//현재배여보다 크기 1작은 배열 만든다음
		//삭제할 요소를 제외한 나머지 요소들을 모두 복사하면 된다.
		
		
		
		//boolean isDeleted = false; 
		//크기 1 작은 배열 생성
		E[] tmpArr = (E[])new Object[array.length-1];
		//지우려는 인덱스의 요소를 제외한 나머지 요소 복사하기
		int j=0;
		for(int i=0;i<array.length;i++) {
			//i가 내가 지우려는 인덱스가 아니면 복사
			if(i != input) {
				tmpArr[j] = array[i];
				j++;
			}
		}
		//array에 새로운 배열의 주소값 넣기
		array = tmpArr;

		//array에 새로운 배열의 주소값 넣기
		
		/*int j=0;
		for(int i=0;i<array.length;i++) {		
				if(array[i]==array[input]&&!isDeleted) {
					isDeleted = true;
			}else {
				tmpArr[j] = array[i];
				j++;
			}
		}
		array = tmpArr;*/
	}
	
	public void add(E input){
		//array의 마지막 에 data 추가하기
		//원래 가지고 있던 array보다 크기가 1 큰 배열 만들어서
		//기존 데이터 복사하고, 마지막에 입력받은 data 추가
		
		//기존 배여보다 크기 1큰 배열 생성
		E[] tmpArr = (E[])new Object[array.length+1];
		
		//기존 array에 있던 데이터를 newArr 복사
		 for(int i =0;i<array.length;i++) {
			 tmpArr[i] = array[i];
		 }
		 //tmpArr의 마지막에 입력받은 데이터 넣기
		 tmpArr[array.length] = input; 	 //tmpArr[array.length-1] = input;
		 //tmpArr의 주소값을 array에 넣기
		 array = tmpArr;
		 
	
	}
	
	public E get(int input) {
		//index 위치에 있는 요소 반환하기
		return array[input];
	}
		
		
	
	public void set(int index, E e) {
		//배열의 인덱스에 데이터 넣기
			array[index]= e; 
		}
	

	public int size() {
		return array.length;
	}

}
