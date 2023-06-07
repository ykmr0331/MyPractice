package J230607_09_01_01;
//중첩클래스
public class A {
	/*바깥 클래스*/
	A() {
		System.out.println("A객체가 생성됨");
	}
	
	//인스턴스 멤버 클래스(클래스 멤버로써)
	class B {
		B() {System.out.println("B객체가 생성됨");}
		int field1; // 인스턴스필드는 생성 가능
		//static int field2;     인스턴스 멤버클래스에서는 정적필드를 선언할 수 없다.
		void method1() {}//인스턴스 메서드는 생성 가능
		//static void method2(){}	인스턴스 멤버클래스에서는 정적메서드를 선언할 수 없다.
	
	}
	
	//정적 멤버 클래스(클래스 멤버로써)   >>>정적 인스턴스 둘다 생성가능
	static class C {
		C() {System.out.println("C객체가 생성됨");}
		int field1; // 인스턴스 필드 생성가능
		static int field2;// 정적필드 생성가능
		void method1() {}// 인스턴스 메서드 생성가능
		static void method2() {}//정적 메서드 생성가능
	}
	
	void method() { // 이거는 바깥 클래스인 A클래스의 메서드
		
		//로컬 클래스 (생성자 또는 메서드 내부에 있는 클래스)
		class D { // 로컬클래스는 인스턴스 필드와 인스턴스메소드는 생성가능
			      //그러나 정적 필드와 정적 메소드는 생성불가	 
			D() {System.out.println("D객체가 생성됨");}
			int field1; // 인스턴스 필드
			//static int field2;  이건 정적필드라 안됌ㅜㅜ
			void method1() {} // 이건 인스턴스 메서드
			//static void method2() {} //이건 정적 메서드라 안됌ㅜㅜ
		
		}//내부클래스 D의 끝
		
		D d = new D(); //바깥 A클래스 안에 D객체 생성
		d.field1 = 3; //D객체의 integer형 멤버필드 field1에 3대입(초기화)
		d.method1(); //D객체의 인스턴스 메서드 호출
		
	}//void method() :A클래스의 메서드 끝

}//A클래스의 끝
