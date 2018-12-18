<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>listTalk</title>
			<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
   			<script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
   			<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
	    <c:forEach items="${tl}" var="t" varStatus="st">
			<div class="row clearfix">
				<div class="col-md-7 column">
					<h3>
						<span class="badge">${t.talkcount}</span><a href="#">${t.title}</a>
					</h3>
				</div>
				<div class="col-md-2 column">
					<a href="#"	class="glyphicon glyphicon-user">${t.author}</a>
				</div>
				<div class="col-md-3 column">
					<small>
					<h4>开始：${t.starttime}</h></small>
					<small><h4>最新：${t.updatetime}</h>
					</small>
				</div>
			</div>
			</c:forEach>
		</div>
	</div>
</div>
	</body>
</html>