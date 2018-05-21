package testEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	// 기능을 하기 위해서 연결이 필요함
	Connection connection;

	// DBMS와의 연결은 외부 자원을 이용하는 것이기 때문에 계속해서 열어 놓고 사용하면, 자원 누수가 발생
	// 사용할 때마다 연결을 만들어서 사용

	// 기능 : insert, update, delete, selectOne, selectAll

	public void insertStudent(Student student) {

		PreparedStatement pstmt = null;
		try {
			// 연결얻어오기
			connection = ConnectionProvider.getConnection();
			String sql = "insert student_ex values(?,?,?,?,?)";
			pstmt = connection.prepareStatement(sql);

			pstmt.setString(1, student.getSname());
			pstmt.setInt(2, student.getSgrade());
			pstmt.setInt(3, student.getSscore().getSkor());
			pstmt.setInt(4, student.getSscore().getSeng());
			pstmt.setInt(5, student.getSscore().getSmath());
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) connection.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void updateStudent(Student student) {
		PreparedStatement pstmt = null;
		try {
			// 연결얻어오기
			connection = ConnectionProvider.getConnection();
			String sql = "update student_ex "
					+ "      set sname = ?,"
					+ "          sgrade = ?"
					+ "    where snum = ?";
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, student.getSname());
			pstmt.setInt(2, student.getSgrade());
			pstmt.setInt(3, student.getSscore().getSkor());
			pstmt.setInt(4, student.getSscore().getSeng());
			pstmt.setInt(5, student.getSscore().getSmath());
			
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) connection.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}
	
	public void deleteStudent(int snum) {
		PreparedStatement pstmt = null;
		try {
			// 연결얻어오기
			connection = ConnectionProvider.getConnection();
			String sql = "delete from student_ex where snum = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, snum);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) connection.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public Student selectOne(int snum) {
		PreparedStatement pstmt = null;
		//결과를 담아서 반환할 학생 참조변수
		Student student = null;
		ResultSet rs = null;
		
		try {
			// 연결얻어오기
			connection = ConnectionProvider.getConnection();
			String sql = "select * from student_ex where snum = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, snum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				student = new Student();
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSgrade());
				pstmt.setInt(3, student.getSscore().getSkor());
				pstmt.setInt(4, student.getSscore().getSeng());
				pstmt.setInt(5, student.getSscore().getSmath());			
			}
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) connection.close();
				if (pstmt != null) pstmt.close();
				if (rs  != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return student;
	}
	public List<Student> selectAll(){
		PreparedStatement pstmt = null;
		//결과를 담아서 반환할 학생 참조변수
		List<Student> studentList = new ArrayList<Student>();
		ResultSet rs = null;
		
		try {
			// 연결얻어오기
			connection = ConnectionProvider.getConnection();
			String sql = "select * from student_ex2";
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Student student = new Student();
				student.setSname(rs.getString("sname"));
				student.setSgrade(rs.getInt("sgrade"));
				student.setSkor(rs.getInt("skor"));
				student.setSmath(rs.getInt("smath"));
				student.setSeng(rs.getInt("seng"));
				studentList.add(student);				
			}
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) connection.close();
				if (pstmt != null) pstmt.close();
				if (rs  != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return studentList;
	}
	
}
