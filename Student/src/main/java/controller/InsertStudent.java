package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.StudentImp;
import entity.Student;

/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/InsertStudent")
public class InsertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int status = Integer.parseInt(request.getParameter("status"));
		boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = sdf.parse(request.getParameter("brithday"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setStatus(status);
		s.setBit(sex);
		s.setBirthday(birthday);
		boolean bl = new StudentImp().add(s);
		if (bl) {
			request.setAttribute("err", "Thêm mới thành công ");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else{
			request.setAttribute("err", "Thêm mới không thành công ");
			request.getRequestDispatcher("insertStudent.jsp").forward(request, response);
		}
	}

}
