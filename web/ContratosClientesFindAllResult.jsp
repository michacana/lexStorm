<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>ContratosClientes findAll Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
ContratosClientes dto[] = (ContratosClientes[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idContrato</td>
	<td>idUsuario</td>
	<td>idEmpresa</td>
	<td>creado</td>
	<td>modificado</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	ContratosClientes value = dto[i];
%>
<tr>
	<td><%= value.getIdContrato() %></td>
	<td><%= value.getIdUsuario() %></td>
	<td><%= value.getIdEmpresa() %></td>
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
