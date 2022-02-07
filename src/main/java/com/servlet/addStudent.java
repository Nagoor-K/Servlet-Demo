package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.entities.Address;
import com.entities.Student;

public class addStudent extends HttpServlet{

  /**
   * 
   */
  private static final long serialVersionUID = 5280991511905880589L;
  
 @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    
	 String street=req.getParameter("street");
	 String city=req.getParameter("city");
	 String state=req.getParameter("state");
	 String zpcode=req.getParameter("zpcode");
	 
	 Address address=new Address(street, city, state, zpcode);
	 Controller control=new Controller();
	 control.addAddress(address);
	 
	 String fname=req.getParameter("fname");
	 String lname=req.getParameter("lname");
	 String cit=req.getParameter("city");
	 
	 Student student=new Student(fname, lname, cit, address);
	 control.addStudent(student);
	 
	 resp.setContentType("text/html");  
	 PrintWriter out=resp.getWriter();  
	 out.print("<h3> Student Added </h3>");
	 out.print("<a href='index.html'> Main Menu</a>");
	 
  }
	
}
