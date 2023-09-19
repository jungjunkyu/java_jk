<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
  <h2 class="pt-5">게시글 조회</h2>
  	<table class="table">
   	 <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>추천/비추천</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list }" var="board" varStatus="vs">
      <tr>
        <td>${list.size() - vs.index}</td>
        <td><a href="#">${board.bo_title }</a></td>
        <td>${board.bo_me_id }</td>
        <td>${board.bo_up }/${board.bo_down }</td>
        <td>${board.bo_views }</td>
      </tr>
    </c:forEach>      
    </tbody>
  </table>
</div>

</body>
</html>

</body>
</html>