
public class AnonymosTest {
	public static void main(String[] args){
		//객체를 사용하기 위해서 필요한 것
		//객체를 참조할 참조 변수, 객체
		//참조변수를 만드는 방법
		//클래스의 이름 변수 이름: ex) Car myCar;
		//익명클래스는 이름이 없음 >> 참조변수를 만들 수 없음
		//항상 부모클래새의 참조변수에 참조되어서 사용됨
		//익명 클래스를 만드는 방법
		//기존의 객체 만드는 방법 => ex) new car();
		
		Car myCar =new Car() { //클래스 선언 하면서 객체를 만드는 꼴,코드내에서 정의가 들어감
			boolean isTurbo;
			public void turboOn() {
				System.out.println("터보온!!");
			}
			public void speedUp() {
				turboOn();
				super.speedUp();
				}//여기까지 익명클래스(선언과 동시에 이루어짐)->코드내에서 한번만 쓰여짐(이름이 필요없음)
			};
			//실제로는 인터페이스나, abstract 클래스 구현에 많이 사용됨
			
			myCar.speedUp();
	}
}
