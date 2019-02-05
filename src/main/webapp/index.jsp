<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
  <head>
    <base target="rightFrame" href="<%=basePath%>">
    
    <title>北大青鸟办公自动化管理系统</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" />
  </head>
  <%
  	String images=request.getContextPath()+"/images";
  	session.setAttribute("images",images);
  %>
  <body>
  <a href="index.html">点击跳转</a>
  <script type="application/javascript">
	  window.location="index.html";

  </script>
  	<%--<jsp:include page="/WEB-INF/jsp/indexTop.jsp"></jsp:include>
		<div class="main">
			<div class="global-width">
				<jsp:include page="/WEB-INF/jsp/indexSidebar.jsp" />
				<jsp:include page="/WEB-INF/jsp/indexRightbar.jsp" />
			</div>
		</div>
	<jsp:include page="/WEB-INF/jsp/indexBottom.jsp"></jsp:include>--%>
  </body>
</html>
