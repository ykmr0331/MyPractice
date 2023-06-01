package J230601_p325_331_Class;
import J230601_p325_331_Class.A;

public class D extends A{
	public D( ) {
		super();
		this.field = "value"; // 책에서는 A클래스와 D클래스는 서로 상속관계인데 다른 패키지에 있다.
		this.method();		//그런데 A클래스의 생성자의 접근제한은 모두 protected이므로 다른 패키지에 있지만 상속관계이므로 사용 가능
	}
}
