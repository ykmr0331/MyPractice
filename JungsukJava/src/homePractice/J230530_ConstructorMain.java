
public class J230530_ConstructorMain {

	public static void main(String[] args) {
		System.out.println("----------------------c1----------------");
		/*
		 << new Constructor();>>
		 	1. Constructor 클래스로 객체생성
		 	2.생성자메소드(블록) 호출
		 	3.
		 */
		J230530_Constructor c1 = new J230530_Constructor();
		System.out.println("c1: " + c1);
		c1.print();
		
		System.out.println();
		J230530_Constructor c2 = new J230530_Constructor(7777,8888);
		c2.print();
	}

}
