<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Causas findWhereRolEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Causas dto[] = (Causas[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idCausa</td>
	<td>rol</td>
	<td>fecha</td>
	<td>caratula</td>
	<td>idContrato</td>
	<td>idTribunal</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Causas value = dto[i];
%>
<tr>
	<td><%= value.getIdCausa() %></td>
	<td><%= value.getRol() %></td>
	<td><%= value.getFecha() %></td>
	<td><%= value.getCaratula() %></td>
	<td><%= value.getIdContrato() %></td>
	<td><%= value.getIdTribunal() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
