<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <!--Logo区域开始-->
        <div id="header">
            <img src="${pageContext.request.contextPath }/assets/images/logo.png" alt="logo" class="left"/>
           	 用户：${admin.aname }
            <a id="exit" href="#">[退出]</a>            
        </div>
        
        <script type="text/javascript">
			$(function(){
				$("#exit").click(function(){
					$(this).attr("href","${pageContext.request.contextPath}/admin/exitAction");
				})
			})
		</script>

<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
		<c:forEach items="${admin.lp}" var="priv">
			<li><a href="${pageContext.request.contextPath}/${priv.purl }" class="${priv.pclass}_off"></a></li>
		</c:forEach>
	</ul>
</div>