package swing_study02.component.JCheckRadio;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JCheckBoxCustomEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private ArrayList<Fruite> list;
	private int sum;
	private JLabel lblResult;
	private JLabel lblTitle_1;

	public JCheckBoxCustomEx(ArrayList<Fruite> list) {
		this.list = list;
		initialize();
	}

	private void initialize() {
		setTitle("실전체크박스");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);

		lblTitle_1 = new JLabel("");
		pNorth.add(lblTitle_1);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);

		lblResult = new JLabel("New label");
		pSouth.add(lblResult);

		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);

		String title = "";
		for (Fruite f : list) {
			title += f.toString() + " ";
			JCheckBox ck = new JCheckBox(f.getName());
			pCenter.add(ck);
			ck.addItemListener(this);
		}
		lblTitle_1.setText(title);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox) e.getSource();
		Fruite selectedFruit = list.get(list.indexOf(new Fruite(cb.getText())));
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += selectedFruit.getPrice();
		} else {
			sum += selectedFruit.getPrice();
		}
		lblResult.setText(sum + "");

	}

}
