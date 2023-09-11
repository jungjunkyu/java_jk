<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>세미프로젝트</title>
</head>
<body>
	<script type="text/javascript">
		alert('${msg}');
		location.href= '<c:url value="${url}"/>';
	</script>
</body>
</html>