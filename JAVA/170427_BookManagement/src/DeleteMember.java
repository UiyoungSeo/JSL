import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteMember extends BFrame implements ActionListener {
	JPanel titlePanel = new JPanel();
	JLabel lbl = new JLabel("회원삭제");
	JPanel centerPanel = new JPanel();
	JLabel lbl1 = new JLabel("회원번호");
	JTextField tf = new JTextField(10);
	JPanel southPanel = new JPanel();
	JButton btnSearch = new JButton("삭제");
	JButton btnCancel = new JButton("취소");

	DBMgr mgr = new DBMgr();
	ArrayList<MemberBean> list;

	public DeleteMember() {
		Container container = this.getContentPane();
		titlePanel.setBackground(Color.DARK_GRAY);
		lbl.setForeground(Color.WHITE);
		titlePanel.add(lbl);

		centerPanel.add(lbl1);
		centerPanel.add(tf);

		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		southPanel.add(btnSearch);
		southPanel.add(btnCancel);

		container.add(titlePanel, BorderLayout.PAGE_START);
		container.add(centerPanel, BorderLayout.CENTER);
		container.add(southPanel, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("삭제")) {
			String code = tf.getText();
			mgr.deleteMember(code);
			dispose();
		} else if (e.getActionCommand().equals("취소")) {
			tf.setText("");
			dispose();
		}
	}
}
