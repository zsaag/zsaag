package Ex1;

public class Bus extends Car{
	boolean isOpen;
	public Bus()
	{
		isOpen=false;
	}
	public void switchGate() {
		if(isOpen) {
			System.out.println("문을 닫습니다.");
			isOpen=false;
		}else {
			System.out.println("문을 엽니다.");
		}
		isOpen = !isOpen;
	}
	public void openGate() {
		System.out.println("문을 엽니다.");
	}
}
