package Ex3;

public class Shape {
	//name,numOfLines,area
	protected double area;
	protected int numOfLines;
	protected String name;

	public Shape() {
		
	}

	public Shape(double area, int numOfLines, String name) {
		this.area=area;
		this.numOfLines=numOfLines;
		this.name=name;
	}

	public void getArea(double area) {
		this.area = area;
	}

	public double setArea() {
		return this.area;
	}

	public void getNumOfLines(int numOfLines) {
		this.numOfLines = numOfLines;
	}

	public int setNumOfLines() {
		return this.numOfLines;
	}

	public void getName(String name) {
		this.name = name;
	}

	public String setName() {
		return this.name;
	}

	public void draw() {
		System.out.println("도형을 그립니다");
	}

	public void calArea() {
		area = 0;
	}
	
}
