package com.tap;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{


	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String fathername=req.getParameter("fathername");
		String branch=req.getParameter("branch");

		
		
		Student s=new Student(id,name,fathername,branch);
		
		StudentBO bo=new StudentBO();
		int i=bo.save(s);
		PrintWriter out=resp.getWriter();
	if(i==1) {
		out.print("Student data saved successfully");
	}
	else {
		out.print("Student data is unsuccessfull!!!!!!...");
	}
		
		} 
	
}
