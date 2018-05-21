package linkedlist;

public class NodeTest {

	public static void main(String[] args) {
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		
		n1.setNext(n2);
		System.out.println(n1.next()); //1다음 연결 까지 확인
		
		Node n3 = new Node("C");
		n1.next().setNext(n3); //3번째 까지 확인
		System.out.println(n1.next().next());
		
		Node current = n1;
		for(int i=0;i<3;i++) { //전체 확인
			System.out.print(current);
			current = current.next();
			
		}//System.out.print(current);
	}

}
