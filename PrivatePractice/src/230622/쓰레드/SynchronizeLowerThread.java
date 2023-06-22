public class SynchronizeLowerThread extends Thread {// 소문자 출력 쓰레드를 만든다
	
   private SynchronizeLowerUpperPrintSharedObject sharedObject;// 알파벳 출력메소드 객체를 멤버변수로 선언
   
   public SynchronizeLowerThread(SynchronizeLowerUpperPrintSharedObject sharedObject) {
	   				//생성자의 매개변수에 알파벳출력메소드가진 객체 참조변수
   }
   
   @Override
	public void run() { //쓰레드의 run메소드 오버라이딩
	   sharedObject.printLower();//알파벳 출력메소드를 가진 객체의 소문자출력메소드 
	}
   
}

// 이 클래스는 공유 객체를 사용하여 소문자를 출력하는 스레드입니다.
// sharedObject는 공유 객체입니다.
// run() 메서드는 무한 루프를 실행하고 sharedObject.printLower()를 호출합니다.  