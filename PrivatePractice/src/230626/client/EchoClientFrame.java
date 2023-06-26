package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EchoClientFrame extends JFrame {

	private JPanel contentPane;
		//JPanel은  그래픽 사용자 인터페이스(GUI)를 구성하는 데 사용됩니다
	private JTextField echoTF;
		/*  JTextField는 Swing 프레임워크의 텍스트 필드 컴포넌트입니다.
		 	사용자로부터 텍스트 입력을 받기 위해 사용됩니다. */
	private JScrollPane scrollPane;
		//JScrollPane은 Swing 프레임워크의 스크롤 패널 컴포넌트입니다. 
		//컨텐츠가 JScrollPane의 크기보다 크면 스크롤바를 사용하여 컨텐츠를 볼 수 있습니다.
	private JTextArea displayTA;
		//JTextArea는 Swing 프레임워크의 텍스트 영역 컴포넌트입니다. 
		//여러 줄의 텍스트를 표시하고 편집할 수 있습니다
		//텍스트 영역의 너비와 높이를 지정하거나, 텍스트 영역의 배경색과 글꼴을 지정할 수 있습니다
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//Runnable 인터페이스를 구현하는 익명 클래스
			//invokeLater() 메서드는 이벤트 디스패치 스레드에서 실행할 작업을 예약합니다.
				//이벤트 디스패치 스레드:사용자 인터페이스 이벤트를 처리하는 스레드		
			//invokeLater()의 인자로는 Runnable 타입의 객체가 들어감
	
			public void run() {
				try {
					EchoClientFrame frame = new EchoClientFrame(); // 밑에 있는 생성자임
					frame.setVisible(true);
						/*DayTimeClientFrame 개체의 가시성을 설정하는 메소드입니다. 
						  이 메소드의 인수는 boolean 값이며,
						  true이면 개체가 보이고, false이면 개체가 보이지 않습니다.*/
					frame.echoTF.requestFocus();
						//ecoTF는 JTextField타입이다.(사용자로부터 텍스트 입력을 받기 위해 사용됌)
						//requestFocus()는 해당 텍스트 필드에 포커스를 맞추는 메서드입니다
				} catch (Exception e) {
					e.printStackTrace();
						//printStackTrace()는 예외가 발생한 위치와 예외의 메시지를 콘솔에 출력하는 메서드
				}
			}// run재정의메소드의 끝~~
		});// Runnable 인터페이스를 구현하는 익명 클래스의 끝~~
	}//메인 메서드의 끝

	/**
	 * Create the frame.
	 */
	public EchoClientFrame() {//생성자임~~~
		setTitle("EchoClientFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 332);
		contentPane = new JPanel();
			////JPanel은  그래픽 사용자 인터페이스(GUI)를 구성하는 데 사용됌
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		echoTF = new JTextField(); 
			//JTextField타입인 echoTF를 초기화함(위에서는 생성만 됌)
		
		echoTF.addActionListener(new ActionListener() { // 익명객체 생성(한번만 사용하려고)				
				//ActionListener 인터페이스는 이벤트 리스너를 구현하는 데 사용됩니다
			
			public void actionPerformed(ActionEvent e) { //익명객체의 메소드
				// ActionEvent: 이벤트를 나타내는 클래스
				/**************************************/
				try {
					String echoStr = echoTF.getText();
						//echoTF는 JTextField타입
						//getText()는  텍스트 필드에 입력된 텍스트를 가져오는 메서드
					if(echoStr.equals("")) {
						echoTF.requestFocus();
							//requestFocus()는 해당 텍스트 필드에 포커스를 맞추는 메서드입니다
						return;
					}
					echoTF.setText("");
						// JTextField의 setText메서드는 텍스트 필드에 텍스트를 설정하는 메서드
					echoTF.requestFocus();
					
					/*
					 * 1.Socket생성
					 */
					Socket socket=new Socket("192.168.15.21",9999);
					/*
					 * 2.서버로문자데이타쓰기
					 * 		- OutputStream 얻기
					 * 		- OutputStream(byte) --> Writer(char)로 변경(OutputStreamWriter)
					 */
					OutputStream out = socket.getOutputStream();
						//getOutputStream()는 Socket 객체의 출력 스트림을 가져오는 메서드
						//출력 스트림은 데이터를 서버로 전송하는 데 사용된다.
					OutputStreamWriter osw=new OutputStreamWriter(out);
						// OutputStreamWriter(): 바이트 출력 스트림을 문자 출력 스트림으로 변환하는 데 사용되는 생성자
						/*들어갈 수 있는 인자
						  
						  바이트 출력 스트림: 변환할 바이트 출력 스트림
						  문자 인코딩: 변환할 문자 인코딩 
						  
						  따라서 바이트출력 스트림인 OutputStream타입도 들어갈 수 있다.
						  */
					PrintWriter pw=new PrintWriter(osw);
						// PrintWriter 클래스가 OutputStreamWriter(자식임) 클래스를 상속한다.
						/* PrintWriter 클래스는 문자 출력 스트림을 제공하는 클래스이고, 
							OutputStreamWriter 클래스는 바이트 출력 스트림을 문자 출력 스트림으로 변환하는 클래스입니다.*/
					
					pw.println(echoStr);
						//PrintWriter 객체의 println() 메서드는 String 타입 인자를 받아서 출력합니다.
					pw.flush();
						// 출력 스트림에 남아 있는 모든 데이터를 버퍼에 저장하고 출력 스트림에 전송
					
					/*
					 * 3.서버에서 전송되는 데이타 읽기
					 * 		- InputStream 얻기
					 * 
					 * 		- InputStream(byte) --> Reader(char)로 변경
					 */
					
					BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//Socket타입인 getInputStream()은 소켓의 입력 스트림을 반환
						//InputStreamReader() 메서드는 바이트 입력 스트림을 문자 입력 스트림으로 변환
							//인자로 InputStream들어감(바이트 입력 스트림)
						//BUfferedReader()생성자에 들어가는 인자 타입은 Reader타입
							//바이트 입력 스트림
					String serverEchoStr = br.readLine();
						//readLine()은 입력 스트림에서 한 줄의 문자열을 읽는 메소드
					displayTA.append(serverEchoStr+"\n");
						// append()는 JTextArea에 문자열을 추가하는 메서드
					
					socket.close();
					
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				/*************************************/
			}
		});//익명객체의 끝,  이제부터는 클래스의 생성자 안
		
		echoTF.setFont(new Font("D2Coding", Font.BOLD, 18));
		
		contentPane.add(echoTF, BorderLayout.SOUTH);
		echoTF.setColumns(10);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		displayTA = new JTextArea();
		displayTA.setFont(new Font("D2Coding", Font.BOLD, 17));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);
		echoTF.requestFocus();
		
		
		
	} //EchoClientFrame클래스의 생성자 끝
	
	

} //EchoClientFrame클래스의 끝












