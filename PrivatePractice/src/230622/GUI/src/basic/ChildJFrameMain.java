package basic;

/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */
public class ChildJFrameMain {

	public static void main(String[] args) {
		
		/*
		 *   1.  컨테이너클래스(JFrame)객체생성
		 */
		//ChildJFrame childFrame= new ChildJFrame();
		/*
		 *  2.  컨테이너(JFrame)객체의 크기설정
		 */
		//childFrame.setSize(300,400);
		/*
		 *   3.  컨테이너(JFrame)객체 보여주기
		 */
		//childFrame.setVisible(true);
		/*
		 * Container.setVisible(true);
		 *   - 메인쓰레드가 호출하면 JVM GUI쓰레드(이벤트쓰레드)를생성
		 *   - GUI쓰레드는 무한대기 하면서 이벤트와 그래픽처리담당
		 *   - Container(JFrame)는 계속떠있다.(JVM이 종료되지않는다.)
		 * 
		 */
		//System.out.println("main thread end jvm return");
		
		return;
		
	}

}