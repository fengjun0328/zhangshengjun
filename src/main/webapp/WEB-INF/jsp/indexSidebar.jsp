<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="true"%>
<%@ include file="taglib.jsp"%>
<div class="nav" id="nav">
	<div class="t"></div>
   		<dl class="open">
	       	<dt onclick="this.parentNode.className=this.parentNode.className=='open'?'':'open';">报销单管理</dt>
	           <dd><a href="jsp/claim/claimVoucher_searchClaimVoucher.action">查看报销单</a></dd>
				<c:if test='${User.name_cn} == "员工"'>
					<dd><a href="jsp/claim/claimVoucher_toAdd.action">添加报销单</a></dd>
				</c:if>
			<c:if test='${User.name_cn}=="员工"'>
				${User.name_cn}
			</c:if>
	       </dl>
       <dl>
       		<dt onclick="this.parentNode.className=this.parentNode.className=='open'?'':'open';">请假管理</dt>
	           <dd><a href="jsp/leave/leave_searchLeave.action">查看请假</a></dd>
				<c:if test='${User.name_cn} == "员工"'>
		       <dd><a href="jsp/leave/leave_toEdit.action">申请请假</a></dd>
				</c:if>
       </dl>
       <c:if test='${User.name_cn} == "总经理"'>
       <dl>
       		<dt onclick="this.parentNode.className=this.parentNode.className=='open'?'':'open';">统计报表</dt>
		       <dd><a href="jsp/statistics/claimVoucherStatistics_getDeptStatisticsByMonth.action">报销单月度统计</a></dd>
		       <dd><a href="jsp/statistics/deptStatistics_findDeptYearStatisticsList.action">报销单年度统计</a></dd>
       </dl>
       </c:if>
       <c:if test='${User.name_cn} == "总经理" ||${User.name_cn} == "财务"'>
       <dl>
       		<dt onclick="this.parentNode.className=this.parentNode.className=='open'?'':'open';">统计报表</dt>
		       <dd><a href="jsp/statistics/compMonStatistics_getList.action">报销单月度统计</a></dd>
		       <dd><a href="jsp/statistics/compYearStatistics_getList">报销单年度统计</a></dd>
       </dl>
      </c:if>
       <dl>
       	<dt onclick="this.parentNode.className=this.parentNode.className=='open'?'':'open';">信息中心</dt>
           <dd><a href="jsp/statistics/compYearStatistics_getList">信心收件箱</a></dd>
           <dd><a href="jsp/statistics/compYearStatistics_getList">信心发件箱</a></dd>
       </dl>
</div>
