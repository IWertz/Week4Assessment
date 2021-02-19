<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<h1>Conversion Machine</h1>
<form action="convertToPeso" method="post">
Enter the USD amount to be converted to Peso:
<input type="text" name="userMoney" size="10">
<input type="submit" value="Calculate" />
</form>
<form action="convertToYen" method="post">
Enter the USD amount to be converted to Yen:
<input type="text" name="userMoney" size="10">
<input type="submit" value="Calculate" />
</form>
</body>
</html>