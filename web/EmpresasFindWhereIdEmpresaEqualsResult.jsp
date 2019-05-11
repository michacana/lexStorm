<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Empresas findWhereIdEmpresaEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Empresas dto[] = (Empresas[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idEmpresa</td>
	<td>nombre</td>
	<td>razonSocial</td>
	<td>direccion</td>
	<td>telefono</td>
	<td>creado</td>
	<td>modificado</td>
	<td>idComuna</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Empresas value = dto[i];
%>
<tr>
	<td><%= value.getIdEmpresa() %></td>
	<td><%= value.getNombre() %></td>
	<td><%= value.getRazonSocial() %></td>
	<td><%= value.getDireccion() %></td>
	<td><%= value.getTelefono() %></td>
	<td><%= value.getCreado() %></td>
	<td><%= value.getModificado() %></td>
	<td><%= value.getIdComuna() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
