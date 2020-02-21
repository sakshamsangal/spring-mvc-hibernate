<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
   <body>
        <c:forEach items="${users}" var="user">
            ${user.id}
            ${user.name}
            ${user.email}
        </c:forEach>
   </body>
</html>