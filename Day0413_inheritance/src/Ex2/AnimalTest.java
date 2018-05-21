package Ex2;

public class AnimalTest {
	public static void main(String[] args) {
		// 랜덤으로 게와 고양이 5마리 생성
		Animal[] animal = new Animal[5];

		for (int i = 0; i < animal.length; i++) {
			if (((int) (Math.random() * 5)) == 0) {
				animal[i] = new Dog(); //개일때 개 출력
			} else {
				animal[i] = new Cat(); //고양이 일때 고양이 출력
			}
		}
		for (Animal a : animal) {
			// 동물들이 우는건 개bark(), 고양이meow()
			/*if (a instanceof Dog) { // a =dog 일때 bark 출력
				((Dog) a).bark();
			} else if (a instanceof Cat)// a =cat 일때 meow 출력
			{
				((Cat) a).meow();
			}*/
			a.sound();
		}
		
	}
}
