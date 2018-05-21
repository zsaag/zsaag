package memberdao2;

import java.util.List;

public class MemberDaoTest {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		Member m = new Member();
		
		/*m.setMnum(2);
		m.setMid("kimbit");
		m.setMpw("1q2w3e4r");
		m.setMname("김비트");
		m.setMemail("kimbit@naver.com");
		dao.insertMember(m);*/
		/*Member m1=dao.selectOne(1);
		System.out.println(m1);*/
		
		List<Member> mList = dao.selectAll();
		for (Member mm : mList) {
			System.out.println(mm);
		}
		System.out.println("완료");
	}	
}

