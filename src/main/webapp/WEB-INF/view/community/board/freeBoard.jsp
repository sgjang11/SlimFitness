<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<main>
	<div class="sub subList2">
		<ul>
			<li><a href="/community/announcements">공지사항</a></li>
			<li><a href="/community/Q&A">Q&A</a></li>
			<li><a href="/community/liveChat">실시간 채팅</a></li>
			<li class="on"><a href="/community/board/freeBoard">자유게시판</a></li>
			</ul>
		</div>
	<div class="container mt-3">
		<h2>일반게시판</h2>
 		<div class="input-group mt-3 mb-3"> 
	  		<button name="kind" id="kind" type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
    		검색선택
  			</button>
  			<div class="dropdown-menu">
    			<a class="dropdown-item" href="#">제목</a>
		    	<a class="dropdown-item" href="#">작성자</a>
		    	<a class="dropdown-item" href="#">날짜</a>
  			</div>
			<input type="text" class="form-control" id="search" name="search">
			<input id="searchbtn" type="button" class="btn btn-info" value="검색">
		</div>
		<table class="table">
			<thead><tr>
				<th>글 번호</th><th>제목</th><th>작성자</th>
			<th>닉네임</th><th>날짜</th><th>조회수</th>
			<th>첨부파일</th>
			</tr></thead>
			<tbody>
				<c:forEach var="board" items="${pagelist.list}">
				<c:if test="${board.isdel eq 0}">
				<tr>
					<td>${idx}</td>
					<td style="text-align: left;">
					<c:forEach begin="1" end="${board.depth}">
					<img alt="댓글이미지" src="/img/reply_icon.gif" style="width: 45px; height: 18px;">
					</c:forEach>
					${board.title}
					</td>
					<td>${board.writeID}</td>
					<td>${board.writeName}</td>
					<td>${board.writeDay}</td>
					<td>${board.readCount}</td>
				</tr>
				</c:if>
				<c:if test="${board.isdel eq 1}">
				<tr class="isdelTd" onclick="del()">
					<th colspan="7">글이 삭제 되었습니다.</th>
				</tr>	
				</c:if>	
				</c:forEach>
			</tbody>
		</table>
	<ul class="pagination">
	<c:if test="${pagelist.startPage>1 }">
		<li class="page-item"><a class="page-link" href="/community/board/freeBoard?currentPage=${pagelist.startPage-5}">이전</a></li>
	</c:if>
	<c:forEach var="pno"  begin="${pagelist.startPage}" end="${pagelist.endPage}" step="1">
		<li class="page-item"><a class="page-link" href="/community/board/freeBoard?currentPage=${pno}">${pno}</a></li>
	</c:forEach>
	<c:if test="${pagelist.endPage<pagelist.totalPage }">
		<li class="page-item"><a class="page-link" href="/community/board/freeBoard?currentPage=${pagelist.startPage+5}">다음</a></li>
	</c:if>
	</ul>
		<button type="button" class="btn btn-success" onclick="location.href='/community/board/writeForm'">글쓰기</button>	
	</div>
</main>
