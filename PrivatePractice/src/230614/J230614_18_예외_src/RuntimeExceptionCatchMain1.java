import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain1 {

	public static void main(String[] args) {
		
		System.out.println("stmt1");
		String str1 = null;
		try { 
			/*
			 * 예외발생예상코드
			 */

			int length = str1.length();
			/*
			 1. 예외상황발생하면  NullPointerException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 던져진 예외객체는 catch block에 선언된 변수에 대입된다.   
			 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			System.out.println("length =" +length);
		} catch(NullPointerException exception) {
			System.out.println("-catch start[NullPointerException]----");
			String msg = exception.getMessage();
			System.out.println("NullPointerException==> msg:" +msg);
			
			str1 = "김경호"; //str1을 try문 밖으로 뺐기 때문에 이게 가능, 안이면 안돼
			int length = str1.length();
			System.out.println("length:"+length);
			System.out.println("-catch end[NullPointerException]----");
		}//try-catch구문의 끝~~
		
		
		
		
		System.out.println("stmt2");
		try {
		int[] intArray = null;
		intArray = new int[3];
		intArray[3] = 9999;
		/*
		 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 던져진 예외객체는 catch block에 선언된 변수에 대입된다.   
		 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
		 */
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("------catch start[ArrayIndexOutOfBoundsException]------");
			System.out.println("ArrayIndexOutOfBoundsException ==> msg: " +e.getMessage());
			/*
			 * getMessage()는 Throwable 클래스의 메소드로, 예외 객체에 저장된 메시지를 반환합니다.
			 *  예외 객체는 예외가 발생할 때 생성되며, 예외에 대한 정보를 포함하고 있는데,
			 *   이 정보 중 하나가 예외 메시지입니다.
			 */
			JOptionPane.showMessageDialog(null, "호갱님 죄송합니다. 프로그램을 종료합니다.");
			/*
			 *  Java Swing 패키지의 JOptionPane 클래스에 포함된 메소드입니다. 
			 *  이 메소드는 다이얼로그 상자를 표시하고 메시지를 사용자에게 보여주는 역할을 합니다.
			 */
			System.exit(0);
			//Java 프로그램을 강제로 종료하는 메소드입니다
			System.out.println("------catch end[ArrayIndexOutOfBoundsException]------");
		}

		
		
		System.out.println("stmt2");
			
	}

}
