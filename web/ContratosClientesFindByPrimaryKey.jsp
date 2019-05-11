<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>ContratosClientes FindByPrimaryKey</h1>
<form action="action?action=ContratosClientesFindByPrimaryKey" method="POST">
<table>
<tr>
<td>idContrato</td>
<td>
<input type="text" name="idContrato">
</td>
</tr>
</table>
<tr>
<td>idUsuario</td>
<td>
<input type="text" name="idUsuario">
</td>
</tr>
</table>
<tr>
<td>idEmpresa</td>
<td>
<input type="text" name="idEmpresa">
</td>
</tr>
</table>
<input type="submit">
</form>
</td>
</tr>
</table>

</html>
