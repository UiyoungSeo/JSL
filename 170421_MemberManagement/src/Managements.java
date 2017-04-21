import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Managements extends MemberManagements implements ActionListener {
	MyFrame managementsFrame = new MyFrame();
	JComboBox cb = new JComboBox();
	JButton add = new JButton("회원 추가");
	JButton edit = new JButton("회원 수정");
	JButton delete = new JButton("회원 삭제");
	JButton cancel = new JButton("취소");
	private JLabel select = new JLabel("회원 선택");
	private final JTextArea memberInfo = new JTextArea();

	public Managements() {
		managementsFrame.setTitle("Manage Members");
		managementsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cb.setBounds(12, 39, 183, 21);
		cb.addItem("회원을 선택하세요");
		// for (int i = 0; i < list.size(); i++) {
		// cb.addItem(list.get(i).getCode()+". "+list.get(i).get);
		// }
		edit.setBounds(207, 40, 97, 32);
		delete.setBounds(207, 82, 97, 32);
		cancel.setBounds(207, 166, 97, 32);
		select.setBounds(12, 14, 57, 15);
		memberInfo.setEditable(false);
		memberInfo.setBounds(12, 80, 183, 152);
		add.setBounds(207, 124, 97, 32);

		managementsFrame.getContentPane().add(cb);
		managementsFrame.getContentPane().add(edit);
		managementsFrame.getContentPane().add(delete);
		managementsFrame.getContentPane().add(cancel);
		managementsFrame.getContentPane().add(select);
		managementsFrame.getContentPane().add(memberInfo);
		managementsFrame.getContentPane().add(add);

		add.addActionListener(this);
		edit.addActionListener(this);
		delete.addActionListener(this);
		cancel.addActionListener(this);
		cb.addActionListener(this);

		managementsFrame.setLocation(550, 350);
		managementsFrame.setSize(331, 285);
		managementsFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancel) {
			managementsFrame.dispose();
			super.start();
		}
	}

}
