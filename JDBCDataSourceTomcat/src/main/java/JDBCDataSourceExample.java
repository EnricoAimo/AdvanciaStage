
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/JDBCDataSourceExample")
public class JDBCDataSourceExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Context ctx = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyLocalDB");

			con = ds.getConnection();
			stmt = con.createStatement();

			result = stmt.executeQuery("select * from titoli");

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("<html><body><h2></h2>");
			out.print("<table border=\"1\" cellspacing=10 cellpadding=5>");
			out.print("<th>Id</th>");
			out.print("<th>Name</th>");
			out.print("<th>Quantity</th>");
			out.print("<th>Value</th>");
			out.print("<th>Duration</th>");
			out.print("<th>Interst</th>");
			out.print("<th>Imin</th>");
			out.print("<th>Risk</th>");

			while (result.next()) {
				out.print("<tr>");
				out.print("<td>" + result.getString("id") + "</td>");
				out.print("<td>" + result.getString("name") + "</td>");
				out.print("<td>" + result.getInt("quantity") + "</td>");
				out.print("<td>" + result.getDouble("value") + "</td>");
				out.print("<td>" + result.getInt("duration") + "</td>");
				out.print("<td>" + result.getInt("interst") + "</td>");
				out.print("<td>" + result.getInt("imin") + "</td>");
				out.print("<td>" + result.getInt("risk") + "</td>");
				out.print("</tr>");
			}
			out.print("</table></body><br/>");

			// lets print some DB information
			out.print("<h3>Database Details</h3>");
			out.print("Database Product: " + con.getMetaData().getDatabaseProductName() + "<br/>");
			out.print("Database Driver: " + con.getMetaData().getDriverName());
			out.print("</html>");

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				con.close();
				ctx.close();
			} catch (SQLException e) {
				System.out.println("Exception in closing DB resources");
			} catch (NamingException e) {
				System.out.println("Exception in closing Context");
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
