
public class NestedLoop {

	public static void main(String[] args) {
		/*for(int i=1 ;i<=5 ;i++){	//x축 입력		
			for(int j=1; j<=10;j++) //y축 입력
			{
				System.out.print("*"); //별출력
			}System.out.print("\n"); //칸 띄우기
		}행과열 출력*/
		//행과열을 이용한 구구단 출력
		
	/*	for(int i=2 ;i<=9 ;i++){	//행 입력		
			System.out.printf("%d단  ", i); //몇단 내용을 행에 출력
		for(int j=1; j<=9;j++) //열 입력
			{
				System.out.printf("%d * %d = %d ", i ,j ,i*j); //열에 출력
			}	System.out.print("\n"); //칸 띄우기
			
		}*/
		for(int i=1 ;i<=9 ;i++){	//행 입력		
		
		for(int j=2; j<=9;j++) //열 입력
			{
			
				System.out.printf(" %d * %d = %2d  ", j ,i ,i*j); //열에 출력
				//System.out.print("\n");
			}	System.out.print("\n");//칸 띄우기			
		}
	}
}

/* 2 * 1= 2		3 * 1= 3
 * 2 * 2= 4		3 * 2= 6
 * 2 * 3= 6		3 * 3= 9
 * 2 * 4= 8		3 * 4= 12
 * 2 * 5= 10	3 * 5= 15
 * 2 * 6= 12	3 * 6= 18
 * 2 * 7= 14	3 * 7= 21
 * 2 * 8= 16	3 * 8= 24
 * 2 * 9= 18	3 * 9= 27  ......
 * 

 */
