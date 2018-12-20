<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>listTalk</title>
<link
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	    <c:forEach items="${sl}" var="s" varStatus="st">
	        <tr>
	            <td>${s.id}</td>
	            <td>${s.name}</td>
	            <td>${s.titleid}</td>
	            <td>${s.talkcount}</td>
	            <td>${s.concern}</td>
	            <td>${s.location}</td>
	            <td>${s.titleid}</td>
	            <br></br>
	        </tr>
	    </c:forEach>
</body>
</html>