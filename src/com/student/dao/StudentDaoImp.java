package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.entity.StudentEntity;
import com.student.util.DbConnectionUtil;

public class StudentDaoImp implements StudentDao {

	@Override
	public List<StudentEntity> getStudent() {
		List<StudentEntity> allStudents = new ArrayList<StudentEntity>();
		try {
			Connection con = DbConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				StudentEntity student = new StudentEntity(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getInt(10), rs.getLong(11), rs.getString(12), rs.getString(13));
				allStudents.add(student);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allStudents;
	}

	@Override
	public StudentEntity getStudentDetail(int studentId) {
		StudentEntity student = null;
		try {
			Connection con = DbConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM  student WHERE STUDENT_ID = ?");
			ps.setInt(1, studentId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student = new StudentEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getInt(10), rs.getLong(11), rs.getString(12), rs.getString(13));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;

	}

	@Override
	public boolean studentDelete(int studentId) {
		boolean deleteStatus = false;
		try {
			Connection con = DbConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("delete FROM  student WHERE STUDENT_ID = ?");
			ps.setInt(1, studentId);
			int rs = ps.executeUpdate();

			if (rs > 0) {
				deleteStatus = true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deleteStatus;
	}

	@Override
	public boolean AddStudentStudentEntity(StudentEntity student) {
		boolean addStatus = false;
		try {
			Connection con = DbConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into student (STUDENTNAME, COURSE, FIRST_NAME, LAST_NAME,ADD_LINE1,ADD_LINE2,CITY,STATE,PIN,MOBILE_NUMBER,EMAIL_ID,PASSWORD) values (?,?,?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1, student.getStudentName());
			ps.setString(2, student.getCourse());
			ps.setString(3, student.getFirstName());
			ps.setString(4, student.getLastName());
			ps.setString(5, student.getAddLine1());
			ps.setString(6, student.getAddLine2());
			ps.setString(7, student.getCity());
			ps.setString(8, student.getState());
			ps.setInt(9, student.getPin());
			ps.setLong(10, student.getMobile());
			ps.setString(11, student.getEmail());
			ps.setString(12, student.getPassword());
			int rs = ps.executeUpdate();

			if (rs > 0) {
				addStatus = true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addStatus;
	}

}
