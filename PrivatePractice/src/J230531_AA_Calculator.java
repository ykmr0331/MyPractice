

public class J230531_AA_Calculator { //Calculator 클래스 생성

//	 private Calculator() {}; //만약에 이거 쓰면 Main에서 생성자 호출 못함
		/*
		 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
		 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
		 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
		 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
		 */
	
	public static int add(int a, int b) {// 정적메소드 선언(굳이 객체를 만들어서 선언할 필요 없어)
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	public static  int mul(int a, int b) {
		return a * b;
	}

}

