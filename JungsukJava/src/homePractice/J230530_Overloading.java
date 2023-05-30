/*
오버로딩(메쏘드 다중정의)
  1. 자바 다형성구현기법 중의하나이다.
  2. 정의: 같은메쏘드 이름으로 여러개를 정의하는방법
           - 규칙: 
               * 메쏘드의 이름이 같아야한다.
               * 메쏘드의 인자의 숫자가 다르거나
               * 메쏘드의 인자의 타입이 달라야한다.
               * 메쏘드의 리턴타입,접근지정자는 상관없다.

*/
public class J230530_Overloading {
	
	public void method() {
		System.out.println("public void method(int a)");
	}
	
	/*  메소드의 리턴타입은 상관이 없기 때문에 이건 안된다.
	
	public int method() { 
		System.out.println("public void method(int a)");
	}
	
	*/
	
	public void method(int a) {
		System.out.println("public void method(int a)");
	}
	
	public void method(String a) { // 위에랑 인자의 개수는 같지만 인자의타입이 다르다.
		System.out.println("public void method(String a)");
	}
	
	public void method(int a, int b) { // 맨위랑 인자의 개수가 다르
		System.out.println("public void method(int a, int b)");
	}
	
	public void method(int a, String b) { // 위랑 인자의 개수는 같지만 타입이 하나 다름
		System.out.println("public void method(int a, String b)");
	}
	
	public void method(int a, int b, int c) {
		System.out.println("public void method(int a, int b, int c)");
	}

//	이건 안된다.
//	public void method(int b, int a, int c) {
//		System.out.println("public void method(int b, int a, int c)");
//	}
	
	public void method(String a, int b, int c) {
		System.out.println("public void method(String a, int b, int c)");
	}
}
