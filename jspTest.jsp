<HTML>
<BODY>
<%-- (1)pageディレクティブでJSPプログラムの特性を定義 --%>
<%@ page language="java" 
         contentType="text/html; charset=Windows-31J" %>

<%-- (2)変数xを宣言 --%>
<%! int x = 10; %>
<%! int y = 20; %>
<%! int ans = 0; %>
<%-- (3)スクリプトレット内でforループ処理を実行 --%>
<%
 ans = x + y;

%>

<%-- (4)式で実行結果を表示 --%>
<H3>計算結果：<%= ans %></H3>

</BODY>
</HTML>