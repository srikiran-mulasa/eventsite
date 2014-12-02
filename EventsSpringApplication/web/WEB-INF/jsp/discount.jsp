<%-- 
    Document   : ticket
    Created on : Nov 1, 2014, 9:10:39 AM
    Author     : venkatesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ticket Reservation Page</title>
    </head>
    <style>
        h1{
            font-size: 20px;
            background-color: whitesmoke;
        }
        th1{
            font-size: 20px;
            background-color: whitesmoke;
        }
        select{
            width: 100px;
        }
        input{
            width:30px;
        }
        table{
            width: 1000px;
            border: 3px solid whitesmoke;
        }
        div{
            width: 1000px;
            
            padding-top: 20px;
            border: 3px solid whitesmoke;
        }
        h2{
            font-size: 30px;

        }

    </style>
    <body>
    <center><div style="width:1000px; height: 800px">

            <h1><span>Discount</span></h1>
            <form:form method="POST" action="save" modelAttribute="discount">
                <table>
                    <tr>
                        <td>Ticket Type</td>
                        <td> <form:select  path="tickettype">
                                <form:option value="-" label="--Please Select"/>
                                <form:options items="${tickettype}"  itemValue="tickettype"/>
                            </form:select></td>

                    </tr>
                    <tr>
                        <td>Minimum Quantity Of Ticket To Buy</td>

                        <td><form:label path="minticket"  type="number" />
                            <form:input path="minticket" id="minticket" type="number"/></td>
                        <td>maximum Quantity Of Ticket To Buy</td>
                        <td><form:input path="maxticket" id="maxticket"  type="number" />
                            <form:label path="maxticket"  type="number" />
                        </td>
                    </tr>
                    <tr>  
                        <td>Discount</td>

                        <td><form:radiobutton path="discounttype" value="Amount"/>
                            Amount</td>                                   
                        <td><form:input path="discountamount" id="discountamount" type="number"/>
                            <form:label path="discountamount" type="number"/>
                        </td>
                        <td><form:radiobutton path="discounttype" value="percentage"/>
                            Percentage</td>
                        <td><form:input path="discountpercentage" id="discountpercentage"  type="number"/>
                            <form:label path="discountpercentage"  type="number"/>
                        </td> 


                        <td> <input style="background-color: cadetblue;width: 50px" type="submit"  value="add" /></tb> 
                    </tr>
                </table>
            </form:form>
            <div>
                <h1>Discount List!</h1>

                <table>

                     

                    <th>min ticket</th>

                    <th>max ticket</th>
                    <th>discount amount</th>
                    <th>discount percentage</th>

                    <c:forEach var="discount" items="${map.discountList}" >
                        <tr>

                            <!--<td>{discount.tickettype}</td>-->

                            <td style="text-align: center">${discount.minticket}</td>

                            <td style="text-align: center">${discount.maxticket}</td>
                            <td style="text-align: center">${discount.discountamount}</td>
                            <td style="text-align: center">${discount.discountpercentage}</td>
                        </tr>
                    </c:forEach>
                </table>
               

            </div>
        </div></center>

</body>
</html>
