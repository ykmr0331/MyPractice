package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChildJFrameWB extends JFrame {

	private JPanel contentPane;
	private JButton okBtn;
	private JButton cancelBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		ChildJFrameWB frame = new ChildJFrameWB();
		frame.setVisible(true);
		
	}

	
	public ChildJFrameWB() {
		setTitle("나의첫번째W프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		okBtn = new JButton("확인");
		okBtn.setBounds(63, 122, 97, 23);
		contentPane.add(okBtn);
		
		cancelBtn = new JButton("취소");
		cancelBtn.setBounds(256, 122, 97, 23);
		contentPane.add(cancelBtn);
	}
}