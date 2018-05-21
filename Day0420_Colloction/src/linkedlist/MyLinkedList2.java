package linkedlist;

public class MyLinkedList2<E> {
	private int size;
	private Node2<E> head;

	
	public MyLinkedList2() {
		size=0;
		head=null; 
	}
	
	public void add(E data) {
		
		if(head == null) {
			
			head = new Node2<E>(data);
		}else {
		
		Node2<E> newNode = new Node2<E>(data);
		getTail().setNext(newNode);
		}
		size++;
	}
	public void remove (int index) {

		if(index ==0) {
			head = head.next();
		}
		else {		
		Node2<E> cur =head;
		Node2<E> prev = null;
		for(int i=0;i<index;i++) {
			prev = cur;
			cur = cur.next();
		}
			
		prev.setNext(cur.next());	
		}
		size--;	
	}
	
	public Node2<E> getTail() {
	
		Node2<E> tail = head;
		for(int i=1;i<size;i++) {
			tail= tail.next();
		}
	
		return tail;
	}
	public int size() {
		return size;
	}

	public Node2<E> get(int index) { 
		Node2<E> current = head;
		for(int i=1;i<index;i++) {
		current = current.next();	
		}
		return current;
	}
	
	public void set(int index, E data) {		
		Node2<E> current = head; 
		for(int i=1;i<index;i++) {
		current = current.next();	
		}
		current.setData(data);
		
		}
		
	
	public String toString() {
		//노드들의 데이터를 하나씩 추가해서 문자열 만들어서 반환
		StringBuilder sb = new StringBuilder();
				Node2<E> cur = head;
		for(int i=0;i<size;i++) {
			sb.append(cur.getData()).append(" ");
			cur = cur.next();
		}
		return sb.toString();		
	}	
}