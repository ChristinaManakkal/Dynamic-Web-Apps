package in.mindcraft;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException  //when you click on submit the values will be stored in request
	{
//		int c=(int)request.getAttribute("c");
//		int sq=c*c;
//		response.getWriter().println("Square of Addition:"+sq);
		
//		int c=Integer.parseInt(request.getParameter("c"));
//		int sq=c*c;
//		response.getWriter().println("Square of Addition:"+sq);
		
		
//		HttpSession session=request.getSession();	
//		int c=(int) session.getAttribute("c");
		
		//cookies
		int c=0;
		Cookie[] cookies=request.getCookies();
		for(Cookie ck:cookies) {
			if(ck.getName().equals("c"))
			{
				c=Integer.parseInt(ck.getValue());
			}
		}
		
		int sq=c*c;
		//response.getWriter().println("Square of addition:"+sq);
		HttpSession session=request.getSession();
		session.setAttribute("sq",sq);
		response.sendRedirect("result.jsp");
	}

}
