import java.util.Scanner;
public class AdderTest {
	public static void main(String[] args) {
		//정수 더하기 기능을 하는 클래스(Adder)작성해서, 
		//정수 더하기 기능 실행해보기
		//상태값: 결과를 저장하는 result(정수)
		//기능add(): 정수 2개를 전달 받아서 더한 다음 결과를
		//      상태값 result에 저장하고 출력하는 기능
		
		//Adder 클래스의 기능 add를 사용하기 위해서는
		//객체를 생성해야 함
		//더하기 기능을 사용하기 위해서 객체 생성후, 참조변수 a에 참조 시킴
		Scanner input = new Scanner(System.in);
		Adder a = new Adder();
		
		a.num1 = input.nextInt();
		a.num2 = input.nextInt();
		//a가 가지고 있는 add() 메서드 호출
		//add()메서드는 매개변수로 2개의 정수를 가짐
		//호출 시 정수 2개를 인자로 주어야 한다. 
		
		//a.add(3, 5);
		//System.out.println(a.result);
		a.add();
	}
}

//메서드 호출시 값을 넘겨주는 방법(변수의 타입에 따른 데이터 전달의 차이점
//값에 의한 전달(call by Value) : 기초자료형
//값 자체가 복사되어서 전달되기 때문에 전달받은 쪽에서 값을 바꾸더라도 전달한 쪽에 영향을 주지 못한다.
//참조에 의한 전달(call by reference) : 참조자료형
//전달하고자 하는 개개체의 주소를 전달하기 때문에 전달 받은쪽에서 객체의 데이터를 조작하게 되면
//원래 객체의 데이터가 바뀌게 된다.



