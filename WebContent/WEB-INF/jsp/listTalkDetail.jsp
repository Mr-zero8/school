<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>detail</title>
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
		<c:forEach items="${td}" var="t" varStatus="st">
			<div class="row clearfix">
				<div class="col-md-2 column">
					<center><img alt="140x140" src="${td.authorphoto}"/>
					<br></br>
					<a href="#">${td.authorname}</a></center>
				</div>
				<div class="col-md-8 column">
					<h3>
						${td.authortext}
					</h3>
					<br></br>
					<br></br>
					<br></br>
					<a href="#"  class="pull-right" style="font-size: 18px;">回复</a>
				</div>
				<div class="col-md-2 column">
					<center><h1>1</h1></center>
				</div>
				</c:forEach>
			</div>
		</div>
	</div>
</div>
</body>
</html>