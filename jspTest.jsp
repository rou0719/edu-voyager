<HTML>
<BODY>
<%-- (1)page�f�B���N�e�B�u��JSP�v���O�����̓������` --%>
<%@ page language="java" 
         contentType="text/html; charset=Windows-31J" %>

<%-- (2)�ϐ�x��錾 --%>
<%! int x = 10; %>
<%! int y = 20; %>
<%! int ans = 0; %>
<%-- (3)�X�N���v�g���b�g����for���[�v���������s --%>
<%
 ans = x + y;

%>

<%-- (4)���Ŏ��s���ʂ�\�� --%>
<H3>�v�Z���ʁF<%= ans %></H3>

</BODY>
</HTML>