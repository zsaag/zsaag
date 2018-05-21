import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lotto {
	Set<Integer>lotto;//멤버변수 정수형 배열
	//랜뎜변수를 이용 번호 생성(중복X)
	public static final int NUM_OF_LOTTO = 6;
	public Lotto(){
		//super();
		//매개변수가 없는 생성자 기본생성자
		lotto = new HashSet<Integer>();
		
	}
	
	//기능 숫자 만들기
	public void makeNumber() {
		//중복되지 않게 임의의 숫자 6개 만들어서 lotto에 저장 
		for(int i=0;i<NUM_OF_LOTTO;i++){
			int num = ((int)(Math.random()*45))+1;
		  //if(lotto.add(num)==false){
			if(!lotto.add(num)){
				i--;
				}				
			}
		}
	
		
	
	//배열 출력하기
	public void printLotto() {
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.print("\n");
		for(int num:lotto) {
			System.out.print(num+" ");
		}
	}
	}
//ctrl+f 문자 바꾸기 기능