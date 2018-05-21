package List;

import List.MyList;

public class MyListTest {
	public static void main(String[] args) {
		
		MyList<String> ml = new MyList<String>();
		ml.add("Hello");
		ml.add("world");
		ml.add("!!");
		for(int i=0;i<ml.size();i++) {
			System.out.println(ml.get(i));
		}System.out.println("\n");
		
		ml.remove(2);
		for(int i=0;i<ml.size();i++) {
			System.out.println(ml.get(i));
		}System.out.println("\n");
		ml.set(1, "하이");
		for(int i=0;i<ml.size();i++) {
			System.out.println(ml.get(i));
		}System.out.println("\n");
	}
	
}
