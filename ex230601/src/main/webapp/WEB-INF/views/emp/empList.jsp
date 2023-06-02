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
  <h2>사원조회</h2>
  <a href="empInsert">등록</a>
  <form action="empList">
    부서<input type="text" name="departmentId" value="${emp.departmentId }">
    fname<input type="text" name="firstName" value="${emp.firstName }">
    <button>검색</button>
    <button type="reset">초기화</button>
  </form>
  <c:forEach items="${empList }" var="emp">
  	<div>${emp.firstName } ${emp.lastName } / ${emp.employeeId }
  		 <a href="empUpdate?empId=${emp.employeeId }">수정</a>
  	 	 <a href="empDelete?empId=${emp.employeeId }">삭제</a></div>
  </c:forEach>
</body>
</html>