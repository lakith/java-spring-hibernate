<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="row" items="${offers}">
  <div>  ID: ${row.id}<br/> </div>
  <div>  Name: ${row.name}<br/> </div>
  <div>  Email: ${row.email}<br/> </div>
  <div>  Text: ${row.text}<br/> </div>
</c:forEach>

</body>
</html>