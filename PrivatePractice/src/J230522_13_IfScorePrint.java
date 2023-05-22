
public class J230522_13_IfScorePrint {

	public static void main(String[] args) {
		int kor = 3000;
		/*
		 * 점수의 유효성 체크
		 */
		if (kor >= 0 && kor <= 100) { // 점수의 유효성 if문 안에 몇학점이지의 if문이 들어가있어
			/******** 유효한 점수 *********/
			/*
			 * 학점계산
			 */
			char hakjum = 'F';
			if (kor >= 90) {
				hakjum = 'A';
			} else if (kor >= 80) {
				hakjum = 'B';
			} else if (kor >= 70) {
				hakjum = 'C';
			} else if (kor >= 60) {
				hakjum = 'D';
			} else {
				hakjum = 'F';
			}
			System.out.println("학점은 " + hakjum + " 입니다.");

		} else {
			/******** 유효하지 않은 점수 *********/
			System.out.println(kor + "은 유효한 점수가 아닙니다.");
		}

		/*
		 * 학점계산
		 */

	}

}
