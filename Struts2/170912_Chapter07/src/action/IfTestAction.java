package action;

import com.opensymphony.xwork2.Action;

public class IfTestAction implements Action {
	int a = -5, b = 10, c = 0;

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
