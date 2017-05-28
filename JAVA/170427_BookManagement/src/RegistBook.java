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


public class RegistBook extends BFrame implements ActionListener {
	JPanel titlePanel = new JPanel();
	JLabel lbl = new JLabel("도서등록");
	JLabel lbl1 = new JLabel("도서번호");
	JLabel lbl2 = new JLabel("제목");
	JLabel lbl3 = new JLabel("가격");
	JLabel lbl4 = new JLabel("저자");
	JLabel lbl5 = new JLabel("출판사");
	JLabel lbl6 = new JLabel("대여정보");

	JPanel inputPanel = new JPanel();
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	JTextField tf4 = new JTextField(10);
	JTextField tf5 = new JTextField(10);
	JTextField tf6 = new JTextField(10);

	JPanel btnPanel = new JPanel();
	JButton btnConfirm = new JButton("확인");
	JButton btnCancel = new JButton("취소");
	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;

	public RegistBook() {
		setTitle("도서등록");
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
		inputPanel.add(lbl3);
		inputPanel.add(tf3);
		inputPanel.add(lbl4);
		inputPanel.add(tf4);
		inputPanel.add(lbl5);
		inputPanel.add(tf5);
		inputPanel.add(lbl6);
		inputPanel.add(tf6);
		
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
			String code = tf1.getText();
			String title = tf2.getText();
			String price = tf3.getText();
			String author = tf4.getText();
			String publisher = tf5.getText();
			String state = tf6.getText();
			mgr.insertBk(code, title, price, author, publisher, state);
			dispose();
		} else if(e.getActionCommand().equals("취소")){
			dispose();
		}
	}

	public static void main(String[] args) {
		new RegistBook();
	}
}
