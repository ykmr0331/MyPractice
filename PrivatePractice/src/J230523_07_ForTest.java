
public class J230523_07_ForTest {

	public static void main(String[] args) {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡwhileㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		int k = 0; 			// 1. 반복변수 초기화
		
		while (k < 10) { 	// 2. 반복변수 비교(반복조건)
			System.out.println("k = " + k); // 3.반복문
			++k; 			// 4. 반복변수 증가(감소)
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡfor i 증가ㅡㅡㅡㅡㅡㅡㅡㅡ ㅡㅡㅡ");
		for( int i = 0; i < 10; i++) {
			System.out.println("i =" +i); //디버깅하면 나중에 i는 없어짐 for문을 빠져나가면서 i가 필요없기 때문
		}
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡfor i 감소ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for( int i = 10; i > 0; i--) {
			System.out.println("i =" +i); //디버깅하면 나중에 i는 없어짐 for문을 빠져나가면서 i가 필요없기 때문
		}
	
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ홀수만 출력[1~100]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int i =1; i < 100; i++) {
			if(i%2==1) { //나머지값이 1이면 홀수니까
				System.out.print(i+ " ");
			}
		} 
		System.out.println("\n");
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ4의 배수출력[1~100]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int i = 1; i < 100; i ++) {
			if(i % 4 ==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ3과 4의 공통배수 출력[1~100]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int i = 1; i < 100; i ++) {
			if((i %3 ==0) && (i % 4 ==0)) {
				System.out.print(i+ "    ");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ3과 4의 최소공배수 출력[1~100]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 1; i < 100; i ++) {
			if((i %3 ==0) && (i % 4 ==0)) {
				System.out.print(i+ "");
				break; //이렇게하면 처음엔 위의 조건에 따라 12가 나오는데, 12가 나오자마자 반복에서break를 거니까 그 이후는 출력 안되고 끝나는거
				/*
				 * break문
				 * 1.반복문에서 사용
				 * 2.break문 이후의 for블록코드를 실행하지 않는다.
				 * 3.다음 반복 블록도 실행하지 않는다.(반복블록을 빠져나온다.)				 
				 */
			} //end if
		}//end for loop
		
		
		System.out.println();
		System.out.println(">> 4의 배수가 아닌 수 출력[continue]");
		for(int i = 1; i < 100; i++) {
			if(i % 4 == 0) {
				/*
				 4의 배수 조건을 만족하면 continue문이 실행되고 
				 현재 실행중인 for블록의 continue문 이후의 코드를 실행하지 않고
				 다음 횟수의 블록을 실행한다.
				 */
				continue; 
				/*
				 * 0.반복 블록에서만 사용가능하다.
				 * 1.continue문 이후의 for블록 코드를 실행하지 않는다.
				 * 2.다음 반복을 계속 실행한다.
				 *   무언가가 아닌 조건에서 continue문을 쓰는게 좋을 듯? 건너뛰는거니까
				 */
			}
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println(">>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 홀수짝수합[1~100]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		int oddTot=0;
		int evenTot=0;
		
		for(int i =1; i <=100; i++) {
			if(i %2 ==0) 
				evenTot += i;
			 else
				 oddTot+=i;
				
			}
		System.out.println("짝수합:" + evenTot);
		System.out.println("짝수합:" + oddTot);
	
		
		System.out.println("----------문자출력--------------");
		for(char c ='a'; c <='z'; c++) {
			System.out.print(c);
			if(c =='z') {
				continue; // 이러면 z마지막은 안찍힘
			}
			System.out.print(",");
		}
		
		
		
	}//main메서드 종료

}//클래스 종료
