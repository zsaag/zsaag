
public class NestedLoop2 {

	public static void main(String[] args) {
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		//별을 다섯 줄 출력해야 되니까 다섯번 반복하는 반복문 작성
		/*for(int i=1; i<=5 ; i++){
			//별출력: 별하나 출력하는 반복문 작성
			//첫번째 반복에서 별하나 출력 >> 한번 반복
			//두번째 반복에서 별 들 출력 >> 두번 박복
			//i번째 반복에서 별i개 출력 >> i번 반복
			for(int j=1; j<=i ; j++)//열값 출력 j값은 i줄에 맞춰서 증가 한다
			{
				System.out.print("*");//별 출력
		}System.out.print("\n");//한줄을 출력하고 나서 개행문자
	}
		System.out.print("\n");//한칸띄움*/
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		/*for(int i=1; i<=5 ; i++){//빈공간 먼저 출력
			for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}//별 출력
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}System.out.print("\n");//한칸띄움
	}*/

		/*for(int j=1; j<=1 ; j++)//열값 출력 j값은 i줄에 맞춰서 증가 한다
			{			
			System.out.print("    *\n");//별 출력
			System.out.print("   **\n");//별 출력
			System.out.print("  ***\n");//별 출력
			System.out.print(" ****\n");//별 출력
			System.out.print("*****\n");//별 출력
			}	System.out.print("\n");//한칸띄움
		}*/
	
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		//빈공간을 출력하는 개수가  첫번째 줄에서는 4개
		//               두번째 줄에서는 3개...
		//               i번째 줄에서는 5-i 개
		//System.out.print("\n");//한칸띄움
		for(int i=1; i<=4 ; i++){//행값 출력
			for(int j=4; j>=i ; j--)//열값 출력 j값은 i줄에 맞춰서 증가 한다
			{
				System.out.print("*");//별 출력
		}System.out.print("\n");//한칸띄움
		
	}
		
}	
}





