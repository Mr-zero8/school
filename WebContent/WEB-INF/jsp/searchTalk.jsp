<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>searchTalk</title>

<style type="text/css">
		.highlight{background:red;font-weight:bold;color:white;}
</style>
 
 <script type="text/javascript">
	function encode(s){
		return s.replace(/&/g,"&").replace(/</g,"<").replace(/>/g,">").replace(/([\\\.\*\[\]\(\)\$\^])/g,"\\$1");
	}
	function decode(s){
		return s.replace(/\\([\\\.\*\[\]\(\)\$\^])/g,"$1").replace(/>/g,">").replace(/</g,"<").replace(/&/g,"&");
	}
	function highlight(s){
		var s=document.getElementById("keyword").value;
		console.log(s);
		if (s.length==0){
			alert('搜索关键词未填写！');
			return false;
		}
		s=encode(s);
		var obj=document.getElementById("div");
		var t=obj.innerHTML.replace(/<span\s+class=.?highlight.?>([^<>]*)<\/span>/gi,"$1");
		obj.innerHTML=t;
		var cnt=loopSearch(s,obj);
		t=obj.innerHTML
		console.log(t);
		var r=/{searchHL}(({(?!\/searchHL})|[^{])*){\/searchHL}/g
		t=t.replace(r,"<span class='highlight'>$1</span>");
		obj.innerHTML=t;
	}
	function loopSearch(s,obj){
		var cnt=0;
		if (obj.nodeType==3){
			cnt=replace(s,obj);
			return cnt;
		}
		for (var i=0,c;c=obj.childNodes[i];i++){
			if (!c.className||c.className!="highlight")
				cnt+=loopSearch(s,c);
		}
		return cnt;
	}
	function replace(s,dest){
		var r=new RegExp(s,"g");
		var tm=null;
		var t=dest.nodeValue;
		var cnt=0;
		if (tm=t.match(r)){
			cnt=tm.length;
			t=t.replace(r,"{searchHL}"+decode(s)+"{/searchHL}")
			dest.nodeValue=t;
		}
		return cnt;}
</script>

</head>
<body>
	<div class="container" id="div">
		<form action="searchTalk">
			<input type="text" name="keyword" id="keyword" value="${keyword}" />
			<button type="submit" onclick="highlight()" class="btn btn-default" onclick="highlight()">搜索</button>			
		</form>
<%-- 		<p><input id="input"/><button onclick="highlight()" value="${keyword}">搜索</button></p> --%>
		<ul class="list-inline">
			<li>排序结果：</li>
			<li><a href="#">按时间顺序</a></li>
			<li><a href="#">按时间倒序</a></li>
			<li><a href="#">按主题查看</a></li>
		</ul>
		<c:forEach items="${ts}" var="t" varStatus="st">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h2>test-title</h2>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h4>${t.authortext}</h4>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-4 column">
					<h5>校吧：</h5>
					<h5></h5>
				</div>
				<div class="col-md-4 column">
					<h5>作者：${t.authorname}</h5>
				</div>
				<div class="col-md-4 column">
					<h5>时间：${t.writetime}</h5>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>