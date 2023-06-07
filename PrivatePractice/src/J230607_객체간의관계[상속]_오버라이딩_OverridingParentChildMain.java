
public class OverridingParentChildMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		
		oc.method1();
		oc.method2();
		/*
		 * oc.method2() 호출시에는 자식에서 재정의된 오버라이딩된 메소드가 호출됌 
		 */
		oc.method3();
		
	}

}
