package com.student.entity;

public class StudentEntity {
	private int studentId;
	private String studentName;
	private String course;
	private String firstName;
	private String lastName;
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private int pin;
	private long mobile;
	private String email;
	private String password;

	public StudentEntity(int studentId, String studentName, String course, String firstName, String lastName,
			String addLine1, String addLine2, String city, String state, int pin, long mobile, String email,
			String password) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", addLine1=" + addLine1 + ", addLine2="
				+ addLine2 + ", city=" + city + ", state=" + state + ", pin=" + pin + ", mobile=" + mobile + ", email="
				+ email + ", password=" + password + "]";
	}

}
