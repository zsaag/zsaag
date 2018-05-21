package Ex1;

public class ObjectEx1 {
	public static void main(String[] args) {
		Car c1 = new SportsCar();
		Car c2 = new Bus();
		
		Student s = new Student();
		
		if(c1 instanceof Bus) {
			//System.out.println("맞아요!");
			Bus bus = (Bus)c1;
			bus.switchGate();
		}else if(c1 instanceof SportsCar){
			//System.out.println("아니에요!");
			SportsCar sc = (SportsCar)c1;
			sc.turboOff();
			sc.turboOn();
		}
		
		SportsCar sc =(SportsCar)c2;
		sc.turboOff();
		sc.turboOn();
		System.out.println(sc);
	}
}
