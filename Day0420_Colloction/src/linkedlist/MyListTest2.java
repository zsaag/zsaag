package linkedlist;

public class MyListTest2 {

	public static void main(String[] args) {
		MyLinkedList2<Object> list 
		 = new MyLinkedList2<Object>();
		
		list.add("A");
		list.add(1);
		list.add('a');
		list.add(100);
		
		System.out.println(list);
		
		
		
	}
}