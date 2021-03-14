package swing_study02.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study02.panel.Department;
import swing_study02.panel.DeptPanel;

public class JPanelEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnSetDefault;
	private JButton btnAdd;
	private JButton btnRemove;
	private DeptPanel pDept;

	public JPanelEx() {
		initialize();
	}

	private void initialize() {
		setTitle("부서정보");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pDept = new DeptPanel();
		contentPane.add(pDept, BorderLayout.CENTER);

		JPanel pBtns = new JPanel();
		contentPane.add(pBtns, BorderLayout.SOUTH);

		btnSetDefault = new JButton("부서설정");
		btnSetDefault.addActionListener(this);
		pBtns.add(btnSetDefault);

		btnAdd = new JButton("부서 가져오기");
		btnAdd.addActionListener(this);
		pBtns.add(btnAdd);

		btnRemove = new JButton("초기화");
		btnRemove.addActionListener(this);
		pBtns.add(btnRemove);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRemove) {
			actionPerformedBtnRemove(arg0);
		}
		if (arg0.getSource() == btnAdd) {
			actionPerformedBtnAdd(arg0);
		}
		if (arg0.getSource() == btnSetDefault) {
			actionPerformedBtnSetDefault(arg0);
		}
	}
	
	//부서설정
	protected void actionPerformedBtnSetDefault(ActionEvent arg0) {
		Department dept = new Department(77, "비상대책팀", 99);
		pDept.setDepartment(dept);
		
	}
	//부서 가져오기
	protected void actionPerformedBtnAdd(ActionEvent arg0) {
		Department dept = pDept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
		
	}
	//초기화
	protected void actionPerformedBtnRemove(ActionEvent arg0) {
		pDept.tfClear();
	}
}
