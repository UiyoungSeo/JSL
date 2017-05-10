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

public class RentBook extends BFrame implements ActionListener {
	JLabel lbl = new JLabel("도서명");
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("검색");
	JPanel pan = new JPanel();
	JPanel pan_1 = new JPanel();
	JTable table;
	JScrollPane scpane;
	ArrayList<BookBean> list; // DTO
	BookBean bean;
	DBMgr mgr = new DBMgr();
	String col[] = { "title", "code", "price", "author", "publisher", "rent satus" };

	JLabel lbl1 = new JLabel("제목");
	JTextField tf1 = new JTextField(10);
	JPanel pan1 = new JPanel();
	JLabel lbl2 = new JLabel("도서번호");
	JTextField tf2 = new JTextField(10);
	JPanel pan2 = new JPanel();
	JLabel lbl3 = new JLabel("가격");
	JTextField tf3 = new JTextField(10);
	JPanel pan3 = new JPanel();
	JLabel lbl4 = new JLabel("저      자");
	JTextField tf4 = new JTextField(10);
	JPanel pan4 = new JPanel();
	JLabel lbl5 = new JLabel("출판사");
	JTextField tf5 = new JTextField(10);
	JPanel pan5 = new JPanel();
	JLabel lbl6 = new JLabel("대출여부");
	JTextField tf6 = new JTextField(10);
	JPanel pan6 = new JPanel();

	JButton btn1 = new JButton("대여/반납");
	JButton btn2 = new JButton("초기화");
	JButton btn3 = new JButton("돌아가기");
	JButton btn4 = new JButton("새로고침");
	JPanel btnPanel = new JPanel();
	JPanel pan7 = new JPanel();

	public RentBook() {
		setTitle("도서대여/반납");
		// list = mgr.allBook();
		init();
	}

	private void init() {
		Container con = this.getContentPane();
		pan.add(lbl);
		pan.add(tf);
		pan.add(btn);
		table();
		pan1.add(lbl1);
		pan1.add(tf1);
		pan2.add(lbl2);
		pan2.add(tf2);
		pan3.add(lbl3);
		pan3.add(tf3);
		pan4.add(lbl4);
		pan4.add(tf4);
		pan5.add(lbl5);
		pan5.add(tf5);
		pan6.add(lbl6);
		pan6.add(tf6);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.add(btn4);
		pan7.add(pan1);
		pan7.add(pan2);
		pan7.add(pan3);
		pan7.add(pan4);
		pan7.add(pan5);
		pan7.add(pan6);
		pan7.add(btnPanel);
		pan7.setLayout(new GridLayout(5, 1));

		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		// con.add(scpane, BorderLayout.PAGE_END);
		con.add(pan7, BorderLayout.CENTER);
		con.add(pan, BorderLayout.PAGE_START);
		this.pack();
	}

	private void table() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("돌아가기"))
			dispose();
	}

	public static void main(String[] args) {
		new RentBook();
	}
}
