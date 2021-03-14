package swing_study02.Layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelGrid extends JPanel {
	private JTextField tfStdNo;
	private JTextField tfStdName;
	private JTextField tfSubject;
	private JTextField tfScore;

	/**
	 * Create the panel.
	 */
	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblStdNo = new JLabel("학번");
		lblStdNo.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblStdNo);
		
		tfStdNo = new JTextField();
		add(tfStdNo);
		tfStdNo.setColumns(10);
		
		JLabel lblStdName = new JLabel("이름");
		lblStdName.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblStdName);
		
		tfStdName = new JTextField();
		tfStdName.setColumns(10);
		add(tfStdName);
		
		JLabel lblSubject = new JLabel("과목");
		lblSubject.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblSubject);
		
		tfSubject = new JTextField();
		tfSubject.setColumns(10);
		add(tfSubject);
		
		JLabel lblScore = new JLabel("점수");
		lblScore.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblScore);
		
		tfScore = new JTextField();
		tfScore.setColumns(10);
		add(tfScore);
	}

}
