package gr.hua.dit.testjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import javax.sql.*;
/**
 * Servlet implementation class JdbcTest
 */
@WebServlet("/JdbcTest")
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JdbcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setup connection variables
		String jdbcUrl = "jdbc:mysql://83.212.105.20/it21036?useSSL=false";
		String user = "it21036";
		String pass = "343813ms";
		String driver = "com.mysql.jdbc.Driver";

		// get connection to db
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to db: " + jdbcUrl);

			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("Connection Success!");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}
