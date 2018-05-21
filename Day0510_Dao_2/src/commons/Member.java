package commons;

public enum Member {
	//열거형 : 값들의 나열
	NUM("num"), 
	ID("id"), 
	NAME("name"), 
	PW("pw"), 
	EMAIL("email"), 
	REG_DATE("mregDate");//enum을 상속받은 객체
	
	private String col;
	
	public String getCol() {
		return col;
	}
	
	//생성자인데 public X, private만 가능
	private Member(String col) {
		this.col = col;
	}
}
