<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Citas findWhereIdEstadoCitaEquals Results</h1>
<%@ page import="com.Abogados.Lex.dto.*" %>
<%
Citas dto[] = (Citas[]) request.getAttribute( "result" );
%>
<table border="1">
<tr>
	<td>idCita</td>
	<td>fechaHora</td>
	<td>idNotaria</td>
	<td>idEstadoCita</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Citas value = dto[i];
%>
<tr>
	<td><%= value.getIdCita() %></td>
	<td><%= value.getFechaHora() %></td>
	<td><%= value.getIdNotaria() %></td>
	<td><%= value.getIdEstadoCita() %></td>
</tr>
<%
}
%>
</table>
</td>
</tr>
</table>

</html>
