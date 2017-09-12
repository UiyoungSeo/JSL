package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import model.Board;

public class IteratorAction implements Action {
	private List<Board> list;
	private List<Board> list2;
	
	@Override
	public String execute() throws Exception {
		list = new ArrayList<Board>();
		list.add(new Board(1,"1빠","폰노이만","엌ㅋㅋㅋ1빠"));
		list.add(new Board(2,"the C programming language","데니스리치","c언어 배우시져"));
		list.add(new Board(3,"java","제임스고슬링","javaㅋ"));
		
		list2 = new ArrayList<Board>();
		list2.add(new Board(4,"swift","apple","object-c말고 swift"));
		list2.add(new Board(5,"ruby","유키히로마츠모토","ruby~개발자의 단짝친구~"));
		
		return SUCCESS;
	}

	public List<Board> getList() {
		return list;
	}

	public void setList(List<Board> list) {
		this.list = list;
	}
	public List<Board> getList2() {
		return list2;
	}

	public void setList2(List<Board> list2) {
		this.list2 = list2;
	}
}
