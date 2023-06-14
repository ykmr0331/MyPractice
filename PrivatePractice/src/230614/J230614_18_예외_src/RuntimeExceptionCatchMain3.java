import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain3 {

	public static void main(String[] args) {
		try { // try catch문 catch 여러개
			System.out.println("stmt1");
			String str = null;
			int length = str.length();
			/*
			 * 1. 예외상황발생하면 NullPointerException객체생성한후 예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로
			 * 던진다.(throw) 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을 검사해서 타입에 일치하는 catch블록 변수에
			 * 대입된다. 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			System.out.println("length:" + length);

			System.out.println("stmt2");

			int[] intArray = null;
			intArray = new int[3];
			intArray[3] = 9999;
			/*
			 * 1. 예외상황발생하면 ArrayIndexOutOfBoundsException객체생성한후 예외발생 코드를 가지고있는 메쏘드를(메인메쏘드)
			 * 호출한곳으로 던진다.(throw) 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 변수에
			 * 대입된다. 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */

			System.out.println("stmt3");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "고객님 죄송합니다. 빠른시일내에 정상화하겠습니다.");
			e.printStackTrace();
			/*
			 * e.printStackTrace()는 예외(Exception) 객체의 스택 트레이스(StackTrace)를 출력하는 메소드입니다.
				일반적으로 예외가 발생한 곳에서 이 메소드를 호출하면, 해당 예외의 상세한 정보를 콘솔에 출력합니다. 
				스택 트레이스에는 예외가 발생한 메소드의 호출 경로와 예외가 발생한 파일과 라인 번호 등이 포함되어 있습니다.
				 이를 통해 예외가 발생한 원인을 파악할 수 있습니
			 */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}