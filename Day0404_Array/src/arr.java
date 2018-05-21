import java.util.Scanner;
public class arr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] s= new int[5];
		int sum=0;
		for(int i=0; i<s.length;i++) {
			System.out.println("성적을 입력하시오.");
			s[i] = input.nextInt();
		}
		for(int i=0; i<s.length;i++)
			sum = sum + s[i];
		    System.out.printf("평균 성적은 %d입니다",sum/s.length);
			}
	}

