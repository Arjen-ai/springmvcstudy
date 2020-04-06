<%--
  Created by IntelliJ IDEA.
  User: aijian
  Date: 2020/3/16
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        function a() {
            $.post("/a1",
                {"username":$("#username").value},
                function (data){
                console.log(data);
                    alert(data);
                });
        }
    </script>
  </head>
  <body>
  用户名：<input type="text" id="username" onblur="a()">
  </body>

</html>
