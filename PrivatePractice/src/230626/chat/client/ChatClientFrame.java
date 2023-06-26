package chat.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JScrollPane scrollPane;
	private JTextArea displayTA;
	/****** ClientClientThread객체 멤버필드로 선언 ******/
	private ClientClientThread client;
	private JScrollPane westScrollPane;
	private JList chatList;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClientFrame frame = new ChatClientFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public ChatClientFrame() throws Exception {
		setTitle("채팅클라이언트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.SOUTH);

		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************/
				/***********************/
			}
		});
		chatTF.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chatTF);
		chatTF.setColumns(38);

		JButton sendB = new JButton("전송");
		sendB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************/

				/***********************/
			}
		});
		panel.add(sendB);

		westScrollPane = new JScrollPane();

		contentPane.add(westScrollPane, BorderLayout.WEST);

		chatList = new JList();
		chatList.setModel(new AbstractListModel() {
			String[] values = new String[] { "김경호", "김미호", "김웅호" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		westScrollPane.setViewportView(chatList);
		/******** ClientClientThread객체생성 *******/

	}// 생성자

	private void displayMessage(String msg) {
		displayTA.append(msg + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/**************************************************************
	  클라이언트쪽소켓을 사용하여 서버와 통신을 담당하는 클래스(VO) 
	  - 서버와연결된 소켓1개를 가지고있는클래스 
	  - 클라이언트의 정보를가지고있는 클래스 
	  - 클라이언트당 1개의객체가생성
	****************************************************************/
	public class ClientClientThread extends Thread {

		/*
		 * 클라이언트에서 서버로 데이타전송
		 */

		/*
		 * 서버에서 보내는 데이타를 읽기
		 */
		@Override
		public void run() {
			try {
				/*
				 * System.out.println("A.ClientClientThread:서버로부터 오는 데이타를 읽기위해 쓰레드 무한대기");
				 * System.out.println("B.ClientClientThread:서버로부터 읽은 데이타를 클라이언트 채팅창에 보여준다.");
				 */
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}