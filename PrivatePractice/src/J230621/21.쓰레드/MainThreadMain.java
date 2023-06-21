
public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("main thread start");

		/*
		 *현재 코드를 실행시키는 메인쓰레드의 쓰레드객체객체참조엳기	 
		 */
		Thread mainThread = Thread.currentThread(); //이 메서드는 현재 실행 중인 스레드를 반환합니다.
		System.out.println("main thread name: " + mainThread.getName());
		MainThreadCalled mainThreadCalled = new MainThreadCalled();
		mainThreadCalled.main_thread_called_method1();
		mainThreadCalled.main_thread_called_method2();
		
		System.out.println("main thread end return");
		return;
	}

}
