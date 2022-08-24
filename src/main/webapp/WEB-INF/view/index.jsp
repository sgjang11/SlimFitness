<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SlimFitness</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://kit.fontawesome.com/656b1c6227.js" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/css/commen.css" />
<link rel="stylesheet" type="text/css" href="/css/aboutmain.css" />
<script type="text/javascript" src="/js/commen.js"></script>
<script type="text/javascript" src="/js/member.js"></script>
<link rel="stylesheet" href="https://unpkg.com/aos@2.3.1/dist/aos.css" />
<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/view/home/header.jsp"></jsp:include>
<jsp:include page="/WEB-INF/view${page}"></jsp:include>
<jsp:include page="/WEB-INF/view/home/footer.jsp"></jsp:include>
<script>
    AOS.init({
        easing: 'ease-out-back',
        duration: 1000
    });
    
</script> 
</body>
</html>