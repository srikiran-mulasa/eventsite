<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Events page</title>
    </head>
     <div>  
   <form:form method="post" action="/insert" modelAttribute="user">  
    <table>  
     <tr>  
      <td>Title</td>  
      <td><form:input path="title"/></td>  
     </tr>  
     <tr>  
      <td>web url</td>  
      <td><form:input path="weburl"/></td>  
     </tr>  
     <tr>
     
      <td><input type="submit" value="Save" /></td>  
     </tr>  
    
    </table>  
   </form:form>  
  </div>  
</html>
