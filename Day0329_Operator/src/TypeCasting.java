
public class TypeCasting {
	public static void main(String[] args) {
	  //암시적 변환 : 컴파일러가 알아서 형변화을 해주는 경우
	  //데이터 손실이 없음, 확대 변환
	  /*예)
	    */
		  double b= 2;
		  b = 3.5 *4;
		
	  //명시적변화 : 개발자가 직접 형변환을 해주는 경우
	  //데이터 손실이 일어남, 축소 변환  
	  //예) 
		  int a = (int)123.5;
		  
	}

}
