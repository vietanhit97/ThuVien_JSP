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
 * Servlet implementation class UpdateStudent
 */
@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String nameString = request.getParameter("name");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday= s.parse(request.getParameter("birthday"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		String address = request.getParameter("address");
		 String className = request.getParameter("className");
		 Double scholarShip = Double.parseDouble(request.getParameter("scholarShip"));
		 Student stu = new Student();
		 stu.setStuId(id);
		 stu.setFullName(nameString);
		 stu.setGender(gender);
		 stu.setBirthday(birthday);
		 stu.setAddress(address);
		 stu.setClassName(className);
		 stu.setScholarShip(scholarShip);
		 boolean bl = new StudentDAOImp().updateStudent(stu);
		 if(bl) {
			 request.getRequestDispatcher("DetailStudent?stuId="+id).forward(request, response);
			 }else {
			 request.setAttribute("err", "Update failed!");
			 request.setAttribute("s", stu); 
			 request.getRequestDispatcher("UpdateStudent.jsp").forward(request, response);
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
