<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; chaset=UTF-8">
<title>11111</title>
</head>
<body>

<h2>JSPからファイル、サーブレットの呼び出し</h2>

<p><a HREF="HelloServlet">HelloServlet</a>
(カレントからのパス)

<p><a HREF="<%=request.getContextPath()%>/HelloServlet">HelloServlet</a>
(サーバールートからのパス)

<p><a HREF="1.txt">1.txt</a>
(1.txt)

<p><a HREF="<%=request.getContextPath()%>/1.txt">1.txt</a>
(1.txt)

<p><a HREF="2.txt">2.txt</a>
(2.txt)

<p><a HREF="<%=request.getContextPath()%>/2.txt">2.txt</a>
(2.txt)

</body>
</html>