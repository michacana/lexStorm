<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Comuna findByProvincia Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Comuna dto[] = (Comuna[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idComuna</td>
	<td>nombre</td>
	<td>idProvincia</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Comuna value = dto[i];
%>
<tr>
	<td><%= value.getIdComuna() %></td>
	<td><%= value.getNombre() %></td>
	<td><%= value.getIdProvincia() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
