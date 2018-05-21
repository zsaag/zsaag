package Day0412_2;

public class StdentTest2 {

	public static void main(String[] args) {
		MiddelStudent mStudent = new MiddelStudent();
		HighStudent hStudent = new HighStudent();
		
		mStudent.name = "홍길동";
		mStudent.grade = 3;
		mStudent.kumonDay = 3;
		
		
		hStudent.name = "이순신";
		hStudent.grade = 2;
		hStudent.regNumber = "020605-3555555";
		
		Student s = new Student();
		//MiddelStudent is a student
		Student s1 = new MiddelStudent();
		//사실 s1은 중학생인데 Student 참조변수에 참조 시켜놓음
		//자식클래스의 개개체가 부모클래스의 참조 변수에 참조되어 있으면
		//자식클래스만 가지고 있는 기능이나 변수(자식클래스에 작성된 내용)을
		//사용 할 수 없다.
		
		
		mStudent.studyKumon(3);
		//s1.studyKumon(4);  <<자식 클래스가 부모클래스의 참조변수에 참조되어있음
		
		
		hStudent.tryTabaco();
		
		((MiddelStudent)s1).studyKumon(3);
		
		//정수는 실수의 일부분
		//double d =2;
		//실수는 정수인가?? 아니다
		
		//int a =2.0
		
	}

}
