package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelJFrame frame = new PanelJFrame();
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
	public PanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.PINK);
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		textField_2 = new JTextField();
		northPanel.add(textField_2);
		textField_2.setColumns(20);
		
		JButton btnNewButton_6 = new JButton("검색");
		northPanel.add(btnNewButton_6);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.CYAN);
		contentPane.add(southPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("회원가입");
		southPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("로그인");
		southPanel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("회원리스트");
		southPanel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("회원삭제");
		southPanel.add(btnNewButton_4);
		
		JList memberJList = new JList();
		memberJList.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "고소미", "김은희", "신명숙", "최경녀", "김봉화", "이소라"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(memberJList, BorderLayout.WEST);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.YELLOW);
		contentPane.add(loginPanel, BorderLayout.CENTER);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(86, 60, 57, 15);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패쓰워드");
		lblNewLabel_1.setBounds(86, 91, 57, 15);
		loginPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(165, 57, 116, 21);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 88, 116, 21);
		loginPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(86, 136, 86, 23);
		loginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBounds(206, 136, 81, 23);
		loginPanel.add(btnNewButton_1);
	}
}