<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
<%--request.getContextPath()此为获取工程路径--%>
<a href="<%=request.getContextPath()%>/do_login.jsp">登录失败请重新登录</a>
</body>
</html>
