package Ex3;

public class Circle extends Shape{
	//원은 다른도형에 없는 반지름 요소를 가짐
	private int radius;
	public static final double PI =3.14;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle() {
		super(1,0,"원");
	}
	public Circle(int radius) {
		super(1,0,"원");
		this.radius=radius;
	}

	public void draw() {
		System.out.println("원을을 그립니다");
	}
	public void calArea() {
		area = PI*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", numOfLines=" + numOfLines + ", name=" + name + "]";
	}
	


}
