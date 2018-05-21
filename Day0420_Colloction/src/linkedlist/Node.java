package linkedlist;

public class Node { //문자열 하나를 저장할 수 있는 노드
	private String data; //데이터를 저장할 변수
	private Node next; //자기 자신의 주소값을 가짐(더함)
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node next() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	public Node() {
		
	}
	public Node(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data+" ";
	}
	
	
	
	
 }
