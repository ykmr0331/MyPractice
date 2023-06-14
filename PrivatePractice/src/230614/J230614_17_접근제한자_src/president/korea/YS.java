package president.korea;

import president.america.Trump;

public class YS {

	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	public void access() {
		/*************************YS와 같은 패키지의 클래스 멤버 접근*************************/
		DJ dj = new DJ( ); 
		dj.member1 = 1;
		dj.member2 = 2;
		dj.member3 = 3;
		//dj.member4 =4;
		dj.method1();
		dj.method2();
		dj.method3();
		//dj.method4();  private이라서그래
		
		/*************************YS와 다른 패키지의 클래스 멤버 접근*************************/
		Trump trump = new Trump();
		trump.member1 = 1;	//public
//		trump.member2 = 2; // protected 패키지도 틀리고 자식클래스가 있는것도 아님
//		trump.member3 = 3;// default 패키지 다름
//		trump.member4 = 4;// private같은 패키지여도 안됌

		trump.method1();//public 가능
//		trump.method2();// protected 패키지도 틀리고 자식클래스가 있는것도 아님
//		trump.method3();// default 패키지 다름
//		trump.method4();// private같은 패키지여도 안됌
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
