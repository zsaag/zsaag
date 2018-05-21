
public class Score {
	int total;
	
	public Score() {
		
	}
	
	public void setTotal(int total) throws OddNumberException{
		
		if(total%2==1) {
			throw new OddNumberException();	
		}this.total=total;
		
	}
	public void ShowTotal() {
		
		System.out.println("총점 " + total+" 입니다.");
	}
}
