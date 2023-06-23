
public class OuterClass {//외부클래스 시작
	
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field = 8888;
	/*
	 * 인스턴스 멤버 메소드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.member_method()");
	}
	// 내부 클래스를 사용하여 ActionListener 인터페이스를 구현하는 클래스를 생성하고 이벤트 리스너로 사용할 수 있습니다.
	/* 내부 클래스를 사용하여 ActionListener 인터페이스를 구현하는 클래스를 생성하면
			이벤트가 발생할 때마다 새로운 참조 변수를 만들 필요가 없습니다*/
	
	/*************OuterClass에서 Inner클래스의 객체생성사용**************/
	public void outer_inner_class_use () {
		InnerClass ic = new InnerClass();// 그냥 Inner클래스 객체 만들면 됌!!!
		ic.inner_member_field = 31232;
		ic.inner_member_method();
		System.out.println(ic);
		System.out.println(ic.inner_member_field);
	}
	
	
	/*
	 * 인스턴스 멤버클래스(nested class, inner class)
	 * --작성이유: 내부클래스에서 외부클래스의 멤버접근을 손쉽게 하기 위해서 작성!!!
	 *              내부 클래스를 사용하지 않으면 참조 변수를 다시 호출해야 해서 불편합니다.
	 */
	public class InnerClass { // 내부클래스의 시작
		
		public int inner_member_field = 3; // 내부클래스의 멤버필드
		
		public void inner_member_method() {//내부클래스의 멤버메소드
			System.out.println("InnerClass.inner_member_method()");
		}
		/***********************내부클래스에서 외부클래스의 멤버접근************************/
		public void inner_outer_member_access() {
//			System.out.println(InnerClass.this.inner_member_field);//내부 클래스의 인스턴스의 멤버필드를 가리키는 키워드
//			System.out.println(OuterClass.this.outer_member_field);//외부 클래스의 인스턴스의 멤버필드를 가리키는 키워드
			
//			System.out.println(OuterClass.this.outer_member_field);  맞긴한데 이렇게 안씀
//			OuterClass.this.outer_member_method();                   맞긴한데 위랑 똑같음
			
			System.out.println(outer_member_field);
			outer_member_method(); // inner클래스부터 확인하고 그다음 outer클래스를 확인하고 없으면 에러남
			//한마디로 알아서 찾는다고~~
		}
	}
	
	
	
	
	
}//외부클래스 끝
