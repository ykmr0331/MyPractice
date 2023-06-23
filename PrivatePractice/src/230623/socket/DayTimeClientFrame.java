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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		requestServerTimeButton = new JButton("Request Server Time");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/******************************************/
				try {
					/*
					 * 1.Socket생성
					 */
					Socket socket=new Socket("192.168.15.31",8000);
					/*
					 * 2.Socket으로부터 InputStream얻기
					 *    - InputStream얻기
					 *    - InputStream[byte stream] 을 Reader[character stream]로 변경하는
					 * 			브릿지스트림(InputStreamReader) 을사용해서 변경
					 */
					InputStream in = socket.getInputStream();
					InputStreamReader isr=new InputStreamReader(in);
					BufferedReader br=new BufferedReader(isr);
					String serverTime = br.readLine();
					//System.out.println(serverTime);
					timeDispayLabel.setText(serverTime);
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