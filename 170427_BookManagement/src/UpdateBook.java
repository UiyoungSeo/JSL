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

public class UpdateBook extends BFrame implements ActionListener {
	JPanel pan = new JPanel();
	JLabel lbl = new JLabel("도서코드 : ");
	JTextField tf = new JTextField(10);
	JButton btnSearch = new JButton("검색");

	JPanel centerPanel = new JPanel();
	JLabel lbl1 = new JLabel("제목");
	JTextField tfTitle = new JTextField(10);
	JLabel lbl2 = new JLabel("코드");
	JTextField tfCode = new JTextField(10);
	JLabel lbl3 = new JLabel("가격");
	JTextField tfPrice = new JTextField(10);
	JLabel lbl4 = new JLabel("저자");
	JTextField tfAuthor = new JTextField(10);
	JLabel lbl5 = new JLabel("출판사");
	JTextField tfPublisher = new JTextField(10);
	JLabel lbl6 = new JLabel("대여여부");
	JTextField tfState = new JTextField(10);

	JPanel btnPanel = new JPanel();
	JButton btnModify = new JButton("수정");
	JButton btnCancel = new JButton("돌아가기");

	JTable table;
	JScrollPane scrollPane;

	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;

	public UpdateBook() {
		setTitle("도서정보 수정 페이지");
		init();
	}

	private void init() {
		Container container = this.getContentPane();
		pan.add(lbl);
		pan.add(tf);
		pan.add(btnSearch);

		centerPanel.setLayout(new GridLayout(6, 1));
		centerPanel.add(lbl1);
		centerPanel.add(tfTitle);
		centerPanel.add(lbl2);
		centerPanel.add(tfCode);
		centerPanel.add(lbl3);
		centerPanel.add(tfPrice);
		centerPanel.add(lbl4);
		centerPanel.add(tfAuthor);
		centerPanel.add(lbl5);
		centerPanel.add(tfPublisher);
		centerPanel.add(lbl6);
		centerPanel.add(tfState);

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
			String code = tf.getText();
			list = mgr.searchBookByCode(code);

			tfTitle.setText(list.get(0).getLib_name());
			tfCode.setText(list.get(0).getLib_code());
			tfPrice.setText(list.get(0).getLib_price());
			tfAuthor.setText(list.get(0).getLib_author());
			tfPublisher.setText(list.get(0).getLib_publisher());
			tfState.setText(list.get(0).getLib_state());
		} else if (e.getActionCommand().equals("수정")) {
			String title = tfTitle.getText();
			String code = tfCode.getText();
			String price = tfPrice.getText();
			String author = tfAuthor.getText();
			String publisher = tfPublisher.getText();
			String state = tfState.getText();
			mgr.updateBk(title, code, price, author, publisher, state);
			dispose();
		} else if (e.getActionCommand().equals("돌아가기")) {
			dispose();
		}
	}
}
