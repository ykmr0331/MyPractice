public class ControlStopThread1 extends Thread {
	// Thread 클래스를 상속하고 run() 메서드를 재정의합니다.
	@Override
	public void run() {
		// try-catch 블록을 사용하여 예외를 처리합니다.
		try {
			// 0에서 100까지의 i 값에 대해 "downloading...[i%]" 메시지를 인쇄합니다.
			for (int i = 0; i <= 100; i++) {
				System.out.println("downloading...[" + i + "%]");
				// Thread.sleep() 메서드를 호출하여 100 밀리초 동안 대기합니다.
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// 예외를 무시합니다.
		}
		// 현재 스레드의 이름과 "thread가 jvm return thread end" 메시지를 인쇄합니다.
		System.out.println(Thread.currentThread() + "thread가 jvm return thread end");
		// run() 메서드에서 반환합니다.
		return;
	}
} 