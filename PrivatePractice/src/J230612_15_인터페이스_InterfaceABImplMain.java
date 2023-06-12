
public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println("---------------InterfaceABImpl---------------");
		InterfaceABImpl abImpl = new InterfaceABImpl();
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
	
		System.out.println("---------------InterfaceA-----------------");
		InterfaceA ia =abImpl;
		ia.method1();
		ia.method2();
//		ia.method3(); //ia에 abImpl의 객체 있다. 타입(InterfaceA)이 바뀌어 못씀
//		ia.method4(); 
	
		System.out.println("---------------InterfaceB-----------------");
		InterfaceB ib =abImpl;
//		ib.method1();//ib에 abImpl의 객체 있다. 타입(InterfaceB)이 바뀌어 못씀
//		ib.method2();
		ib.method3(); 
		ib.method4(); 
		System.out.println("---------InterfaceA <-->InterfaceA---------");
//		InterfaceA ia2 = new InterfaceA();
		//Cannot instantiate the type InterfaceA
		//InterfaceA를 직접적으로 인스턴스화할 수 없다
		InterfaceA ia2 = new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		/*
		ia2.method3();
		ia2.method4();
		*/
		InterfaceB ib2 = (InterfaceB)ia2; // 자식인 구현클래스 때문에 가능한거임
		/*
		ib2.method1();
		ib2.method2();		
		*/
		ib2.method3(); 
		//원래 ia2는 구현클래스의 객체인데 여기서 이미 InterfaceB로 형태가 바뀌어서 그래  
		ib2.method4();
//		InterfaceB ib2 = ia2; // 자식끼리 관계없듯이 부모끼리도 관계가 없음
		
	}

}
