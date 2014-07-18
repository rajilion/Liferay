
<%@page import="javax.portlet.RenderResponse"%>
<%@ include file="/html/library/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h1>Add or Edit Form</h1>
</head>



<%-- <portlet:actionURL var="addProcessActionURL" windowState="normal" name=LibraryConstants.ACTION_UPDATE_BOOK> --%>
<%-- </portlet:actionURL> --%>

 
<body>
<a href = "<portlet:renderURL/>">Go Back</a>

<%
PortletURL updateBookURL = renderResponse.createActionURL();
updateBookURL.setParameter(ActionRequest.ACTION_NAME, LibraryConstants.ACTION_UPDATE_BOOK);

%>

<aui:form name="fm" method="POST" action="<%=updateBookURL%>" >
<aui:input type="text" name="bookTitle" placeholder="BOOK TITLE" helpMessage="Enter the Book title">
<aui:validator name="minLength">5</aui:validator>
<%-- <aui:validator name="alpha"></aui:validator> --%>
</aui:input>
<br/>
<aui:input type="text" name="author" placeholder="AUTHOR" helpMessage="Enter the name of the author">
<%-- <aui:validator name="equalTo"><portlet:namespace/>bookTitle</aui:validator> --%>
<aui:validator name="alpha"></aui:validator>
</aui:input>
<br/>
<aui:input name="redirectURL" type="hidden" value="<%=renderResponse.createRenderURL().toString() %>"></aui:input>
<aui:button type="submit" value="save"/>
</aui:form>
</body>
</html>

<aui:script>
Liferay.Util.focusFormField(document.<portlet:namespace/>fm.<portlet:namespace/>bookTitle);

</aui:script>