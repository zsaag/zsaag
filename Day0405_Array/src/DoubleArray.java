
public class DoubleArray {

	public static void main(String[] args) {
		//이차원 배열:배열을 저장할 수 있는 배열
		//정수형 데이터를 저장할 수 있는 배열 선언
		/*int[] intarr = new int[3]; //배열의 주소값을 저장하는 참조 변수
		
		
		//크기 5인 정수형 배열을 저장하는 크기3인 배열
		//arr 정수형 배열의 주소값을 저장하는 배열의 주소값을 저장하는 참조
		int[][] arr = new int [3][5]; //2차원 배열의 주소값을 저장하는 참조 변수
		//int[][] doublearr = new int [3][]; //[]를 선언해줄 수 있다
		//System.out.println(arr.length); //arr의 2차원배열의 길이
		//System.out.println(arr[0].length); //arr의 정수형 배열의 길이 0번째에 있는 배열의 길이
		//arr[0], arr[1], arr[2]
		//는 정수형 배열의 주소값을 저장하는 참조변수
		
		//arr[0][0]...등등등
		//정수형 변수
		for(int i=0;i<arr.length;i++){
			//얘가 3번 반복
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println(arr[i][j]);
		}*/

		
		//정수 5개를 저장할 수 있는 배열a 선언 및 생성
		/*int[] a = new int[5];
		//정수형 배열 3개를 저장할 수 있는 배열b 선언 및 생성
		int[][] b = new int[3][];
		//크기 4인 정수형 배열 6개를 저장하는 배열 c선언 및 생성
		int[][] c = new int[6][4];
		
		double[] d = new double[3];
		b[0] =a;
		//b[1] =d; //안된다. b는 정수형 배열의 주소박만 저장할 수 있다.
		System.out.println("b[0][0] : "+b[0][0]);
		a[0] =10;
		b[0][1] =20;
		System.out.println("b[0][0] : "+b[0][0]);
		System.out.println("b[0][0] : "+b[0][1]);
		System.out.println(a[1]);
		
		//크기 3인 정수형배열
		int[] a2 = {5,10,20};
		b[1] = a2;
		
		//크기 6인 정수형 배열
		int[] a3 = {10,15,20,43,23,67};
		b[2] = a3;
		//2차원 배열을 반보문에서 사용할 때,
		//각 원소들의 길이를 사용하면, 각원소 배열의 길이가 다르더라도 모두 접근 가능
			for(int i =0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("\n");
			}*/
			//배열에서 값을 초기화 하면서 배열 생성하기
			int[] arr1 = {10,20,30,1,2};
			int[][] arr2 = {{2,3,4},{1,2,3},{1,1,1,1,1},{10,20}};
			
		
				for(int i =0;i<arr1.length;i++) {
						System.out.print(arr1[i]+" ");
					}
				for(int i =0;i<arr2.length;i++) {
					for(int j =0;j<arr2[i].length;j++) {
						System.out.print(arr2[i][j]+" ");
				}			
				}
	}
}


