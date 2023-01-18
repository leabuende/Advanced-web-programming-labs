<%-- 
    Document   : welcome
    Created on : 20 sept. 2019, 10:33:43
    Author     : JAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <form>
            <table border = 1>
                <tr>
                    <td><b>Name</b></td>
                    <td><b>First name</b></td>
                    <td><b>City</b></td>
                    <td><b>Email</b></td>
                </tr>

                <c:forEach items="${empList}" var="employee">
                    <tr> 
                        <td>  ${employee.name}</td>
                        <td>  ${employee.firstname}    </td>
                        <td>  ${employee.city}    </td>
                        <td>  ${employee.mail}  </td>
                    </tr>     
                </c:forEach>
            </table>
            <input type='submit' name="action" value="Detail"/>
        </form>
    </body>
</html>
