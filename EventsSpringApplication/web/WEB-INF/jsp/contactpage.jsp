<%-- 
    Document   : contactpage
    Created on : Nov 15, 2014, 10:11:24 AM
    Author     : HP
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        ${listContact}
        <%-- ${map}  --%>
        <div>
            <form:form method="GET" name="contacts" action="save" modelAttribute="contact">
                <table>
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
                        ${contacttypename} 
                        <td>contact Type-name:</td>
                        <td>
                            <form:select path="contacttypename">
                                <form:options items="${contacttypename}" itemValue="contacttypename"/>
                            </form:select>                       
                        </td>
                    </tr> 

                    <tr>
                        <td>Email:</td>
                        <td><form:input path="email" type="text"/></td>
                    </tr> 
                    ${eventDisplayList}
                    <tr>
                        <td>Event-Display :</td>  
                        <td><form:radiobuttons path="eventDisplay" items="${eventDisplayList}"/></td>
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
                    <th>MEDIA_NAME</th>
                    <th>CTYPE_NAME</th>
                    <th>EMAIL </th>
                    <th>EVENT_DISPLAY</th>
                    <th>CONTACT_FIRST_NAME</th>
                    <th>CONTACT_LAST_NAME</th>
                    <th>CONTACT_EMAIL</th>
                    <th>CONTACT_PHNO</th>
                    <th>ACTION</th>

                    <c:forEach var="contact" items="${listContact}" varStatus="status">
                        <tr>
                            <td>${status.index + 1}</td>  
                            <td> ${contact.medianame}</td>
                            <td>${contact.contacttypename}</td>
                            <td>${contact.email}</td>
                            <td>${contact.eventDisplay}</td>
                            <td>${contact.fname}</td>
                            <td>${contact.lname}</td>
                            <td>${contact.contactemail}</td>
                            <td>${contact.phonenumber}</td>
                            <td>
                                <a href="/editContact?id=${contact.id}">Edit</a>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <%-- <a href="/deleteContact?id=${contact.id}">Delete</a>  --%>
                            </td> 

                        </tr>
                    </c:forEach>             
                </table>
            </div>

        </div>
    </body>
</html>
