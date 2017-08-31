package action;

import com.opensymphony.xwork2.Action;

import dao.UserDao;
import model.User;

public class UserRegAction2 implements Action {
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		UserDao userDao = new UserDao();
		userDao.create(user);
		return SUCCESS;
	}
}
