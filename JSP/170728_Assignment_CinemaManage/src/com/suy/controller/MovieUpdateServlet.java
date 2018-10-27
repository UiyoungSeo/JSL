package com.suy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.suy.dao.MovieDAO;
import com.suy.dto.MovieVO;

/**
 * Servlet implementation class MovieUpdateServlet
 */
@WebServlet("/movieUpdate.do")
public class MovieUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));

		MovieDAO mDao = MovieDAO.getInstance();
		MovieVO mVo = mDao.selectMovieByCode(code);
		request.setAttribute("movie", mVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("movie/movieUpdate.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		ServletContext context = getServletContext();
		String path = context.getRealPath("images");
		String encType = "UTF-8";
		int sizeLimit = 20 * 1024 * 1024;
		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		MovieVO mVo = new MovieVO();
		mVo.setCode(Integer.parseInt(multi.getParameter("code")));
		mVo.setTitle(multi.getParameter("title"));
		mVo.setPrice(Integer.parseInt(multi.getParameter("price")));
		mVo.setDirector(multi.getParameter("director"));
		mVo.setActor(multi.getParameter("actor"));
		mVo.setSynopsis(multi.getParameter("synopsis"));
		if (multi.getFilesystemName("poster") == null) {
			mVo.setPoster(multi.getParameter("nonmakeImg"));
		} else {
			mVo.setPoster(multi.getFilesystemName("poster"));
		}

		MovieDAO mDao = MovieDAO.getInstance();
		mDao.updateMovie(mVo);

		response.sendRedirect("movieList.do");
	}

}
