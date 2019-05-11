<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Documentos findAll Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Documentos dto[] = (Documentos[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idDocumento</td>
	<td>url</td>
	<td>creado</td>
	<td>idContrato</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Documentos value = dto[i];
%>
<tr>
	<td><%= value.getIdDocumento() %></td>
	<td><%= value.getUrl() %></td>
	<td><%= value.getCreado() %></td>
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
