
public class ArrayCopy {

	public static void main(String[] args) {
		//배열 복사(값 복사, 주소 복사)
		
		int num1=10;
		int num2=num1;
		
		System.out.println("num1 :"+num1);
		System.out.println("num1 :"+num2);
		//num2를 증가 시킴
		num2++;
		System.out.println("num1 :"+num1);
		System.out.println("num1 :"+num2);
		
		int[] arr1 = {1,3,5};
		int[] arr2 = arr1;
		//얕은복사, 깊은복사
		//얕은복사(Shallow copy):주소값만 복사
		System.out.print("\narr1: ");
		for(int num:arr1) {
			System.out.print(num+" ");
		}
		System.out.print("\narr2: ");
		for(int num:arr2) {
			System.out.print(num+" ");
		}
		
		//주소값만 복사했기 때문에 복사본의 데이터를 바꾸게 되면, 원본이 바뀌는 것 과 같다.
				//(참조하는 대상이 같기 때문이다)
		arr2[0]++;
		System.out.print("\narr1: ");
		for(int num:arr1) {
			System.out.print(num+" ");
		}
		System.out.print("\narr2: ");
		for(int num:arr2) {
			System.out.print(num+" ");
		}
		
		
		//깊은 복사(Deap copy) : 모든 원소를 하나 하나 복사
		arr2 = new int[arr1.length];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = arr1[i];
		}
		//깊은 복사후 증가
		arr2[0]++;
		System.out.print("\narr1: ");
		for(int num:arr1) {
			System.out.print(num+" ");
		}
		System.out.print("\narr2: ");
		for(int num:arr2) {
			System.out.print(num+" ");
		}
		
		
		
		
		
	}

}
