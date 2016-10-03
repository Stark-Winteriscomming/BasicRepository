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
	function goback() {
		
		history.back();
	}

</script>

</head>
<body>
<% String name = (String)session.getAttribute("userName");%>
	<div class="site-bg"></div>
	<div class="site-bg-overlay"></div>


	<div class="container" id="page-content">
		<div class="row">
			<div class="logo-holder logo-top-margin">
				<a href="#" class="site-brand"><img src="images/logo.png" alt="">
				</a>
			</div>


			<div class="col-md-9 col-sm-12 content-holder">
				<!-- CONTENT -->
				<!-- ��ư�� --->
				<!-- �л� ����, ����, ���� ��ư�� -->
				
				<!-- end of ��ư�� -->


				<div id="con">
					<!-- ---------------------  ���� �ȿ� ������ �� --------------------- -->
					<c:forEach var="studentinfo" items="${studentinfo}">
						<div class="col-md-7 col-sm-8">
							<div class="box-content profile">
								<h3 class="widget-title">
									Number:
									<c:out value="${studentinfo.studentId}" />
									/ Name:
									<c:out value="${studentinfo.studentName}" />
								</h3>
								<!-- �л� �̸� -->
								<div class="profile-thumb">
									<img src="images/${studentinfo.studentName}.png" alt="">
									<!-- �л� ����  -->
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
					
					<form action="#" method="get" class="subscribe-form">
					<div class="row">

						<!-- col-md-(����) ���ڰ� �۾������� �¿� ������ ������ -->
						<fieldset class="col-md-2 button-holder">
							<input name="submit" type="button" class="button default"
								id="submit" value="back" onclick="goback()">
						</fieldset>

					</div>
				</form>




				</div>
			</div>
		</div>
		

		<script src="js/vendor/jquery-1.10.2.min.js"></script>
		<script src="js/plugins.js"></script>
		<script src="js/main.js"></script>
		<!-- templatemo 439 rectangle -->
</body>
</html>