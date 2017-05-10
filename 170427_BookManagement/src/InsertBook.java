import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class InsertBook extends BFrame implements ActionListener {
	JPanel btnPanel = new JPanel();
	JButton btn = new JButton("등록");
	JButton btn1 = new JButton("검색");
	JButton btn2 = new JButton("삭제");
	JButton btn3 = new JButton("새로고침");
	JButton btn4 = new JButton("돌아가기");
	JButton btn5 = new JButton("수정");
	JPanel pan2 = new JPanel();

	JTable table;
	JScrollPane scrollPane;

	String[] col = { "제목", "도서번호", "가격", "저자", "출판사", "대출여부" };
	DBMgr mgr = new DBMgr();// DAO
	ArrayList<BKBean> list;
	BKBean bean;

	public InsertBook() {
		setTitle("도서 입고/폐기");
		list = mgr.allBk();
		init();
	}

	// 생성자 overloading
	public InsertBook(ArrayList<BKBean> list) {
		setTitle("도서 입고/폐기");
		this.list = list;
		init();
	}

	private void init() {
		Container container = this.getContentPane();

		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btnPanel.add(btn3);
		btnPanel.add(btn);
		btnPanel.add(btn1);
		btnPanel.add(btn5);
		btnPanel.add(btn2);
		btnPanel.add(btn4);

		String[][] record = new String[list.size()][col.length];
		for (int i = 0; i < list.size(); i++) {
			bean = list.get(i);
			record[i][0] = bean.getLib_name();
			record[i][1] = bean.getLib_code();
			record[i][2] = bean.getLib_price();
			record[i][3] = bean.getLib_author();
			record[i][4] = bean.getLib_publisher();
			record[i][5] = bean.getLib_state();
		}
		table = new JTable(record, col);
		scrollPane = new JScrollPane(table);
		JPanel panLine = new JPanel(new BorderLayout());
		panLine.setBorder(new TitledBorder(new EtchedBorder(), "도서목록"));
		panLine.add(scrollPane, BorderLayout.CENTER);

		container.add(btnPanel, BorderLayout.PAGE_START);
		container.add(panLine, BorderLayout.CENTER);

		pack(); // 크기에 따라 자동적으로 맞춰진다.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("등록")) {
			new InputBook();
		} else if (e.getActionCommand().equals("검색")) {
			new SearchBook();
		} else if (e.getActionCommand().equals("수정")) {
			new UpdateBook();
		} else if (e.getActionCommand().equals("삭제")) {
			new DeleteBook();
		} else if (e.getActionCommand().equals("새로고침")) {
			// dispose한후 다시 켠다.
			dispose();
			new InsertBook();
		} else if (e.getActionCommand().equals("돌아가기")) {
			dispose();
		}
	}

	public static void main(String[] args) {
		new InsertBook();
	}
}
