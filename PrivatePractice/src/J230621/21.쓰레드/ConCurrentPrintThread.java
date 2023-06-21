public class ConCurrentPrintThread extends Thread {

  // 이 클래스는 10번의 "띵!"을 출력하는 스레드입니다.

  @Override
  public void run() {
    try {
      // 0부터 9까지 반복하면서 "띵!"을 출력합니다.
      for (int i = 0; i < 10; i++) {
        System.out.println("띵!");
      }
    } catch (Exception e) {
      // 예외가 발생하면 e.getMessage() 메서드로 예외 메시지를 출력합니다.
      System.out.println(e.getMessage());
    }
    // 스레드의 종료
    return;
  }
}