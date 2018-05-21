package Interface2;

public class HomeNetWork {
	public static void main(String[] args) {
		//무선으로 조종할 수 있는 기능을 가진 가전 제품을 조종
		
		//무선으로 켜고, 끄기 : 무선으로 조작가능한 객체여야 한다.
		//turnOn(), turnOff()
		
//		RemoteController r = null;
//		
//		r.turnOn();
//		r.turnOff();
		//하나의 통로로 한꺼번에 관리 하려고 한다
		//
		//AirCondition 도 
		//Remotecontroller interface 를 구현해서 
		//Remotecontroller 배열에다가 Tv,aircon 객체 만들어서
		//배열통해서 접근해보기
		
		
		Electronic[] r = new Electronic[2];
		
		r[0] = new Television();	
		r[1] = new Aircondition();
		
		for(Electronic remote:r) {
			remote.turnOn();
			remote.work();
//			if(remote instanceof Television) {
//				((Television)remote).showScreen();
//			}else if(remote instanceof Aircondition){
//				((Aircondition)remote).wind();
//			}
		}
	}
}

