import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.security.auth.login.Configuration;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookManageMain extends BFrame implements ActionListener {

	ButtonGroup group = new ButtonGroup();
	JButton btn1 = new JButton("도서 대어/반납");
	JButton btn2 = new JButton("회원 등록/삭제");
	JButton btn3 = new JButton("도서 등록/삭제");
	JButton btn4 = new JButton("모든 대여 정보");
	JButton btnExit = new JButton("종료");
	JPanel pan = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel pan1_1 = new JPanel();
	ImageIcon img = new ImageIcon("main.jpg");
	JLabel lbl = new JLabel(img);
	JPanel pan2 = new JPanel();
	DBMgr mgr = new DBMgr();

	public BookManageMain() {
		setTitle("Book Management Application");
		setBounds(100, 200, 300, 300);
		init();
	}

	private void init() {
		Container con = this.getContentPane();
		// pan.setLayout(new GridLayout(3,1);
		pan1.setBackground(Color.white);
		btn1.setBackground(Color.white);
		btn2.setBackground(Color.white);
		btn3.setBackground(Color.white);
		btn4.setBackground(Color.white);
		btnExit.setBackground(Color.white);
		pan1.add(pan1_1);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btnExit.addActionListener(this);
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(btnExit);
		pan.add(lbl);
		con.add(pan1, BorderLayout.PAGE_START);
		con.add(pan, BorderLayout.PAGE_END);
		
		pack();	//팩으로 싼다. 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals(btn1.getText())){
			new RentBook();
		}else if(button.equals(btn2.getText())){
			//TODO : 회원등록/삭제
		}
		else if(button.equals(btn3.getText())){
			new InsertBook();
		}
	}
	
	public static void main(String[] args){
		new BookManageMain();
	}
}
