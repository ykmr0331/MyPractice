package J230601_p336_sec02.exam02;
// 자동 타입 변환 후의 멤버 접근
public class Child extends Parent {
	@Override
	//메소드 재정의
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
