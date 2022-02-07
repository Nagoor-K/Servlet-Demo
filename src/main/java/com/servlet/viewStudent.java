package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.entities.Student;

public class viewStudent extends HttpServlet{

  /**
   * 
   */
  private static final long serialVersionUID = -4749146049173982650L;
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    int stuId=Integer.parseInt(req.getParameter("stuId"));
    Controller control=new Controller();
    Student student=control.viewStudent(stuId);
    resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("<p>");
	out.print("Student ID : "+student.getId());
	out.print("Student First Name : "+student.getFname());
	out.print("Student Last Name : "+student.getLname());
	out.print("Student City  : "+student.getCity());
	out.print("</p>");
	out.print("<a href='index.html'> Main Menu</a>");
    
  }
	
}
