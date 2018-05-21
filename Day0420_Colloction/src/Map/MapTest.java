package Map;
import java.util.HashMap;
public class MapTest {

	public static void main(String[] args) {
		/*Map : key-value로 이루어진 자료구조
		 *key : 중복안되는 유일한 값
		 *value : 중복가능, key와 쌍을 이루는 데이터
		 * */
		
		/*Map : 인터페이스, 구현 클래스 >> HashMap
		 * key:int, value:String 인 map 작성
		 * */
		
		HashMap<Integer, String>map = new HashMap<Integer, String>();
		
		//데이터를 추가할 때는 key와 value를 쌍으로 저장해야 한다.
		map.put(1, "APPLE");
		map.put(3, "Grape");
		map.put(5, "Tomato");
		map.put(7, "Pineapple");
		
		
		
		//가져 올때는 key값으로 value를 가져 올 수 있음
		String val1 = map.get(5);
		System.out.println(val1);
		
		map.put(5,"watterMellon");
		val1 = map.get(5);
		System.out.println(val1);
		//얘도 set이랑 같이 순서가 없음
	}

}
