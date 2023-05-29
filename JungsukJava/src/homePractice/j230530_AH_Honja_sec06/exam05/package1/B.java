package j230530_AH_Honja_sec06.exam05.package1;

public class B {
	public B() {
		A a = new A(); //클래스 A의 객체 선언, 생성자 접근제한 public이라 상관없음
		a.field1 = 1; // 멤버변수 접근제한자 public
		a.field2 = 1;// 멤버변수 접근제한자 default
//		a.field3 = 1;// 멤버변수 접근제한자 private이라 안된다.
		
		a.method1();
		a.method2();
//		a.method3(); // private메소드 접근 불가 
		
	}
}
