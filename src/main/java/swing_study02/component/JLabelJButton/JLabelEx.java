package swing_study02.component.JLabelJButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class JLabelEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private JLabel lblNorth;
	private JLabel lblCenter;
	private JLabel lblSouthMsg;
	private JLabel lblSouthPhone;


	public JLabelEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("JLabel");
		setBounds(100, 100, 470, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblNorth = new JLabel("LOST CAT");
		lblNorth.addMouseListener(this);
		lblNorth.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.PINK);
		lblNorth.setForeground(Color.WHITE);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNorth, BorderLayout.NORTH);
		
		lblCenter = new JLabel("");
		lblCenter.setIcon(new ImageIcon("C:\\workspace_java\\swing_study02\\images\\고양이.jpg"));
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCenter, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblSouthMsg = new JLabel("고양이를 찾으시는 분은 아래 연락처로 연락부탁드립니다.");
		lblSouthMsg.setFont(new Font("굴림체", Font.BOLD, 15));
		lblSouthMsg.setOpaque(true);
		lblSouthMsg.setBackground(Color.PINK);
		lblSouthMsg.setForeground(Color.WHITE);
		lblSouthMsg.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSouthMsg);
		
		lblSouthPhone = new JLabel("010 - 7773 - 1663");
		lblSouthPhone.setFont(new Font("굴림", Font.BOLD, 16));
		lblSouthPhone.setOpaque(true);
		lblSouthPhone.setBackground(Color.PINK);
		lblSouthPhone.setForeground(Color.WHITE);
		lblSouthPhone.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSouthPhone);
	}


	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblNorth) {
			mouseClickedLblNorth(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNorth(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path + "button1.gif"));
		lblSouthPhone.setText("사례금 1000만원 드리겠습니다.");
		JOptionPane.showMessageDialog(null, "많은 연락부탁드립니다!!");
	}
}
