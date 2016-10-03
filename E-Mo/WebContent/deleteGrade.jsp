<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;border-color:#aabcfe;}
.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#e8edff;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#039;background-color:#b9c9fe;}
.tg .tg-s6z2{text-align:center}
.tg .tg-yw4l{vertical-align:top}
</style>
</head>
<body>
	<form:form method="post" action="deleteGrade.do">
		<table class="tg">
		  <tr>
		    	<th class="tg-imxd">id</th>
		    	<th class="tg-imxd"><input type="text" name="id" /></th>
		  </tr>
		  <tr>
		    <th class="tg-imxd">월</th>
		    <th class="tg-imxd"><input type="text" name="month" /></th>
		  </tr>
		  <tr>
    		<td class="tg-yw4l" colspan="2"><center><input type="submit" value="삭제" /></center></td>
  		  </tr>
		</table>
	</form:form>
</body>
</html>