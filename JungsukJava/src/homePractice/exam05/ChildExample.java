package J230601_p349_sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자식에서 부모로 자동타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2"; // field2멤버필드는 Child클래스에만 있음, 상속받은거 아님
		 parent.method3();// 불가능 이유는 method3() 메서드는 Child객체에서 생성한거기 때문
		 */

		
		Child child = (Child)parent; // 이게 강제 타입 변환  부모에서 자식으로( 단 원래 자식이었다 부모였다가 다시 자식인것만 됌)
									//애초에 부모클래스인건 안된다!!!!!!!!!!!!!!!!!!!!!!!!
		child.field2 = "yyy";
		child.method3();
	}

}
