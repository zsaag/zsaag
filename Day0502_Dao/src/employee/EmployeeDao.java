package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	//url,user,pass
	//connection
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER= "zsaag";
	private static final String PASSWORD = "whdgus12!";
	
	private Connection conn;
	
	public EmployeeDao() throws ClassNotFoundException, SQLException {
		//드라이버 로딩, 연결 생성
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
	}
	
	//영향을 받은 로우의 개수를 반환
	//executeUpdate()
	public void insertEmployee(Employee employee) throws SQLException {
		//구문객체 생성
		//sql 작성
		//실행
		Statement stmt = null;
		try{String sql = "insert into employee_ex"
				+ " values ("+employee.getEmpNo()+","
				+"'"+employee.geteName()+"',"
				+employee.getDeptNo()+","
				+employee.getSalary()+")";
		
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}finally {
			if(stmt  !=null) stmt.close();
		}
	}
	public void deleteEmployee(int empNo) throws SQLException {
		Statement stmt = null;
		try{
			String sql = "delete from employee_ex"
					+ " where enum = " + empNo;
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}finally {
			if(stmt  !=null) stmt.close();
		}
	}
	public void updateEmployee(Employee employee) throws SQLException {
		Statement stmt = null;
		try{
			String sql = "update employee_ex"
					+ " set ename = '" + employee.geteName() + "',"
					+ "   deptno = "+ employee.getDeptNo()+","
					+ "   salary = " + employee.getSalary() 
					+ " where enum = " + employee.getEmpNo();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}finally {
			if(stmt  !=null) stmt.close();
		}
	}
	public Employee selectOne(int empNo) throws SQLException {
		
		Statement stmt = null;
		ResultSet rs = null;
		Employee employee=null;
		try{
			String sql = "select * from employee_ex where enum = " +empNo ;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				employee = new Employee();
				employee.setEmpNo(rs.getInt("enum"));
				employee.seteName(rs.getString("ename"));
				employee.setDeptNo(rs.getInt("deptno"));
				employee.setSalary(rs.getInt("salary"));
			}
			
		}finally {
			if(stmt  !=null) stmt.close();
		}
		
		return employee;
	}
	public List<Employee> selectAll() throws SQLException{
		Statement stmt = null;
		ResultSet rs = null;
		Employee employee=null;
		
		List<Employee> empList = new ArrayList<Employee>();
		try{
			String sql = "select * from employee_ex";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				employee = new Employee();
				employee.setEmpNo(rs.getInt("enum"));
				employee.seteName(rs.getString("ename"));
				employee.setDeptNo(rs.getInt("deptno"));
				employee.setSalary(rs.getInt("salary"));
				
				empList.add(employee);
			}
			
		}finally {
			if(stmt  !=null) stmt.close();
		}
		return empList;
	}	
}
