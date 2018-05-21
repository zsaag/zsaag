
public class Lotto {
	int[] Lotto;//멤버변수 정수형 배열
	//랜뎜변수를 이용 번호 생성(중복X)
	
	public Lotto(){
		//super();
		//매개변수가 없는 생성자 기본생성자
		Lotto = new int[6];
	}
	//lotto를 배열로 입력받은 배열로 초기화하는 생성자
	public Lotto(int[] arr){
		Lotto =arr;
	}
	
	//기능 숫자 만들기
	public void makeNumber() {
		for(int i=0;i<Lotto.length;i++){
			Lotto[i]= (int)(Math.random()*45+1);
			for(int j=0;j<i;j++){
				if(Lotto[i]==Lotto[j]){
				i--;
				break;
				}				
			}
		}
	}
		
	//배열정렬하기
	public void sort(){
		for(int i=0;i<Lotto.length;i++){
			for(int j=0;j<Lotto.length-1;j++){		
				if(Lotto[j] > Lotto[j+1]) {
					int tmp = Lotto[j];
					Lotto[j] = Lotto[j+1];
					Lotto[j+1] = tmp;
				}
				
			}
		
		}
	}
	//배열 출력하기
	public void printLotto()
		{//멤버변수 lotto를 출력하면 됩니다.
			for(int i=0;i<Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
			}
			System.out.print("\n"); //출력다하고 나서 개행문자 출력
		}
	}
//ctrl+f 문자 바꾸기 기능