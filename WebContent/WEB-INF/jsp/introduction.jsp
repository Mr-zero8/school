<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>introduction</title>
<link
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.center {
	width: 200px;
	border: 1px solid1 #F00;
	padding: 33px;
}

.div-height {
	border: 1px solid1 #F00;
	width: 300px;
	height: 70px
}
</style>

<script type="text/javascript">
	function getJumpUrl() {
		window.open("${schoolbawebsite}")//跳转路径
	}
</script>

<script type="text/javascript">
	$(function() {
		$(".wrap li").click(function() {
			$(this).siblings('li').removeClass('active'); // 删除其兄弟元素的样式
			$(this).addClass('active'); // 为点击元素添加类名
		});
	});
</script>

</head>

<body>
	<!-- 	整体页面框 -->
	<div class="container" style="margin-top: 20px; border: 1px solid1 red;">
		<!-- 		<div class="row clearfix"> -->
		<div class="col-md-12 column" style="border: 1px solid1 blue;">
			<div class="row clearfix">
				<!-- 				导航栏 -->
				<div class="col-md-12 column">
					<div class="row clearfix">
						<nav class="navbar navbar-default navbar-inverse"
							role="navigation">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle"
									data-toggle="collapse"
									data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span><span
										class="icon-bar"></span><span class="icon-bar"></span><span
										class="icon-bar"></span>
								</button>
								<a class="navbar-brand" href="index">主页</a>
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
								<form class="navbar-form navbar-right" role="search">
									<div class="form-group">
										<input type="text" name="id'='${schoolbaid}"
											class="form-control" />
									</div>
									<button type="submit" class="btn btn-default">搜索</button>
									<button type="submit" class="btn btn-default">自动匹配</button>
								</form>
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
			</div>
			<!-- 			加载学校信息 -->
			<div class="row clearfix" style="background-color: #F4F6F9;">
				<div class="col-md-2 column" style="width: 192px;">
					<div class="row clearfix">
						<img  src="${schoolbalogo}" width="192"
							style="border: 1px solid1 #F00;" />
					</div>
				</div>
				<div class="col-md-6 column pull-left"
					style="border: 1px solid1 green; height: 194px;">
					<div class="row clearfix">
						<div class="col-md-12 column"
							style="border: 1px solid1 gray; padding: 9px;">

							<h2>${schoolbaname}</h2>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-12 column" style="border: 1px solid1 red;">
							<div class="row clearfix">
								<span class="text pull-right">${schoolbalocation}</span>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-12 column center-block"
							style="border: 1px solid1 blue; height: 50px;">
							<div class="row clearfix">
								<p class="text-muted">关注量：${schoolbaconcern}</p>
								<p class="text-muted">讨论帖：${schoolbatalkcount}</p>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-12 column center-block"
							style="border: 1px solid1 red; height: 37px;">
							<div class="row clearfix">
								<button class="btn btn-info pull-left">关注</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="row clearfix">
					<div class="col-md-12 column" style="border: 1px solid1 purple;">
						<nav class="navbar navbar-default" role="navigation">
							<ul class="wrap nav navbar-nav">
								<li><a href="getSchoolba?id=${schoolbaid}">谈笑天地</a></li>
								<li class="active"><a href="introduction?id=${schoolbaid}">校园简介</a></li>
								<li><a href="picture?id=${schoolbaid}">校园风景</a></li>
								<li><a href="policy?id=${schoolbaid}">招生政策</a></li>
								<li><a href="javascript:void(0);"
									onclick="getJumpUrl();return false;">校园官网</a></li>
							</ul>
							<!-- 							<ul class="nav navbar-nav navbar-right"> -->
							<!-- 							</ul> -->
						</nav>
					</div>

				</div>
			</div>

		</div>


<form action="updateschoolinfo" method="get">
		<div class="col-md-12 column"
			style="margin-top: -23px; margin-bottom: 200px; margin-bottom: 15px; border: 1px solid1 red;">
			<div class="row clearfix">
				<div class="col-md-12 column row clearfix ">
					<textarea  placeholder="此处填写内容" rows="30" name="info"
						style="resize: none; width: 1140px; font-size: 20px;">${schoolbaintroduction}</textarea>
				</div>
				<button type="submit" class="btn btn-default">修改内容</button>
			</div>
		</div>
</form>
	</div>

</body>
</html>



