<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />

</head>
<body>

	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">
		
		<table class="formtable">
			<tr> <td class="label"> 년도: </td> <td> <sf:input class="control" type="text" path="year"/> </td> </tr>
			<tr> <td class="label"> 학기: </td> <td> <sf:input class="control" type="text" path="semester"/> </td> </tr>
			<tr> <td class="label"> 과목코드: </td> <td> <sf:input class="control" type="text" path="code"/> </td> </tr>
			<tr> <td class="label"> 과목명: </td> <td> <sf:input class="control" type="text" path="subject"/> </td> </tr>
			<tr> <td class="label"> 구분: </td> <td> <sf:input class="control" type="text" path="sort"/> </td> </tr>
			<tr> <td class="label"> 학점: </td> <td> <sf:input class="control" type="text" path="credit"/> </td> </tr>
			<tr> <td class="label">  </td> <td> <input type="submit" value="추가"/> </td> </tr>
		</table>
		
		</sf:form>

</body>
</html>