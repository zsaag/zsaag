package Test1;

public class StudentTest {

	public static void main(String[] args) {

	
				Student[] s = new Student[3];
				s[0] = new Kor();
				s[1] = new Math();
				s[2] = new Eng();
			
				for(Student m3 : s) {
				m3.name();
			}		
				
	}

}
