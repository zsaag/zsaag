package abstract1;

public class Triangle extends Shape{
	private int width;
	private int height;
	public Triangle() {
		super(3,0,"삼각형");		
	}
	public Triangle(int width, int height) {
		super(3,0,"삼각형");	
		this.width=width;
		this.height=height;
	}
	public void draw() {
		System.out.println("삼각형을 그립니다");
	}
	public void calArea() {
		area = width*height*0.5;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", numOfLines=" + numOfLines
				+ ", name=" + name + "]";
	}

	
}
