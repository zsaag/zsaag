package Interface3;

public class DrawableTest {

	public static void main(String[] args) {
		//각종 도형들을 Drawable(interface) 참조변수에
		//참조 시켜서 사용해보자
		//인터페이스를 구현하게 되면, 구현클래스 객체는 해당
		//인터페이스의 참조 변수에 참조 가능하다.
		Drawable[] da = new Drawable[3];
		
		da[0] = new Rectangle();
		da[1] = new Triangle();
		da[2] = new Circle();
		/*for(int i=0;i<da.length;i++)
		{
			da[i].draw();
		}*/
		for(Drawable a : da)
		{
			a.draw();
		}
	}

}
