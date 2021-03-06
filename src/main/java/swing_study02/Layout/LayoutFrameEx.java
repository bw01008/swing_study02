package swing_study02.Layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class LayoutFrameEx extends JFrame {

	private JPanel contentPane;
	private layoutGudun gubun;

	public LayoutFrameEx(layoutGudun gubun) {
		this.gubun = gubun;
		initialize();
	}
	private void initialize() {
		setTitle("레이아웃");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pSwitch = null;
		switch(gubun) {
		case FLOW:
			pSwitch = new PanelFlow();
			setTitle("플로우 레이아웃");
			break;
		case BORDER:
			pSwitch = new PanelBorder();
			setTitle("보더 레이아웃");
			break;
		case GRID:
			pSwitch = new PanelGrid();
			setTitle("그리드 레이아웃");
			break;
		case ABSOLUTE:
			pSwitch = new PanelAbsolute();
			setTitle("앱솔루트 레이아웃");
			break;
		}
		contentPane.add(pSwitch);
	}

}
