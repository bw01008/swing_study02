package swing_study02.Layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelBorder extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNewLabel = new JLabel("NORTH");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("SOUTH");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 25));
		add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2 = new JLabel("WEST");
		lblNewLabel_2.setBackground(Color.PINK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 25));
		add(lblNewLabel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_3 = new JLabel("EAST");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.GREEN);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 25));
		add(lblNewLabel_3, BorderLayout.EAST);
		
		JLabel lblNewLabel_4 = new JLabel("CENTER");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.ORANGE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 25));
		add(lblNewLabel_4, BorderLayout.CENTER);
	}

}
