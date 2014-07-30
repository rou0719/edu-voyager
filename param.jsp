<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; chaset=UTF-8">
<title>Param</title>
</head>
<body>
<h2>いろんなパラメータ</h2>



<form action="ParamListServlet">

	<p>テキストフィールド
	<input type="text" name="text1" value="テキストフィールド">

	
	
	<p>テキストエリア
	<textarea name="textarea1" cols="30" rows="5">テキストエリア</textarea>	

	<p>ラジオボタン
	<input type="radio" name="radio1" value="Light" checked>左
	<input type="radio" name="radio1" value="Right">右
	
	<p>チェックボックス	
		<input type="checkbox" name="checkbox - ゴルフ">ゴルフ
		<input type="checkbox" name="checkbox - テニス">テニス
		<input type="checkbox" name="checkbox - サッカー">サッカー

	<p>セレクト
	<select name="select" size="3" multiple="true">
		<option value="select - A">A
		<option value="select - B">B
		<option value="select - C">C
	</select>

	<p>
	<input type="submit">
	<input type="reset">

</form>

</body>
</html>