package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ActionEventJFrame extends JFrame {

	private JPanel contentPane;
	private JButton northButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventJFrame frame = new ActionEventJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActionEventJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		northButton = new JButton("이벤트쏘스[NORTH]");
		contentPane.add(northButton, BorderLayout.NORTH);
		/****************이벤트쏘스에 이벤트핸들러객체를 등록***********************/
		northButton.addActionListener(
				new NorthButtonActionEventHandler());
		/***************************************************************************/
	}

}