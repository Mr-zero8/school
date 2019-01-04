<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 
<html lang="en">
    <head>
        <meta charset="utf-8">
         <script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
        <script type="text/javascript">
        	$(function(){
        		$("#username").blur(function(){
        		$.ajax({
                   	 url:"sendUserName.action",
                   	 type:"GET",
                   
                   	 data:"username="+$("#username").val(),
                   	 timeout:5000,
                    	success:function(data){
                    	if(data == "error"){
                        	//$("#usernameMsg").css("display","inline");
                        	$("#usernameMsg").show(1000);
                    	}else{
                        	$("#usernameMsg").slideUp(1000);
                    		
                    	}
                    },
                    error:function(){
 
                    }
                	})
                });
        		$("#sendidcode").click(function(){
        			if($("#email").val() == ""){
        				$("#sendidcode").attr("disabled","true");
        				$("#sendidcode").val("邮箱地址未填");
        				setTimeout(function(){
	        				$("#sendidcode").removeAttr("disabled");
        					$("#sendidcode").val("发送验证码");
        				},900);
        				return;
        			}
        			var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
        			if(!myreg.test($("#email").val())){
        				$("#sendidcode").attr("disabled","true");
        				$("#sendidcode").val("邮箱格式错误");
        				setTimeout(function(){
	        				$("#sendidcode").removeAttr("disabled");
        					$("#sendidcode").val("发送验证码");
        				},900);
        				return;
        			}
                    $("#sendidcode").attr("value","正在发送");
                    $("#sendidcode").attr("disabled","true");
        			$.ajax({
                    url:"sendIdCode.action",
                    type:"GET",
                    //发送数据的第一种格式，字符串...
                    data:"email="+$("#email").val(),
                    timeout:5000,
                    success:function(data){
                        $("#sendidcode").attr("value","验证码已发送");
                    },
                    error:function(){
 
                    }
                	});
        		});
        		});
        </script>
    <style type="text/css">
        	.content{
        		border-radius: 5px;
        		background: white;
        		width: 550px;
        		height: 450px;
        		margin: 10px auto;
        		border: 1px solid lightgray;
        	}
        	input[type="text"],input[type="password"],input[type="email"]{
 
        		padding-left:10px; 
				width: 170px;
				height: 25px;
				border: solid 1px lightgrey;
				border-radius: 3px;
			}
 
			.left{
				display: inline-block;
				text-align: right;
				width:170px;
			}
			.in{
				line-height: 50px;
				width: 550px;
				margin: 0 20px;
				font-size: 10pt;
			}
			a{
				font-size: 9pt;
				text-decoration: none;
				color: grey;
			}
			a:hover{
				color: blue;
			}
			hr{
				margin: 10px 20px;
				border: none;
				border-bottom: 1px dotted lightgrey;
			}
			.bottom{
				float: right;
 
				padding-right: 20px;
				line-height: 60px;
			}
			input[type="submit"]{
				background: rgba(22, 115, 11, 0.38);
				border: 0 none;
				width: 90px;
				height: 30px;
				border-radius: 3px;
				color: white;
			}
			input[type="submit"]:hover{
				background: rgb(77, 140, 70);
			}
			input[type="button"]:hover{
				background: rgb(77, 140, 70);
			}
			input[type="button"]{
				background: rgba(22, 115, 11, 0.38);
				border: 0 none;
				width: 90px;
				height: 23px;
				border-radius: 3px;
				color: white;
			}
			input[type="reset"]{
				background: rgb(179, 176, 176);
				border: 0 none;
				width: 90px;
				height: 30px;
				border-radius: 3px;
				color: white;
			}
			input[type="reset"]:hover{
				background: rgb(200, 200, 200);
				
			}
			.tip{
				text-align: center;
				font-size: 10pt;
				color: grey;
        		background: white;
        		width: 530px;
        		height: 90px;
        		margin: 0px auto;
        		padding-left: 10px;
        		background: lightgrey;
			}
			body{
				background: lightgrey;
			}
			.warning{
				color:red;
				
			}
			#usernameMsg{
				display:none;
				width:200px;
				height:30px;
			}
        </style>
    </head>
    <body>
    	<div class="tip">
			<img src="img/logo.png" width="90px" height="90px">
		</div>
		<div class="content">
			<form action="regist.action" method="post">
				
				<div class="in">
					<br>
					<span class="left">用户名：</span>
					<input type="text" required="required" placeholder="请输入用户名" name="username" id="username"/>
					<span id="usernameMsg" class="warning">用户名已存在</span>
					
				</div>
				<div class="in">
					<span class="left">密码：</span>
					<input type="password" required="required" placeholder="请输入密码" name="password"/>
				</div>
				<div class="in">
					<span class="left">真实姓名：</span>
					<input type="text" required="required" placeholder="请输入真实姓名" name="realname"/>
				</div>
				<div class="in">
					<span class="left">邮箱：</span>
					<input type="email" required="required" placeholder="请输入有效邮箱地址" name="email" id="email"/>
					<span><input type="button" value="发送验证码" id="sendidcode"></span>
				</div>
				<div class="in">
					<span class="left">验证码：</span>
					<input type="text" required="required" placeholder="请点击按钮发送验证码" name="idcode"/>
					<span class="warning">${idcodeMsg }</span>
				</div>
				<hr>
				<div class="bottom">
					<input type="submit" value="注册">
					<input type="reset" value="重置">
				</div>
			</form>
			
		</div>
		<div class="tip">
			提示：没有提示。
		</div>
    </body>
</html>
