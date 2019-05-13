import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
	String JDBCUrl = "jdbc:oracle:thin:@ee417.c7clh2c6565n.eu-west-1.rds.amazonaws.com:1521:EE417";
    String username = "ee_user";
    String password = "ee_pass";
  		
 	public void doGet(HttpServletRequest request, HttpServletResponse response)
     	throws ServletException, IOException {
        	response.setContentType("text/html");
    		PrintWriter out = response.getWriter();
                out.println("<HTML><HEAD><TITLE>Database Servlet</TITLE></HEAD>");
                out.println("<BODY><H1>Database Values</H1>");

		// Now we add our database code!
		try {
             		System.out.println("\nConnecting to the SSD Database......");
             		Class.forName("oracle.jdbc.driver.OracleDriver");
             		con = DriverManager.getConnection(JDBCUrl, username, password);
         	}
         	catch (Exception e) {
         		System.out.println(e);
             		out.println("An error has occurred during the connection phase! Did you upload your Oracle Drivers?"); 
         	}   

 	 	try {
	     		out.println("Connection Successful..... creating statement....");
      	     		stmt = con.createStatement();
      	     		rs = stmt.executeQuery("SELECT MAX(USERID) FROM MLECE_USERS");

	     		while (rs.next()) {
	     			System.out.print(rs.getInt("mAX(USERID)"));
	     		}
	 	}
        catch (Exception e) {
        	System.out.print(e);
	     		out.println("<BR>An error has occurred during the Statement/ResultSet phase.  Please check the syntax and study the Exception details!");
	    }   
         	
		finally {
	     try {    
	        if (rs != null) rs.close();
		 	if (stmt != null) stmt.close();
		 	if (con != null) con.close();
	     }
	     catch (Exception ex) {
	      	out.println("<BR>An error occurred while closing down connection/statement"); 
         }
        }
		
		out.println("</BODY></HTML>");
        out.close();
 	}
 	
 	public void doPost(HttpServletRequest request, HttpServletResponse response)
 	     	throws ServletException, IOException {
 		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
            out.println("<HTML><HEAD><TITLE>Database Servlet</TITLE></HEAD>");
            out.println("<BODY><H1>Database Values</H1>");

	// Now we add our database code!
	try {
         		System.out.println("\nConnecting to the SSD Database......");
         		Class.forName("oracle.jdbc.driver.OracleDriver");
         		con = DriverManager.getConnection(JDBCUrl, username, password);
     	}
     	catch (Exception e) {
     		System.out.println(e);
         		out.println("An error has occurred during the connection phase! Did you upload your Oracle Drivers?"); 
     	}   

	 	try {
     		out.println("Connection Successful..... creating statement....");
  	     		stmt = con.createStatement();
     		rs = stmt.executeQuery("SELECT MAX(USERID) FROM MLECE_USERS");

     		while (rs.next()) {
     			System.out.print(rs.getInt("USERID"));
     		}
 	}
    catch (Exception e) {
     		out.println("<BR>An error has occurred during the Statement/ResultSet phase.  Please check the syntax and study the Exception details!");
    }   
     	
	finally {
     try {    
        if (rs != null) rs.close();
	 	if (stmt != null) stmt.close();
	 	if (con != null) con.close();
     }
     catch (Exception ex) {
      	out.println("<BR>An error occurred while closing down connection/statement"); 
     }
    }
	
	out.println("</BODY></HTML>");
    out.close();*/
 	 	}
}