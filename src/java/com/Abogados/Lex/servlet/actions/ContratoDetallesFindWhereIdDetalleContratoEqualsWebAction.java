package com.Abogados.Lex.servlet.actions;

import com.Abogados.Lex.servlet.*;
import com.Abogados.Lex.dao.*;
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.factory.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContratoDetallesFindWhereIdDetalleContratoEqualsWebAction extends WebAction
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
			long idDetalleContrato = parseLong( request, "idDetalleContrato" );
		
			// create the DAO class
			ContratoDetallesDao dao = ContratoDetallesDaoFactory.create();
		
			// execute the finder
			ContratoDetalles dto[] = dao.findWhereIdDetalleContratoEquals(idDetalleContrato);
		
			// store the results
			request.setAttribute( "result", dto );
		
			// forward request on to the appropriate JSP page to display the results
			forward( servlet, request, response, "/ContratoDetallesFindWhereIdDetalleContratoEqualsResult.jsp" );
		}
		catch (Exception e) {
			throw new ServletException( "Failed to process request", e );
		}
		
	}

}
