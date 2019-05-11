<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Contratos findByFormaPago Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Contratos dto[] = (Contratos[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idContrato</td>
	<td>fechaInicio</td>
	<td>fechaTermino</td>
	<td>idContratoEstado</td>
	<td>idDetalleContrato</td>
	<td>idPresupuesto</td>
	<td>idAbogado</td>
	<td>idPlanPago</td>
	<td>creado</td>
	<td>modificado</td>
	<td>aprobadoAbogado</td>
	<td>aprobadoCliente</td>
	<td>idFormaPago</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Contratos value = dto[i];
%>
<tr>
	<td><%= value.getIdContrato() %></td>
	<td><%= value.getFechaInicio() %></td>
	<td><%= value.getFechaTermino() %></td>
	<td><%= value.getIdContratoEstado() %></td>
	<td><%= value.getIdDetalleContrato() %></td>
	<td><%= value.getIdPresupuesto() %></td>
	<td><%= value.getIdAbogado() %></td>
	<td><%= value.getIdPlanPago() %></td>
	<td><%= value.getCreado() %></td>
	<td><%= value.getModificado() %></td>
	<td><%= value.getAprobadoAbogado() %></td>
	<td><%= value.getAprobadoCliente() %></td>
	<td><%= value.getIdFormaPago() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
