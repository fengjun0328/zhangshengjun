<%@page import="org.junit.runner.Request" %>
<%@ page isELIgnored="false"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<!DOCTYPE>
<html>
<head>
    <title>跳转到的页面</title>
</head>
<body>
<h1>欢迎您来到主页</h1>
</body>
</html>
