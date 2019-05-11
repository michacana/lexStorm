<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Diligencias findWhereDescripcionEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Diligencias dto[] = (Diligencias[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idDiligencia</td>
	<td>fechaHora</td>
	<td>descripcion</td>
	<td>idCausa</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Diligencias value = dto[i];
%>
<tr>
	<td><%= value.getIdDiligencia() %></td>
	<td><%= value.getFechaHora() %></td>
	<td><%= value.getDescripcion() %></td>
	<td><%= value.getIdCausa() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
