package J230607_09_01_02;
//바깥필드와 메소드에서 사용 제한


public class A {
//인스턴스 필드 (A클래스의 인스턴스필드라는 의미)
	B field1 = new B();
	C field2 = new C();
	
	
//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
//정적 필드 초기화
  //static B field3 = new B();		//인스턴스멤버클래스(B)는 바깥클래스(A)의 정적필드 초기화 불가
	static C field4 = new C();		//정적멤버클래스(C)는 정적필드의 초기화 가능
	
//정적 메소드
	static void method2() {
	  //B var1 = new B(); // 인스턴스 멤버클래스(B)는 바깥클래스(A)의 정적메소드 초기화 불가
		C var2 = new C(); // 정적 멤버클래스(ㅊ)는 바깥클래스(A)의 정적메소드 초기화 가능
	}
	
	
//인스턴스 멤버 클래스
	class B{}
	
//정적 멤버 클래스
	static class C{}
	
}
