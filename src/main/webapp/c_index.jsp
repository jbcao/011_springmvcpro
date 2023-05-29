<%--指令，指出当前内容的类型和脚本--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--导入jquery函数库--%>
    <script src="js/jquery-3.4.1.js"></script>
</head>
<body>
<br><br><br>
<a href="javascript:showStu()">访问服务器返回的集合</a><br>
<div id="mydiv">等待服务器返回数据</div>
<script type="text/javascript">
    function showStu() {
        //    使用jquery封装的ajax()方法发送请求
        $.ajax({
            url: "${pageContext.request.contextPath}/ajax/list.action",
            type: "get",
            dataType: "json",
            success: function (stuList) {
                var s = "";
                $.each(stuList, function (i, stu) {
                    s += stu.name + "----" + stu.age + "<br>";
                });
                //回显数据
                $("#mydiv").html(s);
            }
        })
    }
</script>

</body>
</html>