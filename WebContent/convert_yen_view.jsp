<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yen Conversion</title>
</head>
<body>
<p>${userYen.getCurrency()} dollars will be converted to: <br>
${userYen.getYen()} yen. </p>
<a href="index.jsp">Select another amount to convert</a>
</body>
</html>