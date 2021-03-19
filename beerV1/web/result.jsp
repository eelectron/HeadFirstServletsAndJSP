<%@ page import="java.util.*" %>
<html>
<head>
	<title></title>
</head>
<body>
	<h1> Beer Recommendation JSp</h1>
	<p>
		<%
			List<String> brands = (List)request.getAttribute("brands");
			for(int i = 0; i < brands.size(); i++){
				out.print("<br>try : " + brands.get(i));
			}
		%>
	</p>
</body>
</html>