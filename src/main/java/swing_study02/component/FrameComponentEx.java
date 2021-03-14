package swing_study02.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JButton btn03;

	
	public FrameComponentEx() {
		initialize();
	}
	
	private void initialize() {
		setTitle("공통속성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn01 = new JButton("사라질 버튼");
		btn01.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 30));
		btn01.setForeground(Color.MAGENTA);
		btn01.addActionListener(this);
		contentPane.add(btn01);
		
		btn02 = new JButton("Disabled 버튼");
		btn02.setEnabled(false);
		btn02.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 30));
		btn02.setForeground(Color.RED);
		btn02.addActionListener(this);
		contentPane.add(btn02);
		
		btn03 = new JButton("Disabled조종버튼");
		btn03.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 30));
		btn03.setForeground(Color.PINK);
		btn03.addActionListener(this);
		contentPane.add(btn03);
	}

	public void actionPerformed(ActionEvent arg0) {
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
	protected void actionPerformedBtn01(ActionEvent arg0) {
		if(btn03.isVisible()) {
			btn03.setVisible(false);
		}else {
			btn03.setVisible(true);
		}
		
	}
	
	protected void actionPerformedBtn02(ActionEvent arg0) {
		if(btn01 != null) {
			contentPane.remove(btn01);
			btn01 = null;
			revalidate();
		}else {
			JButton newBtn = new JButton("다시추가된 버튼");
			contentPane.add(newBtn, 0);
			revalidate();
		}
	}
	
	protected void actionPerformedBtn03(ActionEvent arg0) {
		JButton btn = (JButton) arg0.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX() + ", " + btn.getY());
		
		if(btn02.isEnabled()) {
			btn02.setEnabled(false);
		}else {
			btn02.setEnabled(true);
		}
	}
}
