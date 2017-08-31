package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.UserDao;
import model.User;

public class UserRegAction3 implements Action, Preparable, ModelDriven {
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void prepare() throws Exception {
		user = new User();
	}

	@Override
	public String execute() throws Exception {
		UserDao userDao = new UserDao();
		userDao.create(user);
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		return user;
	}
}
