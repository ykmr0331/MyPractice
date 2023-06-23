package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChattingJFrame extends JFrame {
	
/*컴포넌트는 자바에서 UI를 구성하는 데 사용되는 객체입니다. 
컴포넌트는 레이아웃, 스타일, 이벤트 처리 등을 통해 UI의 모양과 동작을 제어할 수 있습니다.*/	
	
	private JPanel contentPane; //JPanel 컴포넌트에 컴포넌트를 추가하는 컴포넌트
	JTextField chatTF; 			//자바에서 텍스트를 입력할 수 있는 컴포넌트
	private JButton sendBtn;	// JButton은 자바에서 버튼을 생성하는 데 사용되는 컴포넌트
	private JTextArea chatTA;	//다중행 텍스트를 삽입하고 편집할 수 있는 컴포넌트입니다. 	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			ChattingJFrame frame = new ChattingJFrame();
			frame.setVisible(true);//프레임을 화면에 표시하거나 숨깁니다
			frame.chatTF.requestFocus();//텍스트 필드에 포커스를 설정합니다. 
										//포커스란 사용자가 텍스트를 입력할 수 있는 상태(한마디로 커서 깜빡이)
	}

	/**
	 * Create the frame.
	 */
	public ChattingJFrame() {
		setAlwaysOnTop(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 200, 0));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("랜덤채팅");
		lblNewLabel
				.setIcon(new ImageIcon(ChattingJFrame.class.getResource("")));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendMessage = chatTF.getText();
				if(sendMessage.equals("")) {
					return;
				}
				chatTA.append("경호:"+sendMessage+"\n");
				chatTF.setText("");
				chatTF.requestFocus();
			}
		});

		panel_1.add(chatTF);
		chatTF.setColumns(20);

		sendBtn = new JButton("전송");
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendMessage = chatTF.getText();
				if(sendMessage.equals("")) {
					return;
				}
				chatTA.append("경호:"+sendMessage+"\n");
				chatTF.setText("");
				chatTF.requestFocus();
				
			}
		});
		panel_1.add(sendBtn);

		chatTA = new JTextArea();
		chatTA.setEditable(false);

		chatTA.setText("경호:이따만나\r\n태희:아라써~~~~\n");
		contentPane.add(chatTA, BorderLayout.CENTER);
		
		
		
	}// 생성자

}