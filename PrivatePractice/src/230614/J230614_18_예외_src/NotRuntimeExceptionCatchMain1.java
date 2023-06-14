import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionCatchMain1 {

	public static void main(String[] args) {
		try {
			System.out.println("stmt1");
			/*
			예외발생예상코드(IOException)
			  1.예외발생시 IOException객체생성 
			    IOException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 IOException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			 
			Socket socket=new Socket("www.daum.net",80);
			System.out.println(socket);
			System.out.println("stmt2");
			/*
			 예외발생예상코드(ClassNotFoundException)
			  1.예외발생시 ClassNotFoundException객체생성 
			    ClassNotFoundException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ClassNotFoundException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			Class.forName("BClass");
			/*
			 * Class.forName() 메소드는 런타임에 동적으로 클래스를 로드하기 위해 사용됩니다.
			 *  지정된 클래스 이름을 가지는 클래스를 찾고 해당 클래스의 Class 객체를 반환합니다
			 */
			
			
			
			/*
			 * 예외발생예상코드(ArithmeticException[RuntimeException])
			   	1.예외발생시 ArithmeticException객체생성 
			    	ArithmeticException객체가 던져짐
			  	2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ArithmeticException객체대입)  
			  	3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			int result=3/0;
			
			System.out.println("stmt3");
		}catch(IOException e) {
			System.err.println("catch IOException msg:"+e.getMessage());
		}catch (ClassNotFoundException e) {
			System.err.println("catch ClassNotFoundException msg:"+e.getMessage());
		}catch (Exception e) {
			System.err.println("catch Exception msg:"+e.getMessage());
		}

	}

}