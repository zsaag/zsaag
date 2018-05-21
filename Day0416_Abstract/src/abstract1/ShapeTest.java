package abstract1;

public  class ShapeTest {

	public static void main(String[] args) {
		
		/*추상클래스(abstract class)는 객체를 만들 수 없다.*/
		//Shape s = new Shape();
		//추상클래스는 상속을 해서 사용하기 위해서 만든다.
		
		//추상클래스(부모클래스)를 상속받은 클래스(자식클래스)
		//부모클래스가 가지는 추상메서드를 구현하거나, 자기 자신도 추상클래스가 되어야 한다.
		//1. 부모클래스가 가지는 추상메서드를 구현하거나,
		//2. 자기 자신도 추상클래스가 되어야 한다.
		
		//결론적으로는 추사을래스의 객체를 생성하기 위해서는 상속을
		//통해서 추상메서드의 몸체를 구현해야 한다.
		
		Shape s = new Rectangle();//추상메서드
		s.draw();
		s.calArea();
		System.out.println(s);
	}

}
