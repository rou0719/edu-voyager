<HTML>
<BODY>

<%@ page contentType="text/html; charset=Windows-31J" %>

<%-- (1)変数valueを宣言し、4を代入しています。 --%>
<%! int i = 1; %>

<%-- (2)変数valueの値が5以上の場合は、result1.txtファイルを実行し、
       5未満の場合は、result2.txtファイルを実行します。ここでは変
       数valueの値が4のため、result2.txtを実行、表示します。--%>
<%
  if(i == 1) {
%>
  <jsp:include page="1.txt" />
<%
} if(i == 2) {
%>
  <jsp:include page="2.txt" />
<%
}
%>

</BODY>
</HTML>