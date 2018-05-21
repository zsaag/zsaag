public class StringEx2 {

	public static void main(String[] args) {
		// "no news is good news"
		//에서 반복문을 사용하여 n의 개수를 출력하는 프로그램을 작성하시오.
		
		//출력 예)
		// 'n' 의 개수는 3개 입니다.
		//문자열에서  'n'의 개수를 찾는 일
		//>>>> 숫자배열에서 특정 숫자의 개수를 세는 것과 동일하다
		//배열이 문자열로 바뀐것 뿐이다.
		//n의 개수를 저장할 변수가 필요
		String str = "no news is good news";
		int cout=0;//초기값 0, n이 없으면 0개 이므로
		
		//문자열의 인덱스를 처음부터 끝까지 검사\
		for(int i=0; i<str.length();i++) {
			//i는 0부터 i<=str.length()-1 까지 1씩 증가하며 반복
			//String 문자열에서 특정 인덱스의 문자 가져오기
			char c =str.charAt(i); //만약 배열이었다면 str[i]의 형태
			if(c=='n'){//문자열이 포함되어있는지 아닌지 검사
				cout++;
		}		
	}
		//반복문이 종료하면 'n'개의 개수를 출력하면된다
		System.out.println("'n'의개수는"+cout+"개입니다");//문자열이 포함되어있는지 아닌지 검사
}
}

