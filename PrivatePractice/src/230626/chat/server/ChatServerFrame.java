package chat.server;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChatServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField noticeTF;
	private JTextArea displayTA;
	/******접속된클라이어트객체(Socket)를 보관할서비스객체****/
	private ServerClientService clientService;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChatServerFrame frame = new ChatServerFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChatServerFrame() {
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(45);

		JButton noticeB = new JButton("공지");
		noticeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 연결된모든클라이언트에게 공지사항전송
				 */
				String noticeStr=noticeTF.getText();
				if(noticeStr.equals("")) {
					noticeTF.requestFocus();
					return;
				}
				clientService.sendBroadcasting(noticeStr);
			}
		});
		panel.add(noticeB);
		
		/***** 접속된클라이어트객체를 보관할 ServerClientService객체생성 *****************/
		clientService=new ServerClientService();
		/***** 클라이언트의 소켓연결요청을 처리 ChatServerThread 객체생성 쓰레드start **/
		ChatServerThread chatServerThread=new ChatServerThread();
		chatServerThread.start();
		
	}//생성자

	private void setLog(String log) {
		displayTA.append(log + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/***********************************************
	  특정포트를 열고 클라이언트의 소켓연결요청을 처리해서
	  소켓을생성하는클래스
	 ***********************************************/
	public class ChatServerThread extends Thread {
		@Override
		public void run() {
			try {
				 /*
				  setLog("0.ChatServerThread:8888번포트에 ServerSocket생성");
				  setLog("1.ChatServerThread:클라이어트소켓연결요청대기");
				  setLog("2.ChatServerThread:접속클라이언트:"+socket);
				  setLog("3.ChatServerThread:ClientService 객체에 ServerClientThread객체추가 쓰레드start");
				  */
				setLog("0.ChatServerThread:8888번포트에 ServerSocket생성");
				ServerSocket serverSocket=new ServerSocket(8888);
				while(true) {
					setLog("1.ChatServerThread:클라이어트소켓연결요청대기");
					Socket socket=serverSocket.accept();
					setLog("2.ChatServerThread:접속클라이언트:"+socket);
					ServerClient client=new ServerClient(socket);
					setLog("3.ChatServerThread:ServerClientService 객체에 ServerClient객체추가");
					clientService.addClient(client);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/********************************************
	  서버쪽소켓을 사용하여 클라이언트와 통신을 담당하는 클래스(VO) 
	  - 한명의 클라이언트와통신을 담당하는 클래스 
	  - 클라이언트와연결된 소켓1개를 가지고있는클래스 
	  - 클라이언트의 정보를 가지고있는 클래스
	  - 클라이언트당 1개의객체가생성
	 ********************************************/
	public class ServerClient {
		private Socket socket;//서버쪽소켓
		public ServerClient(Socket socket) {
			this.socket=socket;
		}
	}
	
	/************************************
	 * 서버에연결된 클라이언트객체들을관리(Service)할클래스 
	 * - 클라이언트객체 추가 
	 * - 클라이언트객체 찾기 
	 * - 클라이언트객체 삭제 
	 * - 모든 클라이언트객체에 데이타전송
	 ************************************/
	public class ServerClientService {
		/*
		 * 클라이언트객체 보관리스트
		 */
		private ArrayList<ServerClient> clientList=
				new ArrayList<ServerClient>();
		/*
		 * 클라이트객체추가
		 */

		public void addClient(ServerClient client) {
			clientList.add(client);
			setLog("A.ServerClientService:xxx 님입장");
			setLog("B.ServerClientService:현재접속자수:"+clientList.size()+" 명");
		}
		
		/*
		 * 클라이트객체삭제
		 */
		public void removeClient(ServerClient client) {
			clientList.remove(client);
			setLog("A.ServerClientService:xxx 님퇴장");
			setLog("B.ServerClientService:현재접속자수:"+clientList.size()+" 명");
		}
		
		/*
		 *모든클라이언트에 메세지전송
		 */
		public void sendBroadcasting(String noticeStr) {
			
			
		}
	}
}