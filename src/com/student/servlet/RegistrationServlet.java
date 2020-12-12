package com.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImp;
import com.student.entity.StudentEntity;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String studentName = request.getParameter("studentName");
		String course = request.getParameter("course");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String addLine1 = request.getParameter("addLine1");
		String addLine2 = request.getParameter("addLine2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int pin = Integer.parseInt(request.getParameter("pin"));
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean addStatus;
		StudentEntity student = new StudentEntity(studentName, course, firstName, lastName, addLine1, addLine2, city,
				state, pin, mobile, email, password);

		StudentDao dao = new StudentDaoImp();

		addStatus = dao.AddStudentStudentEntity(student);

		if (addStatus) {
			request.setAttribute("addMessage", "You added a new student");
		} else {
			request.setAttribute("addmmessage", "ERROR");
		}

		request.getRequestDispatcher("showAllStudent").forward(request, response);

	}

}
