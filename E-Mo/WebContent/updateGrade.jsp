<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>SeoKyeong Academy</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/templatemo-style.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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
</script>
<title>Update Grade</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #aabcfe;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #aabcfe;
	color: #669;
	background-color: #e8edff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #aabcfe;
	color: #039;
	background-color: #b9c9fe;
}

.tg .tg-s6z2 {
	text-align: center
}

.tg .tg-yw4l {
	vertical-align: top
}
</style>
</head>

</head>

<body>
	<%
		String name = (String) session.getAttribute("userName");
	%>
	<div class="site-bg"></div>
	<div class="site-bg-overlay"></div>

	<!-- TOP HEADER -->
	<div class="top-header">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-sm-6 col-xs-12">
					<p class="phone-info">
						환영합니다
						<%=name%> 선생님 <a href="logout.jsp">로그아웃</a>
					</p>
				</div>
				<div class="col-md-6 col-sm-6 col-xs-12">

					<!-- <div class="subscribe-form"> -->

					<!-- col-md-(숫자) 숫자가 작아질수록 좌우 여백이 좁아짐 -->
					<fieldset class="col-md-3 button-holder">
						<input name="submit" type="button" class="button default"
							id="submit" value="       Home      " onclick="goHome()">
					</fieldset>
					<fieldset class="col-md-4 button-holder">
						<input name="submit" type="button" class="button default"
							id="submit" value="Managing students" onclick="goStudent()">
					</fieldset>
					<fieldset class="col-md-3 button-holder">
						<input name="submit" type="button" class="button default"
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
				<li><a class="show-1 active homebutton" href="#"><i
						class="fa fa-home"></i>Home</a>
				</li>
				<li><a class="show-2 aboutbutton" href="#"><i
						class="fa fa-user"></i>Managing Students</a>
				</li>
				<li><a class="show-3 projectbutton" href="#"><i
						class="fa fa-camera"></i>Managing Grade</a>
				</li>
			</ul>
		</div>
	</div>

	<div class="container" id="page-content">
		<div class="row">



			<div class="col-md-9 col-sm-12 content-holder">
				<!-- CONTENT -->
				<div id="menu-container">

					<!--   <div class="logo-holder logo-top-margin">
                            <a href="#" class="site-brand"><img src="images/logo.png" alt=""></a>
                        </div> -->
					<div class="welcome-text">
						<h2>
							<strong> Update Grade </strong>
						</h2>
					</div>
					<div id="menu-1" class="homepage home-section text-center">
						<div class="row">
							<div class="col-md-8 col-sm-8">
								<div class="box-content">
									<h3 class="widget-title">Input data</h3>
									<form action="updateGrade.do" method="post"
										class="contact-form">
										<fieldset>
											<input type="text" class="name" name="id"
												placeholder="Id...">
										</fieldset>
										<fieldset>
											<input type="text" class="name" name="year"
												placeholder="Year...">
										</fieldset>
										<fieldset>
											<input type="text" class="name" name="month"
												placeholder="Month...">
										</fieldset>

										<fieldset>
											<input type="text" class="name" name="language"
												placeholder="Language...">
										</fieldset>

										<fieldset>
											<input type="text" class="name" name="english"
												placeholder="english...">
										</fieldset>
										<fieldset>
											<input type="text" class="name" name="math"
												placeholder="math...">
										</fieldset>
										
										<fieldset>
											<input type="submit" class="button" id="button"
												value="input">
										</fieldset>

									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

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

	<script src="js/vendor/jquery-1.10.2.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/main.js"></script>
	<!-- templatemo 439 rectangle -->
</body>
</html>