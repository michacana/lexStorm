<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>DocumentosCitas findAll Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
DocumentosCitas dto[] = (DocumentosCitas[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idCita</td>
	<td>idDocumento</td>
	<td>idEstadoDoc</td>
	<td>creado</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	DocumentosCitas value = dto[i];
%>
<tr>
	<td><%= value.getIdCita() %></td>
	<td><%= value.getIdDocumento() %></td>
	<td><%= value.getIdEstadoDoc() %></td>
	<td><%= value.getCreado() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
