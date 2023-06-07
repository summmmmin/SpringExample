<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
	<title>WebSite</title>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header"/>
	</header>
	<main>
		<tiles:insertAttribute name="content"/>
	</main>
	<footer>
	  <div style="text-align : center;">
		<h1>학교</h1>	  
	  </div>
	</footer>
</body>
</html>