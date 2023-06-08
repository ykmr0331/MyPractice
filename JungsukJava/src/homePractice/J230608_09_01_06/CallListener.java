package J230608_09_01_06;

public class CallListener implements Button.OnClickListener{ 
	// 외부클래스인 Button클래스의 내부인터페이스OnClickListener를 구현한다는 의미다. 
	@Override
	public void onClick() {//원래 내부인터페이스에 있는 메서드임
		//인터페이스를 구현한 this클래스에서 메소드를 재정의하는것이다.
		System.out.println("전화를 겁니다.");//
	}
}
