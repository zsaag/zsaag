package Ex2;

public class Dog extends Animal {
	public Dog() {

	}

	public Dog(String name, int numOfLegs) {
		this.name = "멍멍이";
		this.numOfLegs = 4;
	}

	public void bark() {
		System.out.println("멍멍");
	}
	public void sound() {
		System.out.println("멍멍");
	}
}
