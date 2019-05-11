<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Notarias findWhereNombreEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Notarias dto[] = (Notarias[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idNotaria</td>
	<td>nombre</td>
	<td>razonSocial</td>
	<td>direccion</td>
	<td>telefono</td>
	<td>idComuna</td>
	<td>creado</td>
	<td>modificado</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Notarias value = dto[i];
%>
<tr>
	<td><%= value.getIdNotaria() %></td>
	<td><%= value.getNombre() %></td>
	<td><%= value.getRazonSocial() %></td>
	<td><%= value.getDireccion() %></td>
	<td><%= value.getTelefono() %></td>
	<td><%= value.getIdComuna() %></td>
	<td><%= value.getCreado() %></td>
	<td><%= value.getModificado() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
