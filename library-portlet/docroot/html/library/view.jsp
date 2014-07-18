
<%@ include file="/html/library/init.jsp" %>
<portlet:renderURL var ="updateBookURL">
<portlet:param name="jspPage" value="/html/library/update.jsp"/>
</portlet:renderURL>
<br/>
<a href = "<%=updateBookURL %>">Add new Book</a>
<hr/>
<%
PortletURL listBookURL = renderResponse.createRenderURL();
listBookURL.setParameter("jspPage", "/html/library/list.jsp");
%>
&nbsp;|&nbsp;
<a href="<%=listBookURL.toString() %>">Show all books</a>
<!-- <div id = "hello"> -->
<!-- <ul> -->
<!-- <li><a href="#tab1">Tab 1</a></li> -->
<!-- <li><a href="#tab2">Tab 2</a></li> -->
<!-- <li><a href="#tab3">Tab 3</a></li> -->
<!-- </ul> -->
<!-- <div id="tab1">Tab1 content</div> -->
<!-- <div id="tab2">Tab2 content</div> -->
<!-- <div id="tab3">Tab3 content</div> -->


<!-- </div> -->
<!-- <script> -->
<!-- // $(document).ready(function(){ -->
<!-- // $("#hello").tabs(); -->
<!-- // }) -->

<!-- </script> -->