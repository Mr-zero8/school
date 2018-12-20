<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
	<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row clearfix" style="margin-bottom:19px;">
		<div class="col-md-2 column">
			<img alt="140x140" src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/xcwIXcWexgcrN8evw7IWXyUBUIdB6bj5dXePRp8bCNA!/r/dL8AAAAAAAAA" />
		</div>
		<div class="col-md-8 column">
			<h2>
				Hi,欢迎来到谈校风生！
			</h>
		</div>
		<div class="col-md-2 column" >
			<button type="button" class="btn btn-link" style="text-right;">登陆</button>
			<button type="button" class="btn btn-link" style="text-right;">注册</button>
		</div>
	</div>
	<div class="row clearfix" >
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
<!-- 					<form class="navbar-form navbar-right" role="search"> -->
						<form method="post"  class="navbar-form navbar-right"  action="searchlist">
						<div class="form-group">
							<input type="text"  name="string" class="form-control" />
						</div> 
						
						<button type="submit" class="btn btn-default">搜索</button>
						<button type="submit"  class="btn btn-default">自动匹配</button>
						</form>
<!-- 					</form> -->
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
	<div class="row clearfix" style="margin-bottom:10px;">
		<div class="col-md-12 column">
			<div class="carousel slide" id="carousel-618885">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-618885">
					</li>
					<li data-slide-to="1" data-target="#carousel-618885">
					</li>
					<li data-slide-to="2" data-target="#carousel-618885">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/cB94zoh3lA.vUxggGqr8yNM7LH8MaVsBbhH1BEN*3pA!/r/dL0AAAAAAAAA" />
						<div class="carousel-caption">
							<h4>
								First Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/6JekDjRq5mYSMUTd2gw4hGUPo8tjYV*gy7ab3GprEQg!/r/dD4BAAAAAAAA" />
						<div class="carousel-caption">
							<h4>
								Second Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/46uXs6apFHY4D2ZsK7cW5S60vQ3stBgXxX8FOFfD1bo!/r/dMEAAAAAAAAA" />
						<div class="carousel-caption">
							<h4>
								Third Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-618885" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-618885" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>

 <div class="row clearfix" >
 	<c:forEach items="${ss}" var="s" varStatus="st">
	<div class="col-md-12 column" style="margin-bottom:25px;margin-top: 15px;">
			
				<div class="col-md-2 column center-block">
					<img  src="${s.img}" width="80"/>
				</div>
				<div class="col-md-8 column pull-left">
					<h4>${s.name}</h4>
				</div>
				<div class="col-md-2 column pull-right">
					 <button type="button" class="btn btn-default" value="${s.id}" onclick="window.location.href('getSchoolba.jsp')">进入</button>
				</div>
			 	
	</div>
	</c:forEach>
 </div>

</div>
	</body>
</html>