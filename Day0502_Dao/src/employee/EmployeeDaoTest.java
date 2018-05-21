package employee;

import java.sql.SQLException;
import java.util.List;


public class EmployeeDaoTest {
	public static void main(String[] args) {
		//Dao 테스트 니까.. Dao 객체 필요
		
		try {
			EmployeeDao dao = new EmployeeDao();
			
			Employee e = new Employee(1,"홍길동",3,100000);
			dao.insertEmployee(e);
			
			
			System.out.println("종료");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}

