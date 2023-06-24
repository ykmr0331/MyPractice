package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JButton requestServerTimeButton;
	private JLabel timeDispayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//invokeLater() 메서드는 이벤트 디스패치 스레드에서 실행할 작업을 예약합니다.
														//  (사용자 인터페이스 이벤트를 처리하는 스레드)
			
			public void run() { //run메서드는 이벤트 디스패치 스레드에서 호출됌     
				try {  
					DayTimeClientFrame frame = new DayTimeClientFrame();//새 DayTimeClientFrame 개체를 생성
					frame.setVisible(true); /*DayTimeClientFrame 개체의 가시성을 설정하는 메소드입니다. 
											이 메소드의 인수는 boolean 값이며,
											true이면 개체가 보이고, false이면 개체가 보이지 않습니다.*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DayTimeClientFrame() { // 클래스의 생성자
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		requestServerTimeButton = new JButton("Request Server Time");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 이 메서드는 버튼이 클릭될 때 호출됩니다.
				/******************************************/
				try {
					/*
					 * 1.Socket생성
					 */
					Socket socket=new Socket("192.168.15.31",8000);/*서버에 연결하는 Socket 개체를 생성합니다.
														     		서버의 IP 주소는 192.168.15.31이고, 포트 번호는 8000입니다.*/
				
					/*
					 * 2.Socket으로부터 InputStream얻기
					 *    - InputStream얻기
					 *    - InputStream[byte stream] 을 Reader[character stream]로 변경하는
					 * 			브릿지스트림(InputStreamReader) 을사용해서 변경
					 */
					InputStream in = socket.getInputStream();//서버에서 입력 스트림을 얻습니다. 입력 스트림은 서버의 응답을 읽는 데 사용됩니다.
					InputStreamReader isr=new InputStreamReader(in);/*코드는 입력 스트림을 문자 스트림으로 변환합니다. 
																	이렇게 하면 서버의 응답을 문자열로 읽을 수 있습니다.*/
					BufferedReader br=new BufferedReader(isr);//입력 스트림을 버퍼링합니다. 입력 스트림에서 데이터를 읽는 효율성을 향상시킴
					String serverTime = br.readLine();// readLine():입력 스트림에서 한 줄의 문자열을 읽는 메소드입니다
					//System.out.println(serverTime);
					timeDispayLabel.setText(serverTime);/*timeDispayLabel 레이블에 serverTime 문자열을 표시합니다.
														serverTime 문자열은 서버의 응답에서 읽은 현재 시간*/
					br.close();
					socket.close();
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				/******************************************/
			}
		});
		contentPane.add(requestServerTimeButton, BorderLayout.SOUTH);
		
		timeDispayLabel = new JLabel("12:00");
		timeDispayLabel.setForeground(Color.BLUE);
		timeDispayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeDispayLabel.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(timeDispayLabel, BorderLayout.CENTER);
	}

}
