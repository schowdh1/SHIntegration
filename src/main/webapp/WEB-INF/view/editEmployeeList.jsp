<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 hibernate integration</title>
</head>
<body>
 
<h2>Employee Management Screen :</h2>
 
<form:form method="post" action="addIt" commandName="employee">
 
    <table>
    <tr>
    <%-- <td><form:label path="first_name"><spring:message code="label.first_name"/></form:label></td>
        <td><form:input path="first_name" /></td>  --%>
       <td><form><spring:message code="label.first_name"/></form></td>
        <td><form:input path="first_name" /></td> 
        
    </tr>
    <tr>
        <td><form><spring:message code="label.last_name"/></form></td>
        <td><form:input path="last_name" /></td>
    </tr>
    <tr>
    <td>hobbies</td>
    <td>
    <form:select  path="interest" items="${hobbies}"/>
    </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Employees</h3>
<c:if  test="${!empty employeeList}">
<table class="data">
<tr><td>
    <h2>Name</h2>
    </td>
     <td></td> 
     <td></td>
      <td></td>
    <td>
    <h2>Hobby</h2>
    </td>
    <td>
    </td>
     <td></td>
      <td></td>
    <td>
    <h2>Button</h2>
    </td>

</tr>
<c:forEach items="${employeeList}" var="emp">
    <tr>
        <td>${emp.last_name}, ${emp.first_name} </td>
        <td></td>
        <td></td>
         <td></td>
         <td>${emp.interest}</td>
         <td> </td>
         <td></td>
          <td></td>
        <td><a href="delete/${emp.id}">  delete</a></td>
       
    </tr>
   
   
    
</c:forEach>
</table>
</c:if>
 
</body>
</html>