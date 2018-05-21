package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentSelect {

	public static void main(String[] args) {
		//1.드라이버 로딩
		//2.연결
		//3.구문객체 생성
		//4.sql 실행
		//5.결과처리

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		
		
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="zsaag";
		String password="whdgus12!";
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결 -url,user,password	
				conn = DriverManager.getConnection(url, user, password);
			
			//구문객체 생성
				stmt = conn.createStatement();
			//sql 작성 : 학생번호가 6인 학생의 모든 정보를 얻어오기
				String sql = "Select * "
						+ "from student_ex ";
						//+ "where snum=6";
			//select 문장은 결과값이 있는 sql : excuteQuery()	
			//excuteQuery의 결과는 Resultset:결과데이터를 담고 있는 객체	
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					//데이터가 있으면 진입
					
					int number =rs.getInt(1);
					String name = rs.getString(2);
					int grade=rs.getInt(3);
					
					System.out.println("------------");
					System.out.println("번호: "+ number);
					System.out.println("이름: "+ name);
					System.out.println("학년: "+ grade);
				}
				/*if(rs.next()) {
					//데이터가 있으면 진입
					
					int number =rs.getInt(1);
					String name = rs.getString(2);
					int grade=rs.getInt(3);
					
					System.out.println("------------");
					System.out.println("번호: "+ number);
					System.out.println("이름: "+ name);
					System.out.println("학년: "+ grade);
				}*/
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
