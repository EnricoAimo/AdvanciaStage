package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrimoServlet") 						// nome dove trovare l'app

public class PrimoServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public PrimoServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			resp.setContentType("text/html");
//			PrintWriter risposta = resp.getWriter();
//			risposta.println("risposta del server get<br>");	
//			Map<String, String[]> pm = req.getParameterMap();
//			 pm.forEach( (k,v)-> risposta.println(k+"<br>"));
//			risposta.println("benvenuto "+ req.getParameter("testoG"));		
//			risposta.close();
			
			resp.sendRedirect("http://www.gazzetta.it");
			
			
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter risposta = resp.getWriter();
		risposta.println("risposta del server post<br>");		
		
		 Map<String, String[]> pm = req.getParameterMap();
		 pm.forEach( (k,v)-> risposta.println(k+"<br>"));
		risposta.println("benvenuto "+ req.getParameter("testoP"));		
		 
		risposta.close();
	}
	
	
	
}
