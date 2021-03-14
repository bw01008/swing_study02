package swing_study02.component.JCheckRadio;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class JRadioButtonEx extends JFrame {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = {new ImageIcon(path + "apple.jpg"), new ImageIcon(path + "Pear.jpg"), new ImageIcon(path + "Cherry.jpg")};

	public JRadioButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("라디오버튼 응용예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "간단한 라디오 버튼", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		
		JPanel pRadio = new JPanel();
		pLeft.add(pRadio);
		
		JRadioButton radioButton = new JRadioButton("사과");
		pRadio.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("배");
		pRadio.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("체리");
		pRadio.add(radioButton_2);
		
		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "응용예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		pRight.add(panel, BorderLayout.NORTH);
		
		JLabel lblImg = new JLabel("New label");
		pRight.add(lblImg, BorderLayout.CENTER);
		
		
	}

}
