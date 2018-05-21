import java.util.Scanner;
public class Junoll67 {

	public static void main(String[] args) {
		//4*2이차원 배열 생성하고, 순서대로 사용자에게 입력받기
		//(크기 2인 정수형 배열 4개를 저장할 수 있는 배열 생성)		
		int[][] arr =  new int[4][2];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			// arr[0],arr[1],arr[2],arr[3] 으로 반복
			System.out.printf("%dClass?\n",i+1);
			for(int j=0;j<arr[i].length;j++) { //arr[i]번째의 길이보다 j가 작을대  
				
				arr[i][j] = input.nextInt();
				}
			}
		    //가로평균
			int sumTotal=0; //전체합
			int count =0; //전체개 수	 
			int[] sumCol = new int[2]; // 0  1
									   //[0][1]
			
			
			for(int i=0;i<arr.length;i++) {
				int sumRow =0;
					
			for(int j=0;j<arr[i].length;j++) { 
				sumRow +=arr[i][j];
				sumTotal += arr[i][j];
				sumCol[j]+=arr[i][j];// 0이면 0, 1이면 1에다가 대입
				count++;
			}
			//sumRow는 총합
			System.out.print(sumRow/arr[i].length+" ");
			}
			System.out.println();
			
			for(int i=0; i<sumCol.length;i++) {
				System.out.print(sumCol[i]/4+" ");
			}
			System.out.println();
			System.out.print(sumTotal/count);
			//세로평균
			/*
			for(int i=0;i<arr[i].length;i++){
				int sumCol=0;//세로총합
				for(int j=0;j<arr.length;j++) {
						sumCol+=arr[j][i];					
					}	
				System.out.print(sumCol/arr.length+" ");
				}
				System.out.println();
				System.out.println(sumTotal/count);*/
				}	
			}
	
	
