<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>kharevich-webapp-001</title>
<style type="text/css">
	input{
    margin: 2px;
  }
  body{
    background-color: antiquewhite;
  }
  

</style>
</head>
<body>


<form action="controller" method="post">
  <input type="hidden" name="command" value="do_logination" />	 
  <h1>Введите логин и пароль:</h1>
  <div>
    <input type="text" id="login" name="login">
    <label for="login">Логин</label>
    <br>
    
    <input type="password" id="password" name="password">
    <label for="password">Пароль</label>
       
  </div>  
  <br/>
       
  <div>
    <input type="submit" value="Войти"/>
  </div>
</form>


<form action="controller" method="post">
	<div>
		<input type="hidden" name="command" value="GO_TO_REGISTRATION_PAGE" />
		<input type="submit" value="Регистрация" />
	</div>
</form>
<br/>

</body>
</html>