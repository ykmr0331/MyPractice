package J230606_08_02_05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC(); // 이 객체가 InterfaceC를 구현함
		
		InterfaceA ia = impl; // 인터페이스A구현
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl; // 인터페이스B구현
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl; //인터페이스C구현
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
