<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="no-js">

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
<script>
	function goregister() {
		var url = "register.jsp";
		document.location.href = url;
		/* window.open(url, name); */

	}
	function gomodify() {
		var url = "choose.do";
		document.location.href = url;

	}
	function godelete() {
		var url = "choose2.do";
		document.location.href = url;

	}
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
<% String name = (String)session.getAttribute("userName");%>

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
				<li><a class="show-1 active homebutton" href="home.jsp"><i
						class="fa fa-home"></i>Home</a>
				</li>
				<li><a class="show-2 aboutbutton" href="student.jsp"><i
						class="fa fa-user"></i>Managing Students</a>
				</li>
				<li><a class="show-3 projectbutton" href="showGrade.do"><i
						class="fa fa-camera"></i>Managing Grade</a>
				</li>
			</ul>
		</div>
	</div>
	<!-- end of 모바일에서보이는 메뉴 -->

	<div class="container" id="page-content">
		<div class="row">		
			<div class="col-md-9 col-sm-12 content-holder">
				<!-- CONTENT -->
				<!-- 버튼들 --->
				<!-- 학생 삽입, 삭제, 수정 버튼들 -->
				<form action="#" method="get" class="subscribe-form">
					<div class="row">
						<!-- col-md-(숫자) 숫자가 작아질수록 좌우 여백이 좁아짐 -->
						<fieldset class="col-md-2 button-holder">
							<input name="submit" type="button" class="button default"
								id="submit" value="학생정보 등록" onclick="goregister()">
						</fieldset>
						<fieldset class="col-md-2 button-holder">
							<input name="submit" type="button" class="button default"
								id="submit" value="학생정보 수정" onclick="gomodify()">
						</fieldset>
						<fieldset class="col-md-2 button-holder">
							<input name="submit" type="button" class="button default"
								id="submit" value="학생정보 삭제" onclick="godelete()">
						</fieldset>
					</div>
				</form>
				<!-- end of 버튼들 -->


				<div id="con">
					<!-- ---------------------  여기 안에 넣으면 됨 --------------------- -->
					<c:forEach var="studentinfo" items="${studentinfo}">
						<div class="col-md-7 col-sm-8">
							<div class="box-content profile">
								<h3 class="widget-title">
									Number:
									<c:out value="${studentinfo.studentId}" />
									/ Name:
									<c:out value="${studentinfo.studentName}" />
								</h3>
								<!-- 학생 이름 -->
								<div class="profile-thumb">
									<!--  <img src="images/${studentinfo.studentName}.png" alt=""> -->   
									<img src="file:///C:/glassfish3/glassfish/domains/domain1/eclipseApps/E-Mo/images/${studentinfo.studentName}.png" alt=""> -->
									<!--  <img src="C:\Users\Changho\Desktop\EnterpriseTerm\E-Mo\WebContent\images/${studentinfo.studentName}.png" alt=""> -->
									<!-- 학생 사진  -->
								</div>
								<div class="profile-content">
									<p>
										<b>Call</b>
									</p>
									<p>
										<span> ${studentinfo.call} </span>
									<p>
										<b>Address</b>
									<p>
										<span> ${studentinfo.address} </span>
									<p>
										<b>Sex</b>
									</p>
									<span> ${studentinfo.sex} </span>
									<p>
									<h2>
										<b>Family</b>
									</h2>
									<p>
										<span>${studentinfo.father}<br>
										</span> <span> ${studentinfo.mother}<br>
										</span> <span>${studentinfo.brother}<br> </span> <span>${studentinfo.sister}<br>
										</span>
									<p>
										<b>Spec</b>
									</p>
									<span> ${studentinfo.spec}</span>
									<p>
										<b>Enroll Date</b>
									</p>
									<span> ${studentinfo.enroll_date} </span>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
		<!-- SITE-FOOTER -->
		<div class="site-footer">
			<div class="container">
				<div class="row">
					<div class="col-md-12 text-center">
						<p>Copyright &copy; 2016 SeoKyeong Academy</p>
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