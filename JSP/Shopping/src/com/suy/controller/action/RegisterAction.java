package com.suy.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.suy.dao.MemberDAO;
import com.suy.dto.MemberVO;

public class RegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/signIn.jsp";

		HttpSession session = request.getSession();
		MemberVO memberVO = new MemberVO();

		memberVO.setUserID(request.getParameter("userID"));
		memberVO.setPassword(request.getParameter("password"));
		memberVO.setName(request.getParameter("name"));
		memberVO.setEmail(request.getParameter("address"));
		memberVO.setPassword(request.getParameter("phone"));

		session.setAttribute("userID", request.getParameter("userID"));

		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.insertMember(memberVO);

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
