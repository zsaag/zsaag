
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {3,5,4,1,2};
		//중첩 반복을 이용해야 한다.
		//1. 0번에 들어갈 가장작은 수를 찾는다. 0번부터 4번까지 반복
		//0번에 들어갈 가장 작은 수를 찾는다. 0번부터 4번까지 반복
		//1번에 들어갈 가장 작은 수를 찾는다. 0번부터 4번까지 반복
		//2번에 들어갈 가장 작은 수를 찾는다. 0번부터 4번까지 반복
		//3번에 들어갈 가장 작은 수를 찾는다. 0번부터 4번까지 반복
		//4번에 들어갈 가장 작은 수를 찾는다. 0번부터 4번까지 반복
		
		//1.현재 인덱스의 값을 최소값으로 지정
		//2.현재 인덱스부터 4번까지 최소값과 비교 한다.
		//  비교하다가 최소값변수의 값이 더 크다면, 최소값을 비교 대상으로 바꿔준다.
		
		/*for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]){//j의 인덱스 값이 j+1보다 클때
					int tmp = arr[j];//위치 바꿔주기
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
		}
		}
		for(int i=0;i<arr.length;i++) {//배열 출력부분
			System.out.print(arr[i]+" ");
				}*/
				
			//각자리의 들어갈 숫자를 넣어주는 반복문
			
			/*for(int i=0;i<arr.length;i++){
				//for(int i=0;i<arr.length-1;i++)
				//배열 안에서 최소값을 찾기 위해서는  내부비교를 해야 한다.
				//배열에서 가장 앞에 있는 수를 최소값이라고 가정하겠다.
				int minVal=arr[i];  //이미 자리를 찾은 숫자는 비교대상에서 제외
				for(int j=i;j<arr.length;j++){//for(int j=i+1;;j++)
					//minVal가 비교대상보다 크다면, 비교대상을 최소값으로 만들어줌
					//값바꿔주기 minVal과 비교 대상 자리 바꿔주기					
					if(minVal >arr[j]) {
						int tmp = minVal; //tmp임시변수(잠시 저장하는 변수)
						minVal =arr[j]; //비교대상을 최소값으로 만들어주기
						arr[j] = tmp;
					}
					
				}	
				arr[i] = minVal;
			} //반복문이 끝이나면 최소값이 minVal에 저장되어 있음
			//최소값이 들어갈 자리에 최소값을 넣어줌
			
			
			//최소값을 자리에 넣어주는 반복문 끝
			for(int num:arr) {
				System.out.print(num+" ");
				}*/		
		//이번에는 최소값을 찾아서 바로 바꾸지 않고, 자리 위차만 가지고 있기
		for(int i=0;i<arr.length;i++)
		{//알고 있어야 한느 값: 최소값, 최소값의 자리번호
			int minVal = arr[i]; //최소값
			int minPos= i; //최소값 자리번호
			
			minVal = arr[i];
			for(int j=i;j<arr.length;j++) {
				if(minVal > arr[j]) {
					minVal = arr[j];
					minPos = j; //최소값 위치 저장
				}
				
			}
			arr[minPos] = arr[i];
			arr[i] = minVal;
		}
		for(int num:arr) {
			System.out.print(num+" ");
			}		
		}
	}



//변수간 값을 바꾸는 방법
/*int a,b;
a=3;
b=10;
int tmp;
tmp=b;
b=a;
a=tmp;










*/