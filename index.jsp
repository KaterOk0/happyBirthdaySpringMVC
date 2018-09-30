<%@ page import="java.util.Properties" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<%
    final Properties properties = new Properties();
    properties.load(this.getClass().getClassLoader().getResourceAsStream("project.properties"));
%>
<body>
<header>
    Sigaeva Kate
   <%= properties.getProperty("artifactId")%>
</header>
<p><b>Введите имя и дату рождения:</b></p>
<form method="post" action="/result">
    Дата рождения: <input type="text" name="date"><br>
    <input type="submit" value="Submit">
</form>
</body>
<footer>
    version: <%=properties.getProperty("version")%>
</footer>
</html>
