package com.Abogados.Lex.servlet.actions;

import com.Abogados.Lex.servlet.*;
import com.Abogados.Lex.dao.*;
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.factory.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NotariasUsuariosFindByNotariasWebAction extends WebAction
{
	/**
	 * Method 'execute'
	 * 
	 * @param servlet
	 * @param request
	 * @param response
	 * @throws ServletException
	 */
	public void execute(WebController servlet, HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		try {
			// parse parameters
			long idNotaria = parseLong( request, "idNotaria" );
		
			// create the DAO class
			NotariasUsuariosDao dao = NotariasUsuariosDaoFactory.create();
		
			// execute the finder
			NotariasUsuarios dto[] = dao.findByNotarias(idNotaria);
		
			// store the results
			request.setAttribute( "result", dto );
		
			// forward request on to the appropriate JSP page to display the results
			forward( servlet, request, response, "/NotariasUsuariosFindByNotariasResult.jsp" );
		}
		catch (Exception e) {
			throw new ServletException( "Failed to process request", e );
		}
		
	}

}