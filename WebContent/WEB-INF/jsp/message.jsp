<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
/*    $(document).ready(function(){
       $("#account").blur(function(){ // 账号检测
           console.log("有反应 blur");
           var account = document.getElementById("account");
           console.log("account="+account.value);
           //alert("进来了");
           $.ajax({
                type: "POST",
                url: "user/checkacc.do",
                data: "account="+account.value,
                success: function(msg){
                    //alert("msg:"+msg);
                    console.log("msg:"+msg);
                    var acc_msg = document.getElementById("acc_msg");
                    if(msg == "ok"){
                       acc_msg.innerHTML = '';
                       return;
                    }else{
                       account.value = '';
                       acc_msg.innerHTML = msg;
                    }
                }
           }); 
       });

       $("#checkpwd").blur(function(){ // 用ajax确认密码
           var password = document.getElementById("password");
           var checkpwd = document.getElementById("checkpwd");
           $.ajax({
               type: "POST",
               url: "user/checkpwd.do",
               data: "password="+password.value+"&checkpwd="+checkpwd.value,
               success: function(msg){
                    console.log("pwd.msg="+msg);
                    var checkpwd_msg = document.getElementById("checkpwd_msg");
                    if(msg == "ok"){
                       checkpwd_msg.innerHTML = '';
                       return;
                    }else{
                       checkpwd.value = '';
                       checkpwd_msg.innerHTML = msg;
                    }
               }
           });
       });

   });  */

   function checkPhoto(myupload){ // 检测上传是否符合要求
       var file=document.getElementById("fileimg");
       var types=file.value.substr(file.value.lastIndexOf(".")+1).toLowerCase();
       if(file.value==""){        
          alert("请选择图片后上传");
          return false;
       }else if(types!="jpg" && types!="png"){
          alert("只能上传jpg,png格式的图片");
          return false;
       }
   }
</script>

</head>
<body>
 <table>
    <tr>
        <td>接受者：</td>
        <td>${name}</td>
    </tr>
    	    <c:forEach items="${list}" var="c" varStatus="st">
	        <tr>
	            <td>${c.faUserID}</td>
	            <td>${c.jieUserID}</td>
	            <td>${c.text}</td>
	            <td><img src="${c.image}"></td>
	        </tr>
	    </c:forEach> 
</table>

 <form:form method="POST" action="xiexin" enctype="multipart/form-data" onsubmit="return checkPhoto(this)">
   <table>
    <tr>
        <td><form:label path="faUserID" >发者ID：</form:label></td>
        <td><form:input path="faUserID" value="${id}"/></td>
    </tr>
    <tr>
        <td><form:label path="jieUserID">接者ID：</form:label></td>
        <td><form:input path="jieUserID" /></td>
    </tr>
    <tr>
        <td><form:label path="text">说了啥：</form:label></td>
        <td><form:input path="text" /></td>
        <input type='hidden'  id='image' name="image" value =""/>
    </tr>
    <tr>
             <td>上传图片：</td>
             <td><input type="file" name="fileimg" id="fileimg">
             <span class="s1" id="img_msg"></span>
             </td>
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