package Day0412_1;

import Day0412.Car;

public class SportsCar extends Car{
	boolean isTurbo;
	
	
	public SportsCar() {
		//부모클래스의 기본생성자 호출 부분 생략 super();
		//super(1);
		System.out.println("자식클래스 생성자 호출!!");
	}
	
	public void turboOn() {
		
		if(!isTurbo) {
			System.out.println("터보 온!!");
			isTurbo = true;
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speed = 100;
		}else {
			System.out.println("터보 상태입니다!");
		}
		//speed =  10;
	}
	public void turboOff() {
		if(isTurbo) {
			System.out.println("터보를 끕니다");
			isTurbo = false;
			setSpeed(getSpeed()-50);
			
		}else {
			System.out.println("이미 꺼져있습니다.");
		}
	}
}
