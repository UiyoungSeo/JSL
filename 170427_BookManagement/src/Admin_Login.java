
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Admin_Login extends BFrame implements ActionListener {
	ImageIcon img = new ImageIcon("admin.jpg");
	JLabel lblImgage = new JLabel(img);
	JPanel cpan = new JPanel();

	JLabel lab = new JLabel("관리자 로그인");
	JPanel pan = new JPanel();

	JLabel lab1 = new JLabel("ID : ");
	JTextField tfID = new JTextField(10);
	JLabel lab2 = new JLabel("PW : ");
	JTextField tfPW = new JTextField(10);

	JPanel pan1 = new JPanel();

	JButton bt = new JButton("login");
	JButton bt1 = new JButton("exit");
	JPanel pan2 = new JPanel();

	DBMgr mgr = new DBMgr();
	ArrayList<AdminBean> list;
	AdminBean bean;

	public Admin_Login() {
		setTitle("Book Management");
		list = mgr.login();
		init();
	}

	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.BLACK);
		lab.setForeground(Color.WHITE);
		pan.add(lab);
		pan1.add(lblImgage);
		bt.addActionListener(this);
		bt1.addActionListener(this);
		pan2.add(lab1);
		pan2.add(tfID);
		pan2.add(lab2);
		pan2.add(tfPW);
		pan2.add(bt);
		pan2.add(bt1);

		con.add("Center", pan1);
		con.add("South", pan2);
		pack();
	}

	public static void main(String[] args) {
		new Admin_Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("login")) {
			String id = tfID.getText();
			String pw = tfPW.getText();
			
			if (id.equals(list.get(0).getId()) && pw.equals(list.get(0).getPw())) {
				new BookManageMain();
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Login Error", "ErrorMessage", JOptionPane.ERROR_MESSAGE);
				tfID.setText("");
				tfPW.setText("");
			}
		} else {
			dispose();
		}
	}
}
