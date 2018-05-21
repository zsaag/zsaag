
public class ExceptionTest {

	public static void main(String[] args) {
		int x=1;
		int y=0;
		
		
		//예외 처리 문장 :  try-catch
		
		try {// 예외발생 예상 구간
			int result = x/y;
		}catch(NullPointerException e){ //예외객체 e(exception)
			//예외가 발생했을 경우 실행할 문장
			System.out.println("없는데요??");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 못나눠요.");
		}
		
		System.out.println("이문장은 실행이 되나요?");
	}

}
