public class CircleTest {

	public static void main(String[] args) {
		//Circle 클래스 객체 만들어서 중심점 반지름 설정하고
		//메서드 호출해보기
		Circle circle = new Circle();
		//1.Circle 기본생성자 호출 하면 center Point도 기본생성자 호출
		Point center=circle.getCenter();
		center.setX(3);
		center.setY(5);
		circle.printCenter();
		
		//2.외부에서 center를 만들어서 Circle의 center로 지정
		Point p = new Point();
		p.setX(5);
		p.setY(10);
		
		Circle c1 = new Circle(5,p);
		c1.printCenter();
		p.setX(3);
		p.setY(3);
		c1.printCenter();
		//System.out.println(c1.area());
		//System.out.println(c1.round());
		
		double area = c1.area();
		double round = c1.round();
		
		Circle c2 = new Circle(5,3,4);
		//System.out.println(c2.area());
		//System.out.println(c2.round());
		//문자열 만들때 포맷을 지정하고 문자열을 만들면 된다. >> String.format();
		
		String str = String.format("둘레:%.2f, 넓이:%.2f",area,round);
		
		//printf 사용하지 않고 문자열 포맷 만들기
		//System.out.println("둘레 :"+round+"넓이 :"+area);
		System.out.println(str);
		
		
		
	}

}
