

public class Circle {
	//반지름, 중심점
	Point center;// Point int x,y
	private int radius;//반지름
	

	public Circle() {
		//개발자가 초기화를 하지 않으면, 참조 자료형의 경우 null로 초기화 된다
		center = new Point();
	}
	public Circle(int radius, Point center)
	{
		this.radius = radius;
		this.center = center;
	}
	
	public Circle(int radius, int x, int y)
	{
		this.radius = radius;
		center = new Point();
		center.setX(x);
		center.setY(y);
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	public Point getCenter() {
		return this.center;
	}

	public void setradius(int radius) {
		this.radius= radius;
	}
	public int getradius() {
		return this.radius;
	}
	public double round() {	
		return 2*3.14*radius;		
	}
	public double area(){
		return 3.14*radius*radius;
	}
	
	public void printCenter() {
		System.out.println("반지름: "+round());
		System.out.println("x: "+center.getX());
		System.out.println("y: "+center.getY());
	}
	/*public String area() {
		return String.format("넓이:%.2f",3.14*radius*radius);
	}*/
}

