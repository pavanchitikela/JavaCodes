package com.greet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException { 
		/*
		 PrintWriter out= response.getWriter();
		 response.setContentType("application/vnd.ms-excel");
		    out.println("\tQ1\tQ2\tQ3\tQ4\tTOTAL");
	        out.println("Apples\t28\t35\t45\t56\t=sum(B2:E2)");
	        out.println("Mangos\t12\t34\t45\t56\t=sum(B3:E3)");
	        out.println("Orange\t56\t67\t78\t89\t=sum(B4:E4)");
		 
	     int depno=Integer.parseInt(request.getParameter("depno"));
	     pw.println("<h1>Servlet Department number is"+depno+"</h1>");
	     RequestDispatcher rd = request.getRequestDispatcher("First.jsp");
	     rd.include(request, response);
	     */
	}

}
