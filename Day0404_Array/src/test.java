import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum1=0;
		int sum2=0;
		Scanner input = new Scanner(System.in);
			for(int i=0;i<arr.length;i++) {
				{
					arr[i] = input.nextInt();					
			}
			}
			for(int i=0; i<arr.length;i++) {			
			if(i%2==0) {
				sum1 = sum1+arr[i];				
			}if(i%1==0) {
				sum2 = sum2+arr[i];				
			}
	}System.out.printf("sum : %d\n",sum1);
	 System.out.printf("avg : %.1f",(double)sum2/arr.length);
	
	}
}
 


