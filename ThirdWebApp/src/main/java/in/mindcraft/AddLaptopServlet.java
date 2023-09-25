
package in.mindcraft;


 


import java.sql.*;


import javax.servlet.*;


import javax.servlet.annotation.WebServlet;


import javax.servlet.http.*;


import java.io.*;


 


@WebServlet("/add")


public class AddLaptopServlet extends HttpServlet {


public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {


 String laptopId = request.getParameter("id");


 String laptopMake = request.getParameter("make");


 String laptopCost = request.getParameter("cost");


 


 String URL = "jdbc:mysql://localhost/web_application";


 String USER = "root";


 String PASSWORD = "root";


 


try {


 Class.forName("com.mysql.cj.jdbc.Driver");


 


 Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);


 


 PreparedStatement stmt = connection.prepareStatement("INSERT INTO laptop(id, make, cost) VALUES (?, ?, ?)");


stmt.setString(1, laptopId);


stmt.setString(2, laptopMake);


stmt.setString(3, laptopCost);


 


int rowsInserted = stmt.executeUpdate();


 


stmt.close();


connection.commit();


connection.close();


 } catch (ClassNotFoundException | SQLException e) {


e.printStackTrace();


 }


 


response.sendRedirect("index.html");


 }


}


 

