
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="${pageContext.request.contextPath}/mydate.action" method="get">
    日期：<input type="date" name="mydate"><br>
    <input type="submit" value="提交">
</form>
<br>
<br>
<br>
<form action="${pageContext.request.contextPath}/all.action" method="get">
    日期：<input type="date" name="all"><br>
    <input type="submit" value="提交">
</form>
<br>
<br>
<br>
<br>
<h1>返回集合中对象成员变量是日期类型</h1>
<a href="${pageContext.request.contextPath}/collection.action">返回集合中对象成员变量是日期类型</a>