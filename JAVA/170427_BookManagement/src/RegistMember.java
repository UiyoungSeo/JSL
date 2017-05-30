import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RegistMember extends BFrame implements ActionListener {
	JPanel titlePanel = new JPanel();
	JLabel lbl = new JLabel("회원 등록");
	JLabel lbl1 = new JLabel("이름");
	JLabel lbl2 = new JLabel("전화번호");

	JPanel inputPanel = new JPanel();
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);

	JPanel btnPanel = new JPanel();
	JButton btnConfirm = new JButton("확인");
	JButton btnCancel = new JButton("취소");
	DBMgr mgr = new DBMgr();
	ArrayList<MemberBean> list;

	public RegistMember() {
		setTitle("회원 등록");
		init();
	}

	private void init() {
		Container container = this.getContentPane();
		titlePanel.setBackground(Color.DARK_GRAY);
		lbl.setForeground(Color.WHITE);
		titlePanel.add(lbl);
		
		inputPanel.setLayout(new GridLayout(6, 1));
		inputPanel.add(lbl1);
		inputPanel.add(tf1);
		inputPanel.add(lbl2);
		inputPanel.add(tf2);
		
		btnConfirm.addActionListener(this);
		btnCancel.addActionListener(this);
		btnPanel.add(btnConfirm);
		btnPanel.add(btnCancel);
		
		add(titlePanel, BorderLayout.PAGE_START);
		add(inputPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.PAGE_END);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("확인")){
			String name = tf1.getText();
			String phone = tf2.getText();
			mgr.insertMember(name, phone);
			dispose();
		} else if(e.getActionCommand().equals("취소")){
			dispose();
		}
	}
}
