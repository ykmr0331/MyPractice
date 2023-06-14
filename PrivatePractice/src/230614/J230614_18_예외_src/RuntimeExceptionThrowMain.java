
public class RuntimeExceptionThrowMain {
	/*
	 * 모든 메소드는 throws RuntimeException구문이 생략되어있음.
	 */
	public static void main(String[] args) /*throws RuntimeException */{ 

		System.out.println("stmt1");
		String str = "";
		//String str = null; 
		
		/* 예외발생 예상코드
		 * Exception in thread "main" stmt1 java.lang.NullPointerException at RuntimeExceptionThrowMain.main(RuntimeExceptionThrowMain.java:8)
		 */
		int length = str.length();
		System.out.println(length);
		/*(10주석일경우)!!!!!
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 현재실행흐름은 실행을멈추고 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		 */
		
		System.out.println("stmt2");
		
		int[] intArray = new int[3];
		/*
		 * intArray[3] = 9999;일때
		 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 현재실행흐름은 실행을멈추고 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		 */
		intArray[3] =9999;
		
		System.out.println("stmt3");

		System.out.println("stmt4");

		System.out.println("stmt5");

	}

}
