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

@WebServlet("/studentDetail")
public class StudentDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentDao dao = new StudentDaoImp();
		int studentId = Integer.parseInt(request.getParameter("student_id"));
		StudentEntity student = dao.getStudentDetail(studentId);
		request.setAttribute("student", student);
		request.getRequestDispatcher("studentDetail.jsp").forward(request, response);
	}

}
