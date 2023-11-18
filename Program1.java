package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Statement;

public class Program1 {

    public static void main(String[] args) {
    	
    	Scanner scan=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "7386";
       
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery("select * from studentsdata");
            while(res.next()) {
                int Id=res.getInt("Id");
                String name=res.getString("Name");
                String fathername=res.getString("Father name");
                String Branch=res.getString("Branch");
                System.out.println(Id+" "+name+" "+fathername+" "+Branch);
            }
        }
        catch(Exception e) {
            e.printStackTrace();

        }

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "UPDATE studentsdata SET Id = ? WHERE `Father name` = ?";
            PreparedStatement state = conn.prepareStatement(sql);
            state.setInt(1, scan.nextInt());
            state.setString(2, scan.next());

            int i = state.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery("select * from studentsdata");
            while(res.next()) {
                int Id=res.getInt("Id");
                String name=res.getString("Name");
                String fathername=res.getString("Father name");
                String Branch=res.getString("Branch");
                System.out.println(Id+" "+name+" "+fathername+" "+Branch);
            }
        }
        catch(Exception e) {
            e.printStackTrace();

        }
    }
}
