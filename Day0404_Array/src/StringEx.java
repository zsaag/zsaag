import java.util.Scanner;
public class StringEx {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
		/*String str = scan.next();//문자열 출력
		//문자열 비교는 ==을 사용하지 않고 String 클래스가 제공하는
		//equals 메서드를 활용한다.
		if(str.equals("M")) { //equals는 문자열을 비교
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}*/
		
		String s ="Hello"; //stack영역
		String s1 =new String("Hello");//heap영역 
		if(s == s1) { //equals는 문자열을 비교
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//[H][e][l][l][o] : a[0]
		String a ="       He    llo      ";
		a.charAt(0); //0번째 배열에 있는 문자열 출력
		//문자열에서 0번 index에 있는 char c에 대입
		char c=a.charAt(0); //특정한 문자열에 있는 값을 가져옴
		System.out.println(c);
		System.out.println(a.length());//문자열의 길이 가져오기
		String b = a.trim();//앞쪽,뒤쪽 공백제거	
		System.out.println(b.length());//띄어쓰기의 길이 가져오기
		System.out.println(a.contains("He"));//문자열이 포함되어있는지 아닌지 검사
		}
	}


