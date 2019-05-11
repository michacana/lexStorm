<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>FormaPago findWhereNombreEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
FormaPago dto[] = (FormaPago[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idFormaPago</td>
	<td>nombre</td>
	<td>cantidadCuotas</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	FormaPago value = dto[i];
%>
<tr>
	<td><%= value.getIdFormaPago() %></td>
	<td><%= value.getNombre() %></td>
	<td><%= value.getCantidadCuotas() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
