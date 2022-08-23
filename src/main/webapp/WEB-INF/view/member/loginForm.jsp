<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<main>
<form action="loginProc" method="post" id="loginForm">
  <div id="formList">
	<h3>LOGIN</h3>
    <label for=id><b>ID</b></label>
    <input type="text" placeholder="Enter Username" name="id" id="id" required><br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required>
    <input type="submit" value="Login">
  </div>
  <div id="otherBtn">
    <button type="button" onclick="location.href='/index'">뒤로가기</button>
    <button type="button" onclick="location.href='/member/createmember'">회원가입</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</main>


