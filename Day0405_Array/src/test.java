import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int temp=0;
		int k=0;
			Scanner input = new Scanner(System.in);
			//1~6까지의 배열 요소 저장(int[0]부터 시작)
			for(int i=0; i< arr.length;i++)
			{
				arr[i] = i+1;
				
			}
			//중복을 없애줌
			for(int i=0;i<arr.length;i++) 
				{				
				k = (int)(Math.random()*6);
				temp = arr[i];
				arr[i] = arr[k];
				arr[k]= temp;
				
			}
			
			//오름차순 정렬
			for(int i=0;i<arr.length;i++) 
				for(int j=0;j<arr.length-1;j++) {
					
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
			}
			for(int i=0;i<arr.length;i++) 
			{
			System.out.print(arr[i]+" ");
			}
	}
}



