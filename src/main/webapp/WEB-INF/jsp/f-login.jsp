
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>


<h>输入用户名和密码登录</h>
<form action="${pageContext.request.contextPath}/login">
    用户名：<input type="text" name="name"><br>
    密  码:<input type="password" name="pass" id=""><br>
    <input type="submit" value="提交">
</form>

<br>
${msg}