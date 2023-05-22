
public class J230522_12_IfNested {

	public static void main(String[] args) {
		/*
		 * 학점계산(A,B,C,D,F)
		 */

		int kor = 85;
		char hakjum = 'F';
		System.out.println("--------------nested if---------------");// 중첩된 if

		if (kor >= 90 && kor <= 100) {
			// A학점
			hakjum = 'A';
		} else { // else 블럭 안에 다시 조건을 주려면
			if (kor >= 80 && kor < 90) {
				// B학점
				hakjum = 'B';
			} else  {
				// C,D,F
				if (kor >= 70 && kor < 80) {
					// C학점
					hakjum = 'C';
				} else {
					/* D,F */
					if (kor >= 60 && kor < 70) {
						hakjum = 'D';
					} else {
						hakjum = 'F';
					}
				}
			}
		}
		System.out.printf("1.학점은 %c입니다.\n", hakjum);
		
		System.out.println("--------------else if---------------");
		
		hakjum = 'F';
		if(kor >=90 && kor <=100) {
			hakjum ='A';
		} else if (kor >=80 && kor <90) {
			hakjum = 'B';
		} else if (kor >=70 && kor <80) {
			hakjum = 'C';
		} else if (kor >=60 && kor <70) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
			
		System.out.printf("1.학점은 %c입니다.\n", hakjum);
		
	}

}
