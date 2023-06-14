import java.io.IOException;

public class _First {
	private _Second second;
	
	public _First() {
		second = new _Second();
	}
	
	public void method1() throws NullPointerException,IOException {
		//해당 메소드가 실행 중에 NullPointerException이 발생할 수 있음을 나타냅니다.
		System.out.println("\t first.method1()실행");
		second.method2();
		System.out.println("\t first.method1()반환");
		return;
	}
}
