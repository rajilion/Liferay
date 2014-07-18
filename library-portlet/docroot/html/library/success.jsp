
<%@include file="/html/library/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h1>New Book inserted!!!</h1>
</head>
<body>
<%
PortletURL addBookURL = renderResponse.createRenderURL();
addBookURL.setParameter("jspPage", "/html/library/update.jsp");
%>
<aui:a href="<%=addBookURL.toString() %>">Add Book again </aui:a><br/>
<a href="<portlet:renderURL/>">Go Back</a>
</body>
</html>