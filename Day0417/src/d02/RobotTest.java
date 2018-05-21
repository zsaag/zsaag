package d02;

public class RobotTest {

	public static void main(String[] args) {
		Robot[] robots = new Robot[2];
		
		robots[0]= new Transformer();
		robots[1] = new TaekwonV();
		
		for(Robot robot:robots) {
			robot.fight();
			System.out.println("-------------");
		}

	}

}
