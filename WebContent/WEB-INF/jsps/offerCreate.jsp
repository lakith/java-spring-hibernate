<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="tx" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/CSS/maincss.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>


<div>

	<tx:form id="form" method="post" action="${pageContext.request.contextPath}/offerSuccess" commandName="offer">
	<label>Name</label> <tx:input path ="name" name ="name" type="text"/><tx:errors path="name" cssClass="error"></tx:errors><br><br>
	<label>Email</label> <tx:input path ="email" name ="email" type="text"/><br><br>
	<label>text</label> <tx:textarea path ="text"  name ="text" rows="10" cols="10" ></tx:textarea><br><br> 
	<button type="submit">submit</button>
	</tx:form>

</div>

</body>
</html>