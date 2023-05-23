
public class J230523_04_WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */

		/*
		 * char c1 = 0; // 문자변수 c1 생성 초기화 동시에 수행 while (c1 < 65536) {
		 * System.out.print(c1 + " "); c1++; if(c1 % 100 ==0) {
		 * System.err.println("\n"); } } System.out.println();
		 */

		/*
		 * 영문 소문자 출력
		 */
		char c2 = 'a';
		while (c2 <= 'z') {
			System.out.print(c2 + " ");
			c2++;
		}
		System.out.println();
		System.out.println();

		/*
		 * 퀴즈 영문소문자 출력 
		 * a b c d e
		 * f g h i j 
		 * k l m n o 
		 * p q r s t 
		 * u v w x y 
		 * z
		 */
		
		char c4 = 'a';
		while (c4 <= 'z') {
			System.out.print(c4 + " ");// a b c d e 이런 식으로 나오지
			c4++;
			if (c4 % 5 == 2) { // a, f, k,p,u,z의 아스키코드 값은 5로 나눴을 때 나머지가 2이므로 이렇게 정리가능
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();

		
		
		
		/*
		 * 한글출력
		 */

		int han = '가';
		while (han <= '힣') {
			System.out.print(han + " ");
			han++;
			if (han % 100 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		

		
		
		/*
		 * 숫자형 문자(0~9)
		 */

		char c3 = '0';
		while (c3 <= '9') {
			System.out.print(c3 + " ");
			c3++;
		}
		System.out.println();

	}

}
