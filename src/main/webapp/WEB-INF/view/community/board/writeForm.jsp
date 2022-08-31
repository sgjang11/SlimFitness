<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
<div class="container">
<form action="/community/board/writeFormProc" method="post">
<h2>글쓰기</h2>
<div class="input-group">
    <div class="input-group-prepend">
      <span class="input-group-text">글번호</span>
    </div>
    <input type="text" class="form-control" id="idx"  name="idx" value="${idx}" readonly="readonly">
  </div>
<div class="input-group">
    <div class="input-group-prepend">
      <span class="input-group-text">작성자</span>
    </div>
    <input type="text" class="form-control" id="writeID" name="writeID" value="${id}" readonly="readonly">
  </div>
  <div class="input-group">
    <div class="input-group-prepend">
      <span class="input-group-text" >제목</span>
    </div>
    <input type="text" class="form-control" id="title" name="title">
  </div>
  <div class="input-group">
    <div class="input-group-prepend">
      <span class="input-group-text">내용</span>
    </div>
    <textarea class="form-control" rows="10" id="content" name="content"></textarea>
  </div>
<input type="submit" value="등록" class="btn btn-success">
<input type="button" value="뒤로가기" class="btn btn-danger" onclick="location.href='/community/board/freeBoard'" >
</form>
</div>
</main>