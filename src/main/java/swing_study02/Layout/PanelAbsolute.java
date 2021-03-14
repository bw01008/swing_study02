package swing_study02.Layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelAbsolute extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("앱솔루뜨~~~~");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel.setBounds(77, 99, 296, 79);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("버튼~~");
		btnNewButton.setBounds(341, 10, 97, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(136, 188, 116, 21);
		add(textField);
		textField.setColumns(10);
	}
}
