
public class Operator1 {
	public static void main(String[] args) {//=Srting args[]로 해도 상관없음(c바탕으로 나온 것이 java여서)
		//연산자에 대해서 공부합니다.
		//증감연산자 ++,-- 에 대해서 실습합니다.
		
		//int x = 5;
		//int y,z;
		
		
		char x='A';  //A=65 B=66
		char y,z;
		
		char a = 'A';
		char b = 'B';
		System.out.println(a+b);
		//int b=x;
		//System.out.println(b);
		//x++;   //다른연산을 모두 끝낸 후 x의 값을 1증가 시킨다.
		//System.out.println(x);
		//++x;   //다른연산 하기 전 x의 값을 1증가 시킨다.
		//System.out.println(x++);
		
		y = x++;
		z = ++x;
		System.out.println(x); //x는 5에서 2번 증가 7
		System.out.println(y); //x가 1증가하지전에 값 5
		System.out.println(z); //x가 1증가한 6에서 1증가한 값 7
		
		/*y = x--;
		z = --x;
		System.out.println(x); //x는 5에서 2번 감소 3
		System.out.println(y); //x가 1감소하지전에 값 5
		System.out.println(z); //x가 1감소한 4에서 1감소한 값 3*/
	}

}
