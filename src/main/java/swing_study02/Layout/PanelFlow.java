package swing_study02.Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class PanelFlow extends JPanel {
	
	
	public PanelFlow() {
		initialize();
	}

	
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pNorth = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pNorth.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		pNorth.setBorder(new TitledBorder(null, "align(Leading)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pNorth);
		
		JButton btn01 = new JButton("1");
		pNorth.add(btn01);
		
		JButton btn02 = new JButton("2");
		pNorth.add(btn02);
		
		JPanel pCenter = new JPanel();
		pCenter.setBorder(new TitledBorder(null, "align(Center)", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		add(pCenter);
		
		JButton btn03 = new JButton("3");
		pCenter.add(btn03);
		
		JButton btn04 = new JButton("4");
		pCenter.add(btn04);
		
		JPanel pSouth = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pSouth.getLayout();
		flowLayout_1.setAlignment(FlowLayout.TRAILING);
		pSouth.setBorder(new TitledBorder(null, "align(Trailing)", TitledBorder.TRAILING, TitledBorder.TOP, null, null));
		add(pSouth);
		
		JButton btn05 = new JButton("5");
		pSouth.add(btn05);
		
		JButton btn06 = new JButton("6");
		pSouth.add(btn06);
	}

}
