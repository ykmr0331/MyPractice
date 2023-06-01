package J230601_p335_sec02.exam01;
class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExmple {
	public static void main(String args[]) {
		B b = new B();
		C c  = new C();
		D d  = new D();
		E e  = new E();
	
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		
		//B b3 = e;   클래스 B와 E는 상속관계가 아니다.				
		//C c2 = d;   클래스 C와 D는 상속관계가 아니다.				
	
	}

	
	
	
	
	
}
