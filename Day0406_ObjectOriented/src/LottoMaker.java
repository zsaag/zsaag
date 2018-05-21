//로또 프로그램을 객체지향으로 바꿔봅시다.
		//객체지향 : 실제 세계를 모델링>> 문제를 해결하기 위해서 객체를 만들어 냄
		//로또 프로그램에서는 문제는 중복되지 않는 6개의 난수를 생성 하는 것이 문제
		//난수를 생성하는 객체를 만들자!!



//로또에서 숫자를 만들어내는 프로그램
public class LottoMaker { //class:객체의 도면
		//기능은 >>메서드
		//상태값(데이터) >> 변수
	int[] arr = new int[6];
	 public void makerNumber() {
		 //난수를 만들어 내고 출력
		 System.out.println("숫자 만들고 출력");							
								
			for(int i=0;i<arr.length;i++) {
				arr[i] = (int)(Math.random()*45)+1; 
						
			for(int j=0;j<i;j++) {			
				if(arr[i]==arr[j]) 
				{
					i--;	
					break; 
				}
			}
		}				
			for(int number:arr)
				{
				System.out.print(number+" ");
				}
	 		}
		}
