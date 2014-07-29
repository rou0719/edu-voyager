<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Scriptlet</title>
</head>
<body>
<%
int count1 = 0;
for(int i = 0; i < 10; i++){
	count1 = count1 + i;
	}
%>
count1 (1-10) = <%= count1 %>
<br>
<br>
<%
int count2 = 0;
for(int i = 0; i < 100; i++){
	count2 += i;
	}
out.println("count2 (1-100) = " + count2);
%>

</body>
</html>