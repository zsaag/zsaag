package List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// list: interface,
		//ArrayList, LinkedList
		//둘다 List 인터페이스를 구현한 List구현 클래스
		
		//리스트가 어떤 메서드를 구현해야 하는 지 확인: 엄청 많음
		//너무 많으니까 간단하게 몇가지 메서드만 구현 : Generic을 이용
		//StudentList의 업그레이드 버전이라고 보시면 됩니다.
		//MyList는 임의의 데이터 타입을 넣을 수 있도록 작성 : Generic으로...
		
		//List<String> myList = new myList<String>();
		
		ArrayList<String> myList = new ArrayList<String>();
		//기본생성자 호출하면 크기 0인 리스트를 생성
		
		System.out.println(myList.size());
		MyList<String> mList = new MyList<>();
		System.out.println(mList.size());
	}

}
