package in.mindcraft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException //when you click on submit the values will be stored in request
	, ServletException
		{
			 String a=request.getParameter("name"); //convert string to int
			
			//System.out.println(a);
			response.getWriter().println("Welcome "+a);
			
			//request.setAttribute("c",c);
			
			//RequestDispatcher rd=request.getRequestDispatcher("sq");
			//rd.forward(request, response);
		}

}
