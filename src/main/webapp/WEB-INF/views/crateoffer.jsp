<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>

	<form method="post"
		action="${pageContext.request.contextPath}/docreate">
		
		<table>
			<tr> <td> Name: </td> <td> <input type="text" name="name"/> </td> </tr>
			<tr> <td> Email: </td> <td> <input type="text" name="email"/> </td> </tr>
			<tr> <td> Offer: </td> <td> <textarea name="offer" rows="10" cols="10"> </textarea> </td> </tr>
			<tr> <td>  </td> <td> <input type="submit" value="새 제안"/> </td> </tr>
		</table>
		
		</form>

</body>
</html>