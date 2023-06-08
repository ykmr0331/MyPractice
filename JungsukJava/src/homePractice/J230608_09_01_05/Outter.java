package J230608_09_01_05;
/*
 *  바깥클래스.this.필드;      바깥클래스의 필드나 메소드에 접근하려면 이렇게
 *  바깥클래스.this.메소드();
 */


public class Outter {
	String field = "Outter-field"; // 인스턴스 필드
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);//중첩객체참조
			this.method();
			System.out.println(Outter.this.field);//바깥객체 참조
			Outter.this.method();
		}
	}
}
