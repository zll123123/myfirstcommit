<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <%@include file="../common/header.jsp" %>
    </head>
    <body>       
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <%@include file="../common/menubar.jsp" %>
        <!--导航区域结束-->
        <div id="main">      
            <!--保存操作后的提示信息：成功或者失败-->      
            <div id="save_result_info" class="save_success">保存成功！</div><!--保存失败，旧密码错误！-->
            <form action="${pageContext.request.contextPath }/user/updAdminPwd/${admin.aid}" method="post" class="main_form">
                <input type="hidden" name="_method" value="put">
                <div class="text_info clearfix"><span>旧密码：</span></div>
                <div class="input_info">
                    <input type="password" name="oldpwd" class="width200"  /><span class="required">*</span>
                    <div class="validate_msg_medium">30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>新密码：</span></div>
                <div class="input_info">
                    <input type="password" name="newpwd"  class="width200" /><span class="required">*</span>
                    <div class="validate_msg_medium">30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>重复新密码：</span></div>
                <div class="input_info">
                    <input type="password" name="newpwd2" class="width200"  /><span class="required">*</span>
                    <div class="validate_msg_medium">两次新密码必须相同</div>
                </div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" />
                    <%--<input type="button" value="取消" class="btn_save" />--%>
                </div>
                <%--<input type="hidden" name="aid" value="${admin.aid }">--%>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
        </div>
        <script type="text/javascript">
        	$(function(){
        		$(".btn_save").click(function(){
        			$(".main_form").submit();
        		})
        	})
        </script>
    </body>
</html>
