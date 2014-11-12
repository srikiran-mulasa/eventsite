<%-- 
    Document   : createEvent
    Created on : Nov 3, 2014, 10:48:44 PM
    Author     : RaviJyothi
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Events page</title>
        <script>
           function subValues()
           {
             console.log("hello");
               var i = 0;
              var selectedCategory =document.getElementById("categoryId").value;
              
              console.log(selectedCategory);
              if(selectedCategory!==null && selectedCategory!=="-")
                {
                    var secondDDContent = document.getElementsByName(selectedCategory);
                    console.log("hellooo" + secondDDContent.length);
                    var selectOpt = document.getElementById("subCategoryNum");
                    console.log("length" + selectOpt.length);
                    if (selectOpt.length > 1)
                    {
                        // Clear all contents of second drop down
                        for (var i = selectOpt.options.length - 1; i >= 0; i--)
                        {
                            selectOpt.remove(i);
                        }
                        // put back the frist options
                        var opt1 = document.createElement('option');
                        opt1.value = "-";
                        opt1.innerHTML = "--Please Select";
                        selectOpt.appendChild(opt1);
                    }
                    for (var i = 0; i < secondDDContent.length; i++)
                    {
                        var opt2 = document.createElement('option');
                        opt2.innerHTML = selectOpt[i].name;
                        opt2.innerHTML = secondDDContent[i].value;
                        selectOpt.appendChild(opt2);
                    }
                }
            }

        </script>   
    </head>
    <div>  
        <form:form method="post" name="events" action="insert" modelAttribute="user">  
            <table>  
                <tr>  
                    <td>Event Title</td>  
                    <td><form:input path="title" /></td>  
                </tr> 

                <tr>  
                    <td>Paid Event :</td>  
                    <td><form:radiobuttons path="paidEvent"  
                                       items="${map.paidList}" /></td>  
                </tr>  
                </tr> 
                <tr>  
                    <td>Private Event :</td>  
                    <td><form:radiobuttons path="privateEvent"  
                                       items="${map.privateList}" /></td>  
                </tr>  
                <tr>
                    <td>Category</td>
                    <td>
                        <form:select  path="categoryId" onchange="javascript:subValues(this.value);">
                            <form:option value="-" label="--Please Select"/>
                            <form:options items="${categoryId}"  itemValue="categoryId" itemLabel="categoryName"/>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Sub Category</td>
                    <td>
                        <form:select path="subCategoryNum">
                            <form:option value="-" label="--Please Select"/>
                            <%--
                                <form:options items="${subCategoryNum}" itemValue="subCategoryName" itemLabel="subCategoryName"/>
                            --%>
                            <c:forEach items="${subCategoryNum}" var="catgItems">
                                <input type="hidden" name="${catgItems.subCategoryNum}" value="${catgItems.subCategoryName}" />          
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
                <tr>  
                    <td>Webinar Url</td>  
                    <td><form:input path="weburl" /></td>  
                </tr> 
                <tr>

                    <td>Event Description</td>
                    <td><form:textarea path="eventDescription" /></td>
                </tr>
                <td> </td>  
                <td><input type="submit" value="Save" /></td>  
                </tr> 

            </table>  
        </form:form>  
    </div>  
</html>
