<%--指令，指出当前内容的类型和脚本--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--导入jquery函数库--%>
    <script src="js/jquery-3.4.1.js"></script>
</head>
<body>
<br><br><br>
<a href="${pageContext.request.contextPath}/jump/one.action">1.请求转发页面</a><br>
<a href="${pageContext.request.contextPath}/jump/two.action">2.请求转发action</a><br>
<a href="${pageContext.request.contextPath}/jump/three.action">3.重定向页面</a><br>
<a href="${pageContext.request.contextPath}/jump/four.action">4.重定向action</a><br>
<a href="${pageContext.request.contextPath}/jump/five.action">5.跳转到任意位置</a><br>




<%--访问服务器进行数据携带--%>
<br><br><br>
<a href="${pageContext.request.contextPath}/data.action?name=cjb">访问服务器，进行数据携带</a>
</body>
</html>