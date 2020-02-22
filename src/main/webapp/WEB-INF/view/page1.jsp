<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<html>
   <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script>
            $(document).ready(() => {
                $("#id1").change(() => {
                    $.ajax({
                        url: "req4",
                        data: {id: $("#id1").val()},
                        success: function(response) {
                            $("#errorMessage").text(response);
                        }
                    });
                });
            });
        </script>
   </head>
   <body>
        <form action="req2" method="post">
            <input type="text" name="id" id="id1"/>
            <span id="errorMessage"></span><br/>
            <input type="text" name="name" />
            <input type="text" name="email" />
            <button type="submit">Submit</button>
        </form>
        ${id}
   </body>
</html>