package com.Abogados.Lex.servlet.actions;

import com.Abogados.Lex.servlet.*;
import com.Abogados.Lex.dao.*;
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.factory.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContratoEstadosFindWhereNombreEqualsWebAction extends WebAction
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
			java.lang.String nombre = parseString( request, "nombre" );
		
			// create the DAO class
			ContratoEstadosDao dao = ContratoEstadosDaoFactory.create();
		
			// execute the finder
			ContratoEstados dto[] = dao.findWhereNombreEquals(nombre);
		
			// store the results
			request.setAttribute( "result", dto );
		
			// forward request on to the appropriate JSP page to display the results
			forward( servlet, request, response, "/ContratoEstadosFindWhereNombreEqualsResult.jsp" );
		}
		catch (Exception e) {
			throw new ServletException( "Failed to process request", e );
		}
		
	}

}
