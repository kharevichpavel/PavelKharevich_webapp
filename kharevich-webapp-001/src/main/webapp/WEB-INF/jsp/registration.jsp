<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
  input{
    margin: 2px;
  }
  
  div{
  	background-color: antiquewhite;
  	width: 400px;
  	border: solid 2px orange;
  }
  h1{
  	width: 400px;
  	background-color: antiquewhite;
  	text-align: center;
  	border: solid 2px orange;  	 
  }
  
</style>
</head>
<body>


<form action="controller" method="get"> 
  <h1>Создание учётной записи:</h1>
  <div>
    <input type="text" id="first_name" name="first_name" required>
    <label for="first_name">Имя</label><br><br>
           
    <input type="text" id="last_name" name="last_name" required>
    <label for="last_name">Фамилия</label><br><br>
           
    <input type="date" id="date" name="date" required>
    <label for="date">Дата рождения</label>
          
    <p>Пол:</p>
    <input type="radio" id="gender" name="gender" value="male">Мужской
    <input type="radio" id="gender" name="gender" value="female">Женский
    <br><br>
    
    <input type="email" id="email" name="email" size="42px" required placeholder="Пример: one@gmail.com">
    <label for="email">Email</label><br><br>
    
    <input type="tel" id="tel" name="tel" size="32px" required placeholder="Пример: +375291111111" pattern="(\+)([0-9]){12}">
    <label for="tel">Номер телефона</label><br><br>
    
    <input type="text" id="login" name="login" required>
    <label for="login">Логин</label>
    <br><br>
    
    <input type="password" id="password" name="password" required>
    <label for="password">Пароль</label>
           
  </div><br/>
  
  <div>
    <input type="hidden" name="command" value="go_to_main_after_registration" />
    <input type="submit" value="Зарегистрироваться"/>
    <button type="reset">Очистить форму</button>
  </div>
  
</form>  
  
       


</body>
</html>