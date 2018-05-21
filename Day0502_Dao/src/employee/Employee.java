package employee;

public class Employee {
	//직원번호, 이름, 부서번호, 월급
	private int empNo;
	private String eName;
	private int deptNo;
	private int salary;
	
	public Employee() {}
	
	public Employee(int empNo,String eName,int deptNo,int salary) {
		this.empNo = empNo;
		this.eName = eName;
		this.deptNo = deptNo;
		this.salary = salary;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", deptNo=" + deptNo + ", salary=" + salary + "]";
	}
}
