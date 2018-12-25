<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>schoolba</title>
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
			<img  src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/PPVWa7TTn16*VQhYwDI8Y8uECwTaJh5pNIRwe2r*u*k!/r/dD4BAAAAAAAA" />
		</div>
		<div class="col-md-3 column">
		
			<h2>${sb.name}</h>
			 <button type="button" class="btn btn-default" style="margin-top: 50px;">关注</button></br>
			 <small><h4>关注量：1000</h></small></br>
			 <small><h4>讨论帖：500</h></small>
		
		</div>
		<div class="col-md-4 column" style="margin-top: 170px;">
			<span class="text" >安徽省芜湖市弋江区（文津）/芜湖县（新芜）</span>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">校园简介</a>
						</li>
						<li>
							 <a href="#">校园风景</a>
						</li>
						<li>
							 <a href="#">招生政策</a>
						</li>	
						<li>
							 <a href="#">校园官网</a>
						</li>						
					</ul>
					<ul class="nav navbar-nav navbar-right">

					</ul>
				</div>
				
			</nav>
				</div>
				<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-8 column">
					<h3>
						<span class="badge">50</span>不管未来在哪，这里都曾留下了我们美好的青春.不管未来在哪，这里都曾留下了我们美好的青春.
					</h3>
				</div>
				<div class="col-md-2 column">
					<a href="#"	class="glyphicon glyphicon-user">123</a>
				</div>
				<div class="col-md-2 column">
					<small>
					<h4>开始：2018-10-8</h></small>
					<small><h4>最新：2018-12-18</h>
					</small>
				</div>
			</div>
		</div>
	</div>
			</div>
		</div>
	</div>

</body>
</html>