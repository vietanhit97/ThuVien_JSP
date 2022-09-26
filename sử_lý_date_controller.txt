package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAOImp;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String nameString= request.getParameter("name");
		Boolean gender= Boolean.parseBoolean(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday= sdf.parse(request.getParameter("birthday"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String addressString = request.getParameter("address");
		String lopString = request.getParameter("className");
		Double scholarshString= Double.parseDouble(request.getParameter("scholarShip"));
		Student student = new Student();
		student.setFullName(nameString);
		student.setGender(gender);
		student.setBirthday(birthday);
		student.setAddress(addressString);
		student.setClassName(lopString);
		student.setScholarShip(scholarshString);
		boolean bl = new StudentDAOImp().insertStudent(student);
		if (bl) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("err", "Thêm mới không thành công !");
			request.getRequestDispatcher("insertStudent.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
