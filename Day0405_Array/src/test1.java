import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
int[][] arr =  new int[4][3];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.printf("%dClass?\n",i+1);
			for(int j=0;j<arr[i].length;j++) { 
				
				arr[i][j] = input.nextInt();
				}
			}
		    
			int[] sumCol = new int[2]; 
			
			
			for(int i=0;i<arr.length;i++) {
				int sumRow =0;
					
			for(int j=0;j<arr[i].length;j++) { 
				sumRow +=arr[i][j];
				
			}
		
			System.out.println(sumRow/arr[i].length);
			}
			System.out.println("");
			
			System.out.println();
			  }
		   }		
	

