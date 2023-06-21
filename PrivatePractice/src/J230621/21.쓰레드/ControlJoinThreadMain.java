
public class ControlJoinThreadMain {
	public static void main(String[] args) throws Exception{
		//join() 메서드는 지정된 스레드가 종료될 때까지 현재 스레드를 대기합니다.
		System.out.println("1.main thread start");
		ConCurrentBeepThread bt = new ConCurrentBeepThread();
		ConCurrentPrintThread pt = new ConCurrentPrintThread();
		bt.start();
		/*
		 * bt.join()메소드를 호출한 메인스레드를 bt쓰레드가 종료될 때까지 중지시킨다.
		 */
		
		bt.join();//한마디로 main은 대기중
		System.out.println("2.main thread");
		pt.start();
		pt.join();
		
		System.out.println("3.main thread");
		System.out.println("9.main thread jvm return");
	}
}
