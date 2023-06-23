package event;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton bplus;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton bminus;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bmultiple;
	private JButton b0;
	private JButton bresult;
	private JButton bclear;
	private JButton bdivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setResizable(false);// 창 크기 고정 ////etResizable() 메서드는 컴포넌트가 크기를 조정할 수 있는지 여부를 설정하는 메서드입니다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame 컴포넌트의 닫기 버튼의 동작을 설정하는 메서드입니다. 
														//JFrame.EXIT_ON_CLOSE: 닫기 버튼을 클릭하면 JFrame 컴포넌트와 JVM(Java Virtual Machine)이 모두 종료됩니다.
		setBounds(100, 100, 291, 355);
		contentPane = new JPanel();// 콘텐츠 패널 생성
		contentPane.setBackground(new Color(210, 30, 116)); // 배경색 설정
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 배경색 설정

		setContentPane(contentPane); // 배경색 설정
		contentPane.setLayout(new GridLayout(0, 4, 3, 3)); // 그리드 레이아웃으로 배치

		// 버튼 생성 및 이벤트 리스너 등록
		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b1.getText()); // 버튼의 텍스트를 프레임의 제목으로 설정
			}
		});

		contentPane.add(b1);//JPanel 컴포넌트에 컴포넌트를 추가하는 메서드입니다.

		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b2.getText());
			}
		});

		contentPane.add(b2);

		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("3");
			}
		});

		contentPane.add(b3);

		bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("+");
			}
		});

		contentPane.add(bplus);

		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("4");
			}
		});

		contentPane.add(b4);

		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("5");
			}
		});

		contentPane.add(b5);

		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("6");
			}
		});

		contentPane.add(b6);

		bminus = new JButton("-");
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("-");
			}
		});

		contentPane.add(bminus);

		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("7");
			}
		});

		contentPane.add(b7);

		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("8");
			}
		});

		contentPane.add(b8);

		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("9");
			}
		});

		contentPane.add(b9);

		bmultiple = new JButton("x");
		bmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("x");
			}
		});

		contentPane.add(bmultiple);

		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("0");
			}
		});

		contentPane.add(b0);

		bresult = new JButton("=");
		bresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("=");
			}
		});

		contentPane.add(bresult);

		bclear = new JButton("c");
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("c");
			}
		});

		contentPane.add(bclear);

		bdivide = new JButton("/");
		bdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("/");
			}
		});

		contentPane.add(bdivide);
	}

}