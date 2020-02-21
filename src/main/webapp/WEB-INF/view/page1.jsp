<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<html>
   <body>
        <form action="req2" method="post">
            <input type="text" name="id" />
            <input type="text" name="name" />
            <input type="text" name="email" />
            <button type="submit">Submit</button>
        </form>
        ${id}
   </body>
</html>