<%-- 
    Document   : contactpage
    Created on : Nov 15, 2014, 10:11:24 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
      
        <%-- ${map}  --%>
        <div>
            <form:form method="GET" name="contacts" action="save" modelAttribute="contact">
                <table>
                      ${entireContactList}
                    <tr>
                        <td>ID</td>
                        <td><form:input path="Id" type="number"/></td>
                    </tr>

                    <tr>
                        ${medianame} 
                        <td>Media-Name:</td>
                        <td>
                            <form:select path="medianame">
                                <form:options items="${medianame}" itemValue="medianame"/>
                            </form:select>                       
                        </td>
                    </tr>

                    <tr>
                        ${contacttype} 
                        <td>contact Type-name:</td>
                        <td>
                            <form:select path="contacttypename">
                                <form:options items="${contacttype}" itemValue="contacttype"/>
                            </form:select>                       
                        </td>
                    </tr> 

                    <tr>
                        <td>Email:</td>
                        <td><form:input path="email" type="text"/></td>
                    </tr> 
                    ${map.eventDisplayList}
                    <tr>
                        <td>Event-Display :</td>  
                        <td><form:radiobuttons path="eventDisplay" items="${map.eventDisplayList}" /></td>
                    </tr>

                    <tr>
                        <td>First-Name:</td>
                        <td><form:input path="fname" type="text"/></td>
                    </tr>

                    <tr>
                        <td>Last-Name:</td>
                        <td><form:input path="lname" type="text"/></td> 
                    </tr>

                    <tr>
                        <td>Contact-Email: </td>
                        <td><form:input path="contactemail" type="text"/></td>
                    </tr>

                    <tr>
                        <td>Phone Number:</td>
                        <td><form:input path="phonenumber" type="number"/></td>
                    </tr>

                    <tr>  
                        <td></td>
                        <td><input type="submit" value="Save" /></td>
                    </tr>
                </table>
            </form:form>

            <br><br><br>

            <div align="center">
                <h1>Contact List</h1>
                <h3><a href="/newContact">New Contact</a></h3>
                <table border="1">
                    <th>ID</th>
                    <th>MEDIA_NAME</th>
                    <th>CTYPE_NAME</th>
                    <th>EMAIL </th>
                    <th>EVENT_DISPLAY</th>
                    <th>CONTACT_FIRST_NAME</th>
                    <th>CONTACT_LAST_NAME</th>
                    <th>CONTACT_EMAIL</th>
                    <th>CONTACT_PHNO</th>
                    <th>ACTION</th>

                    <c:forEach var="cont" items="${entireContactList}">
                        <tr>
                            <td>${cont.id}</td>
                            <td> ${cont.medianame}</td>
                            <td>${cont.contacttypename}</td>
                            <td>${cont.email}</td>
                            <td>${cont.eventDisplay}</td>
                            <td>${cont.fname}</td>
                            <td>${cont.lname}</td>
                            <td>${cont.contactemail}</td>
                            <td>${cont.phonenumber}</td>
                            <td>
                                <%--- <a href="/editContact?id=${contact.id}">Edit</a> ---%>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                 <a href="/EventContactScreen/contact/deleteContact?id=${cont.id}">Delete</a>  
                            </td> 

                        </tr>
                    </c:forEach>             
                </table>
            </div>

        </div>
    </body>
</html>
