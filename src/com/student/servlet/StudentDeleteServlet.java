package com.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImp;

@WebServlet("/studentDelete")
public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean deleteStatus;
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		StudentDao dao = new StudentDaoImp();
		deleteStatus = dao.studentDelete(student_id);
		if (deleteStatus) {
			request.setAttribute("message", "Your selected student got deleted");
		} else {
			request.setAttribute("message", "ERROR");
		}

		request.getRequestDispatcher("showAllStudent").forward(request, response);

	}

}
