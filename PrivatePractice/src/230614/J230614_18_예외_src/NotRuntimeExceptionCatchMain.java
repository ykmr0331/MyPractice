import java.net.Socket;

public class NotRuntimeExceptionCatchMain {

	public static void main(String[] args) throws Exception /* throws UnknownHostException, IOException, ClassNotFoundException*/  {
										// throws Throwable 이라고 써도됌	
		
/*
 * UnknownHostException는 IOException의 하위 클래스로서, 네트워크 관련 작업에서 발생할 수 있는 예외입니다.
 *  주로 네트워크 연결, 웹 요청 등의 작업에서 사용됩니다.
 */
		System.out.println("stmt1");
		/*
		 * 예외발생예상코드(IOException)
		 */
		Socket socket = new Socket("www.daum.net", 80);

		System.out.println("stmt2");
		/*
		 * 예외발생예상코드(ClassNotFoundException)
		 */
		Class.forName("AClass");
		/*
		 * Class.forName() 메소드는 런타임에 동적으로 클래스를 로드하기 위해 사용됩니다.
		 *  지정된 클래스 이름을 가지는 클래스를 찾고 해당 클래스의 Class 객체를 반환합니다
		 */
		
		/*
		 * 예외발생 예상코드(ArithmaticException[RuntimeException])
		 */
		int result =3/0;
		
		System.out.println("stmt3");

	}

}
