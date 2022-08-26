<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<main>
<form action="creatememberProc" method="post" id="creatememberForm">
  <div id="creatememberFormList">
	<h3>회원가입</h3>
    <label for=id><b>ID</b></label><br>
    <input type="text" placeholder="Enter Username" name="id" id="id">
    <input type="button" value="중복확인" onclick="checkid()" ><br>
    <label for="psw"><b>Password</b></label><br>
    <input type="password" placeholder="Enter Password" name="password" id="password"><br>
    <label for="psw"><b>RePassword</b></label><br>
    <input type="password" placeholder="Enter rePassword" name="repassword" id="repassword">
    <input type="button" value="비밀번호확인" onclick="passwordconfirm()"><br>
    <label for="psw"><b>email</b></label><br>
    <input type="email" placeholder="Enter Email" name="email" id="email"><br>
    <label for="psw"><b>닉네임</b></label><br>
    <input type="text" placeholder="Enter Nickname" name="nickname" id="nickname">
    <input type="button" value="닉네임확인" onclick="checknick()"><br>
  </div>
    <input type="button" value="가입"  onclick="createmember()">
</form>
</main>


