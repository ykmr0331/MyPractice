package J230601_p325_331_Class;

import J230601_p325_331_Class.A;
// 326 protected접근 제한자 테스트
public class C {
	public void method() {
		A a = new A();		//책에서는 이거 A클래스가 다른 패키지파일에 있어서 이거 동작 안된다. protected접근제한자라서
		a.field = "value";
		a.method(); 
	}
	
}
