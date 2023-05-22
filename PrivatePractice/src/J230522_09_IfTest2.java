
public class J230522_09_IfTest2 {

	public static void main(String[] args) {
		int x = 21;
		int y = 30;

		if (x > y) {
			System.out.println("x > y ---> true");
		} else {
			System.out.println("x > y ---> false");
		}
		if (x < y) {
			System.out.println("x < y ---> true");
		} else {
			System.out.println("x < y ---> false");
		}

		if (x == y) {
			System.out.println("x == y ---> true");
		}

		if (x != y) {
			System.out.println("x != y ---> true");
		}
		System.out.println("---변수의 범위(scope)---");

		int kor = 98;

		if (kor >= 90) {
			char grade = 'A';
			String msg = "참 잘했어요";
			System.out.println("kor = " + kor);
			System.out.println("grade = " + grade);
			System.out.println("msg= " + msg);
		}
		
		System.out.println("kor = " + kor);
//		System.out.println("grade = " + grade);  grade와 msg는 블럭 안에서 선언되면 블록 안에서만 사용되어야한다.
//		System.out.println("msg= " + msg);
	}
}
