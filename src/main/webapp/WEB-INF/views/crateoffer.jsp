<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />

</head>
<body>

	<form method="post"
		action="${pageContext.request.contextPath}/docreate">
		
		<table class="formtable">
			<tr> <td class="label"> 년도: </td> <td> <input class="control" type="text" name="year"/> </td> </tr>
			<tr> <td class="label"> 학기: </td> <td> <input class="control" type="text" name="semester"/> </td> </tr>
			<tr> <td class="label"> 과목코드: </td> <td> <input class="control" type="text" name="code"/> </td> </tr>
			<tr> <td class="label"> 과목명: </td> <td> <input class="control" type="text" name="subject"/> </td> </tr>
			<tr> <td class="label"> 구분: </td> <td> <input class="control" type="text" name="sort"/> </td> </tr>
			<tr> <td class="label"> 학점: </td> <td> <input class="control" type="text" name="credit"/> </td> </tr>
			<tr> <td class="label">  </td> <td> <input type="submit" value="추가"/> </td> </tr>
		</table>
		
		</form>

</body>
</html>