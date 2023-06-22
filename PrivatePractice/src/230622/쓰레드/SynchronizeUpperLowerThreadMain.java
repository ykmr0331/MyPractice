public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		// 공유 객체 생성
		SynchronizeLowerUpperPrintSharedObject sharedObject = new SynchronizeLowerUpperPrintSharedObject();

		// 대문자 출력을 위한 스레드 생성
		SynchronizeUpperThread upperThread1 = new SynchronizeUpperThread(sharedObject);
		SynchronizeUpperThread upperThread2 = new SynchronizeUpperThread(sharedObject);

		// 소문자 출력을 위한 스레드 생성
		// SynchronizeLowerThread lowerThread1 = new SynchronizeLowerThread(sharedObject);
		// SynchronizeLowerThread lowerThread2 = new SynchronizeLowerThread(sharedObject);

		// 대문자 출력 스레드 시작
		upperThread1.start();
		upperThread2.start();

		// 소문자 출력 스레드 시작
		// lowerThread1.start();
		// lowerThread2.start();
	}

}
