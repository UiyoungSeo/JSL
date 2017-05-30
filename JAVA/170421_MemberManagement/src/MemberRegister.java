import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MemberRegister extends MemberManagements implements ActionListener {
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField address;
	private JTextField code;
	private JTextField job;
	JButton btnRegister = new JButton("등록");
	JButton btnCancel = new JButton("취소");
	MyFrame frame = new MyFrame();
	JRadioButton female;
	JRadioButton male;
	ButtonGroup bg = new ButtonGroup();

	public MemberRegister() {
		frame.setTitle("Member Registration");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblMemberCode = new JLabel("회원 코드:");
		lblMemberCode.setBounds(27, 16, 90, 30);
		frame.getContentPane().add(lblMemberCode);

		JLabel lblMemberName = new JLabel("회원 이름:");
		lblMemberName.setBounds(207, 16, 90, 30);
		frame.getContentPane().add(lblMemberName);

		JLabel lblMemberAge = new JLabel("회원 나이:");
		lblMemberAge.setBounds(27, 56, 90, 30);
		frame.getContentPane().add(lblMemberAge);

		JLabel lblMemberPhone = new JLabel("회원 전화번호:");
		lblMemberPhone.setBounds(27, 96, 90, 30);
		frame.getContentPane().add(lblMemberPhone);

		JLabel lblMemberAddress = new JLabel("회원 주소:");
		lblMemberAddress.setBounds(27, 182, 90, 30);
		frame.getContentPane().add(lblMemberAddress);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(280, 21, 62, 21);
		frame.getContentPane().add(name);

		age = new JTextField();
		age.setColumns(10);
		age.setBounds(97, 61, 62, 21);
		frame.getContentPane().add(age);

		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(129, 101, 144, 21);
		frame.getContentPane().add(phone);

		address = new JTextField();
		address.setColumns(10);
		address.setBounds(97, 187, 357, 21);
		frame.getContentPane().add(address);

		code = new JTextField();
		code.setColumns(10);
		code.setBounds(97, 21, 62, 21);
		frame.getContentPane().add(code);

		JLabel lblMemberSex = new JLabel("회원성별: ");
		lblMemberSex.setBounds(207, 56, 90, 30);
		frame.getContentPane().add(lblMemberSex);

		male = new JRadioButton("남");
		female = new JRadioButton("여");
		male.setBounds(283, 60, 45, 23);
		female.setBounds(331, 60, 45, 23);
		bg.add(male);
		bg.add(female);
		frame.getContentPane().add(male);
		frame.getContentPane().add(female);

		JLabel label = new JLabel("('-'없이 입력해주세요)");
		label.setBounds(280, 104, 138, 15);
		frame.getContentPane().add(label);

		JLabel lblMemberJob = new JLabel("직장명(학생은 학교명):");
		lblMemberJob.setBounds(27, 147, 144, 15);
		frame.getContentPane().add(lblMemberJob);

		job = new JTextField();
		job.setColumns(10);
		job.setBounds(164, 144, 144, 21);
		frame.getContentPane().add(job);

		btnRegister.setBounds(97, 232, 97, 40);
		btnCancel.setBounds(280, 232, 97, 40);
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);

		frame.getContentPane().add(btnRegister);
		frame.getContentPane().add(btnCancel);

		frame.setSize(500, 330);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			frame.dispose();
			super.start(); // 이걸 쓰기위해 MemberManagemetns 클래스를 상속받았다.
		} else if (e.getSource() == btnRegister) {

		}
	}
}
