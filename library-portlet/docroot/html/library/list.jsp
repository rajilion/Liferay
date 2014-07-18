



<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@include file="/html/library/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h1>List of books in our Library</h1>

</head>
<body>

<% List<LMSBook> books = LMSBookLocalServiceUtil.getLMSBooks(0,LMSBookLocalServiceUtil.getLMSBooksCount()); %>
<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", LibraryConstants.PAGE_LIST);
%>
<!-- old code -->
<!-- <table border="1"; width="80%"> -->
<!-- <tr> -->
<!-- <th>Book Title</th> -->
<!-- <th>Author</th> -->
<!-- <th>Date Added</th> -->
<!-- </tr> -->

<%-- <% --%>
<!-- // for(LMSBook book:books) -->
<!-- // { -->
<%-- %> --%>
<!-- <tr> -->
<%-- <td><%=book.getBookTitle()%></td> --%>
<%-- <td><%=book.getAuthor()%></td> --%>
<%-- <td><%=book.getCreateDate()%></td> --%>
<!-- </tr> -->
<%-- <% 	 --%>
<!-- // } -->

<%-- %> --%>

<!-- </table> -->
<liferay-ui:search-container delta="4" emptyResultsMessage="Sorry No data found" iteratorURL="<%=iteratorURL %>">
<liferay-ui:search-container-results total="<%=books.size() %>" results="<%=ListUtil.subList(books, searchContainer.getStart(), searchContainer.getEnd()) %>"/>
<liferay-ui:search-container-row modelVar="book" className="LMSBook">
<liferay-ui:search-container-column-text name="Book Title" property ="bookTitle"></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="Author" property ="author"></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="Date Added" property ="createDate"></liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>

<liferay-ui:search-iterator searchContainer="<%=searchContainer %>"></liferay-ui:search-iterator>

</liferay-ui:search-container>


<br/>
<a href ="<portlet:renderURL/>">Go Back</a>
</body>
</html>