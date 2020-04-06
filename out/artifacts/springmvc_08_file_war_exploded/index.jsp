<%--
  Created by IntelliJ IDEA.
  User: aijian
  Date: 2020/3/17
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/upload" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
    </form>
  <a href="${pageContext.request.contextPath}/statics/image-20200102001823229.png">下载</a>
  </body>
</html>
