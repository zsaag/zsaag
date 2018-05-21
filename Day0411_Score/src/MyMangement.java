import java.util.Scanner;

public class MyMangement {
	Student[] s = new Student[50]; //배열이 50까지인
	int a=6; //null값을 나타내지 않게 설정
	private boolean isRun;
	public MyMangement() {
		isRun = true; //참이면 프로그램 실행
		s[0] = new Student("신사임당",1,100,100,100);		
	    s[1] = new Student("홍길동",2,100,80,90);	  
	    s[2] = new Student("김장금",3,90,80,90);	
	    s[3] = new Student("김영수",4,100,80,90);	
	    s[4] = new Student("김영희",5,80,80,70);	    
	    s[5] = new Student("김비트",6,80,100,90);	
		
	}
	public void start() {
		
		while(isRun) { 						
			showMenu(); //메뉴보여주는 메서드
			inputMenu(); //메뉴입력받는 메서드			
		}
	}
	
	//사용자에게 메뉴를 보여주는 메서드
	public void showMenu() {
		System.out.println("번호를 선택하세요");
		System.out.println("1.정보보기 2.정보수정 3.정보삭제4.정보검색 5.종료");	
		
	}
	//사용자에게 메뉴를 입력받는 메서드
	public void inputMenu() {
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			System.out.println("정보보기를 선택하셨습니다.");
			for(int i=0;i<a;i++) {
				System.out.println(s[i]);
			}
			break;//종료
		case 2:
			System.out.println("정보수정을 선택하셨습니다.");
			scan.nextLine();
			
				
				String a1; //문자열name
				int b1,c1,d1,e1; //정수 grade,kor,eng,math
				a1 = scan.nextLine(); //name 입력
				b1 = scan.nextInt();  //grade 입력
				c1 = scan.nextInt();  //kor 입력
				d1 = scan.nextInt();  //eng 입력
				e1 = scan.nextInt();  //math 입력
				s[a] = new Student(a1,b1,c1,d1,e1); //배열 순서대로 값 받음
				System.out.println(s[a]); //입력한 값 출력
				a++;
				
		
			break;//종료
		case 3:
			System.out.println("학생삭제를 검색하셨습니다.");
			System.out.println("삭제하실 학생을 입력하세요.");
			break;//종료
		case 4:
			System.out.println("학생정보를 검색하셨습니다.");
			System.out.println("찾을실 학생을 입력하세요.");
			scan.nextLine();  //문자열 칸 띄우기
			String x = scan.next(); //문자입력 
			for(int i=0;i<=s.length;i++) { //배열이므로 반복문 실행
			if(s[i].getName().equals(x)) { //s[i].번째 getName과 입력한 x의 문자열 이 같은지 비교				
				System.out.println(s[i]);  //같으면 출력
			
				break;//종료
			}
			}
			break;//종료
		case 5:
			System.out.println("종료합니다.");
			isRun = false;//거짓이면 프로그램 종료
			break;//종료
		default:
			System.out.println("잘못입력하셨습니다.");
			break;//종료
		
		}
	}
}