package generic2;

public class Store2<A,B> { //제네릭은 한가지만 아닌 두가지 형태도 가능	
	private A data1;
	private B data2;
	
	public A getData1() {
		return data1;
	}
	public void setData1(A data1) {
		this.data1 = data1;
	}
	public B getData2() {
		return data2;
	}
	public void setData2(B data2) {
		this.data2 = data2;
	}
}
