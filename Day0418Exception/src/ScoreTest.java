import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Score score = new Score();
		
		try{	
			score.setTotal(1);
			
			
		}		
		catch(OddNumberException e){
			e.printStackTrace();
			System.out.println("홀수입니다");
		}
		score.ShowTotal();
	}

}
