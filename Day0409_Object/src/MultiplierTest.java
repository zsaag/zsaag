
public class MultiplierTest {
	public static void main(String[] args)
	{		
		
	//Multiplier
	//상태값:결과를 저장하는 :result(정수)
	//동작(메서드) : 출력X, 매개변수로 전달받은
	//두 정수를 곱해서 결과를 result에 저장하고,
	//결과를 반환(return)하는 클래스 작성 multiply()작성
		
	//MutiplierTest main에서 해야할일
	//Multiplier 객체 만들고 multiply()실행해보기
		Multiplier x = new Multiplier(10);//객체를 생성한는문장:객체의 초기화 =>생성자의 호출
		int multResult=x.multiply(3,4);
	
		x.multiply(2.5, 4.5);
		
		//같은 기능을 하는 메서드인데 데이터 타입에 따라서 이름을 다르게 쓰는게 헷갈린다.
		//다른데이터 타입을 동시에 사용할 수 있게 만들기 위해서 오버로딩을 한다.
		
//		System.out.println("123123");
//		System.out.println(123123);
//		System.out.println(123.123);
//		메서드 오버로딩을 통해서 다양한 데이터타입을 매개변수로 받도록 선언해 두었기
		//때문에 쉽게 사용가능하다. 
		
		System.out.println(multResult);
		System.out.println(x.result);
	}
}

