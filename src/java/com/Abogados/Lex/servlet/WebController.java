package com.Abogados.Lex.servlet;

import com.Abogados.Lex.servlet.actions.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WebController extends HttpServlet
{
	protected Map actionMap;

	/**
	 * Method 'WebController'
	 * 
	 */
	public WebController()
	{
		actionMap = new HashMap();
		actionMap.put( "CausasFindByPrimaryKey", CausasFindByPrimaryKeyWebAction.class );
		actionMap.put( "CausasFindAll", CausasFindAllWebAction.class );
		actionMap.put( "CausasFindByContratos", CausasFindByContratosWebAction.class );
		actionMap.put( "CausasFindByTribunal", CausasFindByTribunalWebAction.class );
		actionMap.put( "CausasFindWhereIdCausaEquals", CausasFindWhereIdCausaEqualsWebAction.class );
		actionMap.put( "CausasFindWhereRolEquals", CausasFindWhereRolEqualsWebAction.class );
		actionMap.put( "CausasFindWhereFechaEquals", CausasFindWhereFechaEqualsWebAction.class );
		actionMap.put( "CausasFindWhereCaratulaEquals", CausasFindWhereCaratulaEqualsWebAction.class );
		actionMap.put( "CausasFindWhereIdContratoEquals", CausasFindWhereIdContratoEqualsWebAction.class );
		actionMap.put( "CausasFindWhereIdTribunalEquals", CausasFindWhereIdTribunalEqualsWebAction.class );
		actionMap.put( "CitaEstadosFindByPrimaryKey", CitaEstadosFindByPrimaryKeyWebAction.class );
		actionMap.put( "CitaEstadosFindAll", CitaEstadosFindAllWebAction.class );
		actionMap.put( "CitaEstadosFindWhereIdEstadoCitaEquals", CitaEstadosFindWhereIdEstadoCitaEqualsWebAction.class );
		actionMap.put( "CitaEstadosFindWhereNombreEquals", CitaEstadosFindWhereNombreEqualsWebAction.class );
		actionMap.put( "CitasFindByPrimaryKey", CitasFindByPrimaryKeyWebAction.class );
		actionMap.put( "CitasFindAll", CitasFindAllWebAction.class );
		actionMap.put( "CitasFindByCitaEstados", CitasFindByCitaEstadosWebAction.class );
		actionMap.put( "CitasFindByNotarias", CitasFindByNotariasWebAction.class );
		actionMap.put( "CitasFindWhereIdCitaEquals", CitasFindWhereIdCitaEqualsWebAction.class );
		actionMap.put( "CitasFindWhereFechaHoraEquals", CitasFindWhereFechaHoraEqualsWebAction.class );
		actionMap.put( "CitasFindWhereIdNotariaEquals", CitasFindWhereIdNotariaEqualsWebAction.class );
		actionMap.put( "CitasFindWhereIdEstadoCitaEquals", CitasFindWhereIdEstadoCitaEqualsWebAction.class );
		actionMap.put( "ComunaFindByPrimaryKey", ComunaFindByPrimaryKeyWebAction.class );
		actionMap.put( "ComunaFindAll", ComunaFindAllWebAction.class );
		actionMap.put( "ComunaFindByProvincia", ComunaFindByProvinciaWebAction.class );
		actionMap.put( "ComunaFindWhereIdComunaEquals", ComunaFindWhereIdComunaEqualsWebAction.class );
		actionMap.put( "ComunaFindWhereNombreEquals", ComunaFindWhereNombreEqualsWebAction.class );
		actionMap.put( "ComunaFindWhereIdProvinciaEquals", ComunaFindWhereIdProvinciaEqualsWebAction.class );
		actionMap.put( "ContratoDetallesFindByPrimaryKey", ContratoDetallesFindByPrimaryKeyWebAction.class );
		actionMap.put( "ContratoDetallesFindAll", ContratoDetallesFindAllWebAction.class );
		actionMap.put( "ContratoDetallesFindWhereIdDetalleContratoEquals", ContratoDetallesFindWhereIdDetalleContratoEqualsWebAction.class );
		actionMap.put( "ContratoDetallesFindWhereServicioEquals", ContratoDetallesFindWhereServicioEqualsWebAction.class );
		actionMap.put( "ContratoDetallesFindWhereMontoEquals", ContratoDetallesFindWhereMontoEqualsWebAction.class );
		actionMap.put( "ContratoEstadosFindByPrimaryKey", ContratoEstadosFindByPrimaryKeyWebAction.class );
		actionMap.put( "ContratoEstadosFindAll", ContratoEstadosFindAllWebAction.class );
		actionMap.put( "ContratoEstadosFindWhereIdContratoEstadoEquals", ContratoEstadosFindWhereIdContratoEstadoEqualsWebAction.class );
		actionMap.put( "ContratoEstadosFindWhereNombreEquals", ContratoEstadosFindWhereNombreEqualsWebAction.class );
		actionMap.put( "ContratosFindByPrimaryKey", ContratosFindByPrimaryKeyWebAction.class );
		actionMap.put( "ContratosFindAll", ContratosFindAllWebAction.class );
		actionMap.put( "ContratosFindByContratoDetalles", ContratosFindByContratoDetallesWebAction.class );
		actionMap.put( "ContratosFindByContratoEstados", ContratosFindByContratoEstadosWebAction.class );
		actionMap.put( "ContratosFindByFormaPago", ContratosFindByFormaPagoWebAction.class );
		actionMap.put( "ContratosFindByPlanPago", ContratosFindByPlanPagoWebAction.class );
		actionMap.put( "ContratosFindByPresupuestos", ContratosFindByPresupuestosWebAction.class );
		actionMap.put( "ContratosFindByUsuarios", ContratosFindByUsuariosWebAction.class );
		actionMap.put( "ContratosFindWhereIdContratoEquals", ContratosFindWhereIdContratoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereFechaInicioEquals", ContratosFindWhereFechaInicioEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereFechaTerminoEquals", ContratosFindWhereFechaTerminoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereIdContratoEstadoEquals", ContratosFindWhereIdContratoEstadoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereIdDetalleContratoEquals", ContratosFindWhereIdDetalleContratoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereIdPresupuestoEquals", ContratosFindWhereIdPresupuestoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereIdAbogadoEquals", ContratosFindWhereIdAbogadoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereIdPlanPagoEquals", ContratosFindWhereIdPlanPagoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereCreadoEquals", ContratosFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereModificadoEquals", ContratosFindWhereModificadoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereAprobadoAbogadoEquals", ContratosFindWhereAprobadoAbogadoEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereAprobadoClienteEquals", ContratosFindWhereAprobadoClienteEqualsWebAction.class );
		actionMap.put( "ContratosFindWhereIdFormaPagoEquals", ContratosFindWhereIdFormaPagoEqualsWebAction.class );
		actionMap.put( "ContratosClientesFindByPrimaryKey", ContratosClientesFindByPrimaryKeyWebAction.class );
		actionMap.put( "ContratosClientesFindAll", ContratosClientesFindAllWebAction.class );
		actionMap.put( "ContratosClientesFindByContratos", ContratosClientesFindByContratosWebAction.class );
		actionMap.put( "ContratosClientesFindByEmpresas", ContratosClientesFindByEmpresasWebAction.class );
		actionMap.put( "ContratosClientesFindByUsuarios", ContratosClientesFindByUsuariosWebAction.class );
		actionMap.put( "ContratosClientesFindWhereIdContratoEquals", ContratosClientesFindWhereIdContratoEqualsWebAction.class );
		actionMap.put( "ContratosClientesFindWhereIdUsuarioEquals", ContratosClientesFindWhereIdUsuarioEqualsWebAction.class );
		actionMap.put( "ContratosClientesFindWhereIdEmpresaEquals", ContratosClientesFindWhereIdEmpresaEqualsWebAction.class );
		actionMap.put( "ContratosClientesFindWhereCreadoEquals", ContratosClientesFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "ContratosClientesFindWhereModificadoEquals", ContratosClientesFindWhereModificadoEqualsWebAction.class );
		actionMap.put( "DiligenciasFindByPrimaryKey", DiligenciasFindByPrimaryKeyWebAction.class );
		actionMap.put( "DiligenciasFindAll", DiligenciasFindAllWebAction.class );
		actionMap.put( "DiligenciasFindByCausas", DiligenciasFindByCausasWebAction.class );
		actionMap.put( "DiligenciasFindWhereIdDiligenciaEquals", DiligenciasFindWhereIdDiligenciaEqualsWebAction.class );
		actionMap.put( "DiligenciasFindWhereFechaHoraEquals", DiligenciasFindWhereFechaHoraEqualsWebAction.class );
		actionMap.put( "DiligenciasFindWhereDescripcionEquals", DiligenciasFindWhereDescripcionEqualsWebAction.class );
		actionMap.put( "DiligenciasFindWhereIdCausaEquals", DiligenciasFindWhereIdCausaEqualsWebAction.class );
		actionMap.put( "DocEstadosFindByPrimaryKey", DocEstadosFindByPrimaryKeyWebAction.class );
		actionMap.put( "DocEstadosFindAll", DocEstadosFindAllWebAction.class );
		actionMap.put( "DocEstadosFindWhereIdEstadoDocEquals", DocEstadosFindWhereIdEstadoDocEqualsWebAction.class );
		actionMap.put( "DocEstadosFindWhereNombreEquals", DocEstadosFindWhereNombreEqualsWebAction.class );
		actionMap.put( "DocumentosFindByPrimaryKey", DocumentosFindByPrimaryKeyWebAction.class );
		actionMap.put( "DocumentosFindAll", DocumentosFindAllWebAction.class );
		actionMap.put( "DocumentosFindByContratos", DocumentosFindByContratosWebAction.class );
		actionMap.put( "DocumentosFindWhereIdDocumentoEquals", DocumentosFindWhereIdDocumentoEqualsWebAction.class );
		actionMap.put( "DocumentosFindWhereUrlEquals", DocumentosFindWhereUrlEqualsWebAction.class );
		actionMap.put( "DocumentosFindWhereCreadoEquals", DocumentosFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "DocumentosFindWhereIdContratoEquals", DocumentosFindWhereIdContratoEqualsWebAction.class );
		actionMap.put( "DocumentosCitasFindByPrimaryKey", DocumentosCitasFindByPrimaryKeyWebAction.class );
		actionMap.put( "DocumentosCitasFindAll", DocumentosCitasFindAllWebAction.class );
		actionMap.put( "DocumentosCitasFindByCitas", DocumentosCitasFindByCitasWebAction.class );
		actionMap.put( "DocumentosCitasFindByDocEstados", DocumentosCitasFindByDocEstadosWebAction.class );
		actionMap.put( "DocumentosCitasFindByDocumentos", DocumentosCitasFindByDocumentosWebAction.class );
		actionMap.put( "DocumentosCitasFindWhereIdCitaEquals", DocumentosCitasFindWhereIdCitaEqualsWebAction.class );
		actionMap.put( "DocumentosCitasFindWhereIdDocumentoEquals", DocumentosCitasFindWhereIdDocumentoEqualsWebAction.class );
		actionMap.put( "DocumentosCitasFindWhereIdEstadoDocEquals", DocumentosCitasFindWhereIdEstadoDocEqualsWebAction.class );
		actionMap.put( "DocumentosCitasFindWhereCreadoEquals", DocumentosCitasFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "EmpresaClientesFindByPrimaryKey", EmpresaClientesFindByPrimaryKeyWebAction.class );
		actionMap.put( "EmpresaClientesFindAll", EmpresaClientesFindAllWebAction.class );
		actionMap.put( "EmpresaClientesFindByEmpresas", EmpresaClientesFindByEmpresasWebAction.class );
		actionMap.put( "EmpresaClientesFindByUsuarios", EmpresaClientesFindByUsuariosWebAction.class );
		actionMap.put( "EmpresaClientesFindWhereIdEmpresaEquals", EmpresaClientesFindWhereIdEmpresaEqualsWebAction.class );
		actionMap.put( "EmpresaClientesFindWhereIdUsuarioEquals", EmpresaClientesFindWhereIdUsuarioEqualsWebAction.class );
		actionMap.put( "EmpresasFindByPrimaryKey", EmpresasFindByPrimaryKeyWebAction.class );
		actionMap.put( "EmpresasFindAll", EmpresasFindAllWebAction.class );
		actionMap.put( "EmpresasFindByComuna", EmpresasFindByComunaWebAction.class );
		actionMap.put( "EmpresasFindWhereIdEmpresaEquals", EmpresasFindWhereIdEmpresaEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereNombreEquals", EmpresasFindWhereNombreEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereRazonSocialEquals", EmpresasFindWhereRazonSocialEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereDireccionEquals", EmpresasFindWhereDireccionEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereTelefonoEquals", EmpresasFindWhereTelefonoEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereCreadoEquals", EmpresasFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereModificadoEquals", EmpresasFindWhereModificadoEqualsWebAction.class );
		actionMap.put( "EmpresasFindWhereIdComunaEquals", EmpresasFindWhereIdComunaEqualsWebAction.class );
		actionMap.put( "FormaPagoFindByPrimaryKey", FormaPagoFindByPrimaryKeyWebAction.class );
		actionMap.put( "FormaPagoFindAll", FormaPagoFindAllWebAction.class );
		actionMap.put( "FormaPagoFindWhereIdFormaPagoEquals", FormaPagoFindWhereIdFormaPagoEqualsWebAction.class );
		actionMap.put( "FormaPagoFindWhereNombreEquals", FormaPagoFindWhereNombreEqualsWebAction.class );
		actionMap.put( "FormaPagoFindWhereCantidadCuotasEquals", FormaPagoFindWhereCantidadCuotasEqualsWebAction.class );
		actionMap.put( "NotariasFindByPrimaryKey", NotariasFindByPrimaryKeyWebAction.class );
		actionMap.put( "NotariasFindAll", NotariasFindAllWebAction.class );
		actionMap.put( "NotariasFindByComuna", NotariasFindByComunaWebAction.class );
		actionMap.put( "NotariasFindWhereIdNotariaEquals", NotariasFindWhereIdNotariaEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereNombreEquals", NotariasFindWhereNombreEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereRazonSocialEquals", NotariasFindWhereRazonSocialEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereDireccionEquals", NotariasFindWhereDireccionEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereTelefonoEquals", NotariasFindWhereTelefonoEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereIdComunaEquals", NotariasFindWhereIdComunaEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereCreadoEquals", NotariasFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "NotariasFindWhereModificadoEquals", NotariasFindWhereModificadoEqualsWebAction.class );
		actionMap.put( "NotariasUsuariosFindByPrimaryKey", NotariasUsuariosFindByPrimaryKeyWebAction.class );
		actionMap.put( "NotariasUsuariosFindAll", NotariasUsuariosFindAllWebAction.class );
		actionMap.put( "NotariasUsuariosFindByNotarias", NotariasUsuariosFindByNotariasWebAction.class );
		actionMap.put( "NotariasUsuariosFindByUsuarios", NotariasUsuariosFindByUsuariosWebAction.class );
		actionMap.put( "NotariasUsuariosFindWhereIdNotariaEquals", NotariasUsuariosFindWhereIdNotariaEqualsWebAction.class );
		actionMap.put( "NotariasUsuariosFindWhereIdUsuarioEquals", NotariasUsuariosFindWhereIdUsuarioEqualsWebAction.class );
		actionMap.put( "PagosFindByPrimaryKey", PagosFindByPrimaryKeyWebAction.class );
		actionMap.put( "PagosFindAll", PagosFindAllWebAction.class );
		actionMap.put( "PagosFindByContratos", PagosFindByContratosWebAction.class );
		actionMap.put( "PagosFindWhereIdPagoEquals", PagosFindWhereIdPagoEqualsWebAction.class );
		actionMap.put( "PagosFindWhereFechaHoraEquals", PagosFindWhereFechaHoraEqualsWebAction.class );
		actionMap.put( "PagosFindWhereMontoEquals", PagosFindWhereMontoEqualsWebAction.class );
		actionMap.put( "PagosFindWhereCreadoEquals", PagosFindWhereCreadoEqualsWebAction.class );
		actionMap.put( "PagosFindWhereModificadoEquals", PagosFindWhereModificadoEqualsWebAction.class );
		actionMap.put( "PagosFindWhereIdContratoEquals", PagosFindWhereIdContratoEqualsWebAction.class );
		actionMap.put( "PlanPagoFindByPrimaryKey", PlanPagoFindByPrimaryKeyWebAction.class );
		actionMap.put( "PlanPagoFindAll", PlanPagoFindAllWebAction.class );
		actionMap.put( "PlanPagoFindWhereIdPlanPagoEquals", PlanPagoFindWhereIdPlanPagoEqualsWebAction.class );
		actionMap.put( "PlanPagoFindWhereNombreEquals", PlanPagoFindWhereNombreEqualsWebAction.class );
		actionMap.put( "PresupuestoDetallesFindByPrimaryKey", PresupuestoDetallesFindByPrimaryKeyWebAction.class );
		actionMap.put( "PresupuestoDetallesFindAll", PresupuestoDetallesFindAllWebAction.class );
		actionMap.put( "PresupuestoDetallesFindWhereIdDetallePresupuestoEquals", PresupuestoDetallesFindWhereIdDetallePresupuestoEqualsWebAction.class );
		actionMap.put( "PresupuestoDetallesFindWhereServicioEquals", PresupuestoDetallesFindWhereServicioEqualsWebAction.class );
		actionMap.put( "PresupuestoDetallesFindWhereMontoEquals", PresupuestoDetallesFindWhereMontoEqualsWebAction.class );
	}

	/**
	 * Method 'doPost'
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		try {
			// get the action parameter
			String action = request.getParameter( "action" );
			if (action == null) {
				throw new ServletException( "Parameter 'action' is required" );
			}
		
			// create the appropriate WebAction class
			Class webActionClass = (Class) actionMap.get( action );
			if (webActionClass == null) {
				throw new ServletException( "Invalid action '" + action + "'" );
			}
		
			// instantiate the action class and execute it
			WebAction webAction = (WebAction) webActionClass.newInstance();
			webAction.execute( this, request, response );
		}
		catch (ServletException e) {
			throw e;
		}
		catch (Exception e) {
			throw new ServletException( "Failed to process request:" + e.getMessage(), e );
		}
		
	}

	/**
	 * Method 'doGet'
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		doPost( request, response );
	}

}
