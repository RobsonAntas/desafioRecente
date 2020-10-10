package br.com.ridaccenture;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ridCodeaccenture.Logica;

public class Ridservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    
		String nomeClasse = "br.com.ridCodeaccenture.Logica";
	    try {
			Class<?> classe =Class.forName(nomeClasse, true, getClass().getClassLoader());
			Logica logica = (Logica) classe.getDeclaredConstructor().newInstance();
			String pagina = logica.traduz(request, response);
			request.getRequestDispatcher(pagina).forward(request, response);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
 }

	

}
