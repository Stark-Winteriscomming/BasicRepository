<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>SeoKyeong Academy</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 
        Rectangle Template 
        http://www.templatemo.com/preview/templatemo_439_rectangle
    	-->
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/templatemo-style.css">
<link rel="stylesheet" href="css/ch.css">
<script src="js/vendor/modernizr-2.6.2.min.js"></script>

<script>
	function goHome() {
		var url = "home.jsp";
		document.location.href = url;

	}
	function goStudent() {
		var url = "student.do";
		document.location.href = url;

	}
	function goScore() {
		var url = "showGrade.do";
		document.location.href = url;

	}

</script>

</head>
<body>
<%
String name = (String)request.getAttribute("userName");
session.setAttribute("userName",name);
%>
	<!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

	<div class="site-bg"></div>
	<div class="site-bg-overlay"></div>

	<!-- TOP HEADER -->
	<div class="top-header">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-sm-6 col-xs-12">
					<p class="phone-info">
						환영합니다　　<%=name %> 선생님　　<a href="logout.jsp">로그아웃</a>
					</p>
				</div>
				<div class="col-md-6 col-sm-6 col-xs-12">
				
				<!-- <div class="subscribe-form"> -->

						<!-- col-md-(숫자) 숫자가 작아질수록 좌우 여백이 좁아짐 -->
						<fieldset class="col-md-3 button-holder">
							<input name="submit" type="button" class="menu-button"
								id="submit" value="       Home      " onclick="goHome()">
						</fieldset>
						<fieldset class="col-md-4 button-holder">
							<input name="submit" type="button" class="menu-button"
								id="submit" value="Managing students" onclick="goStudent()">
						</fieldset>
						<fieldset class="col-md-3 button-holder">
							<input name="submit" type="button" class="menu-button"
								id="submit" value=" Managing grade " onclick="goScore()">
						</fieldset>
				</div>
			</div>
		</div>
	</div>
	<!-- .top-header -->


	<!-- 모바일에서보이는 메뉴 -->
	<div class="visible-xs visible-sm responsive-menu">
		<a href="#" class="toggle-menu"> <i class="fa fa-bars"></i> Show
			Menu </a>
		<div class="show-menu">
			<ul class="main-menu">
				<li><a class="show-1 active homebutton" href="home.jsp"><i
						class="fa fa-home"></i>Home</a></li>
				<li><a class="show-2 aboutbutton" href="#"><i
						class="student.jsp"></i>Managing Students</a></li>
				<li><a class="show-3 projectbutton" href="#"><i
						class="fa fa-camera"></i>Managing Grade</a></li>
				<li><a id="register" class="show-5 contactbutton" href="#"><i
						class="fa fa-envelope"></i>Attendance</a></li>
			</ul>
		</div>
	</div>

	<div class="container" id="page-content">
		<div class="row">



			<div class="col-md-9 col-sm-12 content-holder">
				<!-- CONTENT -->
				<div id="menu-container">

					<div class="logo-holder logo-top-margin">
						<a href="#" class="site-brand"><img src="images/logo.png"
							alt="">
						</a>
					</div>



					<div id="menu-1" class="homepage home-section text-center">
						<div class="welcome-text">
							<h2>
								SeoKyeong Academy <strong> Notice </strong>
							</h2>
							<p>2016.06.01 이과선생님들 모임이 있습니다.</p>
							<p>2016.06.22 기말고사 시험 일정 회의가 있습니다.</p>
							<p>2016.07.02 김성홍 선생님 정년퇴임식이 있습니다.</p>
							<form action="search_mid.do" method="get" class="subscribe-form">
								<div class="row">
									<fieldset class="col-md-offset-2 col-md-6">
										<input name="studentName" type="text" class="email"
											placeholder="Write students name..">
									</fieldset>
									<fieldset class="col-md-4 button-holder">
										<input name="submit" type="submit" class="button default"
											id="submit" value="Search">
									</fieldset>
								</div>
								<!-- <p class="subscribe-text">Please subscribe your email for latest updates!</p> -->
							</form>
							<br><br><br><br><br><br><br>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--여기서부
        <!-- SITE-FOOTER -->
	<div class="site-footer">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<p>
						Copyright &copy; 2016 SeoKyeong Academy

						<!-- | Design: <a href="http://www.templatemo.com" target="_parent"><span class="green">free templates</span></a> -->
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- .site-footer -->

	<!-- <script src="js/vendor/jquery-1.10.2.min.js"></script> -->
	<script src="js/plugins.js"></script>
	<script src="js/main.js"></script>
	<!-- templatemo 439 rectangle -->
</body>
</html>