package com.student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImp;
import com.student.entity.StudentEntity;

@WebServlet("/showAllStudent")
public class GetAllStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetAllStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get All Students
		StudentDao dao = new StudentDaoImp();
		List<StudentEntity> students = dao.getStudent();

		// Set data in request
		request.setAttribute("students", students);

		// call jsp to display data
		request.getRequestDispatcher("showStudent.jsp").forward(request, response);
		System.out.println(students);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
