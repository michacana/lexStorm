<html>
<head>
<LINK REL="stylesheet" href="styles.css" type="text/css" >
</head>

<table border="1" width="95%">
<tr>
<td width="15%" valign="top"><%@include file="Nav.jsp" %></td>
<td width="85%" valign="top"><h1>Contratos FindByUsuarios</h1>
<form action="action?action=ContratosFindByUsuarios" method="POST">
<table>
<tr>
<td>idAbogado</td>
<td>
<input type="text" name="idAbogado">
</td>
</tr>
</table>
<input type="submit">
</form>
</td>
</tr>
</table>

</html>
