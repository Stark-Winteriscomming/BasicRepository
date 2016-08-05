<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
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
<!--  cs.css -->
<link rel="stylesheet" href="css/ch.css">
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

<!-- 임시 table css -->

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #999;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #999;
	color: #444;
	background-color: #F7FDFA;
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
	border-color: #999;
	color: #fff;
	background-color: #26ADE4;
}

.tg .tg-pqfs {
	font-weight: bold;
	font-style: italic;
	font-size: 10px;
	font-family: Tahoma, Geneva, sans-serif !important;;
	text-align: center;
	vertical-align: top
}

.tg .tg-baqh {
	text-align: center;
	vertical-align: top
}
<!-- -->
.opt {color:white}

select{background-color:black}




</style>

</head>

<body>
	<% 
		String name = (String)session.getAttribute("userName");
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
						<%=name %>
						선생님 <a href="logout.jsp">로그아웃</a>
					</p>
				</div>
				<div class="col-md-6 col-sm-6 col-xs-12">
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
				<li><a class="show-2 aboutbutton" href="student.jsp"><i
						class="fa fa-user"></i>Managing Students</a></li>
				<li><a class="show-3 projectbutton" href="showGrade.do"><i
						class="fa fa-camera"></i>Managing Grade</a></li>
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
								id="submit" value="성적정보 등록"
								onclick="window.location.href='registerGrade.do'" />
						</fieldset>

						<fieldset class="col-md-2 button-holder">
							<input name="submit" type="button" class="button default"
								id="submit" value="성적정보 수정"
								onclick="window.location.href='editGrade.do'" />
						</fieldset>
						<fieldset class="col-md-2 button-holder">
							<input name="submit" type="button" class="button default"
								id="submit" value="성적정보 삭제"
								onclick="window.location.href='removeGrade.do'" />
						</fieldset>

						<!--  123456789101112월 -->
					</div>
				</form>
				<br>
				<form action="showMonthGrade.do">
					<select name="month" id="s_month">
						<option value="1" class="opt" id="1">1월</option>
						<option value="2" class="opt" id="2">2월</option>
						<option value="3" class="opt" id="3">3월</option>
						<option value="4" class="opt" id="4">4월</option>
						<option value="5" class="opt" id="5">5월</option>
						<option value="6" class="opt" id="6">6월</option>
						<option value="7" class="opt" id="7">7월</option>
						<option value="8" class="opt" id="8">8월</option>
						<option value="9" class="opt" id="9">9월</option>
						<option value="10" class="opt" id="10">10월</option>
						<option value="11" class="opt" id="11">11월</option>
						<option value="12" class="opt" id="12">12월</option>
					</select> <input type="submit" class="button" value="이동">
				</form>
				<!-- end of 버튼들 -->
				<div id="con">
					<!-- ---------------------  여기 안에 넣으면 됨 --------------------- -->
					<br>
					<table class="tg" style="table-layout: fixed; width: 512px">
						<colgroup>
							<col style="width: 113px">
							<col style="width: 57px">
							<col style="width: 57px">
							<col style="width: 57px">
							<col style="width: 57px">
							<col style="width: 57px">
							<col style="width: 57px">
							<col style="width: 57px">
						</colgroup>
						<tr>
							<th class="tg-pqfs">name</th>
							<th class="tg-pqfs">국어</th>
							<th class="tg-pqfs">영어</th>
							<th class="tg-pqfs">수학</th>
 							<th class="tg-pqfs">국어 석차</th>
							<th class="tg-pqfs">영어 석차</th>
							<th class="tg-pqfs">수학 석차</th>
							<th class="tg-pqfs">전체 석차</th> 
						</tr>
						<c:forEach var="grade" items="${gradeInfo}">
							<tr>
								<td class="tg-baqh"><a
									href="chart.do?gradeId=<c:out value="${grade.name}" />"> <c:out
											value="${grade.name}" /> </a></td>
								<td class="tg-baqh">${grade.language}</td>
								<td class="tg-baqh">${grade.english}</td>
								<td class="tg-baqh">${grade.math}</td>
								<td class="tg-baqh">${grade.rank_lan}</td>
								<td class="tg-baqh">${grade.rank_eng}</td>
								<td class="tg-baqh">${grade.rank_mat}</td>
								<td class="tg-baqh">${grade.rank_all}</td>
							</tr>
						</c:forEach>
					</table>
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
				<script language="javascript">
	//var m = document.getElementById(month);
	var url = document.URL;
	var pos=document.URL.indexOf("month=")+6;
	var month = url.substring(pos,document.URL.length);
	document.getElementById(month).selected = true;
	
</script>
		
</body>

</html>