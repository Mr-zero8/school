<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
.center-schoolname {

 	width: 67%; 
	padding: 21px;
	border: 1px solid green;
}

.div-schoolimg {
 	width: 91px;
	padding: 0px;
	border: 1px solid blue;
}


</style>
</head>
<body>
	<div class="container" style="border:1px solid red;margin-top:25px;">
		<div class="row clearfix" style="margin-bottom: 19px;">
			<div class="col-md-2 column" style="border:1px solid red;width:120px;">
				<img alt="140x140" width="90px"
					src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/xcwIXcWexgcrN8evw7IWXyUBUIdB6bj5dXePRp8bCNA!/r/dL8AAAAAAAAA" />
			</div>
			<div class="col-md-8 column" style="border:1px solid red;height:92px;padding:10px;">
				<h2>
					Hi,欢迎来到谈校风生！admin
					</h2>
			</div>
				<div class="col-md-2 column pull-right" style="border:1px solid red;height:92px;">	
					<div class="pull-right row clearfix" style="border:1px solid red;margin-top:55px;">
						<button type="button" class="btn btn-link" style="">登陆</button>
						<button type="button" class="btn btn-link" style="">注册</button>
					</div>
				</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column" style="border:1px solid red;">
				<nav class="navbar navbar-default navbar-inverse" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="searchlist">主页</a>
					</div>

					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">最近热门</a></li>
							<li><a href="#">我的收藏</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
									<li class="divider"></li>
									<li><a href="#">One more separated link</a></li>
								</ul></li>
						</ul>
						<!-- 					<form class="navbar-form navbar-right" role="search"> -->
						<form method="post" class="navbar-form navbar-right"
							action="searchlist">
							<div class="form-group">
								<input type="text" name="string" class="form-control" />
							</div>

							<button type="submit" class="btn btn-default">搜索</button>
							<button type="submit" class="btn btn-default">自动匹配</button>
						</form>
						<!-- 					</form> -->
						<ul class="nav navbar-nav navbar-left">
							<li><a href="#">成绩录入</a></li>
							<li><a href="#">个人设置</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">更多<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul></li>
						</ul>
					</div>

				</nav>
			</div>
		</div>
		<div class="row clearfix" style="border:1px solid red;margin-bottom: 6px;">
			<div class="col-md-12 column">
				<div class="carousel slide" id="carousel-618885"
					data-ride="carousel" data-interval="4000" data-pause="false">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-618885"></li>
						<li data-slide-to="1" data-target="#carousel-618885"></li>
						<li data-slide-to="2" data-target="#carousel-618885"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt=""
								src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/wFMpa7*67DVOnwgJH3toUI.lBxh6vzyKEHRzF2Lekpk!/r/dFMBAAAAAAAA" />
							<div class="carousel-caption">
								<h4>文字标题</h4>
								<p>文字内容</p>
							</div>
						</div>
						<div class="item">
							<img alt=""
								src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/5FZ8oFRCqVhywXU*YxNxsyesD9KEAZ2n7OJtE7iFcZ4!/r/dL8AAAAAAAAA" />
							<div class="carousel-caption">
								<h4>文字标题</h4>
								<p>文字内容</p>
							</div>
						</div>
						<div class="item">
							<img alt=""
								src="http://r.photo.store.qq.com/psb?/V10dqOUK0ZhMOZ/Ou5ARCyy*aPlVufNmSTiUW5eV46UGtyvQjKHn09vTSY!/r/dEcBAAAAAAAA" />
							<div class="carousel-caption">
								<h4>文字标题</h4>
								<p>文字内容</p>
							</div>
						</div>											
					</div>
					<a class="left carousel-control" href="#carousel-618885"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left"></span></a> <a
						class="right carousel-control" href="#carousel-618885"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>
		</div>


			<c:forEach items="${ss}" var="s" varStatus="st">
				<div class="div-1 col-md-12 column"
					style="margin-bottom: 15px; margin-top: 15px;">
					<div class="row clearfix" style="background-color: #F4F6F9;">
						<div class="div-schoolimg col-md-2 column center-block" >
							<img src="${s.img}" width="90" />
						</div>
						<div class="center-schoolname col-md-8 column center-block">
							<h4>
								<a style="font-size: 25px;" href="getSchoolba?id=${s.id}">${s.name}</a>
							</h4>
						</div>
						<div class="col-md-2 column center-block">

						</div>
					</div>
				</div>
			</c:forEach>


	</div>
</body>
</html>