<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Hello</title>
    </head>
    <body>
<form:form method="POST" modelAttribute="user">
    Name: <form:input path="name"/>
    <input type="submit" value="Submit" />
</form:form>
    </body>
</html>