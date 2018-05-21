package memberdao2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	

	private Connection connection;

	
	public void insertMember(Member member) {
		PreparedStatement mb = null;
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "insert into Member2 (mnum,mid,mpw,mname,memail) "
					+ "values(?,?,?,?,?)";
			mb = connection.prepareStatement(sql);
			
			mb.setInt(1, member.getMnum());
			mb.setString(2, member.getMid());
			mb.setString(3, member.getMpw());
			mb.setString(4, member.getMname());
			mb.setString(5, member.getMemail());
			mb.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection !=null) connection.close();
				if (mb !=null) mb.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void updateStudent(Member member) {
		PreparedStatement mb = null;
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "update Member2"
					+ "     set  mid = ?,"
					+ "			 mpw  = ?,"
					+ "			 mname  = ?,"
					+ "			 memail =?,"
					+ "			 MreDate =?"
					+ "			where mnum=? ";
					
		mb = connection.prepareStatement(sql);		
			mb.setString(1, member.getMid());
			mb.setString(2, member.getMpw());
			mb.setString(3, member.getMname());
			mb.setString(4, member.getMemail());
			mb.setDate(5, member.getMreDate());
			mb.setTimestamp(6, member.getMreTime());
			mb.setInt(7, member.getMnum());
			mb.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) connection.close();
				if (mb != null) mb.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}
	public void deletemember(int nnum) {
		PreparedStatement mb = null;
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "delete from Member2 where nnum=?";
			mb = connection.prepareStatement(sql);
			mb.setInt(1, nnum);
			mb.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) connection.close();
				if (mb != null) mb.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public Member selectOne(int mnum) {
		PreparedStatement mb = null;		
		Member member = null;
		ResultSet rs = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "select * from Member2 where mnum = ?";
			mb = connection.prepareStatement(sql);
			mb.setInt(1, mnum);
			rs=mb.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setMnum(rs.getInt("mnum"));
				member.setMid(rs.getString("mid"));
				member.setMpw(rs.getString("mpw"));
				member.setMname(rs.getString("mname"));
				member.setMemail(rs.getString("memail"));
				member.setMreDate(rs.getDate("mregDate"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) connection.close();
				if (mb != null) mb.close();
				if (rs  != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}	
		return member;
	}
	public List<Member> selectAll(){
		PreparedStatement mb = null;
		//결과를 담아서 반환할 학생 참조변수
		List<Member> memberList = new ArrayList<Member>();
		ResultSet rs = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "select * from Member2";
			mb =connection.prepareStatement(sql);
			rs = mb.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				member = new Member();
				member.setMnum(rs.getInt("Mnum"));
				member.setMid(rs.getString("mid"));
				member.setMpw(rs.getString("mpw"));
				member.setMname(rs.getString("mname"));
				member.setMemail(rs.getString("memail"));
				member.setMreDate(rs.getDate("mregDate"));
				member.setMreTime(rs.getTimestamp("mregTime"));
				memberList.add(member);
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) connection.close();
				if (mb != null) mb.close();
				if (rs  != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		return memberList;		
	}
}