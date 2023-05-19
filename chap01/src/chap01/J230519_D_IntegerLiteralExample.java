package chap01;

public class J230519_D_IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; //변수 var1 선언과 함께 2진수 데이터 삽입
		int var2 = 0206;   //변수 var2 선언과 함께 8진수 데이터 삽입
		int var3 = 365;	   //변수 var3 선언과 함께 10진수 데이터 삽입
		int var4 = 0xB3;   //변수 var4 선언과 함께 16진수 데이터 삽입	 
		
		System.out.println("var1: " + var1);// 문자열 연결연산자를 사용해서 var1~var4의 값을 출력
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}

}
