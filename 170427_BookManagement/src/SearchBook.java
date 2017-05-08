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
import javax.swing.border.Border;

public class SearchBook extends BFrame implements ActionListener {
	JPanel titlePanel = new JPanel();
	JLabel lbl = new JLabel("도서검색");
	JPanel centerPanel = new JPanel();
	JLabel lbl1 = new JLabel("도서제목:");
	JTextField tf = new JTextField(10);
	JPanel southPanel = new JPanel();
	JButton btnSearch = new JButton("검색");
	JButton btnCancel = new JButton("취소");
	
	DBMgr mgr = new DBMgr();
	ArrayList<BKBean> list;
	
	
	public SearchBook() {
		setTitle("도서검색");
		init();
	}
	
	private void init(){
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
		if(e.getActionCommand().equals("검색")){
			String title = tf.getText();
			list = mgr.searchBk(title);
			new InsertBook(list);
		} else if (e.getActionCommand().equals("취소")) {
			tf.setText("");
			dispose();
		}
	}
	
}
