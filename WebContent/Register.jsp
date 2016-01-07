<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agv Register & Login</title>
</head>
<body>
	<s:form action="register">
		<s:textfield name="agv.msg" label="Msg"></s:textfield>
		<s:textfield name="agv.xcoord" label="Xcoord"></s:textfield>
		<s:textfield name="agv.ycoord" label="Ycoord"></s:textfield>
		<s:textfield name="agv.netid" label="Netid"></s:textfield>
		<s:submit value="Register"></s:submit>
	</s:form>
	
	<s:form action="login" method="post">
		<s:textfield name="agv.msg" label="Msg"></s:textfield>
		<s:textfield name="agv.xcoord" label="Xcoord"></s:textfield>
		<s:textfield name="agv.ycoord" label="Ycoord"></s:textfield>
		<s:textfield name="agv.netid" label="Netid"></s:textfield>
		<s:submit value="Login"></s:submit>
	</s:form>
	
</body>
</html>