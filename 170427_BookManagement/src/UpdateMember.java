import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UpdateMember extends BFrame implements ActionListener {
	JPanel pan = new JPanel();
	JLabel lbl = new JLabel("회원번호 : ");
	JTextField tf = new JTextField(10);
	JButton btnSearch = new JButton("검색");

	JPanel centerPanel = new JPanel();
	JLabel lblName = new JLabel("이름");
	JTextField tfName = new JTextField(10);
	JLabel lblPhone = new JLabel("전화번호");
	JTextField tfPhone = new JTextField(10);

	JPanel btnPanel = new JPanel();
	JButton btnModify = new JButton("수정");
	JButton btnCancel = new JButton("돌아가기");

	JTable table;
	JScrollPane scrollPane;

	DBMgr mgr = new DBMgr();
	ArrayList<MemberBean> list;
	
	String code;

	public UpdateMember() {
		setTitle("회원정보 수정 페이지");
		init();
	}

	private void init() {
		Container container = this.getContentPane();
		pan.add(lbl);
		pan.add(tf);
		pan.add(btnSearch);

		centerPanel.setLayout(new GridLayout(6, 1));
		centerPanel.add(lblName);
		centerPanel.add(tfName);
		centerPanel.add(lblPhone);
		centerPanel.add(tfPhone);

		btnPanel.add(btnModify);
		btnPanel.add(btnCancel);
		btnSearch.addActionListener(this);
		btnModify.addActionListener(this);
		btnCancel.addActionListener(this);

		add(pan, BorderLayout.PAGE_START);
		add(centerPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("검색")) {
			code = tf.getText();
			list = mgr.searchMemberByCode(code);

			tfName.setText(list.get(0).getName());
			tfPhone.setText(list.get(0).getPhone());
		} else if (e.getActionCommand().equals("수정")) {
			String name = tfName.getText();
			String phone = tfPhone.getText();
			mgr.updateMember(code, name, phone);
			dispose();
		} else if (e.getActionCommand().equals("돌아가기")) {
			dispose();
		}
	}
}
