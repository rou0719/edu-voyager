<HTML>
<BODY>

<%@ page contentType="text/html; charset=Windows-31J" %>

<%-- (1)�ϐ�value��錾���A4�������Ă��܂��B --%>
<%! int i = 1; %>

<%-- (2)�ϐ�value�̒l��5�ȏ�̏ꍇ�́Aresult1.txt�t�@�C�������s���A
       5�����̏ꍇ�́Aresult2.txt�t�@�C�������s���܂��B�����ł͕�
       ��value�̒l��4�̂��߁Aresult2.txt�����s�A�\�����܂��B--%>
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