package model;

public class Board {
	private int no;
	private String subject;
	private String name;
	private String content;

	public Board() {

	}

	public Board(int no, String subject, String name, String content) {
		super();
		this.no = no;
		this.subject = subject;
		this.name = name;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
