package linkedlist;

public class Node2 <T>{
	private T data; //데이터를 저장할 변수
	private Node2<T> next; //자기 자신의 주소값을 가짐(더함)
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node2<T> next() {
		return next;
	}
	
	public void setNext(Node2<T> next) {
		this.next = next;
	}
	public Node2() {
		
	}
	public Node2(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data+" ";
	}
}
