package Ex3;

public class Rectangle extends Shape{
	//가로,세로 길이가 필요
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Rectangle() {
		super(4,0,"사각형");
	}
	public Rectangle(int width, int height) {
		//사각형의 변의 개수 1
		super(4,0,"사각형");
		this.width=width;
		this.height=height;
		
	}
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
	public void calArea() {
		area = width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + ", numOfLines=" + numOfLines
				+ ", name=" + name + "]";
	}

	
}
