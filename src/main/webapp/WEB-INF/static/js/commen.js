/**
 * 
 */

 $(function(){
  $('.navBar>ul>li').mouseover(function(){
    $('.headBott').stop().slideDown();
  });
  $('header').mouseleave(function(){
    $('.headBott').stop().slideUp();
  })
    
});

function openNav() {
   document.getElementById("siteMap").style.width = "100%";
}

function closeNav() {
  document.getElementById("siteMap").style.width = "0%";
}

function imgTurn(){
  var front="/img/frontmuscle.png";
  var back="/img/backmuscle.png";
  
  if($("#TurnBtn").val()=="front"){
    $("#img").attr("src", back);
    $("#TurnBtn").val("back")
  }else if($("#TurnBtn").val()=="back"){
    $("#img").attr("src", front);
    $("#TurnBtn").val("front")
  }
}


window.onscroll = function scrollFunction() {
		 if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
			  document.getElementById("upBtn").style.display = "block";
		  }else {
   			  document.getElementById("upBtn").style.display = "none";
 		 }
}

function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}






