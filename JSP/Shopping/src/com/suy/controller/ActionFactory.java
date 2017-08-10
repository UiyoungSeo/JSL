package com.suy.controller;

import com.suy.controller.action.Action;
import com.suy.controller.action.RegisterAction;
import com.suy.controller.action.SignInAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);

		if (command.equals("signIn"))
			action = new SignInAction();
		else if (command.equals("register"))
			action = new RegisterAction();

		return action;
	}
}
