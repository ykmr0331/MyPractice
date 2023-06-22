package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */
public class ChildJFrame extends JFrame {
	/*
	 * 컴포넌트를 멤버필드로선언
	 */
	private JPanel contentPane;
	private JButton okBtn;
	private JButton cancleBtn;
	
	public ChildJFrame() {
		
		contentPane=new JPanel();
		contentPane.setBackground(Color.BLUE);
		this.setContentPane(contentPane);
		
		/*
		 * 컴포넌트 멤버필드객체생성
		 */
		okBtn=new JButton("확인");
		cancleBtn=new JButton("취소");
		
		/*
		 * contentPane배치관리자 제거
		 */
		contentPane.setLayout(null);
		/*
		 * 컨테이너에 컴포넌트를 부친다.
		 */
		okBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("나의첫번째프레임");
		this.setSize(300, 400);
	}
	
	
	public static void main(String[] args) {
		ChildJFrame childJFrame=new ChildJFrame();
		childJFrame.setVisible(true);
		/*
		 * Container.setVisible(true);
		 *   - 메인쓰레드가 호출하면 JVM GUI쓰레드(이벤트쓰레드)를생성
		 *   - GUI쓰레드는 무한대기 하면서 이벤트와 그래픽처리담당
		 *   - Container(JFrame)는 계속떠있다.(JVM이 종료되지않는다.)
		 * 
		 */
	}

}