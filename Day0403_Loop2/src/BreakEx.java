
public class BreakEx {

	public static void main(String[] args) {
		//break - continue
		//break : 반복문을 반복문의 조건문과 상관없이 빠져 나올 때 사용
		//continue : 해당 반복 순서의 문장을 더이상 실행하지 않고, 다음 반복으로 넘어감
		//특정조건일때 반복문을 실행하지 않고, 다음 반복으로 진행하고 싶을 때 사용

		for(int i =1;i<=10;i++) { //i는 1에서 10까지 출력 반복해서
			//만약 i가 5의 배수이면 반복문을 종료
			//break;
			//만약i가 5의 배수이면 출력하지 마라
			
			if(i%5 ==0) { //5배수를 제외하고 출력
				continue;
			}
			System.out.print(i+" ");
		}
		//중첩반복문에서의 break
		/*
		 * 중첩반목문에서 내가 원하는 반복문을 종료하고 싶을 때 반복문에 태그를 달아주어라
		 * 태크1:
		 * 반복문1
		 *  태그2:
		 *	 반복문2
		 *
		 *	break 태크1:    <<종료하고자 하는 반복문을 선택할 수 있다.
		 *
		 *
		 *	반복문의 이름을 설정하지 않고, 안쪽 바깥쪽 반복문을 
		 *	종료하기 위해서는 바깥쪽 반복문의 상태를 결정할 수 있는 변수의 값을 
		 *	바꿔주면 된다.	<<isEnd
		 * */
			//중첩반복문에서의 break
			int count=0;
			boolean isEnd = false;
			outFor: //바깥 반복문 태그 작성
			for(int i =1;i<=7;i++) {
				inFor: //안쪽 반복문 태그 작성
				for(int j=1; j<=5; j++) {
					//여기는 몇번돌아 오나요??
					if(i == 3 && j==3) {
						System.out.println(count);
						isEnd=true; //바깥족 반복문을 실행 할지 말지 결정
						break;
						//break outFor;
					}
					count++;
				}
				if(isEnd) {
					break;
				}
				/*if(i == 3) {
					break;
				}*/
			}//System.out.println(count);
		}
	}
