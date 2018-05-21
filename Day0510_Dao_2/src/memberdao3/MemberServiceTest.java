package memberdao3;

import commons.Constant;

public class MemberServiceTest {
	public static void main(String[] args) {
		//MemberService 클래스 테스트
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		
	/*	boolean result = service.login("zsaag", "whdgus12!");
		if(result) {
			System.out.println("로그인 성공!!!!");
		}else {
			System.out.println("로그인 실패!!!");
		}
	}*/
		
		/*Member member = new Member();
		member.setId("1");
		member.setPw("12345");
		member.setName("오야");
		member.setEmail("kimbit123@email.com");
		
		
		
		boolean result = service.join(member);
		
		if(result ==true) {
			System.out.println("회원가입성공");
		}else{
			System.out.println("회원가입실패");
		}
	}*/
	
		System.out.println(Constant.Member.NUM);
	}
}
