import java.net.Socket;

import javax.swing.JOptionPane;



public class NotRuntimeExceptionCatchMain2 {

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
			
		}catch(Exception e) {
			System.err.println("catch IOException msg:"+e.getMessage());
			JOptionPane.showMessageDialog(null, "에로사항 발생: " +e.getMessage());
			/*
			 * getMessage()는 Throwable 클래스의 메소드로, 예외 객체에 저장된 메시지를 반환합니다.
			 *  예외 객체는 예외가 발생할 때 생성되며, 예외에 대한 정보를 포함하고 있는데,
			 *   이 정보 중 하나가 예외 메시지입니다.
			 */
			
			
			
			/*
			 *  Java Swing 패키지의 JOptionPane 클래스에 포함된 메소드입니다. 
			 *  이 메소드는 다이얼로그 상자를 표시하고 메시지를 사용자에게 보여주는 역할을 합니다.
			 */
			
			
			
			
		}

	}

}