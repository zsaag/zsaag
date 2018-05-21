
public class Score {

	public static void main(String[] args) {
		// 학생들의 점수가 저장되는 2차원 배열을 생성
		// 2차원 배열은 각각 반 별로 저장이 된다.
		// 1반은 {10,90,80,90} 네 명
		// 2반은 {90,77,60} 세 명
		// 3반은{100,100,50,50,40} 다섯 명
		// 4반은 {100,99,80,90,100,0}여섯 명 
		// 각 반의 총점과 평균을 구하라
		// 단, 평균은 소수점 첫째자리 까지만 표시
		/*출력 예)1반: 총점 xxx점, 평균91.5점
		 *     2반: 총점 xxx점, 평균xx.x점
		 *     3반: 총점 xxx점, 평균xx.x점
		 *     4반: 총점 xxx점, 평균xx.x점
		 * */
		int [][] scores = new int[4][];//2차원배열
		;//정수형 배열
		int[] a1 = {100,90,88,90};
		int[] a2 =  {90,77,60};
		int[] a3 = {100,100,50,50,40};
		int[] a4 = {100,99,80,90,100,0};
		//얕은복사
		scores[0] =a1;
		scores[1] =a2;
		scores[2] =a3;
		scores[3] =a4;
		
		for(int i=0;i<scores.length;i++){
			//각 반별로 총합을 구하는 코드
			int sum=0;
			for(int j=0;j<scores[i].length;j++) {
				sum= sum +scores[i][j];
			}
			System.out.printf("%d반: 총점 %d점,   평균%.1f\n",(i+1),sum,sum/(double)scores[i].length);
		}
		
		/*int[][] a1 = {{100,90,88,90}};
		int[][] a2 = { {90,77,60}};
		int[][] a3 = {{100,100,50,50,40}};
		int[][] a4 = {{100,99,80,90,100,0}};*/
		/*int sum=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		
		for(int i =0;i<a1.length;i++) {			
			for(int j =0;j<a1[i].length;j++) {
				sum= sum + a1[i][j];
				
		}System.out.printf("1반: 총점 %d점,   평균%.1f\n",sum,(double)sum/a1[i].length);
		}
			for(int i=0;i<a2.length;i++) {
				for(int j =0;j<a2[i].length;j++) {
					sum2= sum2 + a2[i][j];				
			}System.out.printf("1반: 총점 %d점,   평균%.1f\n",sum2,(double)sum2/a2[i].length);			
			}
			for(int i=0;i<a3.length;i++) {
				for(int j =0;j<a3[i].length;j++) {
					sum3= sum3 + a3[i][j];				
			}System.out.printf("1반: 총점 %d점,   평균%.1f\n",sum3,(double)sum3/a3[i].length);			
			}
			for(int i=0;i<a4.length;i++) {
				for(int j =0;j<a4[i].length;j++) {
					sum4= sum4 + a4[i][j];	
			}System.out.printf("1반: 총점 %d점,   평균%.1f\n",sum4,(double)sum4/a4[i].length);
			}	*/
	}
}

