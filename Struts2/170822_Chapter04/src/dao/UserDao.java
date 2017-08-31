package dao;

import model.User;

public class UserDao {
	public void create(User user) {
		System.out.println("사용자를 추가했습니다");
		System.out.println("추가된 사용자의 정보");
		System.out.println(user);
	}
}
