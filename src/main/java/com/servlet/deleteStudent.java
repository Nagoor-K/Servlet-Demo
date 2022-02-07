package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;

public class deleteStudent extends HttpServlet{

  /**
   * 
   */
  private static final long serialVersionUID = 8252877239443873431L;
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    int stuId=Integer.parseInt(req.getParameter("stuId"));
    Controller control=new Controller();
    control.deleteStudent(stuId);
    resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();  
	out.print("<h3> Student Removed <h3>");
	out.print("<a href='index.html'> Main Menu</a>");
  }
  
}
