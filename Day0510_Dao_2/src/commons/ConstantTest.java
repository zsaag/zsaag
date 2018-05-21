package commons;

import java.util.HashMap;
import java.util.Map;

public class ConstantTest {

	public static void main(String[] args) {
		//Commons의 상수값들을 key로 해서
		//Map에 회원정보를 저장하는 예제
		Map<String, Object> member = new HashMap<String,Object>();
		
		//map에 넣을때
		//member.put("id", "hong123");
		member.put(Constant.Member.ID,"hong123");
		//member.put("name","홍길동");
		member.put(Constant.Member.NAME,"홍길동");
		//member.put("email", "hong@email.com");
		member.put(Constant.Member.EMAIL,"hong@email.com");
		//member.put("num", 123);
		member.put(Constant.Member.NUM,"123");
		//member.put("pw", "1q2w3e4r");
		member.put(Constant.Member.PW,"1q2w3e4r");
		System.out.println(member);
		
		//꺼내올때
		System.out.println("아이디: "+ member.get("id"));
	}

}
