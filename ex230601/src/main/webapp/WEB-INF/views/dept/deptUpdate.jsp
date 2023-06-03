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
  <form action="deptUpdate" method="post" name="frm">
  	<strong>department_id</strong><input readonly type="text" name="departmentId" value="${dept.departmentId }"> <br>
    <strong>department_name</strong><input type="text" name="departmentName" value="${dept.departmentName }"> <br>
    <strong>locations</strong><br>
    		<c:forEach items="${locations }" var="location"> 
    			<input type="radio" name="locationId" value="${location.LOCATION_ID}"   			
    			<c:if test="${location.LOCATION_ID == dept.locationId}">checked</c:if>>${location.CITY}<br>
    		</c:forEach> <br>
    	  
    <strong>managers</strong> <select name="managerId">
    	    <option>선택
    		<c:forEach items="${managers }" var="manager"> 
    			<option value="${manager.EMPLOYEE_ID}"> ${manager.FIRST_NAME}</option>
    		</c:forEach>
    	  </select><br>
    <button>저장</button>
  </form>

  <script>
  	frm.managerId.value = "${dept.managerId}"
  </script>
</body>
</html>