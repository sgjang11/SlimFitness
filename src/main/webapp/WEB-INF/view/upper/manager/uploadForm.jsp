<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
<div class="container">
<form action="/upper/manager/uploadFormProc" method="post" enctype="multipart/form-data" id="uploadForm">
<h2>등록하기</h2>
<div class="input-group">
   <div class="input-group-prepend">
      <span class="input-group-text">종류</span>
    </div>
    <input type="text" class="form-control" id="kind"  name="kind" value="${url}" readonly="readonly">
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
<div class="input-group">
	<input type="file" id="fileName1" name="fileName1" class="form-file border">
	<input type="file" id="fileName2" name="fileName2" class="form-file border">
</div>
<input type="submit" value="완료" class="btn btn-success">
<input type="button" value="뒤로가기" class="btn btn-danger" onclick="location.href='/upper/anatomy/${url}'" >
</form>
</div>
</main>