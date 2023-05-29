<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!!!</h2>
<form action="${pageContext.request.contextPath}/req.action" method="post">
    <input type="submit">
</form>
<h1>单个数据提交</h1>
<form action="${pageContext.request.contextPath}/sub/one.action" method="post">
    姓名：<input type="text" name="myname"><br/>
    年龄：<input type="text" name="age" id=""><br/>
    <input type="submit">
</form>
<h1>对象封装数据提交</h1>
<form action="${pageContext.request.contextPath}/sub/two.action" method="get">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age" id=""><br/>
    <input type="submit">
</form>
<h1>第三种方式提交</h1>
<a href="${pageContext.request.contextPath}/sub/three/曹建邦/30.action">动态占位符方式提交</a>
</body>
<h1>映射名称不一致方式提交</h1>
<form action="${pageContext.request.contextPath}/sub/four.action" method="get">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age" id=""><br/>
    <input type="submit">
</form>
<h1>手工提交数据</h1>
<form action="${pageContext.request.contextPath}/sub/five.action" method="get">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age" id=""><br/>
    <input type="submit">
</form>

</html>