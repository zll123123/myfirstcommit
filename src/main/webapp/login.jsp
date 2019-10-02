<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
	<%@include file="WEB-INF/view/common/header.jsp" %>

	
	<script type="text/javascript">
		$(function(){
			$("#sub").click(function(){
				$("#loginForm").submit();
			})
		})
	</script>
</head>
<body class="index">

	<div class="login_box">
		<form action="${pageContext.request.contextPath}/admin/loginAction" id="loginForm" method="post">
			<span class="required" style="text-align: center;">${msg }</span>
			<table>
				<tr>
					<td class="login_info">账号：</td>
					<td colspan="2"><input name="username" id="username" type="text" class="width150" /></td>
					<td class="login_error_info"><span class="required"></span></td>
				</tr>
				<tr>
					<td class="login_info">密码：</td>
					<td colspan="2"><input name="password" id="password" type="password"
						class="width150" /></td>
					<td><span class="required"></span></td>
				</tr>
				<tr>
					<td></td>
					<td class="login_button" colspan="2"><a id="sub"><img
							src="${pageContext.request.contextPath}/assets/images/login_btn.png" /></a></td>
					<td><span class="required"></span></td>
				</tr>
			</table>
		</form>
	</div>
	
</body>
</html>
