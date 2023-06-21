import java.awt.Toolkit;

public class ConCurrentBeepThread extends Thread {

  // 이 클래스는 10번의 비프음을 발생시키는 스레드입니다.

  @Override
  public void run() {
    try {
      // Toolkit 클래스의 getDefaultToolkit() 메서드로 시스템의 기본 Toolkit 객체를 얻습니다.
      Toolkit toolkit = Toolkit.getDefaultToolkit();

      // 0부터 9까지 반복하면서 비프음을 발생시킵니다.
      for (int i = 0; i < 10; i++) {
        // toolkit.beep() 메서드로 비프음을 발생시킵니다.
        toolkit.beep();
        // "beep!" 메시지를 출력합니다.
        System.out.println("beep!");
        // Thread.sleep(1000) 메서드로 1초 동안 일시 중단합니다.
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      // 예외가 발생하면 e.getMessage() 메서드로 예외 메시지를 출력합니다.
      System.out.println(e.getMessage());
    }
    // 스레드의 종료
    return;
  }
}