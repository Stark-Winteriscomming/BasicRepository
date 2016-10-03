<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Register Grade</title>
<style>
body {
 font-size: 20px;
 color: teal;
 font-family: Calibri;
}

td {
 font-size: 15px;
 color: black;
 width: 30px;
 height: 22px;
 text-align: left;
}

.heading {
 font-size: 18px;
 color: white;
 font: bold;
 background-color: orange;
 border: thick;
}
</style>
</head>
<body>
 <center>
  <br /> <br /> <br /> <b>Register Grade</b> <br />
  <br />
  <div>
  <!-- <form method="post" action="<c:url value='/insert.do'/>"> -->
   <form:form method="post" action="insert.do">
    <table>
     <tr>
      <td>id</td>
      <td><input type="text" name="id"></td>
     </tr>
     <tr>
      	<td>연도</td>
      	<td><input type="text" name="year"></td>
     </tr>
     <tr>
      	<td>월</td>
      	<td><input type="text" name="month"></td>
     </tr>
     <tr>
      <td>국어 </td>
      <td><input type="text" name="language"></td>
     </tr>
     <tr>
      <td>영어 </td>
      <td><input type="text" name="english"></td>
     </tr>
     <tr>
      <td>수학 </td>
      <td><input type="text" name="math"></td>
     </tr>
     <tr>
      <td> </td>
      <td><input type="submit" value="저장" /></td>
     </tr>

    </table>
   </form:form>
  </div>
 </center>
</body>
</html>