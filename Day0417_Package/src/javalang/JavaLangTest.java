package javalang;

import static java.lang.Math.*;

import java.lang.Math;
import java.lang.String;
import java.lang.System;
public class JavaLangTest {
	public static void main(String[] args) {
		//String,Math,Object 등등
		//Wrapper Class : 기초자료형을 담을 수 있도록 만들어 놓은 클래스
		//Byte,Short,Integer,Long,Float,Double,Boolean,Character
		
		//Math : 수학연산과 관련한 기능을 가지고 있는 클래스
		System.out.println("큰값은:"+Math.max(3,4));
		System.out.println("작은값은:"+min(3,5));
		System.out.println("4의제곱근:"+sqrt(4));
		System.out.println("4의제곱:"+pow(4,2));
		System.out.println("PI: "+PI);
		System.out.println("-4의 절대값:"+Math.abs(-4));
		
		//Wrapper 클래스 : 기초 자료형 데이터를 포함하는 클래스
		int x = 5;
		Integer number = new Integer(5);
		number = 5;
		if(number==5) {
			System.out.println("같습니다");
		}
		//System.out.println(number.compare(7,5));
		//문자열에서 숫자를 추출하기: parseInt(문자열)
		//Double.parseDouble
		int a= Integer.parseInt("123")+1;
		System.out.println(a);
		
		
		
		//System.out.println("123"+1);
		
		
		//-------------------------------------------------
		
		//StringBuilder : 문자열을 만들어주는 역활
		//              : 변경 가능한 문자열
		//String : 변경 불가능한 문자열
		//String str = new String("Hello");
		
		
		StringBuilder sb = new StringBuilder();
		//메서드체이닝기법: 메서드의 반환형이 객체 자신이기 때문에 메서드 호출 후 다시 메서드를 할 수 있다.
		
		
		sb.append("hello").append("!!").append("@@");
		//sb.append("!!");
		//sb.append("**");
		//sb.append("@@");
		
		String str = sb.toString();
		
		System.out.println(str);
		
		String str1 = new String("Hello");
		String str2 = "Hello";
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		str1 = str1+"!!";
		System.out.println(str1);
		System.out.println(str2);
		
		//Object : 모든클래스의 조상 클래스
		//모든 클래스 is a Object
		//모든 객체는 Object 참조 변수에 참조 가능하다.
		
		//Object o1 =1;
		//Object o1 = new Object(); 둘이 같다
		
		
		Object o2 = "Hello";
		Object o3 = new TaekwonV();
		
		//tostring()
		System.out.println(o3);
		

		
		
	}
}
