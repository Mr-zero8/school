<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>

<h2>提交的学生信息如下 - </h2>
   <table>
    <tr>
        <td>发信ID：</td>
        <td>${faid}</td>
    </tr>
    <tr>
        <td>接信ID：</td>
        <td>${jieid}</td>
    </tr>
    <tr>
        <td>说了啥：</td>
        <td>${text}</td>
    </tr>
</table>  
</body>
</html>