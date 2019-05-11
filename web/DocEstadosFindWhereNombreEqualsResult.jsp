<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>DocEstados findWhereNombreEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
DocEstados dto[] = (DocEstados[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idEstadoDoc</td>
	<td>nombre</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	DocEstados value = dto[i];
%>
<tr>
	<td><%= value.getIdEstadoDoc() %></td>
	<td><%= value.getNombre() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
