<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Pagos findByContratos Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Pagos dto[] = (Pagos[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idPago</td>
	<td>fechaHora</td>
	<td>monto</td>
	<td>creado</td>
	<td>modificado</td>
	<td>idContrato</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Pagos value = dto[i];
%>
<tr>
	<td><%= value.getIdPago() %></td>
	<td><%= value.getFechaHora() %></td>
	<td><%= value.getMonto() %></td>
	<td><%= value.getCreado() %></td>
	<td><%= value.getModificado() %></td>
	<td><%= value.getIdContrato() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
