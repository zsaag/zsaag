package studentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	//속성값:연결해야 되니까..url,user,password
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER= "zsaag";
	private static final String PASSWORD = "whdgus12!";
	
	private Connection conn;
	
	//생성자에서 드라이버 로딩하고 연결까지하기, 연결객체는 멤버변수로 유지 
	
	public StudentDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//insert,update,delete, select,selectAll
	public int insertStudent(Student student) {
		String sql = "insert into student_ex"
				+ " values ("+student.getSnum()
				+ ",'"+student.getSname()
				+ "',"+student.getSgrade()+ ")";
		
		Statement stmt = null;
		int result = 0;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public int updateStudent(Student student) {
		//테이블에 학생정보를 업데이트 
		String sql = "update student_ex"
				+ " set sname = '" + student.getSname()+ "',"
				+ "     sgrade = " + student.getSgrade()
				+ " where snum = " + student.getSnum();
		Statement stmt = null;
		int result = 0;
		
		try {
			//구문객체 얻어와서
			stmt = conn.createStatement();
			//실행
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public int deleteStudent(int snum) {
		//where snum = + snum
		
		String sql = "delete from student_ex where snum = "+snum;
		Statement stmt = null;
		int result =0;
		try {
			stmt = conn.createStatement();
			result =  stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	//select
	public Student selectOne(int snum) {
		Student result = null;
		String sql = "select * from student_ex"
				+ " where snum="+snum;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				result = new Student();
				int number;
				String sname;
				int sgrade;
				
				number = rs.getInt("snum");
				sname = rs.getString("sname");
				sgrade = rs.getInt("sgrade");
				
				result.setSgrade(sgrade);
				result.setSname(sname);
				result.setSnum(number);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//자원 사용 다했으니 닫아주기
			try {
				if(stmt !=null) stmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		return result;
	}
	
	//selectAll	
	public List<Student> selectAll(){
		List<Student> result = new ArrayList<Student>();
		String sql = "select * from student_ex";
		
		ResultSet rs = null;
		Statement stmt = null;
		try {
			
			stmt = conn.createStatement();
			//결과 받아오기
			rs = stmt.executeQuery(sql);
			Student student;
			while(rs.next()) {				
				student = new Student();
				//칼럼이름으로 ResultSet에서 가져올 수도 있다.
				//이름으로 ResultSet에서 가져와서, 학생 객체에 넣기
				student.setSnum(rs.getInt("snum"));
				student.setSname(rs.getString("sname"));
				student.setSgrade(rs.getInt("sgrade"));
				
				result.add(student);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//자원 사용 다했으니 닫아주기
			try {
				if(stmt !=null) stmt.close();
				if(rs != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
}
