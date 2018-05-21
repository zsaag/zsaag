
public class Student {
		//학생 객체가 가질 기능
		//평균구하는 기능
		//출력기능
		//가지는 데이터
		//이름, 수학, 영어, 국어 평균

		String name;
		int kor;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKor() {
			return kor;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", avg=" + avg + "]";
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public double getAvg() {
			return avg;
		}

		public void setAvg(double avg) {
			this.avg = avg;
		}

		int math;
		int eng;
		double avg;
		
		//평균계산기능>>메서드
		//수식자 반환값 이름(){
		//
		//{
		public void calAvg() {
			avg = kor + math + eng /3;
		}
		//출력기능>>메서드
		
		public void printstudent() {
			System.out.println("이름: "+name);
			System.out.println("평균: "+avg);	
		}
}
