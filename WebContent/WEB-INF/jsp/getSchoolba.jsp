<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>schoolba</title>
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
	<div class="container"
		style="margin-top: 20px; border: 1px solid1 red;">
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
								<form class="navbar-form navbar-right" role="search"
									action="index">
									<div class="form-group">
										<input type="text" class="form-control" id="string" /> <input
											type="hidden" id="userid" name="userid" value="${userid}">
									</div>
									<button type="submit" class="btn btn-default">搜索</button>
									<button type="submit" class="btn btn-default">自动匹配</button>
								</form>
								<form action="searchTalk">
									<button type="submit" class="btn btn-default">搜索帖子</button>
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
						<img src="${schoolbalogo}" width="192"
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
				<!-- 					<div class="col-md-3 column" style="border: 1px solid1 blue;height:193px;width:378px;"> -->

				<!-- 					</div> -->
			</div>
			<div class="row clearfix">
				<div class="row clearfix">
					<div class="col-md-12 column" style="border: 1px solid1 purple;">
						<nav class="navbar navbar-default" role="navigation">
							<ul class="wrap nav navbar-nav">
								<li class="active"><a href="getSchoolba?id=${schoolbaid}">谈笑天地</a></li>
								<li><a href="introduction?id=${schoolbaid}">校园简介</a></li>
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
		<div class="col-md-12 column"
			style="margin-bottom: 19px; margin-top: -21px;">
			<c:forEach items="${tl}" var="t" varStatus="st">
				<div class="row clearfix">

					<div class="col-md-7 column"
						style="border: 1px solid1 green; padding: 16px; margin-right: 30px; margin-bottom: 5px;">
						<h4>
							<span class="badge">${t.talkcount}</span>
							<!----------------- 传值向listTalkDetail.jsp --------------->
							<form name="${t.id}" id="${t.id}" action="listTalkDetail"
								method="get">
								  <input type="hidden" name="id" id="id" value="${schoolbaid}" /> 
								<input type="hidden" name="talkid" id="talkid" value="${t.id}" />
								<input type="hidden" name="userid" id="userid" value="${userid}" /> 
								<a style="font-size: 25px;"
									onclick="document.getElementById('${t.id}').submit();">${t.title}</a> 


							</form>
						</h4>
					</div>
					<div class="col-md-2 column"
						style="border: 1px solid1 red; padding: 26px; margin-right: 40px;">

						<div>
							<a style="color: black;" href="#"
								class="glyphicon glyphicon-user">${t.author}</a>
						</div>

					</div>
					<div class="col-md-3 column"
						style="width: 210px; border: 1px solid1 green; padding: 26px;">
						<div>
							<small>最新回复:${t.updatetime}</small>
						</div>
						<form action="deleteTalk" method="get">
							<input type="hidden" name="talkid" id="talkid" value="${t.id}" />
							<button type="submit">删除</button>
						</form>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="col-md-12 column"
			style="border: 1px solid1 red; margin-bottom: 10px;">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row clearfix">
						<ul class="pagination pull-left">
							<li><a href="?start=0&id=${schoolbaid}"
								style="color: black;">首页</a></li>
							<li><a style="color: black;"
								<c:if test="${page.start-page.count>=0}"> href="?start=${page.start-page.count}&id=${schoolbaid}"</c:if>>&laquo;</a></li>
							<li <c:if test="${page.start/5+1==1}">class="active"</c:if>><a
								style="color: black;" href="?start=0&id=${schoolbaid}">1</a></li>
							<li <c:if test="${page.start/5+1==2}">class="active"</c:if>><a
								style="color: black;" href="?start=5&id=${schoolbaid}">2</a></li>
							<li <c:if test="${page.start/5+1==3}">class="active"</c:if>><a
								style="color: black;" href="?start=10&id=${schoolbaid}">3</a></li>
							<%-- 						<li <c:if test="${page.start/5+1==4}">class="active"</c:if>><a href="?start=15">4</a></li> --%>
							<%-- 						<li <c:if test="${page.start/5+1==5}">class="active"</c:if>><a href="?start=${page.start=4*5}">5</a></li> --%>
							<li><a style="color: black;"
								<c:if test="${page.start-page.count!=page.last-5}"> href="?start=${page.start+page.count}&id=${schoolbaid}"</c:if>>&raquo;</a></li>
							<li><a style="color: black;"
								href="?start=${page.last}&id=${schoolbaid}">尾页</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="col-md-12 column"
			style="margin-top: 10px; margin-bottom: 200px; background-color: #F4F6F9; border: 1px solid1 red;">
			<div class="col-md-8 column" style="border: 1px solid1 red;">
				<p style="margin-top: 18px;">
					<span class="glyphicon glyphicon-pencil"></span> 发表你的看法吧
				</p>
			</div>
			<div class="col-md-8 column"
				style="margin-bottom: 25px; margin-top: 15px; border: 1px solid1 blue;">
				<input type="text" class="form-control" placeholder="此处填写标题"
					style="height: 40px; font-size: 22px;">
			</div>
			<div class="col-md-8 column"
				style="margin-bottom: 15px; border: 1px solid1 red;">
				<textarea rows="9" cols="114" placeholder="此处填写内容"
					style="resize: none; width: 100%;"></textarea>
			</div>
			<div class="col-md-8 column"
				style="margin-bottom: 15px; border: 1px solid1 red;">
				<button type="button" class="btn btn-primary pull-right">发表</button>
			</div>
		</div>
		<!-- 		</div> -->
	</div>

</body>
</html>