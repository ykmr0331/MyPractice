import java.io.IOException;
import java.net.Socket;

public class _Second {
	public void method2() throws NullPointerException, IOException{
		//해당 메소드가 실행 중에 NullPointerException이 발생할 수 있음을 나타냅니다.
		
		System.out.println("\t Second.method2()실행");
		/***********case1(RuntimeException)***********
		 * 1.JVM 예외상황을 감지하고 예외객체(NullPointerException)생성
		 * 2.JVM은 생성한예외객체를 반환방향으로 던진다.(throw)
		 * 3.실행중인쓰레드는 실행을멈추고 호출한곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진예외객체의 메세지를 출력한후 쓰레드종료(shut down)
		 */
		
		
		/*
		
		String str = null;
		int length = str.length(); 
		변수 str이 null로 초기화되었습니다.
		str.length()를 호출하면서 null 객체에 대해 메서드를 호출하려고 시도합니다.
		이는 NullPointerException(널 포인터 예외)를 발생시킵니다.
		
		System.out.println(length);
		*/
		
		
		
		/***********case2(RuntimeException)***********
		 * 1.내가예외객체생성
		 * 2.내가 예외객체를 던진다.!!!!!!!!!!!!!!!!!!
		 * 3.실행중인쓰레드는 실행을멈추고 호출한곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진예외객체의 메세지를 출력한후 쓰레드종료(shut down)
		 */ 
		
		/*   내가 던지는거임~~~~~~~~~
		boolean isExceptionRaised = true;
		if(isExceptionRaised) {
			NullPointerException exception = new NullPointerException("내가 생성한 예외객체");
			throw exception;// 메인메서드에서 실행하다가 method2()를 호출할 때 예외가 발생하면 이거 던짐
		}*/
		
		
		/***********case2(비RuntimeException)***********/
		
		Socket socket = new Socket("www.naver.com", 8000);
		//Socket안에서 수십개의 메소드를 호출함 
		//ConnectException발생함, 네트워크연결시 발생하는 Exception?
		System.out.println(socket);
		
		
		System.out.println("\t\t Second.method2()반환");
		return;
	
		
		
	}
}
