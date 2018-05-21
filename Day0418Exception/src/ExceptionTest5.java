
import java.io.IOException;

public class ExceptionTest5 {
	public static void main(String[] args) {
		//finally
		
		Student s = new Student(300,3);
		
		try {
			s.showAverage();
			System.out.println("Try 정상 종료");
			return;
		} catch (IOException e) {
			System.out.println("IOException 발생");
		} catch (Exception e) {
			System.out.println("Exception 발생");
		} finally { //예외가 발생해도 항상 실행함,return을 선언과 상관없이 실행됨
			System.out.println("얘는 항상 실행합니다.");
		}
		System.out.println("프로그램종료 합니다.");	//return을 선언하면 실행이 안됨	
	}
}

