<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서별 대여매출현황</title>
<style type="text/css">
	thead >.no {text.align }
</style>
</head>
<body>
	<div>
		<h2>도서별 대여 매출 현황</h2>
		</div>
		<table class="table">
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>대여총계</th>
				<th>대여횟수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${rentList}" var="book">
				<tr>
					<td style="text-align:center">${book.bookNo}</td>
					<td style="text-align:left">${book.bookName}</td>
					<td style="text-align:right">${book.rentTotalPrice}</td>
					<td style="text-align:right">${book.rentCount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>