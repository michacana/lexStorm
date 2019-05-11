<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>NotariasUsuarios findByNotarias Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
NotariasUsuarios dto[] = (NotariasUsuarios[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idNotaria</td>
	<td>idUsuario</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	NotariasUsuarios value = dto[i];
%>
<tr>
	<td><%= value.getIdNotaria() %></td>
	<td><%= value.getIdUsuario() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
