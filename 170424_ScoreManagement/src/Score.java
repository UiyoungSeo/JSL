import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

class ScoreFrame extends JFrame implements ActionListener, MouseListener {

	ScoreDAO scoreDAO;
	ScoreDTO scoreDTO;

	JLabel lblName, lblKor, lblEng, lblMath;
	JTextField tfName, tfKor, tfEng, tfMath;
	JButton btnAdd, btnDelete, btnChange;
	JTable table;
	Vector data, col;

	public ScoreFrame() {
		setLayout(null);
		scoreDAO = new ScoreDAO();

		// name
		add(lblName = new JLabel("이름", JLabel.CENTER));
		lblName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblName.setBorder(BorderFactory.createBevelBorder(0));
		lblName.setBounds(10, 10, 120, 50);
		add(tfName = new JTextField());
		tfName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tfName.setHorizontalAlignment(JTextField.CENTER);
		tfName.setBounds(140, 10, 120, 50);

		// Korean
		add(lblKor = new JLabel("국어 점수", JLabel.CENTER));
		lblKor.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblKor.setBorder(BorderFactory.createBevelBorder(0));
		lblKor.setBounds(10, 70, 120, 50);
		add(tfKor = new JTextField());
		tfKor.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tfKor.setHorizontalAlignment(JTextField.CENTER);
		tfKor.setBounds(140, 70, 120, 50);

		// English
		add(lblEng = new JLabel("영어 점수", JLabel.CENTER));
		lblEng.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblEng.setBorder(BorderFactory.createBevelBorder(0));
		lblEng.setBounds(10, 130, 120, 50);
		add(tfEng = new JTextField());
		tfEng.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tfEng.setHorizontalAlignment(JTextField.CENTER);
		tfEng.setBounds(140, 130, 120, 50);

		// Math
		add(lblMath = new JLabel("수학 점수", JLabel.CENTER));
		lblMath.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblMath.setBorder(BorderFactory.createBevelBorder(0));
		lblMath.setBounds(10, 190, 120, 50);
		add(tfMath = new JTextField());
		tfMath.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tfMath.setHorizontalAlignment(JTextField.CENTER);
		tfMath.setBounds(140, 190, 120, 50);

		// Buttons
		add(btnAdd = new JButton("추가"));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnAdd.setBounds(270, 10, 120, 50);
		btnAdd.addActionListener(this);
		add(btnDelete = new JButton("삭제"));
		btnDelete.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnDelete.setBounds(270, 70, 120, 50);
		btnDelete.addActionListener(this);
		add(btnChange = new JButton("수정"));
		btnChange.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnChange.setBounds(270, 130, 120, 50);
		btnChange.addActionListener(this);

		// 칼럼 벡터
		col = new Vector();
		col.add("이름");
		col.add("국어 점수");
		col.add("영어 점수");
		col.add("수학 점수");
		col.add("총점");
		col.add("평균");

		// table 수정 못하게 DefaultTableModel 사용
		DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		// DefaultTable을 table에 더하고 스크롤패널에 더한다.
		table = new JTable(model);
		table.addMouseListener(this);
		JScrollPane scroll = new JScrollPane(table);
		jTableSet();
		add(scroll);
		scroll.setBounds(415, 10, 770, 250);

		setResizable(false);
		setSize(1200, 300);
		setTitle("Score Management");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	// table 내용을 갱신하는 메서드
	private void jTableRefresh() {
		// table 수정 못하게 DefaultTableModel 사용
		DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
		jTableSet();
	}

	// 테이블 옵션 설정하는 메서드
	private void jTableSet() {
		// 이동과 길이조절 여러개 선택되는 것을 방지한다.
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		// column 정렬에 필요한 메서드
		DefaultTableCellRenderer cellAlignCenter = new DefaultTableCellRenderer();
		cellAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer cellAlignRight = new DefaultTableCellRenderer();
		cellAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		DefaultTableCellRenderer cellAlignLeft = new DefaultTableCellRenderer();
		cellAlignLeft.setHorizontalAlignment(JLabel.LEFT);

		// column별 size 조절&정렬
		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(0).setCellRenderer(cellAlignCenter);
		table.getColumnModel().getColumn(1).setPreferredWidth(10);
		table.getColumnModel().getColumn(1).setCellRenderer(cellAlignCenter);
		table.getColumnModel().getColumn(2).setPreferredWidth(10);
		table.getColumnModel().getColumn(2).setCellRenderer(cellAlignCenter);
		table.getColumnModel().getColumn(3).setPreferredWidth(10);
		table.getColumnModel().getColumn(3).setCellRenderer(cellAlignCenter);
		table.getColumnModel().getColumn(4).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setCellRenderer(cellAlignCenter);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setCellRenderer(cellAlignCenter);
	}

	// 텍스트 필드에 입력된 내용을 set 하는 메서드
	private void contentSet() {
		scoreDTO = new ScoreDTO();
		String name = tfName.getText();
		int kor = Integer.parseInt(tfKor.getText());
		int eng = Integer.parseInt(tfEng.getText());
		int math = Integer.parseInt(tfMath.getText());
		int tot = kor + eng + math;
		int avg = tot / 3;

		scoreDTO.setName(name);
		scoreDTO.setKor(kor);
		scoreDTO.setEng(eng);
		scoreDTO.setMath(math);
		scoreDTO.setTot(tot);
		scoreDTO.setAvg(avg);
	}

	// 텍스트 필드에 입력된 내용을 지우는 메서드
	private void contentClear() {
		tfName.setText("");
		tfKor.setText("");
		tfEng.setText("");
		tfMath.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonFlag = e.getActionCommand();

		if (buttonFlag.equals("추가")) {
			try {
				contentSet();
				int result = scoreDAO.insertScore(scoreDTO);

				if (result == 1) {
					JOptionPane.showMessageDialog(this, "추가 되었습니다.");
					jTableRefresh();
					contentClear();
				} else {
					JOptionPane.showMessageDialog(this, "실패하였습니다.");
				}

			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "값을 입력하세요");
			}
		} else if (buttonFlag.equals("삭제")) {
			try {
				contentSet();
				int result = scoreDAO.deleteScore(scoreDTO);
				System.out.println("result" + result);
				if (result == 1) {
					JOptionPane.showMessageDialog(this, "삭제 되었습니다.");
					jTableRefresh();
					contentClear();
				} else {
					JOptionPane.showMessageDialog(this, "실패 하였습니다.");
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "값을 입력하세요.");
			}
		} else if (buttonFlag.equals("수정")) {
			try {
				contentSet();
				int result = scoreDAO.updateScore(scoreDTO);

				if (result == 1) {
					JOptionPane.showMessageDialog(this, "수정 되었습니다.");
					jTableRefresh();
					contentClear();
					tfName.setFocusable(true);
				} else {
					JOptionPane.showMessageDialog(this, "실패 하였습니다.");
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "값을 입력하세요.");
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int rowIndex = table.getSelectedRow();
		tfName.setText(table.getValueAt(rowIndex, 0) + "");
		tfKor.setText(table.getValueAt(rowIndex, 1) + "");
		tfEng.setText(table.getValueAt(rowIndex, 2) + "");
		tfMath.setText(table.getValueAt(rowIndex, 3) + "");
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}

public class Score {
	public static void main(String[] args) {
		new ScoreFrame();
	}
}
