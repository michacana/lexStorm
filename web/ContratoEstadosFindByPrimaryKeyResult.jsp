<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>ContratoEstados findByPrimaryKey Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
ContratoEstados dto = (ContratoEstados) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idContratoEstado</td>
	<td>nombre</td>
</tr>
<%
if (dto != null) {
	ContratoEstados value = dto;
%>
<tr>
	<td><%= value.getIdContratoEstado() %></td>
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
