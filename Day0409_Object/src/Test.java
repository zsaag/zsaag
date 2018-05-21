
public class Test {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		int result1 = mm.add(5,3); 
	}
}
 class MyMath{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public double divide(double a, double b)
	{
		return a/b;
	}
	
}
