<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>基于Struts+Spring+Hibernate开发的DEMO</title>
	<link rel="stylesheet" type="text/css" href="./resources/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="./resources/css/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="./resources/css/demo.css">
	<script type="text/javascript" src="./resources/js/jquery.min.js"></script>
	<script type="text/javascript" src="./resources/js/jquery.easyui.min.js"></script>
</head>
<style>
body{background-color:#E0ECFF;}
.main{width:400px;margin:auto;margin-top:60px}
</style>
<body>
<div class="main">
	<h2>登录系统</h2>
	<p>填写下面信息登录系统<a href="login.jsp">跳转登录</a></p>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="项目管理系统" style="width:100%;max-width:400px;padding:30px 60px;">
		<form id="ff" method="post">
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="userName" style="width:100%" data-options="label:'账号:',required:true,validType:'length[1,10]'">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="passWord" style="width:100%" data-options="label:'密码:',required:true,validType:'length[6,20]'">
			</div>
		</form>
		<div style="text-align:center;padding:5px 0">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">登录</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</a>
		</div>
	</div>
	</div>
	<script>
		function submitForm(){
			$('#ff').form('submit');
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>
</html>