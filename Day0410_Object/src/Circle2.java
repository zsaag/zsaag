import java.util.Scanner;
public class Circle2 {
	private int radius;
	private int x;
	private int y;
	private double area;
	
	public Circle2(){
		this.area=3.14*radius*radius;
	}
	public Circle2(int radius, int x, int y, double area)
	{
		this.radius=radius;
		this.x=x;
		this.y=y;
		this.area=area;
	}
	public void setRadius(int radius) { //설정자
		this.radius=radius;
	}
	public int getRadius() { //접근자
		 return this.radius;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY() {
		return y;
	}
	public void setarea(double area){
		this.area=area;
	}
	public double getarea(){
		return 3.14*radius*radius;
	}
	public void CirclePrint() {
		int num;
		Scanner a = new Scanner(System.in);
		System.out.println("저장할 원의 개수를 입력하세요");
		num = a.nextInt();
		int[] arr= new int[num];
		for(int i=1;i<=arr.length;i++) {
			System.out.println("원의 반지름을 입력하세요");
			num = a.nextInt();
			System.out.println("원의 x좌표를 입력하세요");
			num = a.nextInt();
			System.out.println("원의 y좌표를 입력하세요");
			num = a.nextInt();
		}System.out.printf("원%d의 반지름은 %d ,넓이는 %.2f, 중심"+ "좌표 %d,%d",num,radius,area,x,y);
	}
}



