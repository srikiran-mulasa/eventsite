<%-- 
    Document   : ticket
    Created on : 10-Nov-2014, 21:47:08
    Author     : yashwanth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <script src="//code.jquery.com/jquery-1.10.2.js"></script>
          <title>JSP Page</title>
    </head>
    <body>
        <script>
            $(document).ready(function(){
              $("button").click(function(){                 
                    var a = $(this).parent().parent().find('td:eq(0)').text();
                      var b = $(this).parent().parent().find('td:eq(1)').text();
                        var c = $(this).parent().parent().find('td:eq(2)').text();
                        //var c = $(this).find('td:eq(1)').text();
                        console.log(c);
              $("#id").val(a).hide();
              $("#tickettype").val(b);
              $("#totaltickets").val(c);
             
              console.log("hai");
            
              });
          });
      
        </script>
        <h1>Hello World!</h1>
        <div>
            <h1>Ticket</h1>
            <form:form action="insert" method="POST" modelAttribute="ticket">
                <table>
                    <form:input path="id" style="display:none" id="id"/>
                    <tr>
                        <td>Event Date/Time</td>
                        <td>
                            <form:select path="eDate" >
                                <form:option value="" label="---select---"/>      
                                <form:options  items="${eDate}" itemValue="eventDates" itemLabel="eventDates"/>
                            </form:select>
                        </td>     
                    </tr>   
                    <tr>
                       
                        <td>Ticket type</td> 
                        <td><form:input path="ticketType" id="tickettype" type="text" /></td>
                    </tr>
                    <tr>
                        <td>No of tickets to sell</td>
                        <td><form:input path="totalTickets" id="totaltickets" type="number"/></td>
                    </tr> 
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Add">
                           
                            <input type="reset" value="Clear">
                        </td> 
                        
                    </tr>
                </table>
            </form:form>
            <div>
               
                <table id="ticketTable" border="1">
                    
                    <tr>  
                        <td>S.No</td>
                        <td class="heading">ticket type</td>  
                        <td class="heading">total tickets</td>  
                        <td class="heading">Action</td>
                    </tr>
                     <c:forEach var="tic" items="${ticketsList}" varStatus="status">
                    <tr>
                            <td>${tic.id}</td>
                            <td>${tic.ticketType}</td>
                            <td>${tic.totalTickets}</td>
                            <td>
                                
                              <button type="button" id="edit" >edit</button>
<!--                               <a id="edit" href="/Ticket/ticket/save">Edit</a>-->
                            
<!--                                <a href="/Ticket/ticket/deleteTicket?ticketType=${tic.ticketType}">Delete</a>   -->
                               <a href="/Ticket/ticket/deleteTicket?id=${tic.id}">Delete</a>  
                            </td>
                        </tr>
                        </c:forEach>
                </table>
                           
                
            </div>         
        </div>
    </body>
</html>



