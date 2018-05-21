
public class Add { //클래스

	public static void main(String[] args) {//메인 메서드(함수) -> 프로그램이 시작되는 시작점(순차적)
		//아래는 a와 b의 합의 결과를 화면에 출력하는 프로그램입니다.
		//->주석(컴파일 영향X,코드내 참고내용 작성시 사용(comment)),/* 내용 */ -> 여러줄 주석처리 시 사용
		
		//명령문 :문장은 메서드 내에서 사용해야 하고, ';' 으로 끝난다.
		//변수 : 프로그램 실행중 데이터를 저장하는 공간
		int a; // 변수의 선언, 'a'라는 이름의 정수형 변수 선언(int = 4byte)
		int b; // 변수선언 'b'라는 이름의 정수형 변수 선언
		int sum; //변수선언, 'sum'이라는 이름의 정수형 변수 선언
		
		a =  50; //a라는 변수에 50을 넣어줌
		b =  100; //b라는 변수에 100을 넣어줌
		sum = a+b; //a+b의 값을 sum에 넣어줌
		
		System.out.print("a와 b의합은"); //""안에 내용을 콘솔에 출력
		System.out.print(sum);       //sum이라는 변수가 가지는 값을 콘솔에 출력
		System.out.print("입니다.");   //""안에 내용을 콘솔에 출력

	}

} 

// ctrl+shift+c 개별 라인 주석/취소
// /**/ ctrl+shift+/ 
// /**/ 해지=>ctrl+shift+\
//ctrl + F11= 컴파일 시작
//println=>한줄씩 나타냄
// Tab 들여쓰기
