<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <%@include file="../common/header.jsp" %>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
--
        <script language="javascript" type="text/javascript">
          /*  function deleteRole() {
                var r = window.confirm("确定要删除此角色吗？");
                if(r) location.href='${pageContext.request.contextPath}/role/deleteRoleAction/${role.rid}';

                var msg = '${msg}';
                if(msg!=""){
                    $("#operate_result_info").append(msg);
                    $("#operate_result_info").css("display","block");

                    //document.getElementById("operate_result_info").style.display = "block";
                }
            }*/
        </script>

    </head>
    <body>
        <!--Logo区域开始-->
        <!--Logo区域结束-->
        <!--导航区域开始-->
       <%@include file="/WEB-INF/view/common/menubar.jsp" %>
        
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">
            <form action="" name="form" method="post">
                <!--查询-->
                <div class="search_add">
                    <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/role/showInsertRoleAction';" />
                </div>  
                <!--删除的操作提示-->
                <div id="operate_result_info" class="operate_success">
                    <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
                    删除成功！
                </div> <!--删除错误！该角色被使用，不能删除。-->
                <!--数据区域：用表格展示数据-->

                <div id="data">
                    <table id="datalist" class="table table-condensed" >
                        <tr>                            
                            <th>角色 ID</th>
                            <th>角色名称</th>
                            <th class="width600">拥有的权限</th>
                            <th class="td_modi"></th>
                        </tr>                      
					<c:forEach items="${roles }" var="role">
						<tr>
							<td>${role.rid }</td>
							<td>${role.rname }</td>
							<td>
								<c:forEach items="${role.lp }" var="lp">
                        			&nbsp${lp.by001 }
                        		</c:forEach>
							</td>
							<%-- <td>${role.lp.by001 }</td> --%>
							<td>
                                <input type="button" value="修改" class="btn_modify" onclick="location.href='${pageContext.request.contextPath}/role/updateRoleUIAction/${role.rid}';"/>
                                <input type="button" value="删除" class="btn_delete" onclick="location.href='${pageContext.request.contextPath}/role/deleteRoleAction/${role.rid}'"/>
                            </td>
                            <%--<input type="hidden" name="rid" value="${role.rid}"/>--%>
						</tr>
					</c:forEach>
                    </table>
                </div>
                <!--分页-->
                <div id="pages">
        	        <a href="#">上一页</a>
                    <a href="#" class="current_page">1</a>
                    <a href="#">2</a>
                    <a href="#">3</a>
                    <a href="#">4</a>
                    <a href="#">5</a>
                    <a href="#">下一页</a>
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
