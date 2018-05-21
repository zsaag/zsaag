import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement { // 학생관리 : 모든 학생정보조회, 학새추가, 검색, 종료
									// 메뉴보여주기, 메뉴입력받기(입력받은 메뉴별로 기능수행)
									// 필요데이터 : 학생의 배열(Student[])
	 //Student student;
	private Student[] student;// 학생정보 저장을 위한 배열
	private boolean isRun; // 프로그램을 계속 실행할것인지 확인하는 변수
	private Scanner scan;
	
	private int number; //학생수를 카운트 하기 위한 변수
	
	public StudentManagement() // StudentMangement 기본생성자
	{
		student = new Student[50];
		isRun = true; // isRun의 초기값을 true로 줘서 프로그램이 실행될 수 있도록 한다.
		scan = new Scanner(System.in);
		//임의의 데이터 넣어주기
		setdefaulsData();
	}

	public void start() {
		 //메뉴를 계속해서 출력하기 위해서 while문에서 메뉴를 출력한다.
		 while(isRun) {
			 showMenw();
			 inputMenu();
		 }
	 }

	// 메뉴보여주기
	public void showMenw() 
	{
		System.out.println("**************************");
		System.out.println("********메뉴를 선택하세요********");
		System.out.println("*                        *");
		System.out.println("* 1. 모든학생보기        2. 학생정보     *");
		System.out.println("* 3. 이름검색              4. 종료           *");
		System.out.println("******메뉴를 선택하세요**********");
		System.out.println("**************************");
		System.out.println("**************************");
	}// 메뉴 입력받기

	public void inputMenu() {
		try {
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();

		switch (menu) {
		case 1:// 학정보보기
			showStudents();
			break;
		case 2:// 학생정보입력
			inputStudent();
			break;
		case 3:// 검색
			searchStudent();
			break;
		case 4:// 종료
			System.out.println("종료합니다.");
			isRun = false; //프로그램을 종료하기 위해서 상태값을 false로 설정
			break;
		default:// 메뉴없음
			System.out.println("잘못입력하셨습니다.");
			break;}
		}catch(InputMismatchException e)
			{
				/*e.printStackTrace();*/
				System.out.println("잘못입력하셨습니다.");
				return;
			}
	}
	// 모든 학생 정보 보기 메서드
	public void showStudents() {
		System.out.println("학생정보보기");
		//현재 내가 가지고 있는 학생 정보를 모두 출력
		//배열에 학생정보를 가지고 있다.
		//배열의 요소를 하나씩 출력
		for(int i=0;i<number;i++) {
			//배열요소에 접근하기 배열이름[index]
			
			//Student[i]>>Student 객체 하나를 참조할 수 있음 			
			/*System.out.println("이름 "+student[i].getName());
			System.out.println("학년 "+student[i].getGrade()); 
			System.out.println("성적 "+student[i].getAverage()); 
			System.out.println("점수 "+student[i].getScore());
			System.out.println("-------------------------");*/
			//System.out.println(student[i]);
			printStudent(i);
		}
		
		}
	
	public void printStudent(int index) {
		System.out.println("이름 "+student[index].getName());
		System.out.println("학년 "+student[index].getGrade()); 
		System.out.println("성적 "+student[index].getAverage()); 
		System.out.println("점수 "+student[index].getScore());
		System.out.println("-------------------------");

	}
		

	//학생 정보 입력하기 메서드
		public void inputStudent() {
			try {
			System.out.println("학생정보 입력하기");
			//학생의 정보를 사용자(키보드)로부터 입력받고 
			//객체를 만들어서 배열에 저장
			System.out.println("이름을 입력하세요");
			String name = scan.next();
			System.out.println("학년을 입력하세요");
			int grade = scan.nextInt();
			
			System.out.println("국어 점수를 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			int math = scan.nextInt();
			
			//객체를 만들어서 배열에다가 넣기
			student[number]	= new Student(name,grade,kor,eng,math);
			number++; //배열에 추가
			System.out.println("추가되었습니다.");
		}	catch(InputMismatchException e)
			{
				/*e.printStackTrace();*/
				System.out.println("잘못입력하셨습니다.");
				return;
			}
		}
	// 학생 정보 이름검색 메서드
	public void searchStudent() {
		try {
		System.out.println("학생정보검색하기");
		//이름검색
		//사용자에게 문자열을 입력받아서 해당 문자열을 포함하는 이름을 가진
		//학생을 모두출력		
		//문자열 하나 입력받고
		//내가 가진 학생배열을 하나씩 검색하면서,
		//입력받은 문자열과 이름을 비교해서 같거나, 문자열을 포함하고 있으면
		//학생정보를 출력
		System.out.println("이름을 입력하세요.");
		String keyword = scan.next();
		for(int i=0;i<number;i++) {
			//student[i].getName() keyword랑 비교
		
			String name =student[i].getName();
			//문자열비교 : equals
			//name.equasl(keyword);
			//name 문자열이 keyword를 포함하고 있으면 true, 아니면 false
			//name.contains(keyword);
			if(name.contains(keyword));{
				//이름이 검색어를 포함하고 있다.
				//해당학생을 출력
				printStudent(i);	
			}
		}
		}catch(InputMismatchException e)
			{
				/*e.printStackTrace();*/
				System.out.println("잘못입력하셨습니다.");
				return;
			}			
	}
	//임의의 학생정보를 배열에 넣어주는 임시 메서드
	public void setdefaulsData() {
		//학생배열에 3~4명정도 학생정보 넣기
		student[0]= new Student("홍길동",3,100,0,50);
		student[1]= new Student("이순신",2,50,100,50);
		student[2]= new Student("신사임당",1,80,100,100);
		student[3]= new Student("김장금",2,70,80,100);
		number=4;
	}	
}
	/*
	  public StudentManagement(Student student) //StudentMangement 기본생성자 
	  {
	  this.student = student; 
	  } 
	  public StudentManagement(String name, int grade,
	  int kor, int eng, int math) {//StudentMangement 생성자
		   student.setName(name);
	  }//이름
	  student.setGrade(grade); //등급
	  student.setKor(kor); //국어
	  student.setEng(eng); //영어
	  student.setMath(math); //수학 
	  } 
	  public void setStudent(String name, int grade, int kor, int eng, int math) //setter student 메서드 
	  { 
		 this.student = new Student(name,grade,kor,eng,math); 
		 }	 
}*/
