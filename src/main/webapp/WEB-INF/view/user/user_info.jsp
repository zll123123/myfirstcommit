<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        
        <%@include file="../common/header.jsp" %>
    
        <script type="text/javascript">
            $(function () {
                var msg = '${msg}';
                if(msg != ""){
                    showResult();
                }
                $("#sub").click(function () {
                    $(".main_form").submit();
                })
            })
        </script>
        
        <script language="javascript" type="text/javascript">
            //保存成功的提示信息
            function showResult() {
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 2000);
            }
            function showResultDiv(flag) {
                if (flag)
                    $(".save_success").css("display","block");
                else
                    $(".save_success").css("display","none");
            }

        </script>
    </head>
    <body>
        <!--Logo区域开始-->
        <%@include file="../common/menubar.jsp" %>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success" >${msg}</div><!--保存失败，数据并发错误！-->
            <form action="${pageContext.request.contextPath}/admin/updateInfoAction" method="post" class="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.acname}" /></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input  type="text" readonly="readonly" class="readonly width400"
                    <c:forEach items="${admin.lr}" var="role">
                        value="${role.rname }"
                    </c:forEach>
                    />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input name="aname" type="text" value="${admin.aname}" />
                    <span class="required">*</span>
                    <div class="validate_msg_long error_msg">20长度以内的汉字、字母的组合</div>
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input name="atel" type="text" class="width200" value="${admin.atel}" />
                    <div class="validate_msg_medium">电话号码格式：手机或固话</div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input name="aemail" type="text" class="width200" value="${admin.aemail}" />
                    <div class="validate_msg_medium">50长度以内，符合 email 格式</div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.createTime}"/></div>
                <div class="button_info clearfix">
                    <input id="sub" type="button" value="保存" class="btn_save" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
                <input type="hidden" name="aid" value="${admin.aid}">
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
