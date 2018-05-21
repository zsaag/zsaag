package generic2;

import List.MyList;

public class MyListTest {
	public static void main(String[] args) {
		//MyList는 데이터를 여러개 넣고 인덱스를 줘서 지울수도 있고
		//인덱스에 있는 요소를 가져올 수 있는 기능이 있는 클래스..
		//제네릭으로 만들었기 때문에 다양한 데이터를 넣을 수가 있다.
		
		//문자열을 저장하는 MyList를 만들어봅시다.
		
		MyList<String> ml = new MyList<String>();
		//임의로 3개의 문자열 넣기:add();
		ml.add("Hello");
		ml.add("world");
		ml.add("!!");
		for(int i=0;i<ml.size();i++) {
			System.out.println(ml.get(i));
		}System.out.println("\n");
		
		//데이터가 여러개면 다 되는게 아니라.
		
		//for-each 구문은 데이터가 여러개면 다되는게 아니라
		//Iterable를 구현한 클래스나, 배열만 사용가능
		//for(Str a:ml)
		//{
			 
		//}->에러
		
	
		ml.remove(2);
		for(int i=0;i<ml.size();i++) {
			System.out.println(ml.get(i));
		}System.out.println("\n");
		ml.set(1, "하이");
		for(int i=0;i<ml.size();i++) {
			System.out.println(ml.get(i));
		}System.out.println("\n");
		
		//MyList<Student>
		//학생 객체를 여러개 저장하는 리스트 이용해서 management 수정
		
	}
	
}
