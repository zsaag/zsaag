import java.io.IOException;

public class Student {
	int numOfSubject; //과목수
	int totalScore; //총점
	
	public Student() {
		
	}
	public Student(int totalScore,int numOfSubject) {
		this.totalScore = totalScore;
		this.numOfSubject = numOfSubject;
	}
	
	public void showAverage()throws IOException,Exception{
		
		int result = totalScore/numOfSubject;
		
//		try{
//			throw new Exception();
//		}catch(Exception e) {
//			System.out.println("예외 발생");
//		}
		
//		try {			
//			
			System.out.println(result);
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누면 안되요");
//			System.out.println("1");
//		}
	}
	
}
