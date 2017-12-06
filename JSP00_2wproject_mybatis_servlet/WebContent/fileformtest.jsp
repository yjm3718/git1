<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%request.setCharacterEncoding("UTF-8");%>
    <%response.setContentType("text/html; charset=UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="fileformtest_res.jsp" method="post" enctype="multipart/form-data">
		<!-- input 타입을 file로 하여 file을 지정하고 submit으로 저장. 여러개로 해야할 경우 input을 여러개 쓰거나 function으로 추가생성하던가...   -->
		파일 : <input type="file" name="file"><br />
		<input type="submit" value="File Upload">
	</form>

</body>
</html>