import java.io.IOException;

public class _FirstSecondExceptionThrowMain {

	public static void main(String[] args) throws NullPointerException, IOException  {
		//해당 메소드가 실행 중에 NullPointerException이 발생할 수 있음을 나타냅니다.
		System.out.println("1.main실행흐름 start");
		_First first = new _First();
		System.out.println("2.main실행흐름 first.method1()호출");
		first.method1();
		System.out.println("3.main실행흐름 first.method1()호출 후 반환");
		System.out.println("4.main실행흐름 JVM반환");
		return;
	}

}
