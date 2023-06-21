
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception{
		//예외처리를 하지 않으면 프로그램이 중단되고 Unhandled exception type InterruptedException 오류가 발생합니다.
		System.out.println("1.main");
		System.out.println("2.main thread를 3초간 실행 중지");
		/*
		 * 현재코드 Thread.sleep(3000);을 실행하는 쓰레드를 3000ms동안 실행 중지
		 */
		Thread.sleep(3000);
		/* sleep()은 자바에서 쓰레드를 지정된 시간 동안 일시 중지하는 메서드입니다. 
		   sleep() 메서드는 밀리초 단위로 지정할 수 있습니다*/
		System.out.println("3. main thread 3초간 sleep후 깨어난 후 실행");
	
		ControlSleepThread cst = new ControlSleepThread();
		cst.setName("clock thread");
		cst.start(); // start는 모든 설정이 끝나고 해야된다??//start() 메서드를 호출하기 전에 run() 메서드를 설정하지 않으면 쓰레드는 실행되지 않습니다.
		System.out.println("9. main thread 3초간 sleep후 깨어난 후 실행");
	}

}
