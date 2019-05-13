
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * Connection con = null; Statement stmt = null; ResultSet rs = null; String
	 * JDBCUrl =
	 * "jdbc:oracle:thin:@ee417.c7clh2c6565n.eu-west-1.rds.amazonaws.com:1521:EE417";
	 * String username = "ee_user"; String password = "ee_pass";
	 */
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String JDBCUrl = "jdbc:oracle:thin:@ee417.c7clh2c6565n.eu-west-1.rds.amazonaws.com:1521:EE417";
		String username = "ee_user";
		String password = "ee_pass";
		int id =0;
		if (request.getParameter("createaccount") != null) {
			String firstname = request.getParameter("firstname");
			String surname = request.getParameter("surname");
			String email = request.getParameter("email");
			String uname = request.getParameter("username");
			String pword = request.getParameter("password");
			String country = request.getParameter("countrySelect");
			System.out.println(username);
			System.out.println(password);
			String getID = "SELECT MAX(USERID) FROM MLECE_USERS";
			try {
				System.out.println("\nConnecting to the SSD Database......");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(JDBCUrl, username, password);
			} catch (Exception e) {
				System.out.println(e);
			}
			try {
				stmt = con.createStatement();
				System.out.println(getID);
				rs = stmt.executeQuery(getID);
				while (rs.next()) {
					id = rs.getInt("MAX(USERID)");
					System.out.println(id);
				}
				rs.close();
				rs = null;
				stmt.close();
				stmt = null;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println(
						"<BR>An error has occurred during the Statement/ResultSet phase.  Please check the syntax and study the Exception details!");
			}
			try {
				stmt = con.createStatement();
				id+=1;
				String createUser = "INSERT INTO EE_USER.MLECE_USERS ( "
						+ "USERID, SURNAME, FIRSTNAME, EMAIL, USERNAME, PASSWORD, COUNTRY )"
						+ "VALUES ("
						+ id + ", '" + surname + "', '" + firstname + "', '"
						+ email + "', '" + uname + "', '" + pword + "', '"
						+ country +"' )";
				System.out.println(createUser);
				stmt.executeQuery(createUser);
			} catch (Exception e) {
				System.out.println(e);
			}
			finally {
				try {
					if (rs != null)
						rs.close();
					if (stmt != null)
						stmt.close();
					if (con != null)
						con.close();
				} catch (Exception ex) {
					System.out.println("<BR>An error occurred while closing down connection/statement");
				}
			}
		} else {
		}
	}
}
