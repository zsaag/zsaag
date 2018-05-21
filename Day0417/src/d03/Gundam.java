package d03;

public class Gundam extends Robot {
		//String name;
	public Gundam(Attackable attack,Moveable move) { //의존성 주입,제어역전
		this.name = "건담";
		this.attack = attack;
		this.move = move;
		//super.name=name; 자식클래스에서 name이라는 문자형 변수가 선언됐을때 부모클래스에서 선언할려면은 super를 이용
	}
	
	/*@Override
	public void attack() {
		//System.out.println("총으로 공격!!");
		attack.attack();
	}

	@Override
	public void move() {
		//System.out.println("날아서 이동!!");
		move.move();*/
		
	//}
	//use-a관계
}
