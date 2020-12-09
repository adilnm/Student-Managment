package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/student";
	private static String username = "root";
	private static String password = "adil1986";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);

		Connection conn = DriverManager.getConnection(url, username, password);

		if (conn != null) {
			System.out.println("Connection has been created");
		}

		return conn;

	}
}
