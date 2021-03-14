package swing_study02;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import swing_study02.Layout.LayoutFrameEx;
import swing_study02.Layout.layoutGudun;
import swing_study02.component.FrameComponentEx;
import swing_study02.component.JCheckRadio.Fruite;
import swing_study02.component.JCheckRadio.JCheckBoxCustomEx;
import swing_study02.component.JCheckRadio.JCheckEx;
import swing_study02.component.JCheckRadio.JRadioButtonEx;
import swing_study02.component.JLabelJButton.JButtonEx;
import swing_study02.component.JLabelJButton.JLabelEx;
import swing_study02.frame.JPanelEx;
import swing_study02.frame.contentPaneEx;

public class SwingMain02 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btn03;
	private JButton btn04;
	private JButton btn05;
	private JButton btn06;
	private JButton btn07;
	private JPanel panel;
	private JButton btn08;
	private JButton btn09;
	private JPanel pCheckRadio;
	private JButton btnCheck;
	private JButton btnRadio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain02 frame = new SwingMain02();
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
	public SwingMain02() {
		initialize();
	}
	private void initialize() {
		setTitle("스윙스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));
		
		btn01 = new JButton("Jframe 예");
		btn01.addActionListener(this);
		contentPane.add(btn01);
		
		btn02 = new JButton("Jpanel 예");
		btn02.addActionListener(this);
		contentPane.add(btn02);
		
		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "레이아웃", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 10));
		
		btn03 = new JButton("플로우 레이아웃");
		btn03.addActionListener(this);
		pLayout.add(btn03);
		
		btn04 = new JButton("보더 레이아웃");
		btn04.addActionListener(this);
		pLayout.add(btn04);
		
		btn05 = new JButton("그리드 레이아웃");
		btn05.addActionListener(this);
		pLayout.add(btn05);
		
		btn06 = new JButton("앱솔루트 레이아웃");
		btn06.addActionListener(this);
		pLayout.add(btn06);
		
		btn07 = new JButton("JComponent");
		btn07.addActionListener(this);
		contentPane.add(btn07);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Jlabel & JButton", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn08 = new JButton("JLabel");
		btn08.addActionListener(this);
		panel.add(btn08);
		
		btn09 = new JButton("JButton");
		btn09.addActionListener(this);
		panel.add(btn09);
		
		pCheckRadio = new JPanel();
		pCheckRadio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uCCB4\uD06C\uBC15\uC2A4, \uB77C\uB514\uC624\uBC84\uD2BC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pCheckRadio);
		pCheckRadio.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnCheck = new JButton("JCheckBox");
		btnCheck.addActionListener(this);
		pCheckRadio.add(btnCheck);
		
		btnRadio = new JButton("JRadioButton");
		btnRadio.addActionListener(this);
		pCheckRadio.add(btnRadio);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRadio) {
			actionPerformedBtnRadio(arg0);
		}
		if (arg0.getSource() == btnCheck) {
			actionPerformedBtnCheck(arg0);
		}
		if (arg0.getSource() == btn09) {
			actionPerformedBtn09(arg0);
		}
		if (arg0.getSource() == btn08) {
			actionPerformedBtn08(arg0);
		}
		if (arg0.getSource() == btn07) {
			actionPerformedBtn07(arg0);
		}
		if (arg0.getSource() == btn06) {
			actionPerformedBtn06(arg0);
		}
		if (arg0.getSource() == btn05) {
			actionPerformedBtn05(arg0);
		}
		if (arg0.getSource() == btn04) {
			actionPerformedBtn04(arg0);
		}
		if (arg0.getSource() == btn03) {
			actionPerformedBtn03(arg0);
		}
		if (arg0.getSource() == btn02) {
			actionPerformedBtn02(arg0);
		}
		if (arg0.getSource() == btn01) {
			actionPerformedBtn01(arg0);
		}
	}
	//Jframe 예 버튼
	protected void actionPerformedBtn01(ActionEvent arg0) {
		contentPaneEx frame = new contentPaneEx();
		frame.setVisible(true);
	}
	//Jpanel 예 버튼
	protected void actionPerformedBtn02(ActionEvent arg0) {
		JPanelEx frame = new JPanelEx();
		frame.setVisible(true);
	}
	//플로우 레이아웃 버튼
	protected void actionPerformedBtn03(ActionEvent arg0) {
		LayoutFrameEx frame = new LayoutFrameEx(layoutGudun.FLOW);
		frame.setVisible(true);
	}
	//보더 레이아웃 버튼
	protected void actionPerformedBtn04(ActionEvent arg0) {
		LayoutFrameEx frame = new LayoutFrameEx(layoutGudun.BORDER);
		frame.setVisible(true);
	}
	//그리드 레이아웃 버튼
	protected void actionPerformedBtn05(ActionEvent arg0) {
		LayoutFrameEx frame = new LayoutFrameEx(layoutGudun.GRID);
		frame.setVisible(true);
	}
	//앱솔루트 레이아웃 버튼
	protected void actionPerformedBtn06(ActionEvent arg0) {
		LayoutFrameEx frame = new LayoutFrameEx(layoutGudun.ABSOLUTE);
		frame.setVisible(true);
	}
	//JComponent 버튼
	protected void actionPerformedBtn07(ActionEvent arg0) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	//JLabel 버튼
	protected void actionPerformedBtn08(ActionEvent arg0) {
		JLabelEx frame = new JLabelEx();
		frame.setVisible(true);
	}
	//JButton버튼
	protected void actionPerformedBtn09(ActionEvent arg0) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}
	//JCheck버튼
	protected void actionPerformedBtnCheck(ActionEvent arg0) {
		JCheckEx frame = new JCheckEx();
		frame.setVisible(true);
		
		ArrayList<Fruite> list = new ArrayList<>();
		list.add(new Fruite("사과", 100));
		list.add(new Fruite("배", 500));
		list.add(new Fruite("체리", 1000));
		list.add(new Fruite("귤", 50));
		list.add(new Fruite("아보카도", 2000));
		
		JCheckBoxCustomEx frame1 = new JCheckBoxCustomEx(list);
		frame1.setVisible(true);
	}
	//JRadio버튼
	protected void actionPerformedBtnRadio(ActionEvent arg0) {
		JRadioButtonEx frame = new JRadioButtonEx();
		frame.setVisible(true);
	}
}
