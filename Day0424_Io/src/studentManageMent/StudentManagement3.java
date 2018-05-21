package studentManageMent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class StudentManagement3 {
	//Management 클래스에 학생정보를 저장하고, 가져오는 기능을 작성
	//private static final String FILE_NAME="studentList.list";
	ObjectOutputStream oos=null;
	ObjectInputStream ois =null;
	MyList<Student> studentlist;
	private boolean isRun; 
	private Scanner scan;
	Student s = new Student();
	public StudentManagement3() {
		//파일에 데이터가 있다라고 가정을 하면 객체를 새로 만들어 내는 작업이 쓸모가 없음
		studentlist = new MyList<Student>();
		//loadData();
		isRun = true;
		scan = new Scanner(System.in);
		
		

	
	}	
	/*public void saveData() {
		//데이터를 파일에 저장하는 기능
		//파일출력(객체를 파일에 작성)
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(FILE_NAME)));
			
			//파일에 작성해야 하는 데이터>>>> sList
			oos.writeObject(sList);
			oos.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(oos !=null) oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}*/

			
		//}
	/*public void loadData() {
		//파일로부터 데이터를 가져오는 기능
		//파일입력
		ObjectInputStream ois = null;
		try{
			ois = new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(FILE_NAME)));
			//파일에서 sList 객체 가져와서 내가 관리할 sList에
			//참조 시켜주면 된다. 
				sList = (MyList<Student>)ois.readObject();
		
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			sList = new MyList<Student>();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try{
				if(ois !=null) ois.close(); 
			}catch(IOException e) {
				e.printStackTrace();
			}
		}		
	}*/
	
	
		
	public void start() {
		
		while (isRun) {
			try {//데이터를 가져오는 기능
				ois = new ObjectInputStream(
						new BufferedInputStream( 
								new FileInputStream("management.txt")));
				studentlist = (MyList<Student>)ois.readObject();
				for(int i=0;i<studentlist.size();i++) {
					System.out.println(studentlist.get(i));
				}
			showMenu();
			inputMenu();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			//데이터를 저장하는 부분
			try {	oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("management.txt")));
			MyList<Student> tmp = studentlist;
			oos.writeObject(tmp);		
			oos.flush();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}				
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
				//saveData();
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
