<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<main>
	<div class="sub subList2">
		<ul>
			<li><a href="/upper/anatomy/backA">Anatomy</a></li>
			<li><a href="/upper/stretching/backS">Stretching</a></li>
			<li><a href="/upper/exercise/backE">Exercise</a></li>
			<li class="on"><a href="/upper/taping/backT">Taping</a></li>
		</ul>
	</div>
	<div class="sub subList3">
		<ul>
			<li><a href="/upper/taping/backT">등</a></li>
			<li class="on"><a href="/upper/taping/chestT">가슴</a></li>
			<li><a href="/upper/taping/shoulderT">어깨</a></li>
			<li><a href="/upper/taping/abdomenT">복부</a></li>
			<li><a href="/upper/taping/armT">팔</a></li>
		</ul>
	</div>
	<div class="searching">
		<input type="text" name="searching" id="searchBar">
		<button class="searchBtn"><i class="fa-solid fa-magnifying-glass"></i></button>
	</div>
	<div id="upload">
	<input type="button" value="등록" id="uploadBtn" onclick="GoForm('${url}')">
	</div>
	<div class="selectedList">
		<c:forEach var="upper" items="${pagelist.list}">
		<div class="title">
			<label for="">근육 이름</label>
			<h3>${upper.title}</h3>		
		</div>
		<div class="writeDay">
			<label for="">작성일</label>
			<h3>${upper.writeDay}</h3>	
		</div>
		<div class="content">
			<p>${upper.content}</p>		
		</div>
		<div class="uploadImg">
			<c:if test="${not empty upper.fileName1}">
			<img src="/file/${upper.fileName1}" alt="${upper.title}">	
			</c:if>
			<c:if test="${not empty upper.fileName2}">
			<img src="/file/${upper.fileName2}" alt="${upper.title}">	
			</c:if>
		</div>
		</c:forEach>
		<div class="pagination">	
			<ul class="pagelist">
			<c:if test="${pagelist.startPage>1 }">
				<li class="page-item"><a class="page-link" href="/upper/anatomy/backA?currentPage=${pagelist.startPage-5}">이전</a></li>
				</c:if>
				<c:forEach var="pno"  begin="${pagelist.startPage}" end="${pagelist.endPage}" step="1">
				<li class="page-item"><a class="page-link" href="/upper/anatomy/backA?currentPage=${pno}">${pno}</a></li>
				</c:forEach>
				<c:if test="${pagelist.endPage<pagelist.totalPage }">
				<li class="page-item"><a class="page-link" href="/upper/anatomy/backA?currentPage=${pagelist.startPage+5}">다음</a></li>
				</c:if>
			</ul>	
		</div>
	</div>
</main>