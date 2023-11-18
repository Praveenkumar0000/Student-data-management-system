package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentBO {
	private Connection connection;
	private   PreparedStatement  statement;

	public int  save(Student s){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/students";
			String username="root";
			String password="7386";
	
			connection =DriverManager.getConnection(url,username,password);
			String insert_query = "INSERT INTO studentsdata(Id, Name, `Father name`, Branch) VALUES(?,?,?,?)";

			statement=connection.prepareStatement(insert_query);
			statement.setInt(1,s.getId());
			statement.setString(2,s.getName());
			statement.setString(3, s.getFathername());
			statement.setString(4,s.getBranch());

			
			int i=statement.executeUpdate();
			return i;
			
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
