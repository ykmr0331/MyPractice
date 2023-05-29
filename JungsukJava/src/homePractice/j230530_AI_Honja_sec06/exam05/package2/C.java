package j230530_AI_Honja_sec06.exam05.package2;

import j230530_AH_Honja_sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
//		a.field2 = 1;//default
//		a.field3 = 1; // private

		a.method1();  //접근제한 public이라 가능
//		a.method2();  //접근제한 default라 접근불가 // 여기는 다른 패키지임
//		a.method3();  //접근제한 private이라 불가능 애초에 클래스를 이미 벗어남
	}
}
