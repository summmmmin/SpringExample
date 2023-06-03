<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h2>부서등록</h2>
  <form action="deptInsert" method="post">
    department_name<input type="text" name="departmentName"> <br>
    locations
    		<c:forEach items="${locations }" var="location"> 
    			<input type="radio" name="locationId" value="${location.LOCATION_ID}">${location.STREET_ADDRESS}    			
    		</c:forEach> <br>
    	  
    managers <select name="managerId">
    	    <option value="">선택
    		<c:forEach items="${managers }" var="manager"> 
    			<option value="${manager.EMPLOYEE_ID}"> ${manager.FIRST_NAME}</option>
    		</c:forEach>
    	  </select><br>
    <button>저장</button>
  </form>

</body>
</html>