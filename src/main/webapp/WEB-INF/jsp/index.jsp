<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
  <head>
    <title>北大青鸟办公自动化管理系统</title>
	<link href="<%=request.getContextPath()%>/statics/css/style.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
  	<jsp:include page="indexTop.jsp"></jsp:include>
		<div class="main">
			<div class="global-width">
				<jsp:include page="indexSidebar.jsp" />
				<jsp:include page="indexRightbar.jsp" />
			</div>
		</div>
	<jsp:include page="indexBottom.jsp"></jsp:include>
  </body>
</html>
