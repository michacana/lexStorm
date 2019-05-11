<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>PresupuestoDetalles findByPrimaryKey Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
PresupuestoDetalles dto = (PresupuestoDetalles) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idDetallePresupuesto</td>
	<td>servicio</td>
	<td>monto</td>
</tr>
<%
if (dto != null) {
	PresupuestoDetalles value = dto;
%>
<tr>
	<td><%= value.getIdDetallePresupuesto() %></td>
	<td><%= value.getServicio() %></td>
	<td><%= value.getMonto() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
