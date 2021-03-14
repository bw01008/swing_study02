package swing_study02.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class contentPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton sameBtn;
	private JButton btn01;
	private JButton btn02;
	private JButton btn03;
	private JButton btn04;

	public contentPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("테스트");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		btn01 = createButton();
		contentPane.add(btn01);
		
		btn02 = createButton();
		contentPane.add(btn02);
		
		btn03 = createButton();
		contentPane.add(btn03);
		
		btn04 = createButton();
		contentPane.add(btn04);
	}

	private JButton createButton() {
		JButton btn = sameBtn = new JButton("귀여운버튼");
		sameBtn.addActionListener(this);
		sameBtn.setForeground(Color.MAGENTA);
		sameBtn.setFont(new Font("휴먼편지체", Font.BOLD, 15));
		return sameBtn;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "귀여운버튼!!!");
	}
}
