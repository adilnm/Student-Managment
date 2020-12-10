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
			System.out.println(ps);

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
			student = new StudentEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10),
					rs.getLong(11), rs.getString(12), rs.getString(13));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;

	}

}
