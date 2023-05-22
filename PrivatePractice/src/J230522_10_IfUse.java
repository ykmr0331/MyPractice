public class J230522_10_IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수 판별
		 */

		int no1 = 52;

		if (no1 % 2 == 0) {
			System.out.printf("%d은 짝수입니다.\n", no1);
		} else {
			System.out.printf("%d은 홀수입니다.\n", no1);
		}
		/*
		 * 4의 배수 판별
		 */
		int no2 = 4000;
		if (no2 % 4 == 0) {
			System.out.printf("%d는 4의배수\n", no2);
		} else {
			System.out.printf("%d는 4의배수아님\n", no2);

		}
		/*
		 * 점수의 유효성 체크
		 */
		int kor = -90;
		if (kor >= 0 && kor <= 100) {
			System.out.printf("%d는 유효한 점수입니다.\n", kor);// 형식화된 문자열을 출력하는 메서드
		} else {
			System.out.printf("%d는 유효한 점수가 아닙니다.\n", kor);
		}

		/*
		 * 윤년여부출력
		 */
		int year = 2023;
		String msg = ""; // 문자열의 초기화
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// 4의배수이고 100의배수는 아님.근데 400의 배수여야한다.
			msg = "윤년";
		} else {
			msg = "평년";
		}

		System.out.printf("%d년은 %s입니다.\n", year, msg);

		/*
		 * 문자판단
		 */
		char c = 'X';
		if (c >= 'A' && c <= 'Z') {
			System.out.printf("%c는 알파벳 대문자입니다.\n", c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf("%c는 알파벳 소문자입니다.\n", c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf("%c는 숫자형태 문자입니다..\n", c);
		}
		/*
		 * 아이디의 첫글자가 알파벳 대문자이거나 소문자여야하는 if문 만들어보기
		 */
		char idFirstLetter = '&';

		if ((idFirstLetter >= 'A' && idFirstLetter <= 'Z') || (idFirstLetter >= 'a' && idFirstLetter <= 'z')) {
			System.out.printf("%c는 유효한 첫문자입니다.\n", idFirstLetter);
		} else {
			System.out.printf("%c는 유효하지 않은 첫문자입니다.\n", idFirstLetter);
		}
	}
}
