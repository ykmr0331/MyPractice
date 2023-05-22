
public class J230522_14_IfScorePointReturn {

	public static void main(String[] args) {
		
		/*
		 * 점수유효성체크
		 */
		int kor = 55;
		if(!(kor >=0 && kor <=100)) {
			//유효하지 않은 점수
			System.out.println(kor + "은 유효한 점수가 아닙니다.");
			return; //유효한 점수가 아닌 경우에 학점계산을 안하도록 하기 위해서는 return;을 적어야
		}

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

		return;
		
	}

}
