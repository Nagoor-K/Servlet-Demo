package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

@Singleton
public class GuiceServlet extends HttpServlet{
	/**
   * 
   */
  private static final long serialVersionUID = -1603727811504689065L;

  @Override
	  protected void service(HttpServletRequest req, HttpServletResponse resp)
	      throws ServletException, IOException {
	  	int i=Integer.parseInt(req.getParameter("num1"));
	    int j=Integer.parseInt(req.getParameter("num2"));
	    PrintWriter out=resp.getWriter();
	    out.print(i+j);
	  }
}
