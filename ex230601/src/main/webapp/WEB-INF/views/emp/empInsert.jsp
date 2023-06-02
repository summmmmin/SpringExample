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
  <h2>사원등록</h2>
  <form action="empInsert" method="post">
    fname<input type="text" name="firstName"> <br>
    lname<input type="text" name="lastName"> <br>
    email<input type="text" name="email"> <br>
    hireDate<input type="Date" name="hireDate"> <br>
    departmentId
    		<c:forEach items="${depts }" var="dept"> 
    			<input type="radio" name="departmentId" value="${dept.DEPARTMENT_ID}">${dept.DEPARTMENT_NAME}    			
    		</c:forEach>
    	  
    jobId <select name="jobId">
    	    <option value="">선택
    		<c:forEach items="${jobs }" var="job"> 
    			<option value="${job.jobId}"> ${job.jobTitle}</option>
    		</c:forEach>
    	  </select><br>
    <button>저장</button>
  </form>

</body>
</html>