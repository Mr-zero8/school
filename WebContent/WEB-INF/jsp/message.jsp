<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table>
    <tr>
        <td>发送者：</td>
        <td>${name}</td>
    </tr>
    	    <c:forEach items="${list}" var="c" varStatus="st">
	        <tr>
	            <td>${c.faUserID}</td>
	            <td>${c.jieUserID}</td>
	            <td>${c.text}</td>
	        </tr>
	    </c:forEach>
</table>

<form:form method="POST" action="xiexin">
   <table>
    <tr>
        <td><form:label path="faUserID">发者ID：</form:label></td>
        <td><form:input path="faUserID" /></td>
    </tr>
    <tr>
        <td><form:label path="jieUserID">接者ID：</form:label></td>
        <td><form:input path="jieUserID" /></td>
    </tr>
    <tr>
        <td><form:label path="text">说了啥：</form:label></td>
        <td><form:input path="text" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="私信"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>