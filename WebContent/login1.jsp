<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

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




<body>
<!-- <form action="login1">
<tr>用户名<input type="text" name="username"></tr>
<tr>密码<input type="text" name="password"></tr>
<input type="submit" value="登录">
</form> -->

<div class="div1">
   <h1 align="center">注  册</h1>
   <form action="register1" method="post" enctype="multipart/form-data" onsubmit="return checkPhoto(this)">
      <table>
          <tr>
             <td>账号：</td>
             <td><input type="text" name="username" id="username" >
                  <span class="s1" id="acc_msg"></span>
             </td>
          </tr>
          <tr>
             <td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
             <td><input type="password" name="password" id="password">
             <span class="s1" id="pwd_msg"></span>
             </td>
          </tr>
<!--           <tr>
             <td>确认密码：</td>
             <td><input type="password" name="checkpwd" id="checkpwd">
             <span class="s1" id="checkpwd_msg"></span>
             </td>
          </tr> -->
          <tr>
             <td>上传头像：</td>
             <td><input type="file" name="fileimg" id="fileimg">
             <span class="s1" id="img_msg"></span>
             </td>
          </tr>
          <tr>
          <td colspan="2" align="center">
            <input type="submit" value="注册"/>
            <input type="reset" value="重置"/>
          </td>
        </tr>
      </table>
   </form>
</div>



</body>
</html>