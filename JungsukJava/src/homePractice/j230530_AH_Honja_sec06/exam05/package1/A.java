package j230530_AH_Honja_sec06.exam05.package1;

public class A {
	//필드
	public int field1; //public 접근제한, 그냥 접근 가능 멤버필드임
	int field2; // default접근제한, 같은 패키지 내에서만 접근 가능
	private int field3; // private 접근 제한. 같은 클래스 내에서만 접근 가능
	
	//생성자
	public A() {
		field1 =1;//클래스 내부이기에 접근제한자의 영향 안받음
		field2 =1;
		field3 =1;

		method1();//클래스 내부이기에 접근제한자의 영향 안받음
		method2();
		method3();
	}
	
	//메소드
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
