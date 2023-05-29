
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<h1>这是第一个springmvc页面</h1>


<br><br>

<%-- //传递数据
        request.setAttribute("requestUser",user);
        session.setAttribute("sessionUser",user);
        model.addAttribute("modelUser",user);
        map.put("mapUser",user);
        modelMap.addAttribute("modelmapUser",user);--%>



requestUser:${requestUser}<br>
sessionUser:${sessionUser}<br>
<%--model，map,modelmap 用的是request作用域--%>
modelUser:${modelUser}<br>
mapUser:${mapUser}<br>
modelmapUser:${modelmapUser}<br>


获取前端jsp访问参数：${param.name}