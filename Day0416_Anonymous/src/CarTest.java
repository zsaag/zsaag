public class CarTest {
	public static void main(String[] args) {
		//Car 객체, Tire 객체 만들어서 drive()호출
		//Tire koreaTire = new KoreaTire();
		Tire chinaTire = new Tire() {
			public void roll(int x) {
				System.out.println(x+ "중국타이어 굴러가다 터짐");
			}
		};
		Tire chinaTire1 
		= a->{System.out.println(a+ "중국타이어 굴러가다 터짐");
			return;
		}; 
			
		Car myCar1 = new Car(
				(a)->{System.out.println(a+"으아아아");}
				);
		
		Car myCar2 = new Car(chinaTire1);
		myCar1.drive();		
	}
}
