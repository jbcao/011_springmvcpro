
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入格式化标签--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

我的日期：${mydate}<br>
<h1>显示集合中对象成员变量是日期</h1>


<table width="800px" border="1">
    <tr><td>name</td><td>birthday</td></tr>
    <c:forEach items="${list}" var="stu">
        <tr><td>${stu.name}</td><td>----<fmt:formatDate value="${stu.birth}" pattern="yyyy-MM-dd"></fmt:formatDate></td></tr>
    </c:forEach>
</table>
