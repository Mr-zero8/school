<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>用户发言 - </h2>
<c:forEach items="${fayanlist}" var="c" varStatus="st">
<form action="">
  <table >
  <tr>
     <td>发言ID：</td>
    <td><input type="text" name="stuName" value="${c.userid}"></td>
  </tr>
    <tr>
    <td>发言：</td>
    <td><input type="text" name="stuName" value="${c.text} }"></td>
  </tr>
    <tr>
   <input type="submit" value="举报">
  </tr>

  </table>
</form>
	    </c:forEach>
</body>
</html>