public class StudentTest {

	public static void main(String[] args) {
		//Student 클래스를 작성
		//객체를 만드어서 객체의 멤버변수에 값을 넣고, 조회하고
		//메서드를 만들어서 객체 상태를 출력하는 기능 실행해보기
		//STUDENT가 가져야할 상태값
		//이름(문자열), 학년(정수), 번호(정수)
		//Student 객체가 할 수 있는 동작
		//상태값 출력: printStudent
		//객체 2개 s1,s2 만들어서 가각 이름, 학년, 번호값 넣어주고
		//printStudent 활용해서 상태값 출력해보기
		//출력 예) 이름 : 홍길동
		//		학년 : 3
		//		번호 : 12
		//출력 예) 이름 : 이순신
		//		학년 : 2
		//		번호 : 10
		//객체를 만들어서 사용하기 위해서는 
		
		Student s1= new Student(); //s1이 참조된 Student 변수 선언
		Student s2= new Student(); //s2가 참조된 Student 변수 선언
		
		s1.name = "홍길동"; //s1 이름 홍길동
		s1.grade = 3;	 //s1 학년 3	
		s1.number =12;	 //s1 번호 12
				
		s2.name = "이순신"; //s1 이름 홍길동
		s2.grade = 2;    //s1 학년 3
		s2.number =10;   //s1 번호 12
		
		s1.printStudnet(); //s1 출력 상태값 
		s2.printStudnet(); //s2 출력 상태값
	}

}
 