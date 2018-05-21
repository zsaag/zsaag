package Ex4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SportsAgency{ //운동선수 속성
	private SportsPlayer[] sportplayer; //운동선수 저장을 위한 배열
	private int number;    //운동선수 저장을 위한 배열
	private boolean isRun; //프로그램을 계속 실행할 것인지 확인하는 변수
	private Scanner input; //입력을 위한 변수
	 
	
	
	public SportsAgency() {
		sportplayer = new SportsPlayer[50];
		
		//isRun의 초기값을 true로 줘서 프로그램이 실행될 수 있도록 한다.
		isRun = true;  //isRun이 사실일경우
		input = new Scanner(System.in); //입력
		setData(); //배열 저장
	}
	
	
	public void start() {
		//메뉴를 계속해서 출력하기 위해서 while문에서 메뉴를 출력한다.
		while(isRun) { 
			showMenu(); //메뉴 보여주기
			inputMenu(); //메뉴 입력받기
		}
	}
	
	
	// 메뉴 보여주기
	public void showMenu() {
		System.out.println("******** 메뉴를 선택 하세요 *******");
		System.out.println("* 1. 운동선수등록           2.조회            *");
		System.out.println("* 3. 검색                       4.삭제            *");
		System.out.println("* 5. 종료                                              *");
		System.out.println("***************************");
	}
	
	// 메뉴 입력받기
	public void inputMenu() {
		try {
		input = new Scanner(System.in);
		int menu = input.nextInt();
		
		switch (menu) {
		case 1:
			//등록
			input();
			break;
		case 2:
			//조회
			showSportsPlayer();
			break;
		case 3:
			//검색
			searchStudent();
			break;
		case 4:
			//삭제
			Delete();
			break;
		case 5:
			//종료
			System.out.println("종료합니다.");
			isRun = false;  //프로그램을 종료하기 위해서 상태값을 false로 변경
			break;
			
		default:
			//메뉴 없음
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		}
			catch(InputMismatchException e)
			{
				/*e.printStackTrace();*/
				System.out.println("잘못입력하셨습니다.");
				return;
			}
		}
	
	

	public void input() { //운동선수 추가 메서드
		
		
		
		String type,name,temper,position; //타입,이름,소속,포지션문자열 
		int age,career,weeklysalary; // 나이,경력,주급 정수형 변수
		int goal,assist; //골,어시스트 정수형 변수
		int twopoint,threepoint,freepoint; // 2점,3점,자유투 정수형 변수
		int safety,homerun,out; //안타,홈런,아웃 정수형 변수
		//기본적인 운동선수 상세 정보 추가 
		System.out.println("타입");			
		type = input.next();	
		System.out.println("이름");	
		name = input.next();
		System.out.println("소속");
		temper = input.next();
		
		System.out.println("나이");
		age=0;
		try{
			age = input.nextInt();
		
			input.next();
			}
		catch(InputMismatchException e) {
			System.out.println("잘못입력하셨습니다");
			return;
		}
		System.out.println("경력");
		career = input.nextInt();
		System.out.println("주급");
		weeklysalary = input.nextInt();

		
		switch(type) {//switch를 이용 타입에 따라 저장
		
		case "축구": //축구선수 일때 
		System.out.println("포지션");
		position = input.next();
		System.out.println("골");
		goal = input.nextInt();
		System.out.println("어시스트");
		assist = input.nextInt();
		sportplayer[number] = new Soccer(type,name,temper,age,career,weeklysalary,position,goal,assist);
		number++;  //배열에 추가
		break;
		
		case "농구": //농구선수 일때
			System.out.println("2점슛");
			twopoint = input.nextInt();
			System.out.println("3점슛");
			threepoint = input.nextInt();
			System.out.println("자유투");
			freepoint = input.nextInt();
			sportplayer[number] = new BasketBall(type,name,temper,age,career,weeklysalary,twopoint,threepoint,freepoint);
		break;
		
		case "야구": //야구선수 일때
			System.out.println("안타");
			safety = input.nextInt();
			System.out.println("홈런");
			homerun = input.nextInt();
			System.out.println("아웃");
			out = input.nextInt();
			sportplayer[number] = new BaseBall(type,name,temper,age,career,weeklysalary,safety,homerun,out);
			number++;		
		break;
		
		}
		System.out.println("추가되었습니다."); //추가 되었다고 안내
		System.out.println();//한칸띄우기
		}
		
	
	public void showSportsPlayer() {//모든 선수 조회 메서드
		 {
			for(int i=0;i<number;i++){ //for문을 이용 number=3까지 현재 저장된 선수들 출력
			{
				System.out.println(sportplayer[i]);
			}
		  }
		}
	}
	
	public void searchStudent() { //이름 탐색 메서드
	
		System.out.println("이름을 입력하세요"); //입력하라고 안내
		String keyword = input.next(); //문자열 입력
		for(int i=0;i<=sportplayer.length;i++) { //for문 sportplayer의 길이까지 반복		
			if(sportplayer[i].getName().contains(keyword)) { //keyword를 getName()으로 해서 이름을 입력하면 해당 선수가 검색					
				sportplayer[i].play(); 
				break;
			}
			
			
	}
	}
	public void Delete() {
		//삭제
		
		System.out.println("이름을 입력하세요");
		
		String keyword = input.next(); //문자열 입력
		for(int i=0;i<=sportplayer.length;i++) { //for문 sportplayer의 길이까지 반복				
			if(sportplayer[i].getName().contains(keyword)) { //keyword를 getName()으로 해서 이름을 입력하면 해당 선수가 검색
				for(int j=0;j<sportplayer.length;j++) //for문을 이용
					sportplayer[i]=sportplayer[i+1]; //배열[i] = 배열 [i+1]이 같으면
					number--;//선택한 배열 삭제
					break;	
				}
			}
		
		
		}
	
	
		
	public void setData() {
		//현재 저장된 운동선수들 
		sportplayer[0] = new Soccer("축구","메시","바르셀로나",30,10,5,"공격수",40,40);
		sportplayer[1] = new BasketBall("농구","르브론제임스","클리븐랜드 캐버리어스",33,11,4,20,30,20);
		sportplayer[2] = new BaseBall("야구","추신수","텍사스 레인저스",35,13,6,10,5,6);
		number = 3; //number값이 없으면 null값까지 나타나기때문에 저장되어있는 배열 변수3까지 출력
	}
}