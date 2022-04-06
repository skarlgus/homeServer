<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 서버</title>
</head>
<body>
	<h1>개발 메인 페이지</h1>
	
	<form class="form-login" action = "/mail.do" method = "post"> 
		<input type = "text" class="input" name = "id" placeholder="ID" required> 
		<input type = "password" class="input" name = "pw" placeholder="PW" required> 
		<button class="btn" type="submit"> 로그인 </button>
	</form>

</body>
</html>


