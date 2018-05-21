package List;
import java.util.Scanner;


public class StudentManagement3 {
	// 수정해야 할 부분: 입력받을 배열의 길이를 고정시키면 안됨
	// : 학생의 수만큼만 저장할 수 있는 배열을 관리

	private MyList<Student> studentlist;
	private boolean isRun; // 프로그램을 계속 실행할 것인지 확인하는 변수
	private Scanner scan;

	public StudentManagement3() {
		studentlist = new MyList<Student>();
		isRun = true;
		scan = new Scanner(System.in);
		// 임의의 데이터 넣어주기
		 
	}

	
	public void start() {
		// 메뉴를 계속해서 출력하기 위해서 while문에서 메뉴를 출력한다.
		while (isRun) {
			showMenu();
			inputMenu();
		}
	}

	// 메뉴 보여주기
	public void showMenu() {
		System.out.println("***************************");
		System.out.println("******** 메뉴를 선택 하세요 *******");
		System.out.println("*                         *");
		System.out.println("* 1. 모든학생보기         2.학생정보입력 *");
		System.out.println("* 3. 이름검색              4. 삭제          *");
		System.out.println("* 5. 종료                                          *");
		System.out.println("***************************");
		System.out.println("***************************");
	}

	// 메뉴 입력받기
	public void inputMenu() {
		scan = new Scanner(System.in);
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			// 학생정보보기
			showStudents();
			break;
		case 2:
			// 학생정보입력
			inputStudent();
			break;
		case 3:
			// 이름검색
			searchStudent();
			break;
		case 4:
			//이름으로 삭제(처음검색된 학생만 삭제)
			deleteStudent();
			break;	
		case 5:
			// 종료
			System.out.println("종료합니다.");
			isRun = false; // 프로그램을 종료하기 위해서 상태값을 false로 변경
			break;
		default:
			// 메뉴 없음
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

	// 모든 학생 정보 보기 메서드
	public void showStudents() {
		System.out.println("학생정보보기");

		for (int i = 0; i < studentlist.size(); i++) {
			printStudent(i);
		}

	}
	public void printStudent(int index) {
		Student s = studentlist.get(index);
		System.out.println("이름 : " + s.getName());
		System.out.println("학년 : " + s.getGrade());
		System.out.println("평균 : " + s.getAverage());
		System.out.println("점수: " + s.getScore());
		System.out.println("--------------------------------");
		
		//해당 인덱스의 학생정보를 출력
		
		
	}



	// 학생 정보 입력하기 메서드
	public void inputStudent() {
	
			System.out.println("학생정보 입력하기");
			// 학생의 정보를 사용자(키보드)로부터 입력받고
			// 객체를 만들어서 배열에 저장
			// 숫자를 입력받는 부분에서 예외가 발생하면
			// 1을 강제로 입력해 준다.

			System.out.println("이름을 입력하세요");
			String name = scan.next();

			System.out.println("학년을 입력하세요");
			int grade = 0;
			grade = scan.nextInt();
			int kor = 0;
			System.out.println("국어 점수를 입력하세요");

			kor = scan.nextInt();

			System.out.println("영어 점수를 입력하세요");
			int eng = scan.nextInt();

			System.out.println("수학 점수를 입력하세요");
			int math = scan.nextInt();
			
			//객체 만들어서 배열에다가 넣기
			Student s = new Student(name, grade, kor, eng, math);
			
			//만든 학생 객체를 StudentList의 객체에 넣어서 보관
			studentlist.add(s);
			
		}
	public void searchStudent() {
		
		System.out.println("이름을 입력하세요");
		String keyword = scan.next();

		for (int i = 0; i < studentlist.size(); i++) {
		
			String name = studentlist.get(i).getName();
			if (name.contains(keyword)) {			
				printStudent(i);
				}
			}
		}
	
	

	// 학생 정보 이름검색 메서드
	
	public void deleteStudent() {
		//이름 입력받고, 해당하는 이름이 있는지 검색하고, 있으면 삭제
		if(studentlist.size() ==0) {
			System.out.println("학생이 없습니다.");
			return;
		}String name = scan.next();
		//이름을 입력받아서 인덱스를 찾고, 인덱스를 studentlist.remove()
		//파라비터로 넘겨줌
		
		//인덱스 찾아서 파라미더로 넘겨줌,반복종료
		for(int i=0;i<studentlist.size();i++) {
			
			Student tmpStudent = studentlist.get(i);
			String studentName = tmpStudent.getName();
			if(studentName.equals(name)) {
				studentlist.remove(i);
				break;
			}
			/*if(studentlist.get(i).getName().equals(name)) {
				studentlist.remove(i);
				break;
			}*/
		}
	}
		
}
