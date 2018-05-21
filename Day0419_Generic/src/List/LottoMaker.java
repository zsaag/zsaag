package List;
import java.util.List;
import java.util.ArrayList;
//로또 프로그램을 객체지향으로 바꿔봅시다.
		//객체지향 : 실제 세계를 모델링>> 문제를 해결하기 위해서 객체를 만들어 냄
		//로또 프로그램에서는 문제는 중복되지 않는 6개의 난수를 생성 하는 것이 문제
		//난수를 생성하는 객체를 만들자!!



//로또에서 숫자를 만들어내는 프로그램
public class LottoMaker { //class:객체의 도면
		//기능은 >>메서드
		//상태값(데이터) >> 변수
	List<Integer> lotto = new ArrayList<Integer>();
	public static final int LENTH_OF_LOTTO = 6;
	
	 public void makerNumber() {
		 //난수를 만들어 내고 출력
	
		 System.out.println("숫자 만들고 출력");							
								
			for(int i=0;i<LENTH_OF_LOTTO;i++) {
			lotto.add((int)(Math.random()*46)+1);
			/*int tmp	=((int)(Math.random()*46)+1);
			 lotto.add(tmp); */
						
			for(int j=0;j<i;j++) {
				if(lotto.get(j)==lotto.get(i)) 
				//if(tmp==lotto.get(j)) 
				{
					//lotto.remove(i);
					i--;	
					break; 
				}
			}
		}		
			/*
			for(int i=0;i<LENTH_OF_LOTTO;i++) {
				//이미 들어갈 자리가 있으니까...미리 넣고 나서 비교
				int tmp =((int)(Math.random()*6))+1;
				boolean isDup=false;  //중복되면 true
			
				for(int j=0;j<i;j++) {
					if(tmp == lotto.get(j)) {
						isDup = true;
						i--;
						break;
					}
				}
				
				if(!isDup) {
					//중복이 일어나면 아무작업하지 않음
					//>>중복이 일어나지 않았다면 생성한 숫자를 추가
					lotto.add(tmp);
				}
				
			}*/
			
			for(Integer number:lotto)
				{
				System.out.print(number+" ");
				}
	 		}
		}
