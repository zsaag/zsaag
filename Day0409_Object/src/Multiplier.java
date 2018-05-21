
public class Multiplier {
	public Multiplier(int number){
		System.out.println("Multiplier의 생성자 입니다.");
		result = number;
	}
	public Multiplier(){
		System.out.println("Multiplier의 기본생성자 입니다.");
	}
	
	
	
	//결과값을 저장할 수 있는 변수
	int result;
	double resultdouble;
	//두 실수를 입력받아 곱을 구하는 기능, 결과를 반환
public int multiply(int a, int b){
	System.out.println("정수곱");
	result = a*b;
	return result;
	}
public double multiply(double a, double b){ //매개변수 종류나 개수나 다르면 생성자 이름이 같아도 된다
	System.out.println("실수곱");
	resultdouble = a*b;
	return resultdouble;
	}
}
