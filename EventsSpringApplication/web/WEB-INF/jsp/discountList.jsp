<%-- 
    Document   : discountList
    Created on : Nov 11, 2014, 8:09:45 PM
    Author     : venkatesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="get" action="discountList" modelAttribute="discountList">
        <h1>Hello World!</h1>

        <table>
            
            <th>ticket type</th>
             
            <th>min amount</th>
             
            <th>max amount</th>
            <th>discount amount</th>
            <th>discount percentage</th>

            <c:forEach var="discount" items="${discountList}"></c:forEach>
                <tr>
                     
                    <td>${discount.tickettype}</td>
                     
                    <td>${discount.minticket}</td>
                     
                    <td>${discount.maxticket}</td>
                    <td>${discount.discountamount}</td>
                    <td>${discount.discountpercentage}</td>
                </tr>
           
        </table>
        </form:form>
    </body>
</html>
