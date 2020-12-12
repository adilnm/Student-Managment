package com.student.dao;

import java.util.List;

import com.student.entity.StudentEntity;

public interface StudentDao {

	public List<StudentEntity> getStudent();

	public StudentEntity getStudentDetail(int studentId);

	public boolean studentDelete(int studentId);

	public boolean AddStudentStudentEntity(StudentEntity student);

}
