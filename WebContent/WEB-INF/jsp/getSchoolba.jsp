<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>schoolba</title>
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
.content{
    width: 500px;
    height: 200px;
    line-height: 200px;/*设置其文字内容垂直居中*/
    border:1px solid red;
    .pox{
        background: yellow;
        width: 200px;
        height: 70px;
        display: inline-block; /*一定要将div设置为inline-block*/
        vertical-align: middle;/*设置该元素在父元素中的位置*/
        line-height: 70px;
        border: 1px solid green;
        text-align: center;
    }
}
</style>
</head>

<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-12 column">
			<nav class="navbar navbar-default navbar-inverse" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">主页</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">最近热门</a>
						</li>
						<li>
							 <a href="#">我的收藏</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">搜索</button>
						<button type="submit" class="btn btn-default">自动匹配</button>
					</form>
					<ul class="nav navbar-nav navbar-left">
						<li>
							 <a href="#">成绩录入</a>
						</li>
						<li>
							 <a href="#">个人设置</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">更多<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
	<div class="row clearfix" style="background-color:#F4F6F9;" >
		<div class="col-md-2 column">
			<img alt="140x140" src="${schoolbaimg}" />
		</div>
		<div class="col-md-3 column">
		
			<h2>${schoolbaname}</h>
			 <button type="button" class="btn btn-default" style="margin-top: 50px;">关注</button></br>
			 <small><h4>关注量：${schoolbaconcern}</h></small></br>
			 <small><h4>讨论帖：${schoolbatalkcount}</h></small>
		
		</div>
		<div class="col-md-4 column" style="margin-top: 170px;">
			<span class="text" >${schoolbalocation}</span>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="http://localhost:8080/ssm/listTalk">谈笑天地</a>
						</li>
						<li>
							 <a href="#">校园简介</a>
						</li>
						<li>
							 <a href="#">校园风景</a>
						</li>
						<li>
							 <a href="#">招生政策</a>
						</li>	
						<li>
							 <a href="http://www.aiit.edu.cn/">校园官网</a>
						</li>						
					</ul>
					<ul class="nav navbar-nav navbar-right">

					</ul>
				</div>
				
			</nav>
				</div>

			</div>
		<div class="col-md-12 column" style="background-color:#F4F6F9;">
	    	<c:forEach items="${tl}" var="t" varStatus="st">
			<div class="row clearfix">
				<div class="col-md-7 column">
					<h3>
						<span class="badge">${t.talkcount}</span><a  href="#">${t.title}</a>
					</h3>
				</div>
				<div class="content col-md-2 column">
				
					<div class="pox">
					<a style="color:black;" href="#"class="glyphicon glyphicon-user">${t.author}</a>
					</div>
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