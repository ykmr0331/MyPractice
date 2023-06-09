package J230607_09_01_03;
//멤버클래스에서 사용 제한

/*
 * 인스턴스 멤버클래스(B)안에서는 바깥 클래스의 모든 필드와 모든 메서드에 접근 가능
 * 정적멤버클래스(C)안에서는 바깥클래스의 정적 필드와 정적 메서드에만 접근가능(인스턴스 필드, 인스턴스 메서드 접근 불가)
 */

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {// 인스턴스 멤버 클래스: 바깥클래스(A)의 모든 필드와 모든 메소드에 접근 가능
		
		void method() {
			field1 = 10;//A클래스의 인스턴스 필드(접근가능)
			method1();  //A클래스의 인스턴스 메서드(접근가능)
			
			field2 = 10;//A클래스의 정적 필드(접근가능)
			method2();  //A클래스의 정적 메서드(접근가능)
		}//B클래스의 메서드
	}//B클래스 의 끝
	
	static class C {/* 정적 멤버 클래스: 바깥 클래스(A)의 정적 필드와 정적 메소드에만 접근가능
					                                     인스턴스필드와 인스턴스 메소드에는 접근 불가.*/
		void method() {
		  //field1 = 10; //A클래스의 인스턴스 필드(접근불가)
		  //method1();   //A클래스의 인스턴스 메서드(접근 불가)
			
			field2 = 10; //A클래스의 정적 필드(접근가능)
			method2();	 //A클래스의 정적 메서드(접근가능)
		}
		
	}
	
}
