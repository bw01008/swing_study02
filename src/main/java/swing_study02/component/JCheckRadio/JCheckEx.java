package swing_study02.component.JCheckRadio;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class JCheckEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxApple;
	private JCheckBox chckbxPear;
	private JCheckBox chckbxCherry;
	private String resStr = "현재 0원입니다.";
	private int sum;
	private JLabel lblResult;

	public JCheckEx() {
		initialize();
	}

	private void initialize() {
		setTitle("체크박스예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "체크박스예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth);
		pNorth.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblTitle = new JLabel("사과 100원 배 500원 체리 1000원");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblTitle);

		JPanel pItem = new JPanel();
		pNorth.add(pItem);

		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		pItem.add(chckbxApple);

		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		pItem.add(chckbxPear);

		chckbxCherry = new JCheckBox("체리");
		chckbxCherry.addItemListener(this);
		pItem.add(chckbxCherry);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth);

		lblResult = new JLabel(resStr);
		pSouth.add(lblResult);
	}

	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == chckbxCherry) {
			itemStateChangedChckbxCherry(arg0);
		}
		if (arg0.getSource() == chckbxPear) {
			itemStateChangedChckbxPear(arg0);
		}
		if (arg0.getSource() == chckbxApple) {
			itemStateChangedChckbxApple(arg0);
		}
		resStr = String.format("현재 %d원 입니다.", sum);
		lblResult.setText(resStr);
	}

	protected void itemStateChangedChckbxApple(ItemEvent arg0) {
		if (arg0.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		} else {
			sum -= 100;
		}
	}

	protected void itemStateChangedChckbxPear(ItemEvent arg0) {
		if (arg0.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		} else {
			sum -= 500;
		}
	}

	protected void itemStateChangedChckbxCherry(ItemEvent arg0) {
		if(arg0.getStateChange()==ItemEvent.SELECTED) {
			sum += 1000;
		}else {
			sum -= 1000;
		}
	}
}
