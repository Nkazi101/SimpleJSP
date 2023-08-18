<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Employee List</title>
    </head>
    <body>
<ul>
    <c:forEach var="employee"  items="${employees}">
    <li>${employee.name}</li>
    </c:forEach>
</ul>
    </body>
</html>