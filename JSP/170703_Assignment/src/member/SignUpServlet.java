package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=EUC-KR");

		PrintWriter out = response.getWriter();
		out.print("<html><body>");

		String[] interests = null;

		String name = request.getParameter("name");
		out.println("이름 : ");
		out.print(name);

		String socialNumber = request.getParameter("social_no1") + "-" + request.getParameter("social_no2");
		out.println("<br>주민번호 : ");
		out.print(socialNumber);

		String id = request.getParameter("id");
		out.println("<br>아 이 디 : ");
		out.print(id);

		String pwd = request.getParameter("pwd");
		out.println("<br>비밀번호 : ");
		out.print(pwd);

		String email = request.getParameter("email");
		if (request.getParameter("email_service").equals("")) {
			email += "@" + request.getParameter("email_service");
		} else {
			email += "@" + request.getParameter("email_service_select");
		}
		out.println("<br>이 메 일 : ");
		out.print(email);

		String zip = request.getParameter("post_number");
		out.println("<br>우편번호 : ");
		out.print(zip);

		String addr = request.getParameter("address_1") + request.getParameter("address_2");
		out.println("<br>주소 : ");
		out.print(addr);

		String phone = request.getParameter("phone");
		out.println("<br>핸드폰번호 : ");
		out.print(phone);

		String job = request.getParameter("job");
		out.println("<br>직업 : ");
		out.print(job);

		out.println("<br>관심분야 : ");
		interests = request.getParameterValues("interest");
		if (interests != null) {
			for (String interest : interests) {
				out.print(interest + " ");
			}
		} else {
			out.print("선택값 없음");
		}
		out.println("<br><br><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
