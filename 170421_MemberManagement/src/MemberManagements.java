import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MemberManagements extends MyFrame {
	// static ArrayList<Members> list = new ArrayList<Members>();
	MyFrame frame = new MyFrame();
	JFileChooser f = new JFileChooser();
	FileNameExtensionFilter fileNameExtensionFilter;
	Image backImg;

	public MemberManagements() {
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu jmFile = new JMenu("File");
		JMenuItem jmiNew = new JMenuItem("new");
		JMenuItem jmiOpen = new JMenuItem("open");
		JMenuItem jmiSave = new JMenuItem("save");
		JMenuItem jmiExit = new JMenuItem("exit");
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		menuBar.add(jmFile);

		JMenu jmHelp = new JMenu("Help");
		JMenuItem jmiAbout = new JMenuItem("about");
		jmHelp.add(jmiAbout);
		menuBar.add(jmHelp);

		JLabel lblNewLabel = new JLabel(new ImageIcon("member.jpg"));
		lblNewLabel.setBounds(22, 10, 431, 213);
		frame.getContentPane().add(lblNewLabel);

	}

	public void start() {
		frame.setTitle("Member Mangement Program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 360);
		frame.setVisible(true);

		JButton btnRegistMember = new JButton("회원등록");
		btnRegistMember.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new MemberRegister();
			}
		});
		btnRegistMember.setBounds(22, 232, 133, 49);

		JButton btnManageMember = new JButton("회원관리");
		btnManageMember.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Managements();
			}
		});
		btnManageMember.setBounds(174, 232, 133, 49);

		JButton btnSearchMember = new JButton("회원검색");
		btnSearchMember.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnSearchMember.setBounds(324, 232, 133, 49);

		frame.getContentPane().add(btnRegistMember);
		frame.getContentPane().add(btnManageMember);
		frame.getContentPane().add(btnSearchMember);
	}
}
