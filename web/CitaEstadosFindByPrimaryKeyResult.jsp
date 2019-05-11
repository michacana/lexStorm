<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>CitaEstados findByPrimaryKey Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
CitaEstados dto = (CitaEstados) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idEstadoCita</td>
	<td>nombre</td>
</tr>
<%
if (dto != null) {
	CitaEstados value = dto;
%>
<tr>
	<td><%= value.getIdEstadoCita() %></td>
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
