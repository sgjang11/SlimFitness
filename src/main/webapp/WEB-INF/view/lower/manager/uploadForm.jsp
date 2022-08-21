<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
<div class="container">
<form action="/upper/manager/regFormProc" method="post" enctype="multipart/form-data">
<h2>등록하기</h2>
<div class="input-group mb-3">
   <div class="input-group-prepend">
      <span class="input-group-text">종류</span>
    </div>
    <input type="text" class="form-control" id="kind"  name="kind" >
</div>
<div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text" >제목</span>
    </div>
    <input type="text" class="form-control" id="title" name="title">
</div>
<div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">내용</span>
    </div>
    <textarea class="form-control" rows="10" id="content" name="content"></textarea>
</div>
<div class="input-group mb-3">
	<input type="file" id="fileName1" name="fileName1" class="form-control-file border">
	<input type="file" id="fileName2" name="fileName2" class="form-control-file border">
	<input type="file" id="fileName3" name="fileName3" class="form-control-file border">
	<input type="file" id="fileName4" name="fileName4" class="form-control-file border">
</div>
<input type="submit" value="등록" class="btn btn-success">
<input type="button" value="뒤로가기" class="btn btn-danger" onclick="location.href='/upper/anatomy/backA'" >
</form>
</div>
</main>
