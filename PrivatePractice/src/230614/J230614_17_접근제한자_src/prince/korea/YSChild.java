package prince.korea;

import president.korea.YS;// import 자동추가 키 ctrl + shift + o

public class YSChild extends YS{
	public void access2() {
		this.member1 = 1;
		this.member2 = 2;
	// YS클래스의 멤버변수 member2는 protected임. 그래서 YS를 상속받은 YSChild클래스의 멤버변수로 가능
	//한마디로 상속받아서 쓰라고 
//		this.member3 = 3;
//		this.member4 = 4;
		
		this.method1();
		this.method2();
		// YS클래스의 메소드 method2()는 protected임. 그래서 YS를 상속받은 YSChild클래스의 메소드로 가능
				//한마디로 상속받아서 쓰라고

	}
}
