package swing_study02.component.JLabelJButton;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private JToggleButton tglbtn;

	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JButton btn01 = new JButton("call");
		btn01.setIcon(new ImageIcon(path + "button1.gif"));
		btn01.setRolloverIcon(new ImageIcon(path + "button2.gif"));
		btn01.setPressedIcon(new ImageIcon(path + "button3.gif"));
		pLeft.add(btn01);
		
		tglbtn = new JToggleButton("TOGGLE");
		tglbtn.addActionListener(this);
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(null, "\uC218\uD3C9\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btn02 = new MyButton();
		btn02.setText("LEFT");
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		pTop.add(btn02);
		
		JButton btn03 = new MyButton();
		btn03.setText("CENTER");
		pTop.add(btn03);
		
		JButton btn04 = new MyButton();
		btn04.setText("RIGHT");
		btn04.setHorizontalAlignment(SwingConstants.TRAILING);
		pTop.add(btn04);
		
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder(null, "\uC218\uC9C1\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btn05 = new MyButton();
		btn05.setText("TOP");
		btn05.setVerticalAlignment(SwingConstants.TOP);
		pBottom.add(btn05);
		
		JButton btn06 = new MyButton();
		btn06.setText("CENTER");
		pBottom.add(btn06);
		
		JButton btn07 = new MyButton();
		btn07.setText("BOTTOM");
		btn07.setVerticalAlignment(SwingConstants.BOTTOM);
		pBottom.add(btn07);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn) {
			actionPerformedTglbtn(e);
		}
	}
	protected void actionPerformedTglbtn(ActionEvent e) {
		if(tglbtn.isSelected()) {
			tglbtn.setText("눌렀당");
		}else {
			tglbtn.setText("눌러봐");
		}
	}
}
