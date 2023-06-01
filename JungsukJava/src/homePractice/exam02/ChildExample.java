package J230601_p336_sec02.exam02;
//자동 타입 변환 후의 멤버 접근
public class ChildExample {

	public static void main(String[] args) {
		Child child =new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); // Child클래스에서 재정의된 method2()클래스가 나온다
//		parent.method3();  안되는 이유는 method3() 메소드는 부모클래스에는 원래 없고 자식 클래스에 있기 때문이다.	
		

	}

}
