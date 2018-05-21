package linkedlist;

public class MyListTest {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		
		
		System.out.println(list);
		System.out.println("-----------------");
		System.out.println(list.get(0));
		System.out.println("-----------------");
		list.set(2, "Z");
		System.out.println(list);
		System.out.println("-----------------");
		list.remove(0);
		
		System.out.println(list);
	
		
		//remove(int index)
		//get(int index)
		//size()
		//add(String data)->완료
		//set(int index, String data)
	}

}
