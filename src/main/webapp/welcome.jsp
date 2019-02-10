<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		<title>欢迎页</title>
		<link href="statics/css/style.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="/statics/js/jquery-1.8.0.min.js"></script>
	</head>
	<body>
		<p>
			<a href="login.html">欢迎使用JBOA办公自动管理系统.</a>
		</p>
	<script type="text/javascript">
		$(function () {
			alert("youxiao");
        })
	</script>
	</body>
</html>
