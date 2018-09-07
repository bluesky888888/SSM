<%@ page language="java" pageEncoding="UTF-8"%>
<HTML>
<head>
    <meta charset="UTF-8">
    <title>Title</title>   
   <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
</head>
<body>

	<h1>hello world</h1>
	<div id="text">
	
	
		<a>点击跳转到登陆页面</a>
	
	
	</div>
</body>
</HTML>
<script type="text/javascript">

$(function) {
	$("#text").click(function(){
		 $(window).attr('location',"${pageContext.request.contextPath }/html/userLogin.html");
	})
}












</script>