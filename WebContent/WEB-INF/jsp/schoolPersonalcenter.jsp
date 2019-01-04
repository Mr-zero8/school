<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

$(document).ready(function(e) {
    $("#cha").click(function(e) {
        $("#renlist").toggle();
    });
    $("input[name='cg']").mouseover(function(e) {
    	$("input[name='panduan']").each(function(){
            $(this).val("cg");
        })
    });
    $("input[name='shibai']").mouseover(function(e) {
    	$("input[name='panduan']").each(function(){
            $(this).val("shibai");
        })
    });
});

  
        </script>

</head>
<body>
 <form action="message" method="get">
 <input type="hidden" name="userid" id="userid" value="${user.id}">
 <input type="submit" value="查看私信">
 </form>
<%-- <button onclick="window.location.href='message?id=${user.id}'">查看私信</button> --%>
头像 <img src="${user.image}">用户名${user.username}
<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
	修改头像
</button>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<form action="xiutouxiang" enctype="multipart/form-data" method="POST">
				<h4 class="modal-title" id="myModalLabel">
					模态框（Modal）标题
					<table>
					    <tr>
             <td>上传图片：</td>
             <td><input type="file" name="fileimg" id="fileimg">
             <span class="s1" id="img_msg"></span>
             </td>
            </tr>
           <input type='hidden'  id='id' name="id" value ="${user.id}"/>
					</table>
				</h4>
			</div>
			<div class="modal-body">

			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="submit" class="btn btn-primary">
					提交更改
				</button>
			</div>
				</form>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
<form action="tie" method="get">
<input type="hidden" name="id" value="${user.id}">
<input type="submit" value="我收藏的帖">
</form>

<button id="cha">查看认证申请</button>
 <table id="renlist" style="display:none">

     	    <c:forEach items="${rens}" var="c" varStatus="st">
	        <tr>
      <form action="renzheng">
     <tr>
        <td>申请认证的学生：${c.username}</td>
    </tr>
         <tr>
        <td><img src="${c.img1}"></td>
    </tr>
         <tr>
        <td><img src="${c.img2}"></td>
    </tr>
         <tr>
        <td><img src="${c.img3}"></td>
    </tr>
     <tr>
     <input type="hidden" name="schoolid" value="${c.schoolid}">
     <input type="hidden" name="username" value="${c.username}">
        <td><input type="submit" id="cg" name="cg" value="认证成功"></td>
        <td><input type="submit" id="shibai" name="shibai" value="认证失败"></td>
        <input type="hidden" name="panduan" id="panduan">
    </tr>
      </form>
	        </tr>
	    </c:forEach>  
</table>

</body>
</html>