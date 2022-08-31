<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
	<div class="headTop">
		<h1><a href="/index" title="메인페이지로 이동"><img src="/img/Logo.png" alt="로고"/></a></h1>
		<div class="navBar">
			<ul>
				<li><a href="/info/siteInfo">사이트소개</a></li>
				<li><a href="/upper/anatomy/backA">상체</a></li>
				<li><a href="/lower/anatomy/hipA">하체</a></li>
				<li><a href="/community/announcements">커뮤니티</a></li>
			</ul>
		</div>
		<div class="headTopRight">
			<div class="navRight">
				<ul>
				<c:if test="${not empty id and id ne 'loginFail'}">
					<li>
						<span id="getId">[${id}]님</span>
						<button type="button" class="login_btn" title="로그인" onclick="location.href='/member/logout'"><i class="fa-solid fa-arrow-right-from-bracket"></i></button>
					</li>
				</c:if>
				<c:if test="${empty id}">
					<li>
						<button type="button" class="login_btn" title="로그인" onclick="location.href='/member/login'"><i class="fa-solid fa-right-to-bracket"></i></button>
					</li>
				</c:if>
					<li>
						<button type="button" class="sitemap_btn" onclick="openNav()" title="사이트맵"><i class="fa-solid fa-bars"></i></button>
					</li>
				</ul>
			</div>
		</div>
	</div> 

	<div class="headBott">
		<div class="navList">
			<div>
				<ul>
					<li><a href="/info/siteInfo">소개글</a></li>
					<li><a href="/info/useInfo">이용방법</a></li>
				</ul>
			</div>
			<div>
				<ul>
					<li><a href="/upper/anatomy/backA">Anatomy</a></li>
					<li><a href="/upper/stretching/backS">Stretching</a></li>
					<li><a href="/upper/exercise/backE">Exercise</a></li>
					<li><a href="/upper/taping/backT">Taping</a></li>
				</ul>
			</div>
			<div>
				<ul>
					<li><a href="/lower/anatomy/hipA">Anatomy</a></li>
					<li><a href="/lower/stretching/hipS">Stretching</a></li>
					<li><a href="/lower/exercise/hipE">Exercise</a></li>
					<li><a href="/lower/taping/hipT">Taping</a></li>
				</ul>	
			</div>
			<div>
				<ul>
					<li><a href="/community/announcements">공지사항</a></li>
					<li><a href="/community/Q&A">Q&A</a></li>
					<li><a href="/community/liveChat">실시간채팅</a></li>
					<li><a href="/community/board/freeBoard">자유게시판</a></li>
				</ul>		
			</div>
		</div> 
	</div>



<div id="siteMap">
	<button type="button" class="closeBtn" onclick="closeNav()"><i class="fa-solid fa-xmark"></i></button>
	<div class="allMenu">
		<div class="inner">
			<div class="list">
				<h2>사이트소개</h2>
				<ul>
					<li><a href="/info/siteInfo">소개글</a></li>
					<li><a href="/info/useInfo">이용방법</a></li>
				</ul>
			</div>
			<div class="list">
				<h2>상체</h2>
				<ul>
					<li><a href="/upper/anatomy/backA">Anatomy</a></li>
					<li><a href="/upper/stretching/backS">Stretching</a></li>
					<li><a href="/upper/exercise/backE">Exercise</a></li>
					<li><a href="/upper/taping/backT">Taping</a></li>
				</ul>		
			</div>
			<div class="list">
				<h2>하체</h2>
				<ul>
					<li><a href="/lower/anatomy/hipA">Anatomy</a></li>
					<li><a href="/lower/stretching/hipS">Stretching</a></li>
					<li><a href="/lower/exercise/hipE">Exercise</a></li>
					<li><a href="/lower/taping/hipT">Taping</a></li>
				</ul>		
			</div>
			<div class="list">
				<h2>커뮤니티</h2>
				<ul>
					<li><a href="/community/announcements">공지사항</a></li>
					<li><a href="/community/Q&A">Q&A</a></li>
					<li><a href="/community/liveChat">실시간채팅</a></li>
					<li><a href="/community/board/freeBoard">자유게시판</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>

</header>