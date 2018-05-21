package memberdao;

import java.util.List;

public interface IMemberDao {
	public void insertMember(Member member);
	public void updateMember(Member member);
	public void deleteMember(int nnum);
	public Member selectOne(int nnum);
	public List<Member> selectAll();
}
