
public class ExceptionTest3 {

	public static void main(String[] args) {
		//RuntimeException의 경우에는
		//코드로 충분히 예방이 가능하다
		//예외처리리를 하지 않아도 된다. 컴파일러가 강제로 하라고 안시킴
		int a = 1;
		int b = 0;
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		int result = 0;
		
		for(int i=0;i<numbers.length;i++) {
				if(b==0){result = numbers[i]/b;
		}else {
			result = numbers[i]/b;
		}
	}
	System.out.println(result);
	
	System.out.println("프로그램 종료합니다.");
}
}
