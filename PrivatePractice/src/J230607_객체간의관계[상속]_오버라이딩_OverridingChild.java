
public class OverridingChild extends OverridingParent{
	
	/*OverridingParent클래스로부터 상속받은 메서드들, 자기꺼임
	 
	 
	 public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	
	    
	public void method2() {
		System.out.println("OverridingParent.method2()");
	}
	 */
	
	
	/*
	 * <<자식에서 재정의한 자식 메소드 method2>>
	 * -자식에서 재정의한 메소드만 호출된다.
	 */
	@Override  // 재정의할 때 실수하는걸 막으려고
	public void method2() {
		System.out.println("------재정의된 method2() start---------");
		super.method2();
		//원래 상속받은 메서드를 호출하고 싶으면 super()를 쓰면 된다.
		/*
		 * super
		 * -this와 같은 self참조변수\
		 * -this.와 같은 주소값이다.
		 * -재정의에 의해 숨겨진 메소드(멤버)를 호출할 때 사용
		 */
		System.out.println("OverridingChild.method2()");
		System.out.println("------재정의된 method2() end---------");
	}
	
	
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
}
