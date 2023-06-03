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
  <h2>부서조회</h2>
  <a href="deptInsert">등록</a>
  <form action="deptList">
    부서<input type="text" name="departmentId" value="${dept.departmentId }">
    위치<input type="text" name="locationId" value="${dept.locationId }">
    <button>검색</button>
    <button type="reset">초기화</button>
  </form>
  <c:forEach items="${deptList }" var="dept">
  	<div>${dept.departmentId } ${dept.departmentName }  ${dept.managerId } ${dept.locationId }
  		 <a href="deptUpdate?deptId=${dept.departmentId }">수정</a>
  	</div>
  </c:forEach>
</body>
</html>