<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
  <input type="button" onclick="topFunction()" id="upBtn" title="Go to top" value="TOP">
	<div id="container">
		<div class="section">
			<div class="searching">
				<input type="text" name="searching" id="searchBar">
				<button class="searchBtn"><i class="fa-solid fa-magnifying-glass"></i></button>
			</div>
			<div class="main1">
				<div class="main1Text">
					<p>원하는 부위를 클릭하세요.</p>
				</div>
				<div class="frontImg" >
					<img src="/img/frontmuscle.png" alt="frontImg" id="img">
				</div>
				<div class="TurnBtnBox">
					<button onclick="imgTurn()" id="TurnBtn" value="front"><i class="fa-solid fa-arrows-rotate"></i></button>
				</div>
			</div>
		</div>
	
		<div class="section">
			<div class="main2">
			<div class="mainImg" data-aos="zoom-out-right" data-aos-duration="1000">
				<img src="/img/warmUp.png" alt="warmUpimg">
			</div>
			<!--  두번째 슬라이드 부분 -->
			<div class="mainSlideText" data-aos="fade-left" data-aos-duration="3000">
				<h1>Warm Up을 해야하는 이유</h1>
				<h3>운동 전 Warm up 이점</h3>
				<ul>
					<li>* 근육과 인대 등의 온도를 높여 부상의 위험을 최소화할 수 있다.</li>
					<li>* 운동 초기에 무산소적 대사물질인 젖산이 조기에 축적되어 근육의 피로를 유발할 수 있지만 적절한 준비운동으로 젖산 축적을 줄일 수 있다.</li>
					<li>* 준비운동을 통해 운동 상황에 대한 적응의 역할을 하여 인체의 신경계 조절기능을 향상시킨다.</li>
					<li>* 갑작스럽게 운동을 시작하면 심장에 무리가기 때문에 준비운동을 통해 심장근의 활동수준을 증가시켜 심장손상의 위험을 낮춰줄 수 있다.</li>
				</ul>
				
			</div>
			</div>
		</div>
	
	
		<div class="section">
			<div class="main3">
			<div class="mainImg" data-aos="zoom-out-right" data-aos-duration="1000">
				<img src="/img/coolDown.png" alt="coolDownimg">
			</div>
			<!--  세번째 슬라이드 부분 -->
			<div class="mainSlideText" data-aos="fade-left" data-aos-duration="3000">
				<h1>Cool Down을 해야하는 이유</h1>
				<h3>운동 후 Cool Down 이점</h3>
				<ul>
					<li>* 정리운동은 활동근으로의 혈류량을 유지시켜주고, 이 과정에서 젖산을 연료로 하는 유산소적 대사를 촉진하여 운동 후의 피로를 예방할 수 있다.</li>
					<li>* 갑자기 활동을 정지하면 정맥환류량(정맥을 통해 심방으로 돌아가는 혈액의 양)이 감소하여 심박출량이 급격히 감소되어 뇌빈혈을 초래할 수 있지만 정리운동으로 근펌프 작용을 지속시켜 하체의 정맥 저류현상 또는 급격한 심박출량 감소 현상을 예방한다.</li>
					<li>* 정리운동은 근혈류 속도가 급격히 감소되지 않고 서서히 감소하도록 하고, 운동 시 축적되는 대사물질(근통증이나 근경직의 원인)과 같은 물질을 신속하게 제거하도록 돕는다.</li>
				</ul>
			</div>
			</div>
		</div>

	</div> <!-- // container -->
</main>
	
